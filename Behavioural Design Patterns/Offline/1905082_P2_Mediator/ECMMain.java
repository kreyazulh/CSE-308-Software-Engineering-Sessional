import java.util.ArrayList;
import java.util.Random;
public class ECMMain implements ExamControlMediator{
    Examiner examiner = new Examiner();
    Student1 student1= new Student1();
    Student2 student2= new Student2();
    Student3 student3= new Student3();
    Student4 student4= new Student4();
    Student5 student5= new Student5();
    Random rand = new Random();
    ArrayList<Integer> rechecked_marks = new ArrayList<Integer>();
    Boolean check1= false;
    Boolean check2= false;
    Boolean check3= false;
    Boolean check4= false;
    Boolean check5= false;
    public ECMMain(){

    }
    @Override
    public void publish() {
    examiner.generate();
    examiner.sent();
    examiner.print();

    }

    @Override
    public void scruitinize() {
    for(int i=0; i<5; i++){
        float float_random= rand.nextFloat();
        int int_random= rand.nextInt(100);
        if(float_random<0.35){
            rechecked_marks.add(int_random);
        }
        else{
            rechecked_marks.add(examiner.marks(i));
        }
    }
    }

    @Override
    public void checkedPublish() {
        System.out.println("Exam scripts were checked by Exam Control Office. Final results are: ");
        System.out.println("Roll : "+ examiner.student(0)+ ", Previous Marks : "+examiner.marks(0)+", Corrected Marks: "+rechecked_marks.get(0));
        System.out.println("Roll : "+ examiner.student(1)+ ", Previous Marks : "+examiner.marks(1)+", Corrected Marks: "+rechecked_marks.get(1));
        System.out.println("Roll : "+ examiner.student(2)+ ", Previous Marks : "+examiner.marks(2)+", Corrected Marks: "+rechecked_marks.get(2));
        System.out.println("Roll : "+ examiner.student(3)+ ", Previous Marks : "+examiner.marks(3)+", Corrected Marks: "+rechecked_marks.get(3));
        System.out.println("Roll : "+ examiner.student(4)+ ", Previous Marks : "+examiner.marks(4)+", Corrected Marks: "+rechecked_marks.get(4));


    }

    @Override
    public void boardResult() {
        System.out.println("All the students' results are: ");
        System.out.println("Roll : "+ examiner.student(0)+ ",  Marks: "+rechecked_marks.get(0));
        System.out.println("Roll : "+ examiner.student(1)+ ",  Marks: "+rechecked_marks.get(1));
        System.out.println("Roll : "+ examiner.student(2)+ ",  Marks: "+rechecked_marks.get(2));
        System.out.println("Roll : "+ examiner.student(3)+ ",  Marks: "+rechecked_marks.get(3));
        System.out.println("Roll : "+ examiner.student(4)+ ",  Marks: "+rechecked_marks.get(4));
    }

    @Override
    public void rescruitize(String s) {
        StringBuffer result = new StringBuffer();
        int index=Integer.parseInt(s);
        index=index-1;
        if(s.equalsIgnoreCase("1")){
            result.append(student1.recheck(check1));
            if(check1) {
                result.append(rechecked_marks.get(0));
                System.out.println(result);
            }
            else{
                System.out.println(result);
                System.out.println("Your roll is 1 and after recheck, your mark is "+examiner.reexamine(s));
                rechecked_marks.set(index, examiner.marks(index));
                check1=true;

            }
        }
        if(s.equalsIgnoreCase("2")){
            result.append(student2.recheck(check2));
            if(check2) {
                result.append(rechecked_marks.get(1));
                System.out.println(result);
            }
            else{
                System.out.println(result);
                System.out.println("Your roll is 2 and after recheck, your mark is "+examiner.reexamine(s));
                rechecked_marks.set(index, examiner.marks(index));
                check2=true;

            }
        }
        if(s.equalsIgnoreCase("3")){
            result.append(student3.recheck(check3));
            if(check3) {
                result.append(rechecked_marks.get(2));
                System.out.println(result);
            }
            else{
                System.out.println(result);
                System.out.println("Your roll is 3 and after recheck, your mark is "+examiner.reexamine(s));
                rechecked_marks.set(index, examiner.marks(index));
                check3=true;

            }
        }
        if(s.equalsIgnoreCase("4")){
            result.append(student1.recheck(check4));
            if(check4) {
                result.append(rechecked_marks.get(3));
                System.out.println(result);
            }
            else{
                System.out.println(result);
                System.out.println("Your roll is 4 and after recheck, your mark is "+examiner.reexamine(s));
                rechecked_marks.set(index, examiner.marks(index));
                check4=true;

            }
        }
        if(s.equalsIgnoreCase("5")){
            result.append(student5.recheck(check5));
            if(check5) {
                result.append(rechecked_marks.get(4));
                System.out.println(result);
            }
            else{
                System.out.println(result);
                System.out.println("Your roll is 5 and after recheck, your mark is "+examiner.reexamine(s));
                rechecked_marks.set(index, examiner.marks(index));
                check5=true;

            }
        }
    }

    @Override
    public void individual(String s) {
        StringBuffer result = new StringBuffer();
        if(s.equalsIgnoreCase("1")){
            result.append(student1.checkResult());
            result.append(rechecked_marks.get(0));
        }
        if(s.equalsIgnoreCase("2")){
            result.append(student2.checkResult());
            result.append(rechecked_marks.get(1));
        }
        if(s.equalsIgnoreCase("3")){
            result.append(student3.checkResult());
            result.append(rechecked_marks.get(2));
        }
        if(s.equalsIgnoreCase("4")){
            result.append(student4.checkResult());
            result.append(rechecked_marks.get(3));
        }
        if(s.equalsIgnoreCase("5")){
            result.append(student5.checkResult());
            result.append(rechecked_marks.get(4));
        }
        System.out.println(result);
    }
}
