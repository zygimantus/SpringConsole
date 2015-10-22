package com.zygimantus.springconsole;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Zygimantus
 */
public class App {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Message message = (Message) context.getBean("message");

        logger.info("Message is: {}", message.getText());
    }
}
