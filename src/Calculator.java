import java.math.RoundingMode;
import java.text.NumberFormat;

public class Calculator {
	public Calculator() {
        // TODO Auto-generated constructor stub
    }
    private double rate;
    private double payment;
    private int principal;
    private int term;
	public double getRate() {
		rate=rate/100/12;
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public int getPrincipal() {
		return principal;
	}
	public  void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getTerm() {
		term = term * 12;
		return term;
	}
	public void setTerm(int term) {
		
		this.term = term;
		
	}
    public double MortgageCalculator(int Principal, double rate, int term){
    	
    	NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		nf.setRoundingMode(RoundingMode.HALF_UP);
		try { 
			
			if ((principal != 0) && (rate != 0)){
				payment = (double) Math.round((((Principal) * (rate)) / (1 - Math.pow(1 + rate, -term))));
			}
					
    	
		}catch (Exception e) {
            System.out.println("Please enter number");
        } finally {
        	
        	 
        	 System.out.println(payment);
        	 return payment;
        }
		
        }
    	
    }

