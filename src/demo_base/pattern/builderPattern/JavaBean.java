package demo_base.pattern.builderPattern;

public class JavaBean {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private String address;
        private int age;

        private Builder() {
        }

        public static Builder aJavaBean() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public JavaBean build() {
            JavaBean javaBean = new JavaBean();
            javaBean.setName(name);
            javaBean.setAddress(address);
            javaBean.setAge(age);
            return javaBean;
        }
    }
}
