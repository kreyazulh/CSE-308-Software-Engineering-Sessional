public class Main {
    public static void main(String[] args) {
        Akash akash = new Akash();
        PayFren payFren= new PayFren();
        Local akashforPayFren = new Akash_Adapter(payFren);
        D_Harai d_harai = new D_Harai();
        Local akashforD_Harai = new Akash_Adapter2(d_harai);


        System.out.println(akash.taka_send(500));

        System.out.println(akashforPayFren.taka_send(500));

        System.out.println(akashforD_Harai.taka_send(500));
    }
}