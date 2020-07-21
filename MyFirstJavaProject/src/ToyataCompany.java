public class ToyataCompany {

    String myCompanyName = "Toyota Corporation";
    String carModel ="Corolla";
    String carModel2 ="Camry";
    String carModel3 ="Avalon";

    public void totalPriceOfCorolla(){
        int basePrice = 16000;
        double tax = 2000.6;
        int registraionFee = 135;
        double totalPrice = basePrice+tax+registraionFee;
        System.out.printf("The price of corolla: " + totalPrice);
    }


    public static void main(String[] args) {
        ToyataCompany corollaCar = new ToyataCompany();
        System.out.println("My company name: " + corollaCar.myCompanyName);
        corollaCar.totalPriceOfCorolla();

    }


}
