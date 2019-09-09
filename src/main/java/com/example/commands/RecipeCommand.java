package com.example.commands;

import com.example.domain.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;

    @NotBlank
    @Size(min = 3, max = 255) // hibernate default max 255
    private String description;

    @NotNull
    @Min(1)
    @Max(480)
    private Integer prepTime;

    @NotNull
    @Min(1)
    @Max(1440)
    private Integer cookTime;

    @NotNull
    @Min(1)
    @Max(20)
    private Integer servings;

    private String source;

    @URL
    private String url;

    @NotBlank
    private String directions;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Byte[] image;
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();

}
