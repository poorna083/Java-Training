/*Description
In the stock market, investors focus only on buying and selling shares.
They don’t see the complex backend where trades are matched and recorded.
For them, the platform simply shows actions like Buy, Sell, and Check Portfolio.
This is abstraction — hiding how the system works, showing only what is needed.
Different exchanges like NSE or BSE implement these actions in their own way.
One may charge extra brokerage, while another may offer discounts.
Yet, for the investor, the interface remains the same: buy, sell, and check.
Thus, abstraction makes the stock market simple and user-friendly despite its complexity.

Input Format
First line → Action (buy or sell)
Second line → Company name (e.g., TCS)
Third line → Quantity of shares

Output Format
Show the result of the action (Bought/Sold shares).
Show the updated total portfolio shares.

Test Case 1
Input:
buy
INFOSYS
40


Output:
Bought 40 shares of INFOSYS via NSE.
Total Shares in Portfolio: 40

Test Case 2
Input:
sell
INFOSYS
20


Output:
Sold 20 shares of INFOSYS via NSE.
Total Shares in Portfolio: 20 */
package Day21;
import java.util.*;
abstract class StockMarket{
    abstract void Buy();
    abstract void Sell();
    abstract String CompanyName();
    int  Portfolio = 0;
}
class BSE extends StockMarket{
    void Buy(int buy){
        System.out.println("Buy"+" "+buy);
    }
    void sell(int Sell){
        System.out.println("Sell"+" "+Sell);
    }
    String CompanyName(String name){
        return name;
    }
}
class NSE extends StockMarket{
    void Buy(int buy){
        System.out.println("Buy"+" "+buy);
    }
    void Sell(int Sell){
        System.out.println("Sell"+" "+Sell);
    }
    String CompanyName(String name){
        return name;
    }
}
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NSE nse = new NSE();
        BSE bes = new BSE();
        System.out.println("Enter Buy or Sell in NSE or BSE");
        if(sc.nextLine().equalsIgnoreCase("NSE"))
        {
        System.out.println("Enter that to buy or Sell in NSE");
        String ns = sc.nextLine();
        ns.equalsIgnoreCase(sc.nextLine());
        System.out.println("Enter The Shares to buy:");
        if (ns.equalsIgnoreCase("buy")) {
            nse.Buy((sc.nextInt()));
        }
        ns.equalsIgnoreCase(sc.nextLine());
        System.out.println("Enter the Shares to sell:");
        if (ns.equalsIgnoreCase("Sell")) {
            nse.Sell((sc.nextInt()));
        }
         System.out.println("Eneter The Company name:");
         nse.CompanyName(sc.nextLine());
        }
        else{
        System.out.println("Enter That to buy or Sell in BSE");
        String bs = sc.nextLine();
        bs.equalsIgnoreCase(sc.nextLine());
        System.out.println("Enter the Shares To buy");
        if (bs.equalsIgnoreCase("buy")) {
            nse.Buy((sc.nextInt()));
        }
        bs.equalsIgnoreCase(sc.nextLine());
        System.out.println("Enter The Shares To Sell:");
        if (bs.equalsIgnoreCase("Sell")) {
            nse.Sell((sc.nextInt()));
        }
        }
        


        

    }
}
