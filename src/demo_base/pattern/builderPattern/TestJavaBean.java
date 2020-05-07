package demo_base.pattern.builderPattern;

public class TestJavaBean {
    public static void main(String[] args) {
        //Original Code
        JavaBean originalBean = new JavaBean();
        originalBean.setAddress("address");
        originalBean.setAge(20);
        originalBean.setName("yangbin");
        System.out.println(originalBean);

        //application Builder Pattern
        JavaBean buildBean = JavaBean.builder()
                        .withAddress("address")
                        .withAge(20)
                        .withName("yangbin")
                        .build();

        System.out.println(buildBean);
    }
}
