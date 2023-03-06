import Builders.*;


public class Shake_Factory {
    public ShakeBuilder shakeBuilder(String shake){
        ShakeBuilder shakeBuilder = null;
        Director director = new Director();

        if ((shake.equalsIgnoreCase("1"))){
            shakeBuilder = (ShakeBuilder) new Chocolate_Shake();

        }
        else if((shake.equalsIgnoreCase("2"))){
            shakeBuilder = (ShakeBuilder) new Coffee_Shake();
        }
        else if((shake.equalsIgnoreCase("3"))){
            shakeBuilder = (ShakeBuilder) new Zero_Shake();
        }
        else
            System.out.println("Invalid option");

        return shakeBuilder;


    }
}
