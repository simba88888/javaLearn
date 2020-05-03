package demo_base.pattern.facadePattern;

public class BusinessFacadeSvc {
    BusinessSvc1 svc1 = new BusinessSvc1();
    BusinessSvc2 svc2 = new BusinessSvc2();

    public void callSvc1AndSvc2(){
        svc1.service1();
        svc2.service2();
    }
}
