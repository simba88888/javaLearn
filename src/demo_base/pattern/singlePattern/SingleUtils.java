package demo_base.pattern.singlePattern;

import java.lang.reflect.Field;

public class SingleUtils {
    public static void print(Class clazz) {
        try {
            Field initNum = clazz.getDeclaredField("initNum");
            initNum.setAccessible(true);
            try {
                System.out.println(clazz.getSimpleName() + " initialization times are " + initNum.get(clazz));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
