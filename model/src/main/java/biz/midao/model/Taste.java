package biz.midao.model;

public class Taste {
    private final int id;
    private final String name;
    private final String description;

    public Taste(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
