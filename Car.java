public class Car {
    // attributes
    private String name;
    private String color;
    private int model;
    private int year;

    // behaviours
    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public String getcolor() {
        return color;
    }

    public String getYear() {
        return String.valueOf(year);
    }

    public void setName(String m) {
        name = m;
    }

    public void setModel(int m) {
        model = m;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setYear(int y) {
        year = y;
    }

    // creating constructor with two parameters
    public Car(String n, int m) {
        name = n;
        color = "no color";
        model = m;
        year = 1990;
    }

    // creating default constructor
    public Car() {
        name = "no name";
        color = "no color";
        model = 0;
        year = 1990;
    }

    
    public Car(String n, int m, String c) {  
        name = n;
        color = c;
        model = m;
        year = 1990;
    }

    public void display() {
        System.out.println("Name of the car is: " + name);
        System.out.println("Color of the car is: " + color);
        System.out.println("Model of the car is: " + model);
        System.out.println("Year of the car is: " + year);
    }
}
