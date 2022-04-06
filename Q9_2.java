//This program calculates the price percentage change per stock.
/*               Stock                  
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 +symbol: String
 +name: String
 +previousClosingPrice: double
 +currentPrice: double
 +Stock(tempSymbol: String, tempName: String)
 +getChangePercent(): double
*/
public class Q9_2 {

	public static void main(String[] args) {
		
		//creates a stock and sets 
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		
		//prints price percentage
		System.out.printf("The price-change percentage for " + stock.name + "(" +
		stock.symbol + ") is: %.2f%%", stock.getChangePercent());
		

	}

}

//stock object
class Stock{
	//defines symbol, name, current and previous price
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	//sets symbol and name
	Stock(String tempSymbol, String tempName){
		symbol = tempSymbol;
		name = tempName;
	}
	
	//returns change percentage
	double getChangePercent(){
		return (((currentPrice - previousClosingPrice)/ previousClosingPrice) * 100);
	}
}