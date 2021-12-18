//package com.example.appchatbackend.service.impl;
//
//import com.example.appchatbackend.entity.DatabaseSequence;
//import com.example.appchatbackend.repository.DatabaseSequenceRepository;
//import com.example.appchatbackend.service.DatabaseSequenceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.ReactiveMongoOperations;
//import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//
//import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
//import static org.springframework.data.mongodb.core.query.Criteria.where;
//import static org.springframework.data.mongodb.core.query.Query.query;
//
//@Service
//public class DatabaseSequenceServiceImpl implements DatabaseSequenceService {
//    @Autowired
//    private DatabaseSequenceRepository databaseSequenceRepository;
//
//    @Autowired
//    private ReactiveMongoOperations mongoOperations;
//
//    @Override
//    public long generateSequenceValue(String seqName) {
//        DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
//                new Update().inc("seq", 1), options().returnNew(true).upsert(true),
//                DatabaseSequence.class)
//                .doOnSuccess();
//        return !Objects.isNull(counter) ? counter.getSeq() : 1;
//    }
//}