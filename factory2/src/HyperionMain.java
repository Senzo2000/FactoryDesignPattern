import java.util.*;

 class HyperionMain {
    public static void main(String[] args){

//Factory object
        StudentFactory Factory = new StudentFactory();

while(true) {
    //creating an object of Hyperion
    Scanner input = new Scanner(System.in);
    System.out.println("\nEnter the respective names of either Susan,Michael,Saoirse to get their details ");
    String studentName = input.nextLine();

    Hyperion S = StudentFactory.getHyperion(studentName);
    if (S == null) {break;}
    S.describe();
}
}
 }
