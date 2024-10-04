package Internship.projects;


import java.util.Scanner;

class Marks_Calculator{
    private final int[] marks;
    private final int No_of_Subjects;
    public Marks_Calculator(int No_of_Subjects){
        this.No_of_Subjects=No_of_Subjects;
        marks=new int[No_of_Subjects];
    }

    public void Input_Marks(){
        Scanner Sc=new Scanner(System.in);
        for(int i=0; i<No_of_Subjects; i++){
            System.out.print("Enter the marks of subject "+(i+1)+": -  ");
            marks[i]=Sc.nextInt();
        }
    }

    public int Calculate_Total(){
        int Total=0;
        for(int m=0; m<No_of_Subjects; m++){
            Total+=marks[m];
        }
        return Total;
    }

    public double Average_Percentage(){
        int Total_Mark=Calculate_Total();
        return (double)Total_Mark/No_of_Subjects;
    }

    public char Grade(double Avg_Prcntg){
        if(Avg_Prcntg>90){
            return 'O';
        } else if (Avg_Prcntg<=90 && Avg_Prcntg>80) {
            return 'E';
        } else if (Avg_Prcntg<=80 && Avg_Prcntg>70) {
            return 'A';
        } else if (Avg_Prcntg<=70 && Avg_Prcntg>60) {
            return 'B';
        } else if (Avg_Prcntg<=60 && Avg_Prcntg>50) {
            return 'C';
        } else if (Avg_Prcntg<=50 && Avg_Prcntg>=40) {
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public void Display_Results(){
        int Total_marks=Calculate_Total();
        double Average_Percentage=Average_Percentage();
        char Grade=Grade(Average_Percentage);

        System.out.print("\t\t---------Displaying the Results------------\n");
        System.out.println("The Total Marks =   "+Total_marks);
        System.out.println("Average Percentage is =  "+Average_Percentage+"% ");
        System.out.println("Grade =  "+Grade);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number of Subjects: -   ");
        int No_of_Subjects=in.nextInt();
        Marks_Calculator marks=new Marks_Calculator(No_of_Subjects);
        marks.Input_Marks();
        marks.Display_Results();
    }
}
