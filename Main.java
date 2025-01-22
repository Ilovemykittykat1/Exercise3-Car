public class Main {
    public static void main(String args[]) {
        Car myCar = new Car();
        Car myCar2 = new Car("Telsa", 0); 
        Car myCar3 = new Car("Kia", 2011); 
        Car myCar4 = new Car("Ford", 2018, "red");  

        System.out.println("display the initial values with no arg");

        myCar.display(); 
        System.out.println("display the initial values with one parameter");
        myCar2.display(); 
        System.out.println("display the initial values with multiple parameters");
        myCar3.display(); 
        System.out.println("display the initial values with multiple parameters");
        myCar4.display(); 
        System.out.println("the code is ended");
    }
}
