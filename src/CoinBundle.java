public class CoinBundle {
    public int number5RupeesCoins;
    public int number10RupeesCoins;
    public int number20RupeesCoins;
    public int number50RupeesCoins;
    public int number100RupeesCoins;

    public CoinBundle(int... enteredCoins) {
        this.number5RupeesCoins = enteredCoins[0];
        this.number10RupeesCoins = enteredCoins[1];
        this.number20RupeesCoins = enteredCoins[2];
        this.number50RupeesCoins = enteredCoins[3];
        this.number100RupeesCoins = enteredCoins[4];
    }
    public int getTotal(){
        int total = 0;
        total = total+this.number5RupeesCoins*Coin.FIVE_RUPEES.getValue();
        total = total+this.number10RupeesCoins*Coin.TEN_RUPEES.getValue();
        total = total+this.number20RupeesCoins*Coin.TWENTY_RUPEES.getValue();
        total = total+this.number5RupeesCoins*Coin.FIFTY_RUPEES.getValue();
        total = total+this.number100RupeesCoins*Coin.HUNDRED_RUPEES.getValue();
        return total;
    }
}
