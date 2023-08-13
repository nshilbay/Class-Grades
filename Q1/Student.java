package Q1;
public class Student {
    //declare private variables
    private String name;
    private int score;
    private int studentNumber;

    //default constructor method
    public Student(){
        name = "Josh Loud"; studentNumber = 251245908; score  = 78;
    }

    //constructor method that uses name, student number, and score as variables
    public Student(String nm, int sNum, int sc){
        name = nm; studentNumber = sNum; score = sc;
    }

    //getter/accessor method for name
    public String getName(){
        return name;
    }

    //getter/accessor method for score
    public int getScore(){
        return score;
    }

    //determines the letter grade of the student based on their number score
    public String getLetterGrade(){
        String letterGrade;
        if (score >= 90){
            letterGrade = "A+";
        }
        else if (score >=80){
            letterGrade = "A-";
        }
        else if (score >= 70){
            letterGrade = "B+";
        }
        else if (score >= 60){
            letterGrade = "B-";
        }
        else if (score >= 50){
            letterGrade = "C+";
        }
        else if (score >= 40){
            letterGrade = "C-";
        }
        else if (score >= 30){
            letterGrade = "D";
        }
        else{
            letterGrade = "F";
        }
        return letterGrade;
    }

    //prints outputted info
    public void printInfo(){
        System.out.printf("%-15s%-15d%-3d%-2s\n",name,studentNumber,score,"(Letter Grade: "+ getLetterGrade() + ")");
    }
}
