package vernandodev.springbootrestapi.models.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="tbl-products")
// opsi 1 (hanya tampil id tidak lengkap)
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id"
//)
public class Product implements Serializable {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increament
    private long id;
    @NotEmpty(message = "Name is required !")
    @Column(name="product_name", length = 100)
    private String name;
    @NotEmpty(message = "Description is required !")
    @Column(name = "product_description", length = 500)
    private String description;
    @NotNull(message = "Price is required !")
    @Column(name = "product_price")
    private Double price;
    @ManyToOne
    private Category category;
    @ManyToMany
    @JoinTable(
            name = "tbl-product_supplier",
            joinColumns = @JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name="supplier_id")
    )
    // opsi 2 (tampil lengkap)
    // (use @JsonManagedReference only displays in one entity in @JsonManageReference)
    @JsonManagedReference
    private Set<Supplier> suppliers;

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
// buat constructor

    public Product() {
    }

    public Product(long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // generate setter getter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
