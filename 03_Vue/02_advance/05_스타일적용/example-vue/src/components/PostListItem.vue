<template>
  <li class="post-item-wrapper">
    <div @click="togglePost(post.no)" class="post-item">
      {{ post.no }}. {{ post.title }}
      <span class="arrow">{{ selectedPostNo === post.no ? '▲' : '▼' }}</span>
    </div>

    <div v-if="selectedPostNo === post.no" class="post-content">
      <div v-if="isEditMode">
        <input
          type="text"
          v-model="editTitle"
          style="
            width: 100%;
            box-sizing: border-box;
            margin-bottom: 5px;
            padding: 5px;
          "
          class="edit-input"
        />
        <textarea
          v-model="editContent"
          class="edit-textarea"
          style="width: 100%; box-sizing: border-box; padding: 5px"
          rows="3"
        ></textarea>
        <button @click="savePost(post.no)">저장</button>
        <button @click="cancelPost">취소</button>
      </div>

      <div v-else>
        <h2>{{ post.title }}</h2>
        <p>{{ post.content }}</p>
        <button @click="closePost">닫기</button>
        <button @click="editPost">수정</button>
        <button @click="deletePost(post.no)">삭제</button>
      </div>
    </div>
  </li>
</template>

<script setup>
import { ref } from 'vue';

const props = defineProps({
  post: Object,
  selectedPostNo: Number,
});

const emit = defineEmits(['delete', 'toggle', 'save', 'close']);

const isEditMode = ref(false);
const editTitle = ref('');
const editContent = ref('');

const togglePost = (no) => {
  emit('toggle', no);
};

const closePost = () => {
  emit('toggle', props.post.no);
};

const deletePost = (no) => {
  emit('delete', no);
};

const editPost = () => {
  editTitle.value = props.post.title;
  editContent.value = props.post.content;
  isEditMode.value = true;
};

const cancelPost = () => {
  isEditMode.value = false;
};

const savePost = (no) => {
  if (editTitle.value.trim() === '' || editContent.value.trim() === '') return;

  const editData = {
    no: no,
    title: editTitle.value,
    content: editContent.value,
  };

  emit('save', editData);
  isEditMode.value = false;
};
</script>

<style lang="scss" scoped></style>
