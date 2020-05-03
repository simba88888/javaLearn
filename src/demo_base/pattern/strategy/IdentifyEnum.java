package demo_base.pattern.strategy;

public enum IdentifyEnum {
    SCHOOL("school"), USER("user"), CLASS("class");

    IdentifyEnum(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
