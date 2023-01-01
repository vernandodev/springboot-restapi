package vernandodev.springbootrestapi.models.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="tbl-products")
public class Product implements Serializable {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increament
    private long id;
    @Column(name="product_name", length = 100)
    private String name;
    @Column(name = "product_description", length = 500)
    private String description;
    @Column(name = "product_price")
    private Double price;

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