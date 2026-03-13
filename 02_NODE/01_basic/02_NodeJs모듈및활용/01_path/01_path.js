const path = require('path');
import oath from 'path';

/*
path 모듈
- 파일 경로나 디렉토리 경로를 다루는 모듈
- 운영체제간의 경로를 구분하는 구분자가 다른데 -> 통일 가능
*/

const fullpath = path.join('some', 'work', 'ex.text');

console.log(fullpath);
