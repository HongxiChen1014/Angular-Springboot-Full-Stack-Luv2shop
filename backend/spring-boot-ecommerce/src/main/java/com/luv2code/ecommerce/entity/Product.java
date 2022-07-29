package com.luv2code.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data // Automatically generate the getter/setter methods behind the scenes
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @Column(name="sku")
    private String sku;

    @Column(name="description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name="active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInstock;

    @Column(name = "date_created")
    @CreationTimestamp // Hibernate will automatically manage the timestamps
    private Date dateCreated;

    @Column(name = "last_updated")
    @CreationTimestamp // Hibernate will automatically manage the timestamps
    private Date lastUpdated;

}


