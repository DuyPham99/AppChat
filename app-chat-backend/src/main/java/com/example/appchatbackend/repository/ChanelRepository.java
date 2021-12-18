package com.example.appchatbackend.repository;

import com.example.appchatbackend.entity.Chanel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChanelRepository extends ReactiveMongoRepository<Chanel, String> {
}
