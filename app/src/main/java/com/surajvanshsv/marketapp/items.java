package com.surajvanshsv.marketapp;

public class items {
    int itemImg;
    String itemName, itemDesc;

    public items(int itemImg, String itemName, String itemDesc) {
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }
    // getter and setter

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
