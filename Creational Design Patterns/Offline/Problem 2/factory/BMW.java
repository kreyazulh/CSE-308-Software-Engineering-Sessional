public class BMW implements Car{
    @Override
    public String companyName() {
        String companyName="BMW";
        return companyName;
    }

    @Override
    public String manufacturingCountry() {
        String country= "Europe";
        return country;
    }

    @Override
    public String color() {
        String color="Black";
        return color;
    }

    @Override
    public String engine() {
        String engine="Electric Engine";
        return engine;
    }

    @Override
    public String driveTrain() {
        String driveTrain="Rear-wheel Drive Train";
        return driveTrain;
    }
}
