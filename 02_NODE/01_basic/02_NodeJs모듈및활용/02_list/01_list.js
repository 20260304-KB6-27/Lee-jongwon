const fs = require('fs'); //fs 모듈 가져오기

// // 동기방식
// let files = fs.readdirSync('./'); // ./는 현재위치
// console.log(files);

// // 콜백방식
// let files = fs.readdir('./', (err, files) => {
//   if (err) {
//     console.log(err);
//     return;
//   }
//   console.log(files);
// });

//promise 방식(이걸 가장 많이 씀)
fs.promises
  .readdir('./')
  .then((files) => {
    console.log(files);
  })
  .catch((err) => {
    console.log(err);
  });
