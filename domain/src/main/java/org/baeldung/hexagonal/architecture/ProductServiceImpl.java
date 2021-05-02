package org.baeldung.hexagonal.architecture;

import java.util.List;

import org.baeldung.hexagonal.architecture.port.inbound.ProductServicePort;
import org.baeldung.hexagonal.architecture.port.outbound.ProductPersistencePort;

class ProductServiceImpl implements ProductServicePort {

    private final ProductPersistencePort productRepository;

    ProductServiceImpl(ProductPersistencePort productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public ProductDto getProductById(Long productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public ProductDto addProduct(ProductDto product) {
        return productRepository.addProduct(product);
    }

    @Override
    public void removeProduct(Long productId) {
        productRepository.removeProduct(productId);
    }
}
