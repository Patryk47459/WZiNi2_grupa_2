public class Car
{
    private String name;
    private int year;
    private String fuel;
    private String color;

    Car(String name, int year, String fuel, String color){
        this.name = name;
        this.year = year;
        this.fuel = fuel;
        this.color = color;

    }
    public String InfoCar(){
        return "Nazwa samochodu to " + this.name
                + "Rok produkcji to " + this.year
                + " Rodzaj paliwa to " + this.fuel
                + "Kolor samochodu to " + this.color;
    }
}
