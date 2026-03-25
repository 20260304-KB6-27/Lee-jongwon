<template>
  <h1>📌 게시판 목록 v2</h1>

  <InputPost :posts="posts" @add="addPost"></InputPost>

  <PostList
    :posts="sortedPosts"
    @delete="deletePost"
    @edit="editPost"
    @toggle="togglePost"
    @save="savePost"
    @cancel="cancelPost"
    @close="closePost"
    @add="addPost"
    :selectedPostNo="selectedPostNo"
  ></PostList>
</template>

<script setup>
import InputPost from './components/InputPost.vue';
import PostList from './components/PostList.vue';
import { ref, computed } from 'vue';

const posts = ref([
  {
    no: 1,
    title: 'Vue.js 기초 배우기',
    content:
      'Vue.js는 사용자 인터페이스를 구축하기 위한 프로그레시브 프레임워크입니다.',
  },
  {
    no: 2,
    title: '자바스크립트 ES6 문법',
    content:
      'ES6는 JavaScript의 최신 문법을 포함하며, let/const, 화살표 함수 등을 제공합니다.',
  },
  {
    no: 3,
    title: 'Node.js와 Express',
    content: 'Node.js는 서버 측 런타임이며, Express는 웹 프레임워크입니다.',
  },
  {
    no: 4,
    title: 'MongoDB 기본 개념',
    content:
      'MongoDB는 NoSQL 데이터베이스로 JSON과 유사한 문서 기반 데이터를 저장합니다.',
  },
  {
    no: 5,
    title: '프론트엔드와 백엔드의 차이',
    content:
      '프론트엔드는 사용자가 보는 부분을 개발하는 것이고, 백엔드는 서버와 데이터베이스를 관리하는 부분입니다.',
  },
  {
    no: 6,
    title: '비동기 프로그래밍',
    content:
      'JavaScript의 비동기 처리 방식에는 콜백, 프로미스, async/await가 있습니다.',
  },
  {
    no: 7,
    title: 'Vue Router 사용법',
    content:
      'Vue Router를 사용하면 Vue.js 애플리케이션에서 페이지 이동을 쉽게 처리할 수 있습니다.',
  },
  {
    no: 8,
    title: '컴포넌트 기반 개발',
    content:
      'Vue.js에서는 컴포넌트를 사용하여 UI를 작은 단위로 쪼개서 관리할 수 있습니다.',
  },
  {
    no: 9,
    title: 'CSS와 SCSS 차이점',
    content: 'SCSS는 CSS의 확장된 버전으로 변수, 중첩, 믹스인 등을 지원합니다.',
  },
  {
    no: 10,
    title: 'Git과 GitHub 사용법',
    content:
      'Git은 버전 관리 시스템이며, GitHub는 이를 활용한 원격 저장소 플랫폼입니다.',
  },
]);

const selectedPostNo = ref(null);

const sortedPosts = computed(() => {
  return [...posts.value].sort((a, b) => b.no - a.no);
});

const addPost = (newPost) => {
  posts.value.push(newPost);
};

const deletePost = (no) => {
  let index = posts.value.findIndex((item) => no === item.no);

  if (index !== -1) {
    alert('정말로 삭제하시겠습니까?');
    posts.value.splice(index, 1);
  }
};

const editPost = (post) => {
  let index = posts.value.findIndex((item) => post.no === item.no);
  posts.value[index].title = post.title;
  posts.value[index].content = post.content;
};

const togglePost = (no) => {
  selectedPostNo.value = selectedPostNo.value === no ? null : no;
};

const savePost = (editData) => {
  let index = posts.value.findIndex((item) => editData.no === item.no);

  if (index !== -1) {
    posts.value[index].title = editData.title;
    posts.value[index].content = editData.content;
  }
};
const cancelPost = () => {
  posts.value.forEach((item) => {
    item.selected = false;
  });
};

const closePost = () => {
  selectedPostNo.value = null;
};
</script>

<style lang="scss" scoped></style>
