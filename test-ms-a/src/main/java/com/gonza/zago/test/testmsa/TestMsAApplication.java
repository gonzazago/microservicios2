package com.gonza.zago.test.testmsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class TestMsAApplication {


//	@Value("${myprops.alias:alias!}")
//	String alias;
//
//	@Bean
//	@RefreshScope
//	public Service service(){
//		return new  Service(props.getName());
//	}

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestMsAApplication.class, args);
	}
}

//@Data
//@RequiredArgsConstructor
//class Service{
//	private final String name ;
//	private Service(){name="UNKNOWN";}
//}
//
//@Data
//@ConfigurationProperties("myprops")
//class MyProps{
//	private  String name = "World";
//}
