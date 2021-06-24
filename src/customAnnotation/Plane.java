package customAnnotation;

public class Plane {

    @MySuperDuperPuperCustomAnnotation(isVeryBigField = true, number = 1)
    private String color;

    @MySuperDuperPuperCustomAnnotation(isVeryBigField = false, number = 2)
    private int size;

    @MySuperDuperPuperCustomAnnotation(isVeryBigField = false)
    private boolean isInTheAir;
}
