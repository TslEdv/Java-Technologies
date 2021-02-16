package ee.taltech.b_practise.assignment2;

public class Lamborghini {

    //todo A add 2 instance fields to this class of different Java types
    //todo B add a constructor which initializes both of the fields
    //todo C add 2 instance methods to this class (other than getters or setters)

    private int numberofcars;
    private String color;

    public Lamborghini(int numberofcars, String color) {
        this.numberofcars = numberofcars;
        this.color = color;
    }

    private int BuyNewCar(int numberofcars) {
        return (numberofcars + 1);
    }

    private String PaintCar(String color) {
        return color = "pink";
    }

    public static void main(String[] args) {
        //todo D create a new instance of your class
        Lamborghini lambo = new Lamborghini(1, "black");
        //todo E call 2 of your newly created methods
        lambo.color = lambo.PaintCar(lambo.color);
        lambo.numberofcars = lambo.BuyNewCar(lambo.numberofcars);
        System.out.println(lambo.color);
        System.out.println(lambo.numberofcars);
    }
}
