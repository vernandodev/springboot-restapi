package vernandodev.springbootrestapi.models.repos;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Category;
import vernandodev.springbootrestapi.models.entities.Product;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
