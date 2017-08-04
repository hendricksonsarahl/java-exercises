package exercises;


// Write a static method to find the sum of all the even numbers in a list.
// Within main, create a list with at least 10 integers and call your method on the list.

public class EvenStevens {

    public static void main(String[] args){
        int sum = 0;

        for(int num=0;num<10;num=num+2){
            sum=num+sum;
        }
        System.out.print(sum);
    }
}