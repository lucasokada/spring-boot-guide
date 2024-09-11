package com.example.spring_boot_guide;

import com.example.spring_boot_guide.entity.Fisica;
import com.example.spring_boot_guide.utils.InstanceGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGuideApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGuideApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Fisica entity = InstanceGenerator.getPessoaFisica("111.222.333-44", "user1");

		System.out.println("\n" + entity + "\n");
	}
}
