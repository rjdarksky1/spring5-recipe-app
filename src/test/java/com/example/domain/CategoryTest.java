package com.example.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
        String descriptions = "American";
        category.setDescription(descriptions);
        assertEquals(descriptions, category.getDescription());
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        recipe.getCategories().add(category);
        assertEquals(category, recipe.getCategories().stream().findFirst().get());
    }

}