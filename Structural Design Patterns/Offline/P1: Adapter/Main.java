public class Main {

    public static void printRed (String str){
        System.out.println("\u001B[31m" + str + "\u001B[0m");
    }
    public static void main(String[] args) {
        Crewmate crewmate = new Crewmate();
        Imposter imposter = new Imposter();
        GoodPassenger susAdapter = new SusAdapter(imposter);

        System.out.println("Crewmate Behavior:");
        crewmate.research();
        crewmate.work();
        System.out.println("\n");
        printRed("Imposter Behavior:");
        System.out.println("Crewmates are watching...");
        susAdapter.research();
        susAdapter.work();
        System.out.println("Crewmates are not watching!");
        imposter.poison();
        imposter.damage();



    }
}