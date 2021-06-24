package customAnnotation;

public class Brain {

    @MySuperDuperPuperCustomAnnotation(isVeryBigField = false, number = 1)
    private int size;

    @MySuperDuperPuperCustomAnnotation(isVeryBigField = false, number = 2)
    private boolean isDead;

    @MySuperDuperPuperCustomAnnotation(isVeryBigField = true, number = 3)
    private String color;
}
