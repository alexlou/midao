package biz.midao.model;

import java.util.Collection;

public class IngredientTaste {
    private final Ingredient ingredient;
    private final Taste overallTaste;
    private final Collection<IngredientTaste> detailTastes;

    public IngredientTaste(Ingredient ingredient, Taste overallTaste, Collection<IngredientTaste> detailTastes) {
        this.ingredient = ingredient;
        this.overallTaste = overallTaste;
        this.detailTastes = detailTastes;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Taste getOverallTaste() {
        return overallTaste;
    }

    public Collection<IngredientTaste> getDetailTastes() {
        return detailTastes;
    }
}
