public class Imposter implements BadPassenger{

    @Override
    public void poison() {
        System.out.println("Poison the crewmates...!!");
    }
    @Override
    public void damage() {
        System.out.println("Damaging Spaceship in disguise...!!");
    }
}
