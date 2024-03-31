import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        login log = new login();
       System.out.println("PHARMACY AT DOOR STEP 24*7");
       System.out.println("\tMedicines---1\n\tLab Tests---2\n\tConsult Doctor---3\n\tAll Products---4");
       System.out.println("Select As Per Requirements");
       int req = sc.nextInt();
       sc.nextLine();
       if(req==1) {
           medicine medi = new medicine();
           System.out.println("\tSearch---1\n\tOrder By Call---2\n\tOrder By WhatsApp---3\n\tShop By category---4");
           System.out.println("Select as per needs");
           int od= sc.nextInt();
           if(od==1){
               medi.SearchMedicine();
           } else if (od == 2) {
               medi.OrderOnCall();
           }
           else if(od==3){
               System.out.println("Redirecting You to WhatsApp");
           }
           else if(od==4) {
               medi.OrderByHealthConsern();
               System.out.println("Do You want to Something Else");
               sc.nextLine();
               String want = sc.nextLine();
               while (want.equalsIgnoreCase("yes")) {
                   medi.OrderByHealthConsern();
                   System.out.println("Do You want to Something Else");
                   want = sc.nextLine();
               }
               medi.Bill();
               System.out.println("Do you want to place the order");
               String ord = sc.nextLine();
               if (ord.equalsIgnoreCase("yes")) {
                   log.name();
                   log.gmail();
                   log.PhoneNumber();
                   log.address();
                   log.det();
                   medi.Bill();
                   System.out.println("Order Placed");
               }
           }
       }
       else if(req==2){
           LabTest test = new LabTest();
           System.out.println("Certified Lab\tSeamless Booking\tHygiene First\tVerified Reports\n");
           System.out.println("\tBook Test From Prescritption---1\n\tCall us to Book Tests---2\n\tWhatsApp to Book Tests---3\n\tBook Doctor Curated Lab Packages---4");
           System.out.println("Select as per needs(1-4)");
           int ts = sc.nextInt();
           if(ts==1){
               test.BookFromPrescription();
           }
           else if(ts==2){
               test.callToBook();
           }
           else if(ts==3){
               System.out.println("Redirecting You to WhatsApp");
           }
           else if(ts==4){
               test.DrCurated();
               System.out.println("Do You want to Book Somemore Tests");
               sc.nextLine();
               String want = sc.nextLine();
               while(want.equalsIgnoreCase("yes")){
                   test.DrCurated();
                   System.out.println("Do You want to Somemore Tests");
                   want = sc.nextLine();
               }
               test.Price();
               System.out.println("Do you want to place the order");
               String ord = sc.nextLine();
               if (ord.equalsIgnoreCase("yes")) {
                   log.name();
                   log.gmail();
                   log.PhoneNumber();
                   log.address();
                   log.det();
                   test.Price();
                   System.out.println("Order Placed");
               }

           }
       }
       else if (req==3){
           ConsultDoctor Dr = new ConsultDoctor();
           System.out.println("Talk within 30 mins\t\t3 day FREE Follow Up\tGet a valid prescription\n\t\tStarting at Rs199");
           System.out.println("Do you want to Consult Now");
           String in = sc.nextLine();
           if(in.equalsIgnoreCase("yes")){
               Dr.DrConsult();
           }
       }
       else if(req==4){
           HealthProduct hlt = new HealthProduct();
           System.out.println("We these following Medicines Currently Available:-");
           hlt.HltPro();
       }
    }
}