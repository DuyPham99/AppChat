package com.example.appchatbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection  = "database_sequences")
public class DatabaseSequence {
    @Id
    @Field(value = "_id", targetType = FieldType.STRING)
    private String id;
    private long seq;
}
