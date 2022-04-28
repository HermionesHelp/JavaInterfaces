package com.company;

public abstract class Item {
    private String name;
    private String description;
    private Integer quantity;
    private Integer buyPrice;


    public Item (String name, String description, Integer quantity, Integer buyPrice){
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
    }

    @Override
    public String toString(){
        return this.getName() + "\n Description: " + this.getDescription() + "\n I have " + this.getQuantity() + ", they cost " + this.getBuyPrice() + " gold.\n";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }
}
