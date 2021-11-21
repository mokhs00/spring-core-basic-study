package com.core.springcorestudy.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
