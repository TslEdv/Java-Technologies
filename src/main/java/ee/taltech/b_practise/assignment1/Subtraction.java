package ee.taltech.b_practise.assignment1;

public class Subtraction {

    //todo A create a static function that takes in two ints
    // and returns the result of subtracting second element from the first
    // p.s pay attention to function and parameter names
    public static int substract(int x1, int x2) {
        return x1 - x2;
    }

    public static void main(String[] args) {
        //todo B
        // - call your newly created function with 5 and 2, print out the result
        // - call your newly created function with -5 and -2, print out the result
        System.out.println(substract(5, 2));
        System.out.println(substract(-5, -2));
        //todo C if you were to add another method
        // with the same name, but 3 inputs, then it would be an example of?
        // a) overreaching?
        // b) overloading?
        // c) overriding?
        // d) overreacting?
        // e) overlooking?
        // Answer:b
    }
}

