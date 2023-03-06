public class Akash_Adapter2 implements Local{

        D_Harai d_harai;
        public Akash_Adapter2(D_Harai d_harai)
        {
            this.d_harai=d_harai;
        }
        @Override
        public int nid_no(int i) {
            return d_harai.number(i);
        }

        @Override
        public float taka_deposit(float i) {
            return d_harai.deposit((float) (i*0.5));
        }

        @Override
        public float taka_send(float i) {
            return (float) (i*0.5);
        }

}
