package methods;

public class Methodcalling {
    public static int addNumbers(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args){
        int result = addNumbers(5, 7);
        System.out.println("result = " + result);
    }
}
