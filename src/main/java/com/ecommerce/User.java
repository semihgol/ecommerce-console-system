package com.ecommerce;

public class User {
    private int id;
    private String username;
    private double walletBalance;

    public User(int id, String username, double walletBalance) {
        this.id = id;
        this.username = username;
        this.walletBalance = walletBalance;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        if (walletBalance >= 0) {
            this.walletBalance = walletBalance;

        } else {
            System.out.println("Error: wallet cannot be negative");
        }

    }


}
