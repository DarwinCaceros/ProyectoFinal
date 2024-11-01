package com.educacion.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration

public class MongoConfig  extends AbstractMongoClientConfiguration{

    @Override
    protected String getDatabaseName(){
        return "Educativo";
    }
    @Bean
    @Override
    public MongoClient mongoClient(){
        String connectionString = "mongodb+srv://dcacerosj:8IuWAO4D8lL9bUKA@educativo.00vcx.mongodb.net/?retryWrites=true&w=majority&appName=Educativo";
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoClient(), getDatabaseName());
    }
    
}
