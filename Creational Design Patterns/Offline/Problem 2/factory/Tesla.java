public class Tesla implements Car{
    @Override
    public String companyName() {
        String companyname="Tesla";
        //System.out.println("Company: Tesla");
        return companyname;
    }

    @Override
    public String manufacturingCountry() {
        String country= "United States";
        return country;
    }

    @Override
    public String color() {
        String color="White";
        return color;
    }

    @Override
    public String engine() {
        String engine="Electric Engine";
        return engine;
    }

    @Override
    public String driveTrain() {
        String driveTrain="All-wheels Drive Train";
        return driveTrain;
    }
}
