package ee.taltech.c_extra.problem1;

public class BizarreMath {

    //todo A
    // byte is a data structure from -128 to 127
    // can you explain in plain english (simpler the better)
    // why 127 + 1 = -128 ?!
    // Answer:
    // Byte consists of 8 binary values, where 127 = 01111111 and 10000000 is -128. The first number shows the positivity/negativity.
    // There are 256 value to a byte (127 + 128 + 1 (the 1 being a 0 on 00000000)).
    //todo B
    // How is this phenomenon called? (this is unrelated, but funny https://www.youtube.com/watch?v=h5Mc55P1i9g)
    // Answer (one word):
    // underflow
    //todo C
    // What would you recommend developer to do?
    // Answer:
    // use either an unsigned integer or a bigger type like long
    //todo D
    // Does the similar thing happen with "int/Integer"?
    // Answer: Yes

    public static void main(String[] args) {
        byte num = 127;
        byte num2 = (byte) (num + 1);
        System.out.println(num);
        System.out.println("+ 1");
        System.out.println(num2);
    }
}
