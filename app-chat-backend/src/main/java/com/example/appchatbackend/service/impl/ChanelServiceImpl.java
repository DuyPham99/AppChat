package com.example.appchatbackend.service.impl;

import com.example.appchatbackend.entity.Chanel;
import com.example.appchatbackend.repository.ChanelRepository;
import com.example.appchatbackend.service.ChanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ChanelServiceImpl implements ChanelService {

    @Autowired
    private ChanelRepository chanelRepository;

    @Override
    public Flux<Chanel> findAll() {
        return chanelRepository.findAll();
    }

    @Override
    public Mono<Chanel> findChanelById(String id) {
        return chanelRepository.findById(id);
    }

    @Override
    public Mono<Chanel> save(Chanel chanel) {
        return chanelRepository.save(chanel);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return chanelRepository.deleteById(id);
    }
}
