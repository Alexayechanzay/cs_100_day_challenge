package the_basics;

public class DataTypeCasting {
    static void main(String[] args) {
        int a = 10;
        double b = a; //widening casting
        System.out.println(b);
        int c = (int) b;  //narrowing casting
        System.out.println(c);
    }
}