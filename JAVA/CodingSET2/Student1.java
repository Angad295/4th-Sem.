/*Student Marks Using Array 
Create a class Student that stores marks of 5 subjects in an array. Use a 
constructor to initialize the array and write a method to calculate the average 
marks. */

public class Student1{
    int arr[] = new int[5];
    
    public Student1(){
        for(int a : arr){
            a=0;
        }
    }
    public Student1(int a[]){
        for(int i=0;i<5;i++){
            arr[i]=a[i];
        }
    }
    public int avg(){
        int num=0;
        for(int n : arr ){
            num+=n;
        }
    return num / 5;
    }

    public void main(String[] args){
        int arr[]={80,90,80,70,90};
        Student1 s=new Student1(arr);
        System.out.println("The average marks :"+s.avg());
    }
}