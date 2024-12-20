package com.example.productserviceaws.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@Entity
public class Product extends BaseModel implements Serializable {
    String description;
    Double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
}
