package de.kozdemirhasan.service;

import de.kozdemirhasan.customexception.ProductNotFoundException;
import de.kozdemirhasan.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Product getProductById(Long productId) {
        // Simulate product retrieval logic
        Product product = getProductFromDatabase(productId);

        if (product == null) {
            throw new ProductNotFoundException(productId);
        }

        return product;
    }

    // Simulated method to fetch a product from a database
    private Product getProductFromDatabase(Long productId) {
        // Implement your database logic here
        // Return null if the product is not found
        return null;
    }
}
