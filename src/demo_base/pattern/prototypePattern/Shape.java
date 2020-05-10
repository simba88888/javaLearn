package demo_base.pattern.prototypePattern;

public abstract class Shape implements Cloneable {
    protected abstract void draw();
    private String id;
    protected String type;

    public Shape clone(){
        Shape cloneIntance = null;
        try {
            System.out.println("super class name is "+super.getClass().getSimpleName());
            cloneIntance = (Shape)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneIntance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "type="+type+",id="+id+",id address="+id.hashCode()+"dd"+this.hashCode();
    }
}
