package vernandodev.springbootrestapi.models.repos;

import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Supplier;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {

}
