package week1.day1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 44535566l;
	boolean isPunctured = false;
	String bikeName = "Honda CB 350";
	double runningKM = 30000;
	
	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();
		System.out.println(tw.noOfWheels+ "/"+tw.noOfMirrors+"/"+tw.chassisNumber+"/"+tw.isPunctured+"/"+tw.isPunctured+"/"+tw.bikeName+"/"+tw.runningKM);
	}
}
