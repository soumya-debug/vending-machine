public class TextVendingMachineInterface implements VendingMachineInterface {

    private VendingMachineController controller = new SimpleVendingMachineController();
    private int selectedProduct;
    private CoinBundle change;


    @Override
    public void displayProducts() {
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        System.out.println("            Products available:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println("num of 5 rupees coins, \nnum of 10 rupees coins, \nnum of 20 rupees coins, \nnum of 50 rupees coins, \nnum of 100 rupees coins >>> ");
        System.out.println("                                              ");
        System.out.println("Example: If you would like to enter 2 ten rupees coins: 0,2,0,0,0");
        System.out.println("Plese enter coins : ");

    }

    @Override
    public void enterCoins(int... coins) {
        VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is :"+ change.getTotal()+" rupees split as follows: ");
        System.out.println("    100 rupees coins: "+ change.number100RupeesCoins);
        System.out.println("    50 rupees coins: "+ change.number50RupeesCoins);
        System.out.println("    20 rupees coins: "+ change.number20RupeesCoins);
        System.out.println("    10 rupees coins: "+ change.number10RupeesCoins);
        System.out.println("    5 rupees coins: "+ change.number5RupeesCoins);

    }
}
