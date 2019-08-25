package com.liuencier.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Scanner;

public class ConsumerClient {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");
        context.start();;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();
            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            System.out.println(serviceAPI.sendMessage(message));
        }
    }
}
