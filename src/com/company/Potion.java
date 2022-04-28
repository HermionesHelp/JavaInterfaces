package com.company;

public class Potion extends Item {

    private Integer manaAmount;

    public Potion (String name, String description, Integer quantity, Integer buyPrice, Integer manaAmount){
        super(name, description, quantity, buyPrice);
        this.manaAmount = manaAmount;
    }

    public Integer getManaAmount() {
        return manaAmount;
    }

    @Override
    public String toString(){
        return this.getName() + "\n Description: " + this.getDescription() + "\n I have " + this.getQuantity() + " it replenishes "
                + this.getManaAmount() + " points of mana. " + "they cost " + this.getBuyPrice() + " gold.\n";
    }

    public String removeItem() {
        return "You used " + this.getName() + ". It has been removed from your inventory..";
    }

    public String affectCharacter(){
        return "You used " + this.getName() + ". Your mana is restored by " + this.getManaAmount() + "points." + this.removeItem();
    }

    public String determineSellPrice(Integer shopMarkdown) {
        Integer sellPrice = this.getBuyPrice()/shopMarkdown;
        return "Your " + this.getName() + " is worth " + sellPrice + " gold.";
    }


}
