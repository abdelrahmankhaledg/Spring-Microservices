package spring.mircoservices.moviecatalogservice;
import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class MovieCatalogServiceApplication {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
		Duration connectTimeout = Duration.ofMillis(3000);
		Duration readTimeout = Duration.ofMillis(3000);
		RestTemplate restTemplate = restTemplateBuilder.setConnectTimeout(connectTimeout).setReadTimeout(readTimeout).build();
		return restTemplate; 
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
