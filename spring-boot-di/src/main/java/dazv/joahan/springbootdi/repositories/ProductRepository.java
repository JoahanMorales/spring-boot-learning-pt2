package dazv.joahan.springbootdi.repositories;

import dazv.joahan.springbootdi.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private List<Product> data;
    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "Teclado", 20L),
                new Product(2L, "Camara", 50L),
                new Product(3L, "Mouse", 40L),
                new Product(4L, "Monitor", 100L)
        );
    }
    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
