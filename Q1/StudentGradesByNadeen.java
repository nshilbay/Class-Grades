package Q1;
/************************************************************************************************************
 Nadeen Shilbayeh
 Creates a student class and assigns a letter grade based on a score
 *************************************************************************************************************/
public class StudentGradesByNadeen {
    public static void main(String[] args){

        //create objects of the Students class
        Student josh  = new Student();
        Student nadeen = new Student("Nadeen Shil", 251213277, 78);

        //formatted output using printInfo()
        System.out.printf("%-15s%-15s%-3s%-2s\n--------------------------------------------------\n","Name","Student Number","Score"," (Letter Grade)");
        josh.printInfo();
        nadeen.printInfo();
        System.out.printf("--------------------------------------------------\n");

        //outputs who had a higher score using the getScore method
        if(nadeen.getScore()>josh.getScore()){
            System.out.println(nadeen.getName() + " scored higher than " + josh.getName());
        }
        else if (josh.getScore() > nadeen.getScore()){
            System.out.println(josh.getName() + " scored higher than " + nadeen.getName());
        }
        else{
            System.out.println("Their scores are equal");
        }
    }

}
