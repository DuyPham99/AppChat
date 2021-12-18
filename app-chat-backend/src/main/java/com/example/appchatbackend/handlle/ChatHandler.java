package com.example.appchatbackend.handlle;

import com.example.appchatbackend.entity.Message;
import com.example.appchatbackend.repository.MessageRespository;
import com.example.appchatbackend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

import static org.springframework.http.MediaType.*;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class ChatHandler {

    @Autowired
    MessageService messageService;

    @Autowired
    MessageRespository messageRespository;

    public Mono<ServerResponse> postMessage(ServerRequest request) {
        String chanelId = request.pathVariable("chanelId");
        return request
                .bodyToMono(Message.class)
                .flatMap(message -> messageService.save(message, chanelId))
                .flatMap(chat -> ServerResponse.created(URI.create("/api/v1/chats/" + chat.getId())).build());
    }

    public Mono<ServerResponse> getAllMessage(ServerRequest request) {
        return ok()
                .contentType(APPLICATION_JSON)
                .body(messageService.findAll(), Message.class);
    }

    public Mono<ServerResponse> getNewMessage(ServerRequest request) {
        String chanelId = request.pathVariable("chanelId");
        return ok()
                .contentType(TEXT_EVENT_STREAM)
                .body(messageRespository.findByChanel_Id(chanelId), Message.class);
    }
}
