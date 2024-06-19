import java.util.*;
public class task2 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int n = obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks of subject "+(i+1));
            int marks = obj.nextInt();
            arr[i]=marks;
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        int percentage=total/n;
        System.out.println("the total marks are "+total);
        System.out.println("the percentage is "+percentage);
        System.out.println("the corresponding grade to the percentage is "+assignGrade(percentage));
        

    } 
    public static char assignGrade(int percentage) {
        switch (percentage / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }
    
}
