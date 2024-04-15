package com.ohgiraffers;


public class ItemDTO {

    private int id;
    private String name;
    private int price;
    private int amount;
    private String date;

    public ItemDTO() {}

    public ItemDTO(int id, String name, int price, int amount, String date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
