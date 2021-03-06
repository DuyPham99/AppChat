package com.example.appchatbackend.service.impl;

import com.example.appchatbackend.entity.Chanel;
import com.example.appchatbackend.entity.Message;
import com.example.appchatbackend.repository.ChanelRepository;
import com.example.appchatbackend.repository.MessageRespository;
import com.example.appchatbackend.service.ChanelService;
import com.example.appchatbackend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRespository messageRespository;

    @Autowired
    private ChanelRepository chanelRepository;

    @Autowired
    ReactiveMongoOperations mongoOperations;

    @Override
    public Mono<Message> save(Message message, String chanelId) {
        return chanelRepository
                .findById(chanelId)
                .flatMap(x -> {
                    message.setChanel(x);
                    return messageRespository.save(message);
                });
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return messageRespository.deleteById(id);
    }

    @Override
    public Mono<Message> findById(String id) {
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
