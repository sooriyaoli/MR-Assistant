package com.aviras.mrassistant.models;

import java.util.ArrayList;
import java.util.List;

import io.realm.annotations.PrimaryKey;

/**
 * Represent order
 * <p/>
 * Created by ashish on 8/6/16.
 */
public class Order {

    @PrimaryKey
    private int id;

    private Doctor doctor;

    private List<OrderItem> items = new ArrayList<>();

    private long createdDate;
    private long expectedDeliveryDate;
    private long actualDeliveryDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public long getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(long expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public long getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    public void setActualDeliveryDate(long actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }
}
