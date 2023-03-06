public class Toyota implements Car{
    @Override
    public String companyName() {
        String companyName="Toyota";
        return companyName;
    }

    @Override
    public String manufacturingCountry() {
        String country= "Japan";
        return country;
    }

    @Override
    public String color() {
        String color="Red";
        return color;
    }

    @Override
    public String engine() {
        String engine="Hydrogen Fuel Cells";
        return engine;
    }

    @Override
    public String driveTrain() {
        String driveTrain="Rear-wheel Drive Train";
        return driveTrain;
    }
}
