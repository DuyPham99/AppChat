package com.example.appchatbackend.service;

import com.example.appchatbackend.entity.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessageService {
    Mono<Message> save(Message message, String chatId);
    Mono<Void> deleteById(long id);
    Mono<Message> findById(long id);
    Flux<Message> findAll();
    Flux<Message> streamNewMessages();
}
