package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 1500.0, 5);
        Product product2 = new Product(2, "Phone", 800.0, 10);

        User user1 = new User(101, "Semih", 3000);
        Cart cart1 = new Cart();
        cart1.addProduct(product1);
        cart1.addProduct(product2);

        System.out.println("Müşteri: " + user1.getUsername() + "  Cüzdan Bakiyesi: " + user1.getWalletBalance());
        System.out.println("Sepet toplamı: " + cart1.getTotalPrice());

        if(user1.getWalletBalance() >= cart1.getTotalPrice()){
            System.out.println("Sipariş başarıyla oluşturuldu ");
            double newBalance = user1.getWalletBalance() - cart1.getTotalPrice();
            user1.setWalletBalance(newBalance);
            System.out.println("Güncel bakiye:" + user1.getWalletBalance());


        } else {
            System.out.println("Sipariş onaylanmadı.Ödeme yönteminizi güncelleyiniz.(Yetersiz Bakiye) ");
        }
    }
}
