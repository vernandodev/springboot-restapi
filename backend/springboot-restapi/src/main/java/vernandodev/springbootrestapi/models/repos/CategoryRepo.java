package vernandodev.springbootrestapi.models.repos;

import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import vernandodev.springbootrestapi.models.entities.Category;
import vernandodev.springbootrestapi.models.entities.Product;

public interface CategoryRepo extends PagingAndSortingRepository<Category, Long> {

}
