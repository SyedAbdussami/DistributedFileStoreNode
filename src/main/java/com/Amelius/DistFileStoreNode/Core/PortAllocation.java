//package com.Amelius.DistFileStoreNode.Core;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.server.ConfigurableWebServerFactory;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PortAllocation implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
//    @Value("${server.port.low}")
//    private  int lowPort;
//    @Value("${server.port.high}")
//    private  int highPort;
//    @Override
//    public void customize(ConfigurableWebServerFactory factory) {
//        int maxAttempts = 10;  // Adjust the number of attempts as needed
//        int port = -1;
//        int attempts = 0;
//
//        while (attempts < maxAttempts) {
//            int randomPort = (int) (Math.random() * (highPort - lowPort + 1) + lowPort);
//
//            try {
////                webServerFactory.setPort(randomPort);
////                webServerFactory.afterPropertiesSet();  // Apply the new port
//                factory.setPort(port);
//                port = randomPort;
//                break;  // Port successfully set
//            } catch (Exception e) {
//                attempts++;
//                System.err.println("Port " + randomPort + " is in use. Retrying...");
//            }
//        }
//
//        if (port != -1) {
//            System.out.println("Server is running on port: " + port);
//        } else {
//            System.err.println("Failed to find an available port after " + maxAttempts + " attempts.");
//        }
//
//    }
//}
