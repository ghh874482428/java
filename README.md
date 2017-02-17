# java
java相关项目

Git:
Pull时报错：Git Pull Failed，fatal: refusing to merge unrelated histories
解决办法：
打开Git Bush。本地资源管理器的工程目录下，右键——Git Bush Here。或直接打开Git Bash，然后用cd命令打开工程目录。
输入命令：git pull origin master --allow-unrelated-histories
表示允许不相关的仓库合并。

先提交代码再上传项目
git push –u origin master
