package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	private OrderRepository repo;
	
	public OrderServiceImpl(OrderRepository repo) {
		this.repo = repo;
	}

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
    	OrderEntity order = OrderMapper.toEntity(request);
    	return repo.save(order);
    }

    @Override
    public OrderEntity getOrderById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new OrderNotFoundException());
    }

    @Override
    public void deleteOrder(Long id)  {
        if(repo.existsById(id)) {
        	repo.deleteById(id);
        }else {
        	throw new OrderNotFoundException();
        }
    }
}
