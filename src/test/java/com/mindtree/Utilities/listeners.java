package com.mindtree.Utilities;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mindtree.Reusable.ReusableComponents;


 

 
public class listeners implements ITestListener{
  

	ReusableComponents b=new ReusableComponents ();

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
    }
 
    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

    }
 
    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub

      
    }
 
    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }
 
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }
 

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }
 
    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
    	Sendmail sm=new Sendmail();
    	
    	

    }
}
 
    
