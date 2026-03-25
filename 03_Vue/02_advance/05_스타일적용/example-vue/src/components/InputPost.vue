<template>
  <input
    type="text"
    placeholder="새 게시글 제목"
    v-model="newtitle"
    @keyup.enter.exact="addPost"
  />
  <input
    type="text"
    placeholder="새 게시글 내용"
    v-model="newcontent"
    @keyup.enter.exact="addPost"
  />
  <button @click="addPost">작성</button>
</template>

<script setup>
import { ref } from 'vue';

const props = defineProps({
  posts: Array,
});

const emit = defineEmits(['add']);
const newtitle = ref('');
const newcontent = ref('');

const addPost = () => {
  if (newtitle.value === '' || newcontent.value === '') return;

  emit('add', {
    no: props.posts.length + 1,
    title: newtitle.value,
    content: newcontent.value,
  });

  newtitle.value = '';
  newcontent.value = '';
};
</script>

<style lang="scss" scoped></style>
