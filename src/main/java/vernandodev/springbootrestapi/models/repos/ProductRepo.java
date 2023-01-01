package vernandodev.springbootrestapi.models.repos;

import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Product;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    //custom function di dalam productRepo
    List<Product> findByNameContains(String name);
}
