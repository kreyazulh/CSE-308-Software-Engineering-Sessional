public class Premium implements Observer{
    private String name;
    private String status;
    private String message;


    public Premium(String name, String status){
        this.name=name;
        this.status=status;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void update(String s) {
        this.message=s;
    }



}
