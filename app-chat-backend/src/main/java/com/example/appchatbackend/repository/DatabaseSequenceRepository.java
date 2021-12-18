package com.example.appchatbackend.repository;

import com.example.appchatbackend.entity.DatabaseSequence;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseSequenceRepository extends ReactiveMongoRepository<DatabaseSequence, String> {
}
