import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class medicine {
    String type;
    ArrayList<String> name=new ArrayList<>();
    String Description;
    double price;
    String Size;
    String DeliveryOptions;
    String Rate;
    Scanner sc = new Scanner(System.in);

    public void OrderByHealthConsern(){
        System.out.println("Order by health concerns");
        System.out.println("\tDiabetes--1\n\tHeart Care--2\n\tStomach Ache--3\n\tLiver Care--4\n\tBone,Joint & Muscle Care--5\n\tKidney Care--6\n\tDerma Care--7\n\tRespiratory Care--8\n\tEye Care--9");
        System.out.println("Enter the selected No(1-9):-");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice==1){
            Diabetes();
        }
        else if(choice==2){
            HeartCare();
        }
        else if(choice==3){
            StomachAche();
        }
        else if(choice==4){
            LiverCare();
        }
        else if(choice==5){
            BoneMuscleCare();
        }
        else if(choice==6){
            KidneyCare();
        }
        else if(choice==7){
             DermaCare();
        }
        else if(choice==8){
             RespiratoryCare();
        }
        else if(choice==9){
             EyeCare();
        }
    }
    public void Diabetes(){
        System.out.println("Search medicine--1\nShop by Category--2");
        System.out.println("Select(1-2)");
        int src = sc.nextInt();
        sc.nextLine();
        if(src == 2) {
            System.out.println("Shop by Category");
            System.out.println("\tTest Strips & Lancets--1\n\tDiabetes nutrition--2\n\tBlood Glucose Monitors--3\n\tSugar Substitutes--4" +
                    "\n\tHomeopathy Medicines--5\n\tAyurvedic Medicines--6\n\tJuices & Vinegars--7\n\tContinous Glucose Monitors--8");
            System.out.println("Select as per needs(1-8)");
            int DbCat = sc.nextInt();
            sc.nextLine();
            if (DbCat == 1) {
                System.out.println("Contour TS Blood Glucose Test(Only Strips)---1\n box of 50 test strips\n Rate=4.4(565 ratings)\n Rs1167   6%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 1167;
                    System.out.println("Added to Cart");

                }
            }
            else if (DbCat == 2) {
                System.out.println("Protinex Diabetes Care|Protien for Strengrh,Blood Sugar & Weight Management|Flavour Vanilla Powder---1" +
                        "\n box of 200gm powder\n Rate=4.3(311 ratings)\n Rs375   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 375;
                    System.out.println("Added to Cart");
                }

            } else if (DbCat == 3) {
                System.out.println("Combo Pack of OneTouch Select Plus Simple Glucometer with 10 Free Strips Black,Onetouch Select Plus Test Strip(50)" +
                        "& 2 Boxes of OneTouch Ultrasoft Lancets(25 each)\n combo pack of 4 packets\n Rate=4.3(1632 ratings)\n Rs2548   4%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 2548;
                    System.out.println("Added to Cart");
                }
            } else if (DbCat == 4) {
                System .out.println("Sugar Free Gold Low Calorie Aspartame Sweetener---1\n bootle of 500 pellets\n Rate=4.5(3267 ratings)\n Rs285   8%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 285;
                    System.out.println("Added to Cart");
                }

            }
            else if (DbCat == 5) {
                System.out.println("SBL Syzygium Jambolanum Mother\n bottle of 30ml mother tincture\n Rate=4.6(1227 rating)\n Rs100   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 100;
                    System.out.println("Added to Cart");
                }
            }
            else if (DbCat == 6) {
                System.out.println("Tata 1mg Tejasaya Liver Care Syrup\n bottle of 200ml syrup\n Rate=4.4(175 rating)\n Rs155   38%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 155;
                    System.out.println("Added to Cart");
                }
            }
        else if (DbCat == 7) {
                System.out.println("Tata 1mg Organic Apple Cider Vinegar with the-Mother of Vinegar\n bottle of 500ml liquid\n Rate=4.4(211 ratings)\n Rs211   28%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 211;
                    System.out.println("Added to Cart");
                }
            } else if (DbCat == 8) {
                System.out.println("FreeStyle Libre System - Sensor and Reader\n combo pack of 2 Packs\n Rate=4.1(129 ratings)\n Rs10501   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 10501;
                    System.out.println("Added to Cart");
                }
            }
        }
        else{
           SearchMedicine();
        }
    }
    public void HeartCare() {
        System.out.println("Search medicine--1\nShop by Category--2");
        System.out.println("Select(1-2)");
        int src = sc.nextInt();
        sc.nextLine();
        if (src == 2) {
            System.out.println("Shop by Category");
            System.out.println("\tOmega And Fish Oil---1\n\tBP Monitors---2\n\tHomeopathy Cardiac Care---3\n\tAyurveda Cardiac Care---4");
            System.out.println("Select as per needs(1-4)");
            int in = sc.nextInt();
            sc.nextLine();
            if (in==1) {
                System.out.println("Zingavita Omega3 Fish Oil 1000mg Soft Gelatin Capsules for Brain and Joint Health\n bottle of 60 soft gelatin\n Rate=4.3(180 ratings)\n Rs379   37%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 379;
                    System.out.println("Added to Cart");
                }
            }
            else if (in==2) {
                System.out.println("Dr Morepen BP 02 Blood Pressure Monitor\n box of 1 unit\n Rate=3.9(2850 ratings)\n Rs1426   2%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 1426;
                    System.out.println("Added to Cart");
                }
            }
            else if(in==3){
                System.out.println("Dr William Schwade India Zincum Valerianicum\n bottlr of 20gm trituration tablet\n Rate=\n Rs135");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 135;
                    System.out.println("Added to Cart");
                }
            }
            else if(in==4){
                System.out.println("Morepheme Arjuna Capsule\n bottle of 60 capsules\n Rate=\n Rs199   43%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 199;
                    System.out.println("Added to Cart");
                }

            }

        }
        else{
            SearchMedicine();
        }
    }
    public void StomachAche(){
        System.out.println("Search medicine--1\nShop by Category--2");
        System.out.println("Select(1-2)");
        int src = sc.nextInt();
        sc.nextLine();
        if (src == 2){
            System.out.println("Shop By Category");
            System.out.println("\tGeneral Digestion/Indigestion---1\n\tPre and Probiotics---2\n\tAcidity---3\n\tGas---4\n\tConstipation---5\n\tLoose Motion/Diarrhoea---6");
            System.out.println("Select as per need(1-6)");
            int sto =sc.nextInt();
            sc.nextLine();
            if(sto==1){
                System.out.println("Digene Antacid Antigas Gel|For Actidity,Gas,Heartburn & Bloated Stomach Relief|Flavour Mint\n bottle of 200ml oral gel\n Rate=4.5(2363 ratings)\n Rs153   9%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 153;
                    System.out.println("Added to Cart");
                }
            }
            else if(sto==2){
                System.out.println("Enterogermina Probiotics Supplement for Diarrhoea\n box of 10 bottles\n Rate=4.6(557 ratings)\n Rs658");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 658;
                    System.out.println("Added to Cart");
                }
            }
            else if(sto==3){
                System.out.println("Digene Antacid Antigas Tablet|For Acidity & Gas\n strip of 15 tablets\n Rate=4.6(2365 ratings)\n Rs24.4   8%");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 24.4;
                    System.out.println("Added to Cart");
                }
            }
            else if(sto==4){
                System.out.println("Tata 1mg Antacid & Antigas Liquid For HeartBurn,Indigestion, & Gas Sugar Free Mint\n bottle of 200ml Liquid\n Rate=4.2(124 ratings)\n Rs103   21%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 103;
                    System.out.println("Added to Cart");

                }
            }
            else if(sto==5){
                System.out.println("Duphalac Oral Solution Lemon\n bottle of 450ml oral solution\n Rs534   8%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 534;
                    System.out.println("Added to Cart");
                }
            }
            else if(sto==6){
               System.out.println("Tata 1mg ORS Hydration Boost\n packets of 21.8gm powder\n Rate=4.5(458 ratings)\n Rs17   19%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 17;
                    System.out.println("Added to Cart");
                }
            }
        }

    }
    public void LiverCare(){
          SearchMedicine();
    }
    public void BoneMuscleCare(){
        System.out.println("Search medicine--1\nShop by Category--2");
        System.out.println("Select(1-2)");
        int src = sc.nextInt();
        if (src == 2) {
            System.out.println("Shop By Category");
            System.out.println("\tBalms,Gel & Sprays--1\n\tPain Relief & Massage Oils---2\n\tSupplements---3\n\tOrthopaedic Supports---4\n\tHeating Kit---5\n\tBody Massager---6");
            System.out.println("Select as per need(1-6)");
            int opt = sc.nextInt();
            sc.nextLine();
            if(opt==1){
                System.out.println("Volini Spray For Sprain,Muscle and Joint Pain\n bottle of 100gm spray\n Rate=4.5(4952 ratings)\n Rs289   15%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 289;
                    System.out.println("Added to Cart");
                }
            }
            else if(opt==2){
                System.out.println("Himalaya Wellness Pain Relief Oil\n bottle of 100mg oil\n Rate=4.1(364 rating)\n Rs130   7%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 130;
                    System.out.println("Added to Cart");
                }
            }
            else if(opt==3){
                System.out.println("Corcium Tablet\n strip of 15 tablets\n Rate=4.6(215 ratings)\n Rs200   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 200;
                    System.out.println("Added to Cart");
                }
            }
            else if (opt==4){
                System.out.println("Tata 1mg Abdominal Belt Black,Abdominal Support For post Delivery,Slimming Waist, and Lower Back Pain\n box of 1 unit\n Rate=3.9(97 ratings)\n Rs495   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 495;
                    System.out.println("Added to Cart");
                }
            }
            else if(opt==5){
                System.out.println("Flamingo Orthopedic Heating Belt XL\n packet of 1 unit\n Rate=3.9(721 ratings)\n Rs1350");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 1350;
                    System.out.println("Added to Cart");
                }
            }
            else if(opt==6){
                System.out.println("HealthSense HM 210 Toner-Pro Electric Body Massager\n box of 1 massager\n Rate= \n Rs2090   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 2090;
                    System.out.println("Added to Cart");
                }
            }
        }
        else {
            SearchMedicine();
        }

    }
    public void KidneyCare(){
         SearchMedicine();
    }
    public void DermaCare(){
        System.out.println("Search medicine--1\nShop by Concern--2");
        System.out.println("Select(1-2)");
        int src = sc.nextInt();
        if (src == 2) {
            System.out.println("Shop By Concern");
            System.out.println("\tAcne & Pimples---1\n\tAntiFungal Creams & Powders---2\n\tSkin Infection & Psoriasis---3\n\tDry & Itchy Skin---4\n\tSkin Pegmentation---5\n\tWounds & Insect Bite---6");
            System.out.println("Select as per needs(1-6)");
            int ot = sc.nextInt();
            sc.nextLine();
            if(ot==1){
                System.out.println("Baidyanath(Jhansi) Surakta Tonic For Pimples\n bottle of 200ml tonic\n Rate=4.5(10 ratings)\n Rs106   2%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 106;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==2){
                System.out.println("Abzorb Anti Fungal Dusting Powder|Absorbs Excess Sweat,Controls Itching & Manages Fungal Infections\n bottle of 100gm dusting powder\n Rate=4.6(2981 ratings)\n Rs125   12%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 125;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==3){
                System.out.println("Nipcare Modified Lanolin Cream\n tube of 20gm cream\n Rate=4.4(304 ratings)\n Rs177   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 177;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==4){
                System.out.println("Dewderm Moisturishing Lotion with Vitamin E,Aloe Vera & Jojoba Oil|Skin Friendly & pH-Balanced\n bottle of 200gm lotion\n Rate=4.7(22 ratings)\n Rs457   4%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 457;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==5){
                System.out.println("Depiwhite Advanced Cream|Reduces Melanin\n tube of 40ml cream\n Rate=4.0(126 ratings)\n Rs1527   5%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 1527;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==6){
                System.out.println("Betadine Powder\n bottle of 10gm powder\n Rate= \n Rs156   1%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 156;
                    System.out.println("Added to Cart");
                }
            }
        }
        else{
            SearchMedicine();
        }
    }
    public void RespiratoryCare(){
        System.out.println("Search medicine--1\nShop by Category--2");
        System.out.println("Select(1-2)");
        int src = sc.nextInt();
        if (src == 2) {
            System.out.println("Shop By Category");
            System.out.println("\tNasal Sprays---1\n\tNebulizers & Vaporizers---2\n\tMasks---3\n\tPulse Oximeters---4\n\tOxygen Cans & Concentrators---5\n\tCPAP & BIPAP Machines---6");
            System.out.println("Select as per needs(1-6)");
            int ot = sc.nextInt();
            sc.nextLine();
            if (ot==1){
                System.out.println("Nasivion Classic Adult 0.05% Nasal Spray|Fast Relief from Blocked Nose\n bottle of 10ml nasal spray\n Rate=4.5(558 ratings)\n Rs106   3%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 106;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==2){
                System.out.println("MedTech VAP 100 Handyvap Steam Inhaler\n box of 1 inhaler\n Rate=4.4(24 ratings)\n Rs3099");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 3099;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==3){
                System.out.println("Tata 1mg 3Ply Surgical Mask with Meltblown Filter and Nose Pin 50 Mask Light Blue\n box of 50 masks\n Rate=4.2(985 ratings)\n Rs285   43%off");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 285;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==4){
                System.out.println("SLC Fingertip Pulse Oximeter with Beep\n box of 1 unit\n Rate=3.6(448 ratings)\n Rs3999");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 3999;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==5){
                System.out.println("Jumao Oxygen Concentrator(5ltr)\n box of 1unit\n Rs85000");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 85000;
                    System.out.println("Added to Cart");
                }
            }
            else if(ot==6){
                System.out.println("Philips Respironics BiPAP A40 Device\n box of 1unit\n Rs330000");
                System.out.println("Do you want to add this to your cart");
                String cart = sc.nextLine();
                if(cart.equalsIgnoreCase("yes")) {
                    price += 330000;
                    System.out.println("Added to Cart");
                }
            }
        }

    }
    public void EyeCare(){
        SearchMedicine();
    }
    public void OrderOnCall() {
        System.out.println("Enter Your Name");
        String UserName = sc.nextLine();
        System.out.println("Enter Your Number");
        String num = sc.nextLine();
        Pattern ptr = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = ptr.matcher(num);
        boolean valid = (match.find() && match.group().equals(num));
        if(valid==true){
            System.out.println("REQUEST REGISTERED\n\tWE WILL CALL YOU SHORTLY");
        }
        else{
            System.out.println("PLEASE PROVIDE A VALID NO");
        }
    }
    public void SearchMedicine(){
            System.out.println("Search the medicine you require");
            String srch=sc.nextLine();
            System.out.println("Item OutOfStock");
        }
        public void Bill(){
            System.out.println("Your bill is:-"+price);
        }

    }
