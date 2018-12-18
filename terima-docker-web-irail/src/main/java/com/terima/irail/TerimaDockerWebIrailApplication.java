package com.terima.irail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.terima.irail"})
public class TerimaDockerWebIrailApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerimaDockerWebIrailApplication.class, args);
	}

}

