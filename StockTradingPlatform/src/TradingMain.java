public class TradingMain {
    public static void main(String[] args){

        Stock stock = new Stock("TCS", 3500);
        User user = new User ("sowmiya");

        user.quantity = user.quantity + 5;
        System.out.println("User Name   : " + user.userName);
        System.out.println("Stock Name  : " + stock.stockName);
        System.out.println("Stock price : " + stock.price);
        System.out.println("Quantity    : " + user.quantity);
        System.out.println("Total Value : " + (user.quantity * stock.price));

    }
}
