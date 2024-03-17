public class Film extends Director{
    String name_movie;
    int year_movie;

    public void info ()
    {
        System.out.println("Nazwa filmu to " + name_movie
                + "Rok produkcji filmu to " + year_movie
        + "Reżyser filmu to " + this.getName_director()
        + ",a jego rok urodzenia to " + this.getYear_director());
    }
}
