package the_basics;

public class Operators {
    static void main(String[] args) {
        int a = 10, b = 5;
        int sum = a+b;
        int sub = a-b;
        int product = a*b;
        int quot = a/b;
        int mod = a%3;

        System.out.printf("%d %d %d %d %d%n",sum, sub, product, quot, mod);

        boolean compResult1 = a < b;
        boolean compResult2 = a > b;
        System.out.printf("A is less then B: %b%nA is greater than B: %b%n",compResult1, compResult2);

        int c = 5;
        boolean logicalResult = a > b && b >= c;
        System.out.println(logicalResult);
        System.out.println("++++++++++++++++");
        boolean logicalResult2 = a < b || c != c;
        System.out.println(logicalResult2);
        System.out.println("++++++++++++++++");
        // a = 10, b = 5, c = 5
        boolean preResult = a + b > b + c && b * c < a / b;
        System.out.println(preResult);

    }
}
// Operators

// Arithmetic operators => * % / + -
// Relational Operator (or) Comparison => < > >= <= == !=
// Logical Operator => && ||
// Assignment

// Precedence 1.Arithmetic 2.Relational 3.Logical
