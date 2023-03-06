import Builders.ShakeBuilder;

public class Director {
    private ShakeBuilder shakeBuilder;

    public void make(ShakeBuilder shakeBuilder){
        this.shakeBuilder = shakeBuilder;
        this.shakeBuilder.addBase();
        this.shakeBuilder.addCandy();
        this.shakeBuilder.addCookies();
        this.shakeBuilder.addAlmond_milk();
    }
}
