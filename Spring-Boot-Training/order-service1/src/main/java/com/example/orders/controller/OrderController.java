package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;

import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
	
	private OrderService service;
	
	public OrderController(OrderService service) {
		this.service = service;
	}

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
    	OrderEntity res = service.createOrder(request);
    	OrderResponseDTO dto = OrderMapper.toResponseDTO(res);
       return new ResponseEntity<OrderResponseDTO>( dto , HttpStatusCode.valueOf(201));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
    	
    	OrderEntity res = service.getOrderById(id);
    	OrderResponseDTO dto = OrderMapper.toResponseDTO(res);
    	return new ResponseEntity<>(dto , HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
    	service.deleteOrder(id);
    	return new ResponseEntity<>( "Order deleted successfully" ,HttpStatus.OK);
    }
}
