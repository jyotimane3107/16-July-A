package Generalization;

public class TestGeneralisation 
{
public static void main(String[] args) 
{
	System.out.println("-Features of Joi SimCard-");
	
	Jio j=new Jio();
	j.sms();
	j.audioCalling();
	j.data();
	j.newFeatureA();
	
	System.out.println("-Feature of VI simcard-");
	
	VI v=new VI();
	v.sms();
	v.audioCalling();
	v.data();
	v.newFeatureB();
	
	System.out.println("-Feature of Airtel simcard-");
	
	Airtel a=new Airtel();
	a.sms();
	a.audioCalling();
	a.data();
	a.newFeatureC();
	
	
}
}
