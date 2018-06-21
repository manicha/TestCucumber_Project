package Utils;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import mx4j.log.Logger;

public class TestData {
	static String testData;
	public static String data(String columnName, String rowName) throws Exception {
		Fillo fillo=new Fillo();
		String dirPath = System.getProperty("user.dir");
		Connection connection=fillo.getConnection(dirPath+"\\src\\data\\TestData.xlsx");
		String strQuery="Select " +columnName+" from InputData where TestCaseName='"+rowName+"'";
		Recordset recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
	testData = recordset.getField(columnName);
		}
		recordset.close();
		connection.close();
		return testData;
	}
	
public static void main(String[] args) throws Exception {
	data("UserName", "TC01");
}
}
