package service;

import model.Product;

import java.util.*;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Bánh", 10000, "vàng", "Cosy"));
        products.put(2, new Product(2, "Kẹo", 5000, "xanh", "panme"));
        products.put(3, new Product(3, "Nước ngọt ", 15000, "đỏ", "red-bull"));
        products.put(4, new Product(4, "Bia", 20000, "trắng", "tiger"));
        products.put(5, new Product(5, "Rượu", 100000, "đà", "su-chu"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {

        for (Integer key : products.keySet()) {
            if (products.get(key).getName().contains("bánh") ||
                    products.get(key).getName().contains("kẹo") ||
                    products.get(key).getName().contains("nước ngọt") ||
                    products.get(key).getName().contains("bia") ||
                    products.get(key).getName().contains("rượu")) {


            }
        }

        return null;
    }


}
