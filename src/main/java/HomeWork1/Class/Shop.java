package HomeWork1.Class;

import seminars.first.Shop.Product;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<seminars.first.Shop.Product> products;

    // Геттеры, сеттеры:
    public List<seminars.first.Shop.Product> getProducts() {
        return products;
    }

    public void setProducts(List<seminars.first.Shop.Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<seminars.first.Shop.Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return null;
    }

}