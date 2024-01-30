import java.util.*;
class StudentGradeTask2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of subjects:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int total =0;
        for(int i=0;i<n;i++)
        {System.out.print("Mark"+(i+1)+":");
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        System.out.println("Total Marks:"+total);
        int avg=total/n;
        System.out.println("Average Percentage"+avg);
        if(90<=avg && avg<=100){
            System.out.print("Grade :A");
        }
        else if(80<=avg && avg<90){
            System.out.print("Grade :B");
        }
        else if(70<=avg && avg<80){
            System.out.print("Grade :C");
        }
        else if(60<=avg && avg<70){
            System.out.print("Grade :D");
        }
        else{
            System.out.print("Grade: E");
        }
    }
}