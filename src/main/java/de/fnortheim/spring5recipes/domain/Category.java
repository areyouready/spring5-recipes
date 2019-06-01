package de.fnortheim.spring5recipes.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * created by sebastian on May, 2019
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
