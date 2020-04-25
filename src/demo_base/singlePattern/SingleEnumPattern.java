package demo_base.singlePattern;

public enum SingleEnumPattern {
        INSTANCE;

        private String objName;


        public String getObjName() {
            return objName;
        }


        public void setObjName(String objName) {
            this.objName = objName;
        }


        public static void main(String[] args) {

            // 单例测试
            SingleEnumPattern firstSingleton = SingleEnumPattern.INSTANCE;
            firstSingleton.setObjName("firstName");
            System.out.println(firstSingleton.getObjName());
            SingleEnumPattern secondSingleton = SingleEnumPattern.INSTANCE;
            secondSingleton.setObjName("secondName");
            System.out.println(firstSingleton.getObjName());
            System.out.println(secondSingleton.getObjName());

            // 反射获取实例测试
            try {
                SingleEnumPattern[] enumConstants = SingleEnumPattern.class.getEnumConstants();
                for (SingleEnumPattern enumConstant : enumConstants) {
                    System.out.println(enumConstant.getObjName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
