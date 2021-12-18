package com.example.appchatbackend.repository;

import com.example.appchatbackend.entity.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MessageRespository extends ReactiveMongoRepository<Message, Long> {
    @Tailable
    Flux<Message>  findWithTailableCursorByChanelId(long chatId);
}