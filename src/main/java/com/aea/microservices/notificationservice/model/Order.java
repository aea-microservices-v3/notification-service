package com.aea.microservices.notificationservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Order")
public class Order
{
	@Id
	private String orderId;
	private String username;
	private OrderDetails orderDetails;
	private int quantity;
}
