package biz.midao.model.recipe;

import java.util.Collection;

public class RecipeNode<T extends RecipeNode> {
    protected final Collection<T> parents;
    protected final Collection<T> children;

    public RecipeNode(Collection<T> parents, Collection<T> children) {
        this.parents = parents;
        this.children = children;
    }

    public Collection<T> getParents() {
        return parents;
    }

    public Collection<T> getChildren() {
        return children;
    }
}
