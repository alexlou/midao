package biz.midao.model.recipe;

import java.util.Collection;

public class Step extends RecipeNode<IngredientNode>{

    public Step(Collection<IngredientNode> ingredients, Collection<IngredientNode> output) {
        super(ingredients, output);
        for (IngredientNode base : ingredients) {
            base.produce(this);
        }
        for (IngredientNode out : output) {
            out.comeFrom(this);
        }
    }
}
