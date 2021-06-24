package customAnnotation;

public class Main {
    public static void main(String[] args) {
        Class<?>[] classes = new Class[2];
        classes[0] = Brain.class;
        classes[1] = Plane.class;
        AnnotationProcessor annotationProcessor = new AnnotationProcessor();
        annotationProcessor.doSomethingWithSuperDuperPuperCustomAnnotation(classes);
    }
}
