package biz.midao.model;

import java.util.Collection;

public interface Step {
    Collection<Ingredient> execute(Collection<Ingredient> ingredients, Collection<Instruction> instructions);
}
