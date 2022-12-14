package data.example;

import java.util.Scanner;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return  length * breadth;
    }

    public static void main(String[] args) {
        ////Declaring array of objects
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        Rectangle[] obj = new Rectangle[size];
        //Initializing array
       /* obj[0] = new Rectangle(2,4);
        obj[1] = new Rectangle(3,4);
        obj[2] = new Rectangle(4,4);
        obj[3] = new Rectangle(5,4);
        obj[4] = new Rectangle(6,4);*/

        for (int i = 0; i < obj.length; i++) {
            System.out.println(i + " index Enter length");
            int len = sc.nextInt();
            System.out.println(i + " index Enter bredth");
            int bredth = sc.nextInt();
            obj[i] = new Rectangle(len,bredth);
        }

        // Traversing through the for loop and retrieving area value
        for(int i = 0; i < obj.length; i++){
            System.out.println("Area of "+(i+1) +" object "+obj[i].getArea());
        }
    }
}
