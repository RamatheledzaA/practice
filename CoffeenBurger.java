import java.util.Scanner;
public class CoffeenBurger {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Create a list of the type of coffee you want
        String[] coffee = {"Espresso", "Cappuccino", "Latte"};
        int[] coffee_prices={ 20 , 25, 15};

        String[] size = {"small","medium","large"};
        int[] size_prices ={10,15,20};

        String[] coffee_extra = {"milk","sugar"};
        int[] extraPrice = {7,4};

        //Create a list or the type of burger you want
        String[] burger = {"beef", "chicken", "veggie"};
        int[] burger_Prices={ 80 , 75, 60};

        String[] burger_size = {"small","medium","large"};
        int[] burgerSizePrices ={10,15,20};

        String[] burger_extra = {"cheese","bacon"};
        int[] burgerExtraPrice = {7,10};


        System.out.println("----Please make your order");
        for(int i = 0 ; i < coffee.length; i++){
            System.out.println((i+1)+"." + coffee[i] + "(R" + coffee_prices[i] + ")");
        }
        System.out.print("Enter the type of coffee you want(1-3):");
        int coffee_Choice = scan.nextInt() -1;

        for(int i = 0 ; i < size.length; i++){
            System.out.println((i+1)+"." + size[i] + "(R" + size_prices[i] + ")");
        }
        System.out.print("Enter the size of coffee you want(1-3):");
        int size_Choice = scan.nextInt() -1;

        for(int i = 0 ; i < coffee_extra.length; i++){
            System.out.println((i+1)+"." + coffee_extra[i] + "(R" + extraPrice[i] + ")");
        }
        System.out.print("Enter the type of coffee you want(1-2):");
        int extra_Choice = scan.nextInt() -1;

        // make your burger order

        for(int i = 0 ; i < burger.length; i++){
            System.out.println((i+1)+"." + burger[i] + "(R" + burger_Prices[i] + ")");
        }
        System.out.print("Enter the type of burger you want(1-3):");
        int burger_Choice = scan.nextInt() -1;

        for(int i = 0 ; i < burger_size.length; i++){
            System.out.println((i+1)+"." + burger_size[i] + "(R" + burgerSizePrices[i] + ")");
        }
        System.out.print("Enter the size of burger you want(1-3):");
        int burgerSize_Choice = scan.nextInt() -1;

        for(int i = 0 ; i < burger_extra.length; i++){
            System.out.println((i+1)+"." + burger_extra[i] + "(R" + burgerExtraPrice[i] + ")");
        }
        System.out.print("Enter what extras  you want on your burger(1-2):");
        int burgerExtra_Choice = scan.nextInt() -1;

        int totalAmount_coffee = coffee_prices[coffee_Choice] + size_prices[size_Choice] + extraPrice[extra_Choice];
        int totalAmount_burger= burger_Prices[burger_Choice] + burgerSizePrices[burgerSize_Choice] + burgerExtraPrice[burgerExtra_Choice];
        int totalAmount = totalAmount_coffee + totalAmount_burger;

        System.out.println("-----Order Summary------");

        System.out.println("Coffee type:" + coffee[coffee_Choice]);
        System.out.println("Coffee size:" + size[size_Choice]);
        System.out.println("Coffee extras:" +coffee_extra[extra_Choice]);

        System.out.println("Burger type:" + burger[burger_Choice]);
        System.out.println("Burger size:" + burger_size[burgerSize_Choice]);
        System.out.println("Burger extra:" + burger_extra[burgerExtra_Choice]);

        System.out.println("Total Price: R" + totalAmount);

        System.out.println("THANK YOU FOR YOUR ORDERING, KINDLY WAIT FOR YOUR ORDER");
















    }
}
