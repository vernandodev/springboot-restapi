package vernandodev.springbootrestapi.models.repos;

import org.springframework.data.repository.CrudRepository;
import vernandodev.springbootrestapi.models.entities.Supplier;

import java.util.List;

public interface SupplierRepo extends CrudRepository<Supplier, Long> {

    // Derived Query
    // By deriving the query from the method name directly
    Supplier findByEmail(String email);
    List<Supplier> findByNameContains(String name); // Contains / Like

    List<Supplier> findByNameStartsWith(String prefix); // find from front word
}