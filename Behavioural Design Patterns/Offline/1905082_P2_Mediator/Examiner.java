import java.util.ArrayList;
import java.util.Random;
public class Examiner implements ExamScript{

    public Examiner() {

    }

    ArrayList<String> student = new ArrayList<String>();
    ArrayList<Integer> marks = new ArrayList<Integer>();
    @Override
    public void generate() {
    student.add("1");
    student.add("2");
    student.add("3");
    student.add("4");
    student.add("5");

    Random Rand = new Random();
    int mark1=Rand.nextInt(100);
    marks.add(mark1);
    int mark2=Rand.nextInt(100);
    marks.add(mark2);
    int mark3=Rand.nextInt(100);
    marks.add(mark3);
    int mark4=Rand.nextInt(100);
    marks.add(mark4);
    int mark5=Rand.nextInt(100);
    marks.add(mark5);
    }

    @Override
    public void sent() {
    System.out.println("Scripts and marks of student id 1,2,3,4,5 sent to exam controller office\n");
    }

    public void print(){
        System.out.println("Examiner provided marks are:");
        System.out.println("Roll : "+ student.get(0)+ " Marks : "+marks.get(0));
        System.out.println("Roll : "+ student.get(1)+ " Marks : "+marks.get(1));
        System.out.println("Roll : "+ student.get(2)+ " Marks : "+marks.get(2));
        System.out.println("Roll : "+ student.get(3)+ " Marks : "+marks.get(3));
        System.out.println("Roll : "+ student.get(4)+ " Marks : "+marks.get(4));
        System.out.println("\n");

    }

    @Override
    public Integer reexamine(String s) {
        Random rand2 = new Random();
        int index=Integer.parseInt(s);
        index=index-1;
        float float_random= rand2.nextFloat();
        int int_random2= rand2.nextInt(99);
        if(float_random<0.30){
            marks.set(index, int_random2);
        }
        return marks.get(index);

    }

    public Integer marks(int i) {
        return marks.get(i);
    }
    public String student(int i){
        return student.get(i);
    }
}
