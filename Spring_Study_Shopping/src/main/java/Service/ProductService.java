package Service;

import Products.Product;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;//실제 db와 데이터를 주고받는 객체

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {//jparepository에 구현된 save메서드 호출
        productRepository.save(product);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("상품 없음"));
    }
}
