package caojx.learn.microservicesimpleconfigserverencryption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置属性加解密-对称加密
 * curl http://localhost:8080/encrypt -d mysecret ,返回851a6effab6619f43157a714061f4602be0131b73b56b0451a7e268c880daea3 。说明mysecret 被加密了
 * curl http://localhost:8080/decrypt -d 851a6effab6619f43157a714061f4602be0131b73b56b0451a7e268c880daea3 ,可返回mysecret ，说明能够正常解密。
 */
@EnableConfigServer
@SpringBootApplication
public class MicroserviceSimpleConfigServerEncryptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConfigServerEncryptionApplication.class, args);
    }

}
