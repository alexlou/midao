package biz.midao.model.recipe;

import biz.midao.model.Amount;
import biz.midao.model.Ingredient;

import java.util.ArrayList;

public class IngredientNode extends RecipeNode<Step>{
    private final Ingredient ingredient;
    private final Amount amount;

    public IngredientNode(Ingredient ingredient, Amount amount) {
        super(new ArrayList<Step>(), new ArrayList<Step>());
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Amount getAmount() {
        return amount;
    }

    void comeFrom(Step step) {
        parents.add(step);
    }

    void produce(Step step) {
        children.add(step);
    }

}
