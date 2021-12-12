package omecenTestNG.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class OmecenListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Method passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	/*
	 * @Override public void onTestFailedButWithinSuccessPercentage(ITestResult
	 * result) { // TODO Auto-generated method stub
	 * ITestListener.super.onTestFailedButWithinSuccessPercentage(result); }
	 */
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("");
	
}
//these are suite level
	@Override
	public void onStart(ITestContext context) {
	System.out.println("suite execution start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("suite Execution finish");
	}

	/*
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * super.hashCode(); }
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub return super.equals(obj); }
	 * 
	 * @Override protected Object clone() throws CloneNotSupportedException { //
	 * TODO Auto-generated method stub return super.clone(); }
	 * 
	 * @Override public String toString() { // TODO Auto-generated method stub
	 * return super.toString(); }
	 * 
	 * @Override protected void finalize() throws Throwable { // TODO Auto-generated
	 * method stub super.finalize(); }
	 * 
	 */	

}
