package caojx.learn.microservicesimpleconfigserverencryptionrsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置属性加解密-非对称加密
 * curl http://localhost:8080/encrypt -d mysecret ,尝试加密时 ，就会得到类似以下的结果。
 * AQCfhuwIhUYHNfijWFwD6gRZvOxcZeoAiQNZMQHzwa8CZCHLbNB+dKUImFbspFFuWjTjgiuBwAHi9C4bfq0/xGfBUJ7vAm1LQpO6oh62c4iRZMf9QUY6vtFBW1JXcn9igquf4I+OBO2urg7D1Nx8GUFepjJGhYlY+AyiZ3otfIdjTne+v6n9YURpCYNpaTTidwBsY5+L1NVVD7gpPyC6WqplUJbTY24Wqd0/ZYG56ofuId2viaGubgBRoWT6oUNAw3iXe57vdkhuZpdu3lF9MKuysUD/x7q1+6yHpqd9/HEghpGAt6dPTShRMeVjtfZLFf9dTVpWVJLNa2BQ6TB2EZ1mZtjk92R++CE6e//2nWWhcPrq7hqL4v1MSLfO/v6bGhY=%
 * 相对于对称加密，非对称加密的安全性更高，但对称加密相对方便。读者可按照需求，自行选择加密方案。
 */
@EnableConfigServer
@SpringBootApplication
public class MicroserviceSimpleConfigServerEncryptionRsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleConfigServerEncryptionRsaApplication.class, args);
    }

}
