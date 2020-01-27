package com.xupes.randomhouse;

import com.xupes.randomhouse.xupeAipClient.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

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
