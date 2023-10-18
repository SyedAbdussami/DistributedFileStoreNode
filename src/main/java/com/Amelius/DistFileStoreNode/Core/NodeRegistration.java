package com.Amelius.DistFileStoreNode.Core;

import com.Amelius.DistFileStoreNode.DTOs.NodeRegistrationRequest;
import com.Amelius.DistFileStoreNode.DTOs.NodeRegistrationResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Component
public class NodeRegistration implements CommandLineRunner {

    @Value("${master.port}")
    private  int masterPort;
    @Value("${server.port}")
            private int port;

    @Autowired
    Environment environment;
    @Override
    public void run(String... args) throws Exception {
        NodeRegistrationRequest node=new NodeRegistrationRequest();
        node.setAddress("localhost");
        node.setPort(port);
        node.setCapacity(1000);
        node.setNodeName("Node-"+port);
        node.setFileBlocks(0);

        WebClient webClient = WebClient.create("http://localhost:"+masterPort);

        Object responseObject = webClient
                .post()
                .uri("/api/node/register")
                .body(Mono.just(node), NodeRegistrationRequest.class)
                .retrieve();

        System.out.println("Request Sent");
        System.out.println("Response: " + responseObject);
    }
}
