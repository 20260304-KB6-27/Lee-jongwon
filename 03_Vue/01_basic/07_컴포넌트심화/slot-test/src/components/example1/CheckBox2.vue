<template>
  <div>
    <input type="checkbox" :value="id" :checked="checked" @change="onChange" />
    <!--부모 컴포넌트에서 정의한 템플릿 요소들이 들어오는 장소-->
    <slot>
      <!--{{ label }} 부모에서 템플릿을 정의하지 않았을경우 표시될 기본값-->
      {{ label }}
    </slot>
  </div>
</template>

<script setup>
const props = defineProps(['id', 'checked', 'label']); //부모에게서 받아오는거

const emit = defineEmits(['check-changed']); //부모로 보내는거

function onChange(event) {
  emit('check-changed', { id: props.id, checked: event.target.checked });
}
</script>

<style lang="scss" scoped></style>
