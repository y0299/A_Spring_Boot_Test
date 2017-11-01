# 基于哪个镜像
FROM java:8
# 将本地文件夹挂载到当前容器
VOLUME /tmp
# 拷贝文件到容器，也可以直接写成ADD Chapter1-1.0.0.jar /app.jar
ADD target/Chapter1-1.0.0.jar app.jar
ENV JAVA_OPTS=""
# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]