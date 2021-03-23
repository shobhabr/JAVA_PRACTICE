import javax.xml.namespace.QName;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name,String engine){
        this.engine=engine;
        this.name= name;
        numberOfCars++;

    }
}
