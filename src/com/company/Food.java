package com.company;

public class Food extends Item {

    private Integer healAmount;

    public Food (String name, String description, Integer quantity, Integer buyPrice, Integer healAmount){
        super(name, description, quantity, buyPrice);
        this.healAmount = healAmount;
    }

    public Integer getHealAmount() {
        return healAmount;
    }

    @Override
    public String toString(){
        return this.getName() + "\n Description: " + this.getDescription() + "\n I have " + this.getQuantity() + " it replenishes "
                + this.getHealAmount() + " points of health. " + "they cost " + this.getBuyPrice() + " gold.\n";
    }

    public String removeItem() {
        return "You used " + this.getName() + ". It has been removed from your inventory..";
    }

    public String affectCharacter(){
        return "You used " + this.getName() + ". Your health is restored by " + this.getHealAmount() + "points." + this.removeItem();
    }

    public String determineSellPrice(Integer shopMarkdown) {
        Integer sellPrice = this.getBuyPrice()/shopMarkdown;
        return "Your " + this.getName() + " is worth " + sellPrice + " gold.";
    }

}
