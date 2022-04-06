
public class Q10_8 {

	public static void main(String[] args) {
		// Create two tax objects
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax(); // Current Year

		// Tax rates for 2001
		double[] rates2001 = {15, 27.5, 30.5, 35.5, 39.1};
		tax2001.setRates(rates2001);

		// The 2001 brackets for each rate for all the filing statuses
		int[][] brackets2001 = {
			{27050, 65550, 136750, 297350},  // Single filer
			{45200, 109250, 166500, 297350}, // Married jointly
														// -or qualifying widow(er)
			{22600, 54625, 83250, 148675},  	// Married separately
			{36250, 93650, 151650, 297350} 	// Head of household
		};
		tax2001.setBrackets(brackets2001);

		// Print tax tables for 2001 and 2009
		final double FROM = 50000;		// Start table taxable income range at $50,000
		final double TO = 60000;		// End table taxable income range at $60,000
		final double INTERVAL = 1000;	// Increase each row by $1000

		System.out.println(
			"\n2001 tax tables for taxable income from $50,000 to $60,000");
		print(tax2001, FROM, TO, INTERVAL);

		System.out.println(
			"\n2009 tax tables for taxable income from $50,000 to $60,000");
		print(tax2009, FROM, TO, INTERVAL);
		
	}

	/** Display taxable for  taxable income with specified range and interval */
	public static void print(Tax tax, double from, double to, double interval) {
		// Print header
		System.out.println(
			"---------------------------------------------------------------------\n" +
			"Taxable       Single      Married Joint       Married        Head of\n" +
			"Income                    or Qualifying       Separate       a House\n" +
			"                          Widow(er)\n" +
			"---------------------------------------------------------------------");
		// Print Data
		for (double taxableIncome = from; 
			  taxableIncome <= to; taxableIncome += interval) {
			tax.setTaxableIncome(taxableIncome);
			System.out.printf("%-13.0f", taxableIncome);
			tax.setFilingStatus(tax.SINGLE_FILER);
			System.out.printf("%8.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%15.2f", tax.getTax());
			tax.setFilingStatus(tax.MARRIED_SEPARATELY);
			System.out.printf("%18.2f", tax.getTax());
			tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%15.2f\n", tax.getTax());
		}
	}
}

class Tax {
	// Data fields
	private int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;

	// Construct a tax object with default 
	// filingStatus, rates, brackets and taxableIncome
	Tax() {
		// Defalut filing status
		filingStatus = SINGLE_FILER;

		// Defalut tax rates
		double[] currentYearRates = {10, 15, 25, 28, 33, 35};;
		setRates(currentYearRates);

		// Default brackets for each rate for all the filing statuses
		int[][] currentYearBrackets = {
			{8350, 33950, 82250, 171550, 372950},  // Single filer
			{16700, 67900, 137050, 20885, 372950}, // Married jointly
																// -or qualifying widow(er)
			{8350, 33950, 68525, 104425, 186475},  // Married separately
			{11950, 45500, 117450, 190200, 372950} // Head of household
		};
		setBrackets(currentYearBrackets);

		// Default taxable income
		taxableIncome = 0;

	}

	// Construct a tax object with specified
	// filingStatus, rates, brackets and taxableIncome
	Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}

	/** Set a new filingStatus */
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	/** Return filingStatus */
	public int getFilingStatus() {
		return filingStatus;
	}

	/** set new brackets */
	public void setBrackets(int[][] brackets) {
		this.brackets = new int[brackets.length][brackets[0].length];
		for (int i = 0; i < brackets.length; i++) {
			for (int j = 0; j < brackets[i].length; j++)
				this.brackets[i][j] = brackets[i][j];
		}
	}

	/** Return brackets */
	public int[][] getBrackets() {
		return brackets;
	}

	/** Set new rates */
	public void setRates(double[] rates) {
		this.rates = new double[rates.length];
		for (int i = 0; i < rates.length; i++)
			this.rates[i] = rates[i] / 100;
	}

	/** Return rates */
	public double[] getRates() {
		return rates;
	}

	/** Set new taxableIncome */
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	/** Return Tax */
	public double getTax() {
		double tax = 0, incomeTaxed = 0;
		double income = taxableIncome; 
		if (rates.length >= 2) {
			for (int i = rates.length - 2; i >= 0; i--) {
				if (income > brackets[filingStatus][i]) {
 					tax += (incomeTaxed = income - brackets[filingStatus][i]) 
 								* rates[i + 1];
					income -= incomeTaxed;
 				}
			} 
		}
		return tax += brackets[filingStatus][0] * rates[0];
	}
}
