package com.zygimantus.springconsole;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Zygimantus
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Message message = (Message) context.getBean("message");

        System.out.println(message.getText());
    }
}
