package com.example.appchatbackend.router;

import com.example.appchatbackend.handlle.ChanelHandler;
import com.example.appchatbackend.handlle.ChatHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class ChatRouter {
    @Bean
    public RouterFunction<ServerResponse> routeChats(ChatHandler chatHandler) {
        RouterFunction<ServerResponse> chatRoutes = RouterFunctions
                .route(RequestPredicates.POST(""), chatHandler::postMessage)
                .andRoute(RequestPredicates.GET("").and(accept(APPLICATION_JSON)), chatHandler::getAllMessage)
                .andRoute(GET("/stream").and(accept(TEXT_EVENT_STREAM)), chatHandler::getNewMessage);
        return RouterFunctions.nest(RequestPredicates.path("/api/v1/chats/{chanelId}/message"), chatRoutes);
    }

    @Bean
    public RouterFunction<ServerResponse> routeChanels(ChanelHandler chanelHandler) {
        RouterFunction<ServerResponse> chanelRoutes = RouterFunctions
                .route(RequestPredicates.POST(""), chanelHandler::postChanel)
                .andRoute(RequestPredicates.GET(""), chanelHandler::getChanels);
        return RouterFunctions.nest(RequestPredicates.path("/api/v1/chanels"), chanelRoutes);
    }
}
