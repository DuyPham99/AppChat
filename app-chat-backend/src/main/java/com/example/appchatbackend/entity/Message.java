package com.example.appchatbackend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "messages")
public class Message {
//    @Id
//    private long id;
//    private String author;
//    private String content;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private LocalDateTime published;
////    private Chanel chanel;
    private long chanelId;
}
