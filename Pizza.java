package ControlWork;

import java.util.List;

public abstract class Pizza {
    private String name;
    private List<String> ingredients;
    private List<String> stagesOfPreparing;

    public Pizza(String name, List<String> ingredients, List<String> stagesOfPreparing) {
        this.name = name;
        this.ingredients = ingredients;
        this.stagesOfPreparing = stagesOfPreparing;
    }

    public String getName() {
        return name;
    }
}
