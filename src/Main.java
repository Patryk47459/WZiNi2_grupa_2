//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Film movie = new Film();
        movie.name_movie = "Avatar ";
        movie.year_movie = 2018;
        movie.info();
        movie.setName_director("Andrzej");
        movie.setYear_director(2000);
        movie.info();


        Car car = new Car(
                "BWM,",
                2024,
                "98,",
                "RED."
                );
        System.out.println(car.InfoCar());
    }
}



