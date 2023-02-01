package vernandodev.springbootrestapi.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernandodev.springbootrestapi.models.entities.Supplier;
import vernandodev.springbootrestapi.models.repos.SupplierRepo;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SupplierService {
    @Autowired
    private SupplierRepo supplierRepo;

    public Supplier save(Supplier supplier){
        return supplierRepo.save(supplier);
    }

    public Supplier findOne(Long id){
        Optional<Supplier> supplier = supplierRepo.findById(id);
        if(!supplier.isPresent()){
            return null;
        }
        return supplier.get();
    }

    public Iterable<Supplier> findAll(){
        return supplierRepo.findAll();
    }

    public void removeOne(Long id){
        supplierRepo.deleteById(id);
    }

    // delivery query
    public Supplier findByEmailServices(String email){
        return supplierRepo.findByEmail(email);
    }

    public List<Supplier> findByNameServices(String name){
        return supplierRepo.findByNameContains(name);
    }

    public List<Supplier> findByNameStartsWith(String prefix){
        return supplierRepo.findByNameStartsWith(prefix);
    }


}
