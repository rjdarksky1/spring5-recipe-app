package com.example.controllers;

import com.example.domain.Category;
import com.example.domain.UnitOfMeasure;
import com.example.repositories.CategoryRepository;
import com.example.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository,
                           UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexpage() {
        Optional<Category> categoryOptional =
                categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional =
                unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id: " + categoryOptional.get().getId());
        System.out.println("UOM id:" + unitOfMeasureOptional.get().getId());

        return "index";
    }

}
