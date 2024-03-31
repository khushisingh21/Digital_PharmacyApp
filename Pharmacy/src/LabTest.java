import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LabTest {
    Scanner sc = new Scanner(System.in);
    int price;
    public void BookFromPrescription() {
        System.out.println("Enter the no of Tests you want to order");
        int num = sc.nextInt();
        String[] arr = new String[num];
        sc.nextLine();
        System.out.println("Enter the name of Tests");
        for (int i=0;i<num;i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("You Booked" + Arrays.toString(arr) + "Tests");
        System.out.println("YOU WILL BE CALLED SHORTLY TO BE INFORMED ABOUT THE DATE,TIME & AMOUNT");
    }

    public void callToBook() {
        System.out.println("Enter Your Name");
        String UserName = sc.nextLine();
        System.out.println("Enter Your Number");
        String num = sc.nextLine();
        Pattern ptr = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptr.matcher(num);
        boolean valid = (match.find() && match.group().equals(num));
        if (valid == true) {
            System.out.println("REQUEST REGISTERED\n\tWE WILL CALL YOU SHORTLY");
        } else {
            System.out.println("PLEASE PROVIDE A VALID NO");
        }
    }

    public void DrCurated() {
        System.out.println("\tFull Body Checkups---1\n\tDiabetes & Heart Health---2\n\tWomen's Health---3\n\tElderly Care---4\n\tMen's Care---5\n\tBlood Studies---6\n\tFever & Infection---7\n\tAllergy Profiles---8\n\tThyroid Tests---9\n\tFitness Packages---10\n\tPregnancy Packages---11\n\tHormone Tests---12");
        System.out.println("Select as per nee(1-12");
        int opt = sc.nextInt();
        sc.nextLine();
        if(opt==1){
            System.out.println("Comprehensive Platinum Full Body Checkup with Smart Report\n\tcontains 92 tests\n\n\tGet reports within 24hrs\nRs3549 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 3549;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==2){
            System.out.println("Diabetes Package Advanced\n\tcontains 31 tests\n\n\tGet reports within 18hrs\nRs999 onwars");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 999;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==3){
            System.out.println("Women Wellness Premium Package with Smart Report\n\tcontains 46 tests\n\n\tGet reports within 48hrs\nRs1899 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 1899;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==4){
            System.out.println("Senior Citizen Advanced Package with Smart Report\n\tcontains 60 tests\n\n\tGet reports within 36hrs\nRs1675 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 1675;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==5){
            System.out.println("Men Health Premium Package with Smart Report\n\tcontains 44 tests\n\n\tGet reports within 15hrs\nRs1899 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 1899;
                System.out.println("Added to Cart");
            }
        }
        else if (opt==6){
            System.out.println("CBC,HbA1c,ESR,Hb,Serum Iron Studies Basic,hsCRP Blood Test Package\n\n\tGet Reports within 20Hrs\nRs2024");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 2024;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==7){
            System.out.println("Widal Test\n\n\tGet reports within 18hrs\nRs219 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 219;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==8){
            System.out.println("Allergy Scree,Total igE and Phadia Top(Adult & >5yrs)\n\n\tGet reports within 96hrs\nRs1399 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 1399;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==9){
            System.out.println("Thyroid Profile Total(T3,T4 & TSH)\n\n\tGet reports within 15hrs\nRs249 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 249;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==10){
            System.out.println("Fitness Advanced Package for men & women with Smart Report\n\tContains 78 tests\n\n\tGet reports within 48hrs\nRs3799 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 3799;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==11){
            System.out.println("Antenatal Profile Comprehensive\n\tcontains 41tests\n\n\tGet reports wihthin 36hrs\nRs2029 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 2029;
                System.out.println("Added to Cart");
            }
        }
        else if(opt==12){
            System.out.println("TSH Ultrasensitive\n\n\tGet reports within 15hrs\nRs249 onwards");
            System.out.println("Do you want to Book this package");
            String cart = sc.nextLine();
            if(cart.equalsIgnoreCase("yes")) {
                price += 249;
                System.out.println("Added to Cart");
            }
        }
    }
    public void Price(){
        System.out.println("Your Bill is:-"+price);
    }
}