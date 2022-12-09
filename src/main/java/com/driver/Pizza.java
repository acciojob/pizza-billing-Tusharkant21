package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private  int extraToppingPrice;
    private int takeAwayPrice;
    private boolean isCheesAdded;
    private boolean isToppingAdded;
    private boolean isBillGenerated;
    private boolean isTakeAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // your code goes here
        this.isCheesAdded=false;
        this.isToppingAdded=false;
        this.isTakeAway=false;
        this.isBillGenerated=false;
        this.takeAwayPrice=20;
        this.extraCheesePrice=80;
        if(isVeg==true){
            this.price=300;
            this.extraToppingPrice=70;

        }
        else{
            this.price=400;
            this.extraToppingPrice=120;
        }
        this.bill="Base Price of Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheesAdded==false) {
            this.price = this.price + this.extraCheesePrice;
            this.isCheesAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false) {
            this.price = this.price + this.extraToppingPrice;
            this.isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            isBillGenerated=true;
            if(isCheesAdded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if(isToppingAdded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.extraToppingPrice+"\n";
            }
            if(isTakeAway==true){
                this.bill=this.bill+"Paperbag Added: "+this.takeAwayPrice+"\n";
            }


            this.bill=this.bill+ "Total price: "+this.price+"\n";

        }

        return this.bill;
    }
}
