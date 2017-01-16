import java.util.ArrayList;

import javax.swing.JOptionPane;


public class RecList {
	public static void main(String[] args) {
		ArrayList<String> binaryInvestorPositionList = new ArrayList<String>();
		
    	String s = JOptionPane.showInputDialog(null, "Parent");
    	String val = JOptionPane.showInputDialog(null, "Depth");
    	binaryInvestorPositionList.add(s);
    	getPersonListForLevelFill(binaryInvestorPositionList,Integer.parseInt(val),s);
    	System.out.println(binaryInvestorPositionList);
    	
	}

public static void getPersonListForLevelFill(ArrayList<String> investorPositionList,int depth, String parentPosition){
	if(depth >= 1){
		depth = depth -1;
		ArrayList<String> leftinvestorPosition = investorPositionList;
		ArrayList<String> rightinvestorPosition =  investorPositionList;
		leftinvestorPosition.add(parentPosition + ".1");
		rightinvestorPosition.add(parentPosition + ".2");
		getPersonListForLevelFill(leftinvestorPosition,depth,parentPosition + ".1");
		getPersonListForLevelFill(rightinvestorPosition,depth,parentPosition + ".2");
	}
	else{
		return;
	}
}
}
