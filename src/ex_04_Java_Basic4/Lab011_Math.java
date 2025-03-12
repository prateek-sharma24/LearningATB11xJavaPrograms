package ex_04_Java_Basic4;

public class Lab011_Math {
    public static void main(String[] args) {
        // Given values for x, y and z
        double x=10.0;
        double y=10.0;
        double z=10.0;
        //compute the expression
        double result=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        //Print the result
        System.out.println(result);
    }

}
