package cz.ivosahlik.springrestapifaketory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("/config/config.properties")
@SpringBootApplication
public class SpringRestApifaketoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApifaketoryApplication.class, args);
	}
}
