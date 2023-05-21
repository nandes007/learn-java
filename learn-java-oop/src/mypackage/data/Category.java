package mypackage.data;

public class Category {
    private String id;

    private boolean expensive;

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    public String getId() {
        return id;
    }

    public boolean isExpensive() {
        return expensive;
    }
}
