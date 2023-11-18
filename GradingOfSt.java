public class GradingOfSt {
    public static void main(String[] args) {
        int marks = 1111;
        if(marks < 50){
            System.out.println("fail");
        }
        else if(marks >= 50 && marks < 60){
            System.out.println("Student grade is D");
        }
        else if(marks >= 60 && marks < 70){
            System.out.println("Student grade is C");
        }
        else if(marks >= 70 && marks < 80){
            System.out.println("Student grade is B");
        }
        else if(marks >= 80 && marks < 90){
            System.out.println("Student grade is A");
        }
        else if(marks >= 90 && marks <= 100){
            System.out.println("Student grade is A+");
        }
        else{
            System.out.println("Numbere is invalid!!!");
        }
    }
}
