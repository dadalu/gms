# npm install报错的问题
- 首先把项目文件夹下的package.json里面的node-sass4.9.0改成4.9.2可尝试多个版本
- mac m芯片需要切换chromedriver版本
```
  "chromedriver": "^80.0.2"
  ```

- 然后终端执行
```
npm rebuild node-sass
npm uninstall node-sass
```
- 执行：
```
npm i node-sass --sass_binary_site=https://npm.taobao.org/mirrors/node-sass/
```
- 执行成功没报错执行下面命令
```
npm install
```
```
npm run dev
```
