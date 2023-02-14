package com.stocks;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Program to display total stocks
public class StockPortfolio extends Stock{
    public static StockPortfolio stockPortfolio =new StockPortfolio();
    public static ArrayList<Stock> stockList = new ArrayList<>();
    public double totalStockValue=0.0;
    public static void add(){       //Method to add stock details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Stock name");
        stockPortfolio.setStockName(scanner.nextLine());
        System.out.println("Enter shares");
        stockPortfolio.setShares(scanner.nextDouble());
        System.out.println("Enter share price");
        stockPortfolio.setSharePrice(scanner.nextDouble());
        Stock stock = new Stock(stockPortfolio.getStockName(),stockPortfolio.getShares(),stockPortfolio.getSharePrice());
        stockList.add(stock);
        System.out.println(stockList);
    }
    public static void totalStockValue(){       //Method to calculate total stocks
        ListIterator<Stock> iterator = stockList.listIterator();
        while (iterator.hasNext()){
            Stock stock= iterator.next();
            stockPortfolio.totalStockValue+=stock.getValueOfEachStock();
        }
    }
    public static void display(){               //Method to display total stocks
        totalStockValue();
        System.out.println("Total Stock value: " + stockPortfolio.totalStockValue);
    }
    public static void main(String[] args) {
    int flag = 1,input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to stocks");
    do{
        System.out.println("Enter stock details");
        add();
        System.out.println("Do you want to continue adding stocks");
        input=scanner.nextInt();
        flag=(input==1)?1:0;
    }while (flag==1);
        display();
    }
}
