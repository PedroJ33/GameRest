package com.example.gamerest.config;

import org.bson.Document;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoConnectionTest implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    public MongoConnectionTest(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) {

        Document response = mongoTemplate.executeCommand(
                new Document("ping", 1)
        );

        System.out.println("====================================");
        System.out.println("       GAMEREST - MONGODB ATLAS");
        System.out.println("====================================");
        System.out.println("Respuesta: " + response);
        System.out.println("CONEXION EXITOSA CON MONGODB ATLAS");
        System.out.println("====================================");
    }
}
