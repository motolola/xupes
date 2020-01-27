package io.motolola.randomhouse;

import io.motolola.randomhouse.xupeAipClient.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class RandomhouseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(RandomhouseApplication.class, args);
		System.out.println(Client.getToken());
	}

	@Scheduled(initialDelay = 1000L, fixedDelay = 500L)
	public void testing()
	{
		//System.out.println(new Date());
	}

	@Configuration
	@EnableScheduling
	class schedulinh { }
}
