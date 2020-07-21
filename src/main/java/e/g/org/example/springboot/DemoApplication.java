package e.g.org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 开启了Spring的组件扫描和springboot的自动配置功能。事实上spring boot是三个有效注释组合在了一起
// 分别是@configuration、@componentScan和@EnableAutoConfiguration
// 第一个：标明该类的使用spring基于Java的配置
// 第一个：启用组件扫描，这样你写的web控制器类和其他组件才能被自动发现并注册为spring应用程序上下文里的Bean
// 第三个：这个注解也可以被称为Abracadabra（咒语）它的意义是开启自动配置的魔力，去掉繁杂的配置
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
