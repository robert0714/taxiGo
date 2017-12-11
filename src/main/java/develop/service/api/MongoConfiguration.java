package develop.service.api;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableMongoRepositories(basePackages= {"develop.service.api.repository"})
@EnableAutoConfiguration(exclude = { org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration.class,
		org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class,
		org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.class , 
		org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration.class})
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "taxiGo";
	}

	@Value("${spring.data.mongodb.host}")
	private String host;
	
	@Value("${spring.data.mongodb.port}")
	private Integer port; 
	
	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(host, port);
	}
	@Bean
	public RestTemplate getRest() {
		return new RestTemplate();
	}
	
}
