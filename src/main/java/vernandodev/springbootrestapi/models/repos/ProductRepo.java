package vernandodev.springbootrestapi.models.repos;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Product;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    //custom function di dalam productRepo
    List<Product> findByNameContains(String name);

    @Query("SELECT p FROM Product p WHERE p.name = :name") // anotasi query untuk custom query, JPAQL
    public Product findProductByName(@PathParam("name") String name);
}
