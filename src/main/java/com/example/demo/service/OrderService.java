package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import java.util.List;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);
    OrderDTO getOrderById(Long id);
    List<OrderDTO> getOrdersByUserId(Long userId);
    List<OrderDTO> getAllOrders();
    OrderDTO updateOrderStatus(Long id, String status);
    void cancelOrder(Long id);
} 