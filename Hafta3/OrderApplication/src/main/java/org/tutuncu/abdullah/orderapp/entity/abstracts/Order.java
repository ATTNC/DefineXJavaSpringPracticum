package org.tutuncu.abdullah.orderapp.entity.abstracts;

import java.time.LocalDate;

public abstract class Order {


    private int id;
    private String orderType;
    private int cost;
    private LocalDate createDate;


    public Order() {
    }

    public Order(int id, String orderType, int cost, LocalDate createDate) {
        this.id = id;
        this.orderType = orderType;
        this.cost = cost;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
