public class CarFactory {
    public Car getCompany( String region){

        if( region.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        else if( region.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        else if( region.equalsIgnoreCase("United States")){
            return new Tesla();
        }
        return null;
    }
}
