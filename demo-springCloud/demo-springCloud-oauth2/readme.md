# api远程调用服务（9501） auth认证服务（9401） gateway网关服务（9201）

## SpringCloud认证系统：Gateway+Security+Oauth2 将服务分为以下几个层次：
security-gateway：网关层，负责接收所有网络请求、转发以及权限鉴定   
security-auth：认证层，负责对登录用户进行认证   
security‐discovery：注册中心  
security-api：资源层，提供被访问的资源，用户被鉴权之后才可被访问，某一个具体的微服务。  
[项目代码架构分析](https://blog.csdn.net/qq_36748248/article/details/125916633?utm_medium=distribute.pc_relevant.none-task-blog-2~default~baidujs_baidulandingword~default-9-125916633-blog-127241879.pc_relevant_3mothn_strategy_and_data_recovery&spm=1001.2101.3001.4242.6&utm_relevant_index=12)

前端所有的请求都会到达gateway，gateway根据请求的携带的token来判断是否需要认证，如果需要，则校验token，
并从token中获取用户信息（也即对token解密过程：先向auth—server请求公钥（Jwt），再解密），
根据解密出来的用户信息（比如角色），和路径所需的权限（角色）进行比较。过滤器的设置就在网关中。  
auth-server用来给用户颁发令牌。用户在登录的时候就会访问auth-server



## 一、auth服务

使用keytool生成RSA证书jwt.jks，复制到resource目录下，在JDK的bin目录下使用命令:
keytool -genkey -alias jwt -keyalg RSA -keystore jwt.jks

1、创建UserServiceImpl类实现Spring Security的UserDetailsService接口，用于加载用户信息；

2、添加认证服务相关配置Oauth2ServerConfig，需要配置加载用户信息的服务UserServiceImpl及RSA的钥匙对KeyPair；

3、如果你想往JWT中添加自定义信息，比如说登录用户的ID，可以自己实现TokenEnhancer接口；

4、由于网关服务需要RSA公钥来验证签名是否合法，所以认证服务需要有个接口把公钥暴露出来（KeyPairController）

5、还需要配置SpringSecurity（WebSecurityConfig中的过滤链），允许获取公钥接口的访问