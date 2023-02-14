package com.stocks;

public class Stock {
    private String stockName;
    private double shares;
    private double sharePrice;
    private double valueOfEachStock=0.0;
    public double totalStockValue=0.0;

    public double getSharePrice() {
        return sharePrice;
    }
    public String getStockName() {
        return stockName;
    }
    public double getShares() {
        return shares;
    }
    public double getTotalStockValue() {
        return totalStockValue;
    }
    public double getValueOfEachStock() {
        return valueOfEachStock;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }
    public void setValueOfEachStock(double valueOfEachStock) {
        this.valueOfEachStock = valueOfEachStock;
    }
    public void setShares(double shares) {
        this.shares = shares;
    }
    Stock(){
        super();
    }
    public Stock(String stockName,double shares, double sharePrice){
        this.stockName=stockName;
        this.shares=shares;
        this.sharePrice=sharePrice;
        valueOfEachStock=shares*sharePrice;
    }

    @Override
    public String toString() {
        return "Stock: " + this.stockName + "\nshares: " + this.shares + "\nsharePrice: " + this.sharePrice + "\nvalue: " + this.valueOfEachStock;
    }
}
