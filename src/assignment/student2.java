package assignment;

public class student2 {
	public String Name;
	public String Address;
	public long phoneNo;
	public double salesAmount;
	public double commision;
	public void AcceptDetails_Employee(String Name,String Address,long phoneNo,double salesAmount) {
		this.Name=Name;
		this.Address=Address;
		this.phoneNo=phoneNo;
		this.salesAmount=salesAmount;
	}
	public double CalculateCommission() {
		if(salesAmount>=100000) {
			return commision = salesAmount*0.1;
		}
		else if(50000<=salesAmount && salesAmount<100000) {
			return commision = salesAmount*0.05;
		}
		else if(30000<=salesAmount && salesAmount<50000) {
			return commision=salesAmount*0.03;
		}
		else {
			return 0;
		}
	}

}
