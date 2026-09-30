package lockerpractice;

public class lockeroperator
{
    public static void main(String[] args){
        double totalcapacity = 45;
        double usedcapacity = 30;

        double freecapacity = totalcapacity - usedcapacity;
        double percentused = (usedcapacity / totalcapacity) * 100;
        boolean isfull = usedcapacity >= totalcapacity;

        System.out.println("total capacity: " + totalcapacity);
        System.out.println("used capacity: " + usedcapacity);
        System.out.println("free capacity: " + freecapacity);
        System.out.println("percent used: " + percentused);
        System.out.println("is full: " + isfull);
    }
}
