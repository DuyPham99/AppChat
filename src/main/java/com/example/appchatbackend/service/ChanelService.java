package com.example.appchatbackend.service;

import com.example.appchatbackend.entity.Chanel;
import com.example.appchatbackend.entity.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ChanelService {
    Flux<Chanel> findAll();
    Mono<Chanel> findChanelById(String id);
    Mono<Chanel> save(Chanel chanel);
    Mono<Void> deleteById(String id);
}
