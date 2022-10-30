package com.aea.microservices.notificationservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aea.microservices.notificationservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>
{

}
