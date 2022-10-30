package com.aea.microservices.notificationservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aea.microservices.notificationservice.config.MessageConfig;
import com.aea.microservices.notificationservice.model.Order;
import com.aea.microservices.notificationservice.repository.OrderRepository;

@Component
public class NotificationConsumer {
	
	private static Logger LOG = LoggerFactory.getLogger(NotificationConsumer.class);
	
	@Autowired
	private OrderRepository orderRepository;
	
	@RabbitListener(queues = MessageConfig.QUEUE)
    public void consumeOrderAndPushToDatabase(Order order) {
        LOG.info("Order received from Queue => {}", order);
        LOG.info("Saving order to DB => {}", order);
        orderRepository.save(order);
    }
	
}
