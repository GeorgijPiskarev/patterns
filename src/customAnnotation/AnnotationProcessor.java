package customAnnotation;

import java.lang.reflect.Field;

public class AnnotationProcessor {
    public void doSomethingWithSuperDuperPuperCustomAnnotation(Class<?>[] classes) {
        for (Class<?> clas : classes) {
            Field[] fields = clas.getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(MySuperDuperPuperCustomAnnotation.class)) {
                    MySuperDuperPuperCustomAnnotation mySuperDuperPuperCustomAnnotation =
                            field.getAnnotation(MySuperDuperPuperCustomAnnotation.class);
                    System.out.println("Class name: " + clas.getSimpleName());
                    System.out.println("Number: " + mySuperDuperPuperCustomAnnotation.number());
                    System.out.println("Field name: " + field.getName());
                    if (field.getName().equals("isDead") && clas.getSimpleName().equals("Brain")) {
                        System.out.println("Покойся с миром!");
                    }
                    System.out.println("Big field: " + mySuperDuperPuperCustomAnnotation.isVeryBigField());
                    System.out.println();
                }
            }
        }
    }
}
