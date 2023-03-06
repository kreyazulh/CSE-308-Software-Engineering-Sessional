//disguise imposter's damage method (because he/she has to look not suspicious)
public class SusAdapter implements GoodPassenger{

    BadPassenger badpassenger;
    public SusAdapter(BadPassenger badpassenger){
        this.badpassenger = badpassenger;
    }

    @Override
    public void research() {
        badpassenger.poison();
    }

    @Override
    public void work() {
        badpassenger.damage();
    }
}
