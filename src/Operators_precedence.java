public class Operators_precedence {
    public static void main(String[] args) {
        System.out.println("it is the ");
// Precedence & Associativity
//        Postfix -> ++ - -	Left to right
//        Unary -> + - ! ~ ++ - -	Right to left
//        Multiplicative -> * / %	Left to right
//        Additive -> + -	Left to right
//        Shift -> << >>	Left to right
//        Relational -> < <= > >=	Left to right
//        Equality -> == !=	Left to right
//        Bitwise AND -> &	Left to right
//        Bitwise XOR -> ^	Left to right
//        Bitwise OR -> |	Left to right
//        Logical AND -> &&	Left to right
//        Logical OR ->||	Left to right
//        Conditional -> ?:	Right to left
//        Assignment -> = += -= *= /= %=>>= <<= &= ^= |=	Right to left


        // Quick Quiz
        int x =6;
        int y = 1;
        //  int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

        System.out.println("change in Priority using parenthesis ");
        int first = 4*(5-6); // answer will be 14 if we remove parenthesis but due to its effect we will get answer "-4"
//        int second = (5-4)*5;
//        int sum = first+second;
//        System.out.println(sum);
        System.out.println(first);
    }
}


