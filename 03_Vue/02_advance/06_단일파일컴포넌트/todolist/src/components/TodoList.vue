<template>
  <ul>
    <TodoListItem
      v-for="todoitem in todolist"
      :key="todoitem.id"
      :todoitem="todoitem"
      @toggle="toggleCompleted"
      @delete="deleteTodo"
    >
    </TodoListItem>
  </ul>
</template>

<script setup>
import TodoListItem from './TodoListItem.vue';

const props = defineProps({
  todolist: Array,
});

const emit = defineEmits(['toggle', 'delete']);

const toggleCompleted = (id) => {
  emit('toggle', id);
};
const deleteTodo = (id) => {
  emit('delete', id);
};
</script>

<style lang="scss" scoped></style>
