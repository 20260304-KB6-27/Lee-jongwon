<template>
  <ul>
    <PostListItem
      v-for="post in posts"
      :key="post.no"
      :post="post"
      @delete="deletePost"
      @edit="editPost"
      @toggle="togglePost"
      @save="savePost"
      @cancel="cancelPost"
      @close="closePost"
      @add="addPost"
      :selectedPostNo="selectedPostNo"
    >
    </PostListItem>
  </ul>
</template>

<script setup>
import PostListItem from './PostListItem.vue';

const props = defineProps({
  posts: Array,
  selectedPostNo: Number,
});

const emit = defineEmits([
  'delete',
  'edit',
  'toggle',
  'save',
  'cancel',
  'close',
  'add',
]);

const deletePost = (no) => {
  emit('delete', no);
};
const editPost = (no) => {
  emit('edit', no);
};
const togglePost = (no) => {
  emit('toggle', no);
};
const savePost = (post) => {
  emit('save', post);
};
const cancelPost = () => {
  emit('cancel');
};
const closePost = () => {
  emit('close');
};
const addPost = (newPost) => {
  emit('add', newPost);
};
</script>

<style lang="scss" scoped></style>
