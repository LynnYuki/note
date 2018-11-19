#Git 常用命令
@(Git命令)[常用  |test]

[TOC]

###参照廖雪峰Git教程总结
>[原文链接](https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000)

###设置用户名和Email地址
```java
git config --global user.name 'your name'
git config --global user.email 'your email address'
```
###常用命令
####创建本地仓库
```
git init
```
####添加文件
```
git add filename
git add.  #添加当前目录下的所有文件
```
####提交到暂存空间
```
git commit -m "description" #双引号里面写提交注释
```
####查看当前状态
```
git status
```
####查看文件修改内容
```
git diff
git diff HEAD -- filename #查看工作区和版本库里面最新版本的区别
```
####查看修改历史记录
```
git log
git log --pretty=oneline #按行查看历史
git reflog #查看命令历史记录
```
####版本回退
```
git reset --hard HEAD^  #回退一个版本HEAD^ 上上个版本HEAD^^ 一百个版本HEAD~100
git reset --hard commit_id #回退到指定id版本
```
####丢弃工作区修改
```
git checkout -- filename
```