public class Student2 implements Student{
    @Override
    public String checkResult() {
        String s = "Your Roll is 2 and you got ";
        return s;
    }

    @Override
    public String recheck(boolean b) {
        if(b) {
            String s = "You have already applied for recheck once. Your roll is 2 and your unchanged mark is ";
            return s;
        }
        else {
            String s = "Your answer script is sent for recheck. ";
            return s;
        }
    }
}
