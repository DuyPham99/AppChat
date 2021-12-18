package com.example.appchatbackend;

import com.example.appchatbackend.entity.Message;
import com.example.appchatbackend.repository.MessageRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class AppChatBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppChatBackendApplication.class, args);
    }
}
