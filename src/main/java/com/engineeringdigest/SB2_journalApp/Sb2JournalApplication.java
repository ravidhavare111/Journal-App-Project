package com.engineeringdigest.SB2_journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Sb2JournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb2JournalApplication.class, args);
	}


	//For @Transactional annotation
	@Bean
	public PlatformTransactionManager transactionManager(MongoDatabaseFactory factory) {
		return new MongoTransactionManager(factory);
	}

}
