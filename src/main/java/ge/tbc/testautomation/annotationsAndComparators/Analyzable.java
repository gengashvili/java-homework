package ge.tbc.testautomation.annotationsAndComparators;

public class Analyzable {
    @VariableNameAnnotation(name = "Variable1")
    byte variable1 = 1;

    @VariableNameAnnotation(name = "Variable2")
    short variable2 = 2;

    @VariableNameAnnotation(name = "Variable3")
    int variable3 = 3;

    @VariableNameAnnotation(name = "Variable4")
    long variable4 = 4;

    @VariableNameAnnotation(name = "Variable5")
    float variable5 = 5;

    @VariableNameAnnotation(name = "Variable6")
    double variable6 = 6;

    @VariableNameAnnotation(name = "Variable7")
    boolean variable7 = true;

    @VariableNameAnnotation(name = "Variable8")
    char variable8 = '$';

    @VariableNameAnnotation(name = "Variable9")
    Byte variable9 = 9;

    @VariableNameAnnotation(name = "Variable10")
    Short variable10 = 10;

    @VariableNameAnnotation(name = "Variable11")
    Integer variable11 = 11;

    @VariableNameAnnotation(name = "Variable12")
    Long variable12 = 12L;

    @VariableNameAnnotation(name = "Variable13")
    Float variable13 = 13F;

    @VariableNameAnnotation()
    Double variable14 = 14D;

    @VariableNameAnnotation(name = "something")
    String  variable15 = "variable 15";


}
