package com.example.controllers;

import com.example.repositories.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/recipes")
@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipes/index";
    }

}
