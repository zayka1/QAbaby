package task2.Product;

import java.util.HashMap;

public class PriceList {
    private HashMap<String, Double> priceList;

    public PriceList() {
        this.priceList = new HashMap<String, Double>();


    }
    public void addProduct(Product product) {
        this.priceList.put(product.getName(), product.getPrice());

    }
    public void changePrice(String name, double price) {
        if (priceList.containsKey(name)) {
            this.priceList.put(name, price);
        }
    }
    public void getPrice(String name) {
        if (priceList.containsKey(name)) {
            double price = priceList.get(name);
            System.out.println(price);
        }
}}
