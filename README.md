# E-Commerce Console Simulation

This project is a mini e-commerce simulation operating on the console, developed in Java using Object-Oriented Programming (OOP) principles. It simulates core shopping cart logic, user balance verification, and secure data encapsulation.

## Technologies & Concepts Used
* **Language:** Java 21
* **OOP Principles:** Encapsulation, Data Integrity
* **Data Structures:** ArrayList, List
* **Algorithms:** Dynamic price calculation using for-each loops, conditional purchase control via if-else blocks

## Project Architecture
The project consists of 4 core Java classes:
1. **Product:** Manages product details including id, name, price, and stockQuantity with secure getter/setter methods.
2. **User:** Manages customer credentials and the walletBalance, which is updated post-purchase.
3. **Cart:** Holds a list of Product objects. It handles adding products to the cart (addProduct) and dynamically calculating the total price of the items (getTotalPrice).
4. **Main:** The entry point of the application that instantiates the objects and simulates checkout scenarios, covering both successful purchases and insufficient balance cases.

## How to Run
1. Clone or download the project repository to your local machine.
2. Open the project using a Java IDE (such as IntelliJ IDEA or Eclipse).
3. Navigate to the Main.java class and click the Run button.

## Sample Console Output (Successful Purchase)
```text
Müşteri: Semih | Cüzdan Bakiyesi: 3000.0
Sepet toplamı: 2300.0
Sipariş başarıyla oluşturuldu
Güncel bakiye: 700.0
