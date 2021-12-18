package com.example.appchatbackend.service.impl;

import com.example.appchatbackend.entity.Chanel;
import com.example.appchatbackend.entity.Message;
import com.example.appchatbackend.repository.MessageRespository;
import com.example.appchatbackend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRespository messageRespository;

    @Autowired
    ReactiveMongoOperations mongoOperations;

    @Override
    public Mono<Message> save(Message message, long chatId) {
        Chanel chanel = new Chanel();
        chanel.setId(chatId);
//        message.setChanel(chanel);
        return messageRespository.save(message);
    }

    @Override
    public Mono<Void> deleteById(long id) {
        return messageRespository.deleteById(id);
    }

    @Override
    public Mono<Message> findById(long id) {
        return messageRespository.findById(id);
    }

    @Override
    public Flux<Message> findAll() {
        return messageRespository.findAll();
    }

    @Override
    public Flux<Message> streamNewMessages() {
        return null;
    }
}
