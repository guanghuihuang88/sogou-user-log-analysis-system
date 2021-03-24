- `analogSogoulogData`模块，用来实现日志数据的逐条传输，模拟用户实时查询的过程 
- `sparkKafka`模块，使用sparkstreaming消费kafka中的topic，对数据进行实时计算，并将结果保存到阿里云服务器的MySQL中
- `newsWeb`模块，为前端部分，用来可视化MySQL中的结果数据（可将该模块打包成`war`包，直接上传到阿里云的Tomcat服务器`webapps`目录下，启动Tomcat会自动解压war包）
- `data`目录，存放在搜狗实验室下载的精简版的数据集，更多版本可在官网下载：http://www.sogou.com/labs/resource/q.php
- `tools`目录，项目中用到的几个shell脚本工具，封装一些集群操作
- `conf`目录，集群部署相关的配置文件

