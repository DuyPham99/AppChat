package com.example.appchatbackend.handlle;

import com.example.appchatbackend.entity.Chanel;
import com.example.appchatbackend.entity.Message;
import com.example.appchatbackend.service.ChanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class ChanelHandler {

    @Autowired
    ChanelService chanelService;

    public Mono<ServerResponse> postChanel(ServerRequest request) {
        return request
                .bodyToMono(Chanel.class)
                .flatMap(chanel -> chanelService.save(chanel))
                .flatMap(chanel -> ServerResponse.created(URI.create("/api/v1/chats/" + chanel.getId())).build());
    }

    public Mono<ServerResponse> getChanels(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(APPLICATION_JSON)
                .body(chanelService.findAll(), Chanel.class);
    }
}
