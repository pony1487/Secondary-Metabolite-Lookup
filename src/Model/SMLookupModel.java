package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Model performs all the calculations needed and that is it. It doesn't know the View exists


public class SMLookupModel {
	
	
	private String[] accessionNumbers;
	private ArrayList<String> outputList = new ArrayList<String>();
	private HashMap<String,String> referenceList = new HashMap<String,String>(); 
	
	
	public void setAccessionNumberFromInput(String str)
	{
		//Add check for which way user gives input??
		//split on new line
		accessionNumbers = str.split("[\\r\\n]+");
		
		//split on 'A' for continuos string pasted in
		//accessionNumbers = str.split("(?=A)");
		
	}//end setAccessionNumberFromInput
	
	public void printAccessionNumbers()
	{
		for(int i = 0; i < accessionNumbers.length;i++)
		{
			System.out.println("AccessionNumber[" + i + "] = " + accessionNumbers[i]);
		}
		
	}//edn printAccessionNumbers()
	
	public void searchReferenceList()
	{
		for(int i = 0; i < accessionNumbers.length;i++)
		{
			if(referenceList.containsKey(accessionNumbers[i]))
			{
				//value = referenceList.get(accessionNumbers[i]);
				outputList.add(referenceList.get(accessionNumbers[i]));
			}
			else
			{
				outputList.add("Not found");
			}	
		}
	}//end searchReferenceList()
	
	public void printReferenceList()
	{
		for(Map.Entry m:referenceList.entrySet())
		{  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}//end printReferenceList()
	
	public void printOutputList()
	{
		for(int i = 0;i < outputList.size();i++)
		{
			System.out.println(outputList.get(i));
		}
	}//end printOutputList()
	
	public ArrayList<String> getOutputList()
	{
		return outputList;
		
	}
	
	public void addToReferenceList(String key, String cluster)
	{
		referenceList.put(key,cluster);
	}//end AddToReferenceList()
	
	public void initReferenceList()
	{
		//SMURF
		//1:Fumigaclavine C
		referenceList.put("Afu2g17930","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g17940","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g17950","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g17960","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g17970","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g17980","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g17990","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18000","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18010","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18020","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18030","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18040","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18050","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18060","Fumigaclavine C (fga) cluster");
		referenceList.put("Afu2g18070","Fumigaclavine C (fga) cluster");
		
		//2: Fumitremorgin B(ask about this one, sheet says 00280 - 00100)
		referenceList.put("Afu8g00100","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00110","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00120","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00130","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00140","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00150","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00160","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00170","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00180","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00190","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00200","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00210","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00220","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00230","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00240","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00250","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00260","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00270","Fumitremorgin B (ftm) cluster");
		referenceList.put("Afu8g00280","Fumitremorgin B (ftm) cluster");
		
		//Gliotoxin (gli)
		referenceList.put("Afu6g09520","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09530","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09540","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09550","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09560","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09570","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09580","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09590","Gliotoxin (gli) cluster");
		
		referenceList.put("Afu6g09600","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09610","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09620","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09630","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09640","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09650","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09660","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09670","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09680","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09690","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09700","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09710","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09720","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09730","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09740","Gliotoxin (gli) cluster");
		referenceList.put("Afu6g09745","Gliotoxin (gli) cluster");
		
		//Pseurotin A cluster
		/*
		 * Exceptions
		 * Afu8g00342
			Afu8g00595
			Afu8g00885
			Afu8g00962
			Afu8g01045
			Afu8g01222
			Afu8g01265
			Afu8g01385
			Afu8g01465
			Afu8g01485
			Afu8g01637
			Afu8g01638
			Afu8g01795
			Afu8g02315
			Afu8g02335
			Afu8g03905
			Afu8g04702
			Afu8g04826
			Afu8g05165
		 */
		referenceList.put("Afu8g00342","Pseurotin A cluster");
		referenceList.put("Afu8g00350","Pseurotin A cluster");
		referenceList.put("Afu8g00360","Pseurotin A cluster");
		referenceList.put("Afu8g00370","Pseurotin A cluster");
		referenceList.put("Afu8g00380","Pseurotin A cluster");
		referenceList.put("Afu8g00390","Pseurotin A cluster");
		
		referenceList.put("Afu8g00400","Pseurotin A cluster");
		referenceList.put("Afu8g00410","Pseurotin A cluster");
		referenceList.put("Afu8g00420","Pseurotin A cluster");
		referenceList.put("Afu8g00430","Pseurotin A cluster");
		referenceList.put("Afu8g00440","Pseurotin A cluster");
		referenceList.put("Afu8g00450","Pseurotin A cluster");
		referenceList.put("Afu8g00460","Pseurotin A cluster");
		referenceList.put("Afu8g00470","Pseurotin A cluster");
		referenceList.put("Afu8g00480","Pseurotin A cluster");
		referenceList.put("Afu8g00490","Pseurotin A cluster");
		
		referenceList.put("Afu8g00500","Pseurotin A cluster");
		referenceList.put("Afu8g00510","Pseurotin A cluster");
		referenceList.put("Afu8g00520","Pseurotin A cluster");
		referenceList.put("Afu8g00530","Pseurotin A cluster");
		referenceList.put("Afu8g00540","Pseurotin A cluster");
		
		
		//Siderophone (sid) cluster
		referenceList.put("Afu3g03270","Siderophone (sid) cluster");
		referenceList.put("Afu3g03280","Siderophone (sid) cluster");
		referenceList.put("Afu3g03290","Siderophone (sid) cluster");
		referenceList.put("Afu3g03300","Siderophone (sid) cluster");
		referenceList.put("Afu3g03310","Siderophone (sid) cluster");
		referenceList.put("Afu3g03320","Siderophone (sid) cluster");
		referenceList.put("Afu3g03330","Siderophone (sid) cluster");
		referenceList.put("Afu3g03340","Siderophone (sid) cluster");
		referenceList.put("Afu3g03350","Siderophone (sid) cluster");
		referenceList.put("Afu3g03360","Siderophone (sid) cluster");
		referenceList.put("Afu3g03370","Siderophone (sid) cluster");
		referenceList.put("Afu3g03370","Siderophone (sid) cluster");
		referenceList.put("Afu3g03390","Siderophone (sid) cluster");
		referenceList.put("Afu3g03400","Siderophone (sid) cluster");
		referenceList.put("Afu3g03410","Siderophone (sid) cluster");
		referenceList.put("Afu3g03420","Siderophone (sid) cluster");
		referenceList.put("Afu3g03430","Siderophone (sid) cluster");
		referenceList.put("Afu3g03440","Siderophone (sid) cluster");
		referenceList.put("Afu3g03450","Siderophone (sid) cluster");
		referenceList.put("Afu3g03460","Siderophone (sid) cluster");
		referenceList.put("Afu3g03470","Siderophone (sid) cluster");
		referenceList.put("Afu3g03480","Siderophone (sid) cluster");
		referenceList.put("Afu3g03490","Siderophone (sid) cluster");
		referenceList.put("Afu3g03500","Siderophone (sid) cluster");
		referenceList.put("Afu3g03510","Siderophone (sid) cluster");
		referenceList.put("Afu3g03520","Siderophone (sid) cluster");
		referenceList.put("Afu3g03530","Siderophone (sid) cluster");
		referenceList.put("Afu3g03540","Siderophone (sid) cluster");
		referenceList.put("Afu3g03550","Siderophone (sid) cluster");
		referenceList.put("Afu3g03560","Siderophone (sid) cluster");
		referenceList.put("Afu3g03570","Siderophone (sid) cluster");
		referenceList.put("Afu3g03580","Siderophone (sid) cluster");
		
		//Afu1g01010 cluster
		referenceList.put("Afu1g00970","Afu1g01010 cluster");
		referenceList.put("Afu1g00980","Afu1g01010 cluster");
		referenceList.put("Afu1g00990","Afu1g01010 cluster");
		referenceList.put("Afu1g00100","Afu1g01010 cluster");
		referenceList.put("Afu1g00110","Afu1g01010 cluster");
		referenceList.put("Afu1g00120","Afu1g01010 cluster");
		referenceList.put("Afu1g00130","Afu1g01010 cluster");
		referenceList.put("Afu1g00140","Afu1g01010 cluster");
		referenceList.put("Afu1g00150","Afu1g01010 cluster");
		referenceList.put("Afu1g00160","Afu1g01010 cluster");
		referenceList.put("Afu1g00170","Afu1g01010 cluster");
		referenceList.put("Afu1g00180","Afu1g01010 cluster");
		referenceList.put("Afu1g00190","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00200","Afu1g01010 cluster");
		referenceList.put("Afu1g00210","Afu1g01010 cluster");
		referenceList.put("Afu1g00220","Afu1g01010 cluster");
		referenceList.put("Afu1g00230","Afu1g01010 cluster");
		referenceList.put("Afu1g00240","Afu1g01010 cluster");
		referenceList.put("Afu1g00250","Afu1g01010 cluster");
		referenceList.put("Afu1g00260","Afu1g01010 cluster");
		referenceList.put("Afu1g00270","Afu1g01010 cluster");
		referenceList.put("Afu1g00280","Afu1g01010 cluster");
		referenceList.put("Afu1g00290","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00300","Afu1g01010 cluster");
		referenceList.put("Afu1g00310","Afu1g01010 cluster");
		referenceList.put("Afu1g00320","Afu1g01010 cluster");
		referenceList.put("Afu1g00330","Afu1g01010 cluster");
		referenceList.put("Afu1g00340","Afu1g01010 cluster");
		referenceList.put("Afu1g00350","Afu1g01010 cluster");
		referenceList.put("Afu1g00360","Afu1g01010 cluster");
		referenceList.put("Afu1g00370","Afu1g01010 cluster");
		referenceList.put("Afu1g00380","Afu1g01010 cluster");
		referenceList.put("Afu1g00390","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00400","Afu1g01010 cluster");
		referenceList.put("Afu1g00410","Afu1g01010 cluster");
		referenceList.put("Afu1g00420","Afu1g01010 cluster");
		referenceList.put("Afu1g00430","Afu1g01010 cluster");
		referenceList.put("Afu1g00440","Afu1g01010 cluster");
		referenceList.put("Afu1g00450","Afu1g01010 cluster");
		referenceList.put("Afu1g00460","Afu1g01010 cluster");
		referenceList.put("Afu1g00470","Afu1g01010 cluster");
		referenceList.put("Afu1g00480","Afu1g01010 cluster");
		referenceList.put("Afu1g00490","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00500","Afu1g01010 cluster");
		referenceList.put("Afu1g00510","Afu1g01010 cluster");
		referenceList.put("Afu1g00520","Afu1g01010 cluster");
		referenceList.put("Afu1g00530","Afu1g01010 cluster");
		referenceList.put("Afu1g00540","Afu1g01010 cluster");
		referenceList.put("Afu1g00550","Afu1g01010 cluster");
		referenceList.put("Afu1g00560","Afu1g01010 cluster");
		referenceList.put("Afu1g00570","Afu1g01010 cluster");
		referenceList.put("Afu1g00580","Afu1g01010 cluster");
		referenceList.put("Afu1g00590","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00600","Afu1g01010 cluster");
		referenceList.put("Afu1g00610","Afu1g01010 cluster");
		referenceList.put("Afu1g00620","Afu1g01010 cluster");
		referenceList.put("Afu1g00630","Afu1g01010 cluster");
		referenceList.put("Afu1g00640","Afu1g01010 cluster");
		referenceList.put("Afu1g00650","Afu1g01010 cluster");
		referenceList.put("Afu1g00660","Afu1g01010 cluster");
		referenceList.put("Afu1g00670","Afu1g01010 cluster");
		referenceList.put("Afu1g00680","Afu1g01010 cluster");
		referenceList.put("Afu1g00690","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00700","Afu1g01010 cluster");
		referenceList.put("Afu1g00710","Afu1g01010 cluster");
		referenceList.put("Afu1g00720","Afu1g01010 cluster");
		referenceList.put("Afu1g00730","Afu1g01010 cluster");
		referenceList.put("Afu1g00740","Afu1g01010 cluster");
		referenceList.put("Afu1g00750","Afu1g01010 cluster");
		referenceList.put("Afu1g00760","Afu1g01010 cluster");
		referenceList.put("Afu1g00770","Afu1g01010 cluster");
		referenceList.put("Afu1g00780","Afu1g01010 cluster");
		referenceList.put("Afu1g00790","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00800","Afu1g01010 cluster");
		referenceList.put("Afu1g00810","Afu1g01010 cluster");
		referenceList.put("Afu1g00820","Afu1g01010 cluster");
		referenceList.put("Afu1g00830","Afu1g01010 cluster");
		referenceList.put("Afu1g00840","Afu1g01010 cluster");
		referenceList.put("Afu1g00850","Afu1g01010 cluster");
		referenceList.put("Afu1g00860","Afu1g01010 cluster");
		referenceList.put("Afu1g00870","Afu1g01010 cluster");
		referenceList.put("Afu1g00880","Afu1g01010 cluster");
		referenceList.put("Afu1g00890","Afu1g01010 cluster");
		
		referenceList.put("Afu1g00900","Afu1g01010 cluster");
		referenceList.put("Afu1g00910","Afu1g01010 cluster");
		referenceList.put("Afu1g00920","Afu1g01010 cluster");
		referenceList.put("Afu1g00930","Afu1g01010 cluster");
		referenceList.put("Afu1g00940","Afu1g01010 cluster");
		referenceList.put("Afu1g00950","Afu1g01010 cluster");
		referenceList.put("Afu1g00960","Afu1g01010 cluster");
		referenceList.put("Afu1g00970","Afu1g01010 cluster");
		referenceList.put("Afu1g00980","Afu1g01010 cluster");
		referenceList.put("Afu1g00990","Afu1g01010 cluster");
		
		referenceList.put("Afu1g01000","Afu1g01010 cluster");
		referenceList.put("Afu1g01010","Afu1g01010 cluster");
		referenceList.put("Afu1g01020","Afu1g01010 cluster");
		referenceList.put("Afu1g01030","Afu1g01010 cluster");
		
		//Afu1g10380 (nrps1) cluster
		referenceList.put("Afu1g10270","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10280","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10290","Afu1g10380 (nrps1) cluster");
		
		referenceList.put("Afu1g10300","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10310","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10320","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10330","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10340","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10350","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10360","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10370","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10380","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10390","Afu1g10380 (nrps1) cluster");
		
		referenceList.put("Afu1g10400","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10410","Afu1g10380 (nrps1) cluster");
		referenceList.put("Afu1g10420","Afu1g10380 (nrps1) cluster");
		
		
		//Afu1g17200 (sidC) cluster
		referenceList.put("Afu1g17080","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17090","Afu1g17200 (sidC) cluster");
		
		referenceList.put("Afu1g17100","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17110","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17120","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17130","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17140","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17150","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17160","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17170","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17180","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17190","Afu1g17200 (sidC) cluster");
		
		referenceList.put("Afu1g17200","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17210","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17220","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17230","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17240","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17250","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17260","Afu1g17200 (sidC) cluster");
		referenceList.put("Afu1g17270","Afu1g17200 (sidC) cluster");
		
		
		//Afu1g17740 cluster
		//Afu1g17723 (exceptions)
		//Afu1g17725
		referenceList.put("Afu1g17710","Afu1g17740 cluster");
		referenceList.put("Afu1g17720","Afu1g17740 cluster");
		referenceList.put("Afu1g17730","Afu1g17740 cluster");
		referenceList.put("Afu1g17740","Afu1g17740 cluster");
		referenceList.put("Afu1g17750","Afu1g17740 cluster");
		
		referenceList.put("Afu1g17723","Afu1g17740 cluster");
		referenceList.put("Afu1g17725","Afu1g17740 cluster");
		
		
		
		//Afug2g01290 cluster
		
		referenceList.put("Afu2g01170","Afug2g01290 cluster");
		referenceList.put("Afu2g01180","Afug2g01290 cluster");
		referenceList.put("Afu2g01190","Afug2g01290 cluster");
		
		referenceList.put("Afu2g01200","Afug2g01290 cluster");
		referenceList.put("Afu2g01210","Afug2g01290 cluster");
		referenceList.put("Afu2g01220","Afug2g01290 cluster");
		referenceList.put("Afu2g01230","Afug2g01290 cluster");
		referenceList.put("Afu2g01240","Afug2g01290 cluster");
		referenceList.put("Afu2g01250","Afug2g01290 cluster");
		referenceList.put("Afu2g01260","Afug2g01290 cluster");
		referenceList.put("Afu2g01270","Afug2g01290 cluster");
		referenceList.put("Afu2g01280","Afug2g01290 cluster");
		referenceList.put("Afu2g01290","Afug2g01290 cluster");
		
		referenceList.put("Afu2g01300","Afug2g01290 cluster");
		referenceList.put("Afu2g01310","Afug2g01290 cluster");
		referenceList.put("Afu2g01320","Afug2g01290 cluster");
		referenceList.put("Afu2g01330","Afug2g01290 cluster");
		referenceList.put("Afu2g01340","Afug2g01290 cluster");
		referenceList.put("Afu2g01350","Afug2g01290 cluster");
		referenceList.put("Afu2g01360","Afug2g01290 cluster");
		referenceList.put("Afu2g01370","Afug2g01290 cluster");
		referenceList.put("Afu2g01380","Afug2g01290 cluster");
		referenceList.put("Afu2g01390","Afug2g01290 cluster");
		
		referenceList.put("Afu2g01400","Afug2g01290 cluster");
		
		//Afu2g05760 cluster
		referenceList.put("Afu2g05730","Afu2g05760 cluster");
		referenceList.put("Afu2g05740","Afu2g05760 cluster");
		referenceList.put("Afu2g05750","Afu2g05760 cluster");
		referenceList.put("Afu2g05760","Afu2g05760 cluster");
		referenceList.put("Afu2g05770","Afu2g05760 cluster");
		referenceList.put("Afu2g05780","Afu2g05760 cluster");
		referenceList.put("Afu2g05790","Afu2g05760 cluster");
		
		referenceList.put("Afu2g05800","Afu2g05760 cluster");
		referenceList.put("Afu2g05810","Afu2g05760 cluster");
		referenceList.put("Afu2g05820","Afu2g05760 cluster");
		referenceList.put("Afu2g05830","Afu2g05760 cluster");
		referenceList.put("Afu2g05840","Afu2g05760 cluster");
		
		//Afu2g17600 cluster (this one does not end in zero)??????????????????????????????
		referenceList.put("Afu2g17511","Afu2g17600 cluster");
		referenceList.put("Afu2g17515","Afu2g17600 cluster");
		
		referenceList.put("Afu2g17600","Afu2g17600 cluster");
		
		//Afu3g01410 cluster
		referenceList.put("Afu3g01360","Afu3g01410 cluster");
		referenceList.put("Afu3g01370","Afu3g01410 cluster");
		referenceList.put("Afu3g01380","Afu3g01410 cluster");
		referenceList.put("Afu3g01390","Afu3g01410 cluster");
		
		referenceList.put("Afu3g01400","Afu3g01410 cluster");
		referenceList.put("Afu3g01410","Afu3g01410 cluster");
		referenceList.put("Afu3g01420","Afu3g01410 cluster");
		referenceList.put("Afu3g01430","Afu3g01410 cluster");
		referenceList.put("Afu3g01440","Afu3g01410 cluster");
		referenceList.put("Afu3g01450","Afu3g01410 cluster");
		referenceList.put("Afu3g01460","Afu3g01410 cluster");
		referenceList.put("Afu3g01470","Afu3g01410 cluster");
		referenceList.put("Afu3g01480","Afu3g01410 cluster");
		referenceList.put("Afu3g01490","Afu3g01410 cluster");
		
		referenceList.put("Afu3g01500","Afu3g01410 cluster");
		referenceList.put("Afu3g01510","Afu3g01410 cluster");
		referenceList.put("Afu3g01520","Afu3g01410 cluster");
		referenceList.put("Afu3g01530","Afu3g01410 cluster");
		referenceList.put("Afu3g01540","Afu3g01410 cluster");
		referenceList.put("Afu3g01550","Afu3g01410 cluster");
		referenceList.put("Afu3g01560","Afu3g01410 cluster");
		
		//Afug3g02530 cluster
		referenceList.put("Afu3g02450","Afug3g02530 cluster");
		referenceList.put("Afu3g02460","Afug3g02530 cluster");
		referenceList.put("Afu3g02470","Afug3g02530 cluster");
		referenceList.put("Afu3g02480","Afug3g02530 cluster");
		referenceList.put("Afu3g02490","Afug3g02530 cluster");
		
		referenceList.put("Afu3g02500","Afug3g02530 cluster");
		referenceList.put("Afu3g02510","Afug3g02530 cluster");
		referenceList.put("Afu3g02520","Afug3g02530 cluster");
		referenceList.put("Afu3g02530","Afug3g02530 cluster");
		referenceList.put("Afu3g02540","Afug3g02530 cluster");
		referenceList.put("Afu3g02550","Afug3g02530 cluster");
		referenceList.put("Afu3g02560","Afug3g02530 cluster");
		referenceList.put("Afu3g02570","Afug3g02530 cluster");
		referenceList.put("Afu3g02580","Afug3g02530 cluster");
		referenceList.put("Afu3g02590","Afug3g02530 cluster");
		
		referenceList.put("Afu3g02600","Afug3g02530 cluster");
		referenceList.put("Afu3g02610","Afug3g02530 cluster");
		referenceList.put("Afu3g02620","Afug3g02530 cluster");
		referenceList.put("Afu3g02630","Afug3g02530 cluster");
		referenceList.put("Afu3g02640","Afug3g02530 cluster");
		referenceList.put("Afu3g02650","Afug3g02530 cluster");
		
		
		
		//Afu3g02570 cluster
		referenceList.put("Afu3g02450","Afu3g02570 cluster");
		referenceList.put("Afu3g02460","Afu3g02570 cluster");
		referenceList.put("Afu3g02470","Afu3g02570 cluster");
		referenceList.put("Afu3g02480","Afu3g02570 cluster");
		referenceList.put("Afu3g02490","Afu3g02570 cluster");
		
		referenceList.put("Afu3g02500","Afu3g02570 cluster");
		referenceList.put("Afu3g02510","Afu3g02570 cluster");
		referenceList.put("Afu3g02520","Afu3g02570 cluster");
		referenceList.put("Afu3g02530","Afu3g02570 cluster");
		referenceList.put("Afu3g02540","Afu3g02570 cluster");
		referenceList.put("Afu3g02550","Afu3g02570 cluster");
		referenceList.put("Afu3g02560","Afu3g02570 cluster");
		referenceList.put("Afu3g02570","Afu3g02570 cluster");
		referenceList.put("Afu3g02580","Afu3g02570 cluster");
		referenceList.put("Afu3g02590","Afu3g02570 cluster");
		
		referenceList.put("Afu3g02600","Afu3g02570 cluster");
		referenceList.put("Afu3g02610","Afu3g02570 cluster");
		referenceList.put("Afu3g02620","Afu3g02570 cluster");
		referenceList.put("Afu3g02630","Afu3g02570 cluster");
		referenceList.put("Afu3g02640","Afu3g02570 cluster");
		referenceList.put("Afu3g02650","Afu3g02570 cluster");
		
		//Afu3g02670 cluster
		//Afu3g02685
		referenceList.put("Afu3g02685","Afu3g02670 cluster");
		
		referenceList.put("Afu3g02670","Afu3g02670 cluster");
		referenceList.put("Afu3g02680","Afu3g02670 cluster");
		referenceList.put("Afu3g02690","Afu3g02670 cluster");
		
		referenceList.put("Afu3g02700","Afu3g02670 cluster");
		referenceList.put("Afu3g02710","Afu3g02670 cluster");
		referenceList.put("Afu3g02720","Afu3g02670 cluster");
		referenceList.put("Afu3g02730","Afu3g02670 cluster");
		referenceList.put("Afu3g02740","Afu3g02670 cluster");
		referenceList.put("Afu3g02750","Afu3g02670 cluster");
		referenceList.put("Afu3g02760","Afu3g02670 cluster");
		
		//Afu3g12920 cluster
		referenceList.put("Afu3g12750","Afu3g12920 cluster");
		referenceList.put("Afu3g12760","Afu3g12920 cluster");
		referenceList.put("Afu3g12770","Afu3g12920 cluster");
		referenceList.put("Afu3g12780","Afu3g12920 cluster");
		referenceList.put("Afu3g12790","Afu3g12920 cluster");
		
		referenceList.put("Afu3g12800","Afu3g12920 cluster");
		referenceList.put("Afu3g12810","Afu3g12920 cluster");
		referenceList.put("Afu3g12820","Afu3g12920 cluster");
		referenceList.put("Afu3g12830","Afu3g12920 cluster");
		referenceList.put("Afu3g12840","Afu3g12920 cluster");
		referenceList.put("Afu3g12850","Afu3g12920 cluster");
		referenceList.put("Afu3g12860","Afu3g12920 cluster");
		referenceList.put("Afu3g12870","Afu3g12920 cluster");
		referenceList.put("Afu3g12880","Afu3g12920 cluster");
		referenceList.put("Afu3g12890","Afu3g12920 cluster");
		
		referenceList.put("Afu3g12900","Afu3g12920 cluster");
		referenceList.put("Afu3g12910","Afu3g12920 cluster");
		referenceList.put("Afu3g12920","Afu3g12920 cluster");
		referenceList.put("Afu3g12930","Afu3g12920 cluster");
		referenceList.put("Afu3g12940","Afu3g12920 cluster");
		referenceList.put("Afu3g12950","Afu3g12920 cluster");
		referenceList.put("Afu3g12960","Afu3g12920 cluster");
		referenceList.put("Afu3g12970","Afu3g12920 cluster");
		referenceList.put("Afu3g12980","Afu3g12920 cluster");
		referenceList.put("Afu3g12990","Afu3g12920 cluster");
		
		
		referenceList.put("Afu3g13000","Afu3g12920 cluster");
		referenceList.put("Afu3g13010","Afu3g12920 cluster");
		referenceList.put("Afu3g13020","Afu3g12920 cluster");
		
		//Afu3g12930 cluster
		referenceList.put("Afu3g12750","Afu3g12930 cluster");
		referenceList.put("Afu3g12760","Afu3g12930 cluster");
		referenceList.put("Afu3g12770","Afu3g12930 cluster");
		referenceList.put("Afu3g12780","Afu3g12930 cluster");
		referenceList.put("Afu3g12790","Afu3g12930 cluster");
		
		referenceList.put("Afu3g12800","Afu3g12930 cluster");
		referenceList.put("Afu3g12810","Afu3g12930 cluster");
		referenceList.put("Afu3g12820","Afu3g12930 cluster");
		referenceList.put("Afu3g12830","Afu3g12930 cluster");
		referenceList.put("Afu3g12840","Afu3g12930 cluster");
		referenceList.put("Afu3g12850","Afu3g12930 cluster");
		referenceList.put("Afu3g12860","Afu3g12930 cluster");
		referenceList.put("Afu3g12870","Afu3g12930 cluster");
		referenceList.put("Afu3g12880","Afu3g12930 cluster");
		referenceList.put("Afu3g12890","Afu3g12930 cluster");
		
		referenceList.put("Afu3g12900","Afu3g12930 cluster");
		referenceList.put("Afu3g12910","Afu3g12930 cluster");
		referenceList.put("Afu3g12920","Afu3g12930 cluster");
		referenceList.put("Afu3g12930","Afu3g12930 cluster");
		referenceList.put("Afu3g12940","Afu3g12930 cluster");
		referenceList.put("Afu3g12950","Afu3g12930 cluster");
		referenceList.put("Afu3g12960","Afu3g12930 cluster");
		referenceList.put("Afu3g12970","Afu3g12930 cluster");
		referenceList.put("Afu3g12980","Afu3g12930 cluster");
		referenceList.put("Afu3g12990","Afu3g12930 cluster");
		
		referenceList.put("Afu3g13000","Afu3g12930 cluster");
		referenceList.put("Afu3g13010","Afu3g12930 cluster");
		referenceList.put("Afu3g13020","Afu3g12930 cluster");
		
		//Afu3g13730 cluster
		referenceList.put("Afu3g13600","Afu3g13730 cluster");
		referenceList.put("Afu3g13610","Afu3g13730 cluster");
		referenceList.put("Afu3g13620","Afu3g13730 cluster");
		referenceList.put("Afu3g13630","Afu3g13730 cluster");
		referenceList.put("Afu3g13640","Afu3g13730 cluster");
		referenceList.put("Afu3g13650","Afu3g13730 cluster");
		referenceList.put("Afu3g13660","Afu3g13730 cluster");
		referenceList.put("Afu3g13670","Afu3g13730 cluster");
		referenceList.put("Afu3g13680","Afu3g13730 cluster");
		referenceList.put("Afu3g13690","Afu3g13730 cluster");
		
		referenceList.put("Afu3g13700","Afu3g13730 cluster");
		referenceList.put("Afu3g13710","Afu3g13730 cluster");
		referenceList.put("Afu3g13720","Afu3g13730 cluster");
		referenceList.put("Afu3g13730","Afu3g13730 cluster");
		referenceList.put("Afu3g13740","Afu3g13730 cluster");
		referenceList.put("Afu3g13750","Afu3g13730 cluster");
		referenceList.put("Afu3g13760","Afu3g13730 cluster");
		referenceList.put("Afu3g13770","Afu3g13730 cluster");
		referenceList.put("Afu3g13780","Afu3g13730 cluster");
		referenceList.put("Afu3g13790","Afu3g13730 cluster");
		
		
		//Afu3g14700 cluster
		referenceList.put("Afu3g14620","Afu3g14700 cluster");
		referenceList.put("Afu3g14630","Afu3g14700 cluster");
		referenceList.put("Afu3g14640","Afu3g14700 cluster");
		referenceList.put("Afu3g14650","Afu3g14700 cluster");
		referenceList.put("Afu3g14660","Afu3g14700 cluster");
		referenceList.put("Afu3g14670","Afu3g14700 cluster");
		referenceList.put("Afu3g14680","Afu3g14700 cluster");
		referenceList.put("Afu3g14690","Afu3g14700 cluster");
		
		referenceList.put("Afu3g14700","Afu3g14700 cluster");
		referenceList.put("Afu3g14710","Afu3g14700 cluster");
		referenceList.put("Afu3g14720","Afu3g14700 cluster");
		referenceList.put("Afu3g14730","Afu3g14700 cluster");
		referenceList.put("Afu3g14740","Afu3g14700 cluster");
		referenceList.put("Afu3g14750","Afu3g14700 cluster");
		referenceList.put("Afu3g14760","Afu3g14700 cluster");
		referenceList.put("Afu3g14770","Afu3g14700 cluster");
		referenceList.put("Afu3g14780","Afu3g14700 cluster");
		referenceList.put("Afu3g14790","Afu3g14700 cluster");
		
		referenceList.put("Afu3g14800","Afu3g14700 cluster");
		referenceList.put("Afu3g14810","Afu3g14700 cluster");
		referenceList.put("Afu3g14820","Afu3g14700 cluster");
		referenceList.put("Afu3g14830","Afu3g14700 cluster");
		referenceList.put("Afu3g14840","Afu3g14700 cluster");
		referenceList.put("Afu3g14850","Afu3g14700 cluster");
		referenceList.put("Afu3g14860","Afu3g14700 cluster");
		referenceList.put("Afu3g14870","Afu3g14700 cluster");
		referenceList.put("Afu3g14880","Afu3g14700 cluster");
		
		//Afu3g15270 cluster
		referenceList.put("Afu3g15190","Afu3g15270 cluster");
		
		referenceList.put("Afu3g15200","Afu3g15270 cluster");
		referenceList.put("Afu3g15210","Afu3g15270 cluster");
		referenceList.put("Afu3g15220","Afu3g15270 cluster");
		referenceList.put("Afu3g15230","Afu3g15270 cluster");
		referenceList.put("Afu3g15240","Afu3g15270 cluster");
		referenceList.put("Afu3g15250","Afu3g15270 cluster");
		referenceList.put("Afu3g15260","Afu3g15270 cluster");
		referenceList.put("Afu3g15270","Afu3g15270 cluster");
		referenceList.put("Afu3g15280","Afu3g15270 cluster");
		referenceList.put("Afu3g15290","Afu3g15270 cluster");
		
		referenceList.put("Afu3g15300","Afu3g15270 cluster");
		referenceList.put("Afu3g15310","Afu3g15270 cluster");
		referenceList.put("Afu3g15320","Afu3g15270 cluster");
		referenceList.put("Afu3g15330","Afu3g15270 cluster");
		referenceList.put("Afu3g15340","Afu3g15270 cluster");
		referenceList.put("Afu3g15350","Afu3g15270 cluster");
		
		//------------------Afu4g00210
		//exceptions
		//Afu4g00195
		//Afu4g00225
		//Afu4g00235
		
		
		referenceList.put("Afu4g00195","Afu4g00210 cluster");
		referenceList.put("Afu4g00225","Afu4g00210 cluster");
		referenceList.put("Afu4g00235","Afu4g00210 cluster");
		
		referenceList.put("Afu4g00150","Afu4g00210 cluster");
		referenceList.put("Afu4g00160","Afu4g00210 cluster");
		referenceList.put("Afu4g00170","Afu4g00210 cluster");
		referenceList.put("Afu4g00180","Afu4g00210 cluster");
		referenceList.put("Afu4g00190","Afu4g00210 cluster");
		
		referenceList.put("Afu4g00200","Afu4g00210 cluster");
		referenceList.put("Afu4g00210","Afu4g00210 cluster");
		referenceList.put("Afu4g00220","Afu4g00210 cluster");
		referenceList.put("Afu4g00230","Afu4g00210 cluster");
		referenceList.put("Afu4g00240","Afu4g00210 cluster");
		referenceList.put("Afu4g00250","Afu4g00210 cluster");
		referenceList.put("Afu4g00260","Afu4g00210 cluster");
		referenceList.put("Afu4g00270","Afu4g00210 cluster");
		referenceList.put("Afu4g00280","Afu4g00210 cluster");
		referenceList.put("Afu4g00290","Afu4g00210 cluster");
		
		//----------------Afu4g14560
		//exceptions
		//Afu4g14705
		//Afu4g14712
		
		referenceList.put("Afu4g14705","Afu4g14560 cluster");
		referenceList.put("Afu4g14712","Afu4g14560 cluster");
		
		referenceList.put("Afu4g14420","Afu4g14560 cluster");
		referenceList.put("Afu4g14430","Afu4g14560 cluster");
		referenceList.put("Afu4g14440","Afu4g14560 cluster");
		referenceList.put("Afu4g14450","Afu4g14560 cluster");
		referenceList.put("Afu4g14460","Afu4g14560 cluster");
		referenceList.put("Afu4g14470","Afu4g14560 cluster");
		referenceList.put("Afu4g14480","Afu4g14560 cluster");
		referenceList.put("Afu4g14490","Afu4g14560 cluster");
		
		referenceList.put("Afu4g14500","Afu4g14560 cluster");
		referenceList.put("Afu4g14510","Afu4g14560 cluster");
		referenceList.put("Afu4g14520","Afu4g14560 cluster");
		referenceList.put("Afu4g14530","Afu4g14560 cluster");
		referenceList.put("Afu4g14540","Afu4g14560 cluster");
		referenceList.put("Afu4g14550","Afu4g14560 cluster");
		referenceList.put("Afu4g14560","Afu4g14560 cluster");
		referenceList.put("Afu4g14570","Afu4g14560 cluster");
		referenceList.put("Afu4g14580","Afu4g14560 cluster");
		referenceList.put("Afu4g14590","Afu4g14560 cluster");
		
		referenceList.put("Afu4g14600","Afu4g14560 cluster");
		referenceList.put("Afu4g14610","Afu4g14560 cluster");
		referenceList.put("Afu4g14620","Afu4g14560 cluster");
		referenceList.put("Afu4g14630","Afu4g14560 cluster");
		referenceList.put("Afu4g14640","Afu4g14560 cluster");
		referenceList.put("Afu4g14650","Afu4g14560 cluster");
		referenceList.put("Afu4g14660","Afu4g14560 cluster");
		referenceList.put("Afu4g14670","Afu4g14560 cluster");
		referenceList.put("Afu4g14680","Afu4g14560 cluster");
		referenceList.put("Afu4g14690","Afu4g14560 cluster");
		
		referenceList.put("Afu4g14700","Afu4g14560 cluster");
		referenceList.put("Afu4g14710","Afu4g14560 cluster");
		referenceList.put("Afu4g14720","Afu4g14560 cluster");
		referenceList.put("Afu4g14730","Afu4g14560 cluster");
		
		//Afu5g10120
		referenceList.put("Afu5g09970","Afu5g10120 cluster");
		referenceList.put("Afu5g09980","Afu5g10120 cluster");
		referenceList.put("Afu5g09990","Afu5g10120 cluster");
		
		referenceList.put("Afu5g10000","Afu5g10120 cluster");
		referenceList.put("Afu5g10010","Afu5g10120 cluster");
		referenceList.put("Afu5g10020","Afu5g10120 cluster");
		referenceList.put("Afu5g10030","Afu5g10120 cluster");
		referenceList.put("Afu5g10040","Afu5g10120 cluster");
		referenceList.put("Afu5g10050","Afu5g10120 cluster");
		referenceList.put("Afu5g10060","Afu5g10120 cluster");
		referenceList.put("Afu5g10070","Afu5g10120 cluster");
		referenceList.put("Afu5g10080","Afu5g10120 cluster");
		referenceList.put("Afu5g10090","Afu5g10120 cluster");
		
		referenceList.put("Afu5g10100","Afu5g10120 cluster");
		referenceList.put("Afu5g10110","Afu5g10120 cluster");
		referenceList.put("Afu5g10120","Afu5g10120 cluster");
		referenceList.put("Afu5g10130","Afu5g10120 cluster");
		referenceList.put("Afu5g10140","Afu5g10120 cluster");
		referenceList.put("Afu5g10150","Afu5g10120 cluster");
		referenceList.put("Afu5g10160","Afu5g10120 cluster");
		referenceList.put("Afu5g10170","Afu5g10120 cluster");
		referenceList.put("Afu5g10180","Afu5g10120 cluster");
		referenceList.put("Afu5g10190","Afu5g10120 cluster");
		
		referenceList.put("Afu5g10200","Afu5g10120 cluster");
		referenceList.put("Afu5g10210","Afu5g10120 cluster");
		referenceList.put("Afu5g10220","Afu5g10120 cluster");
		referenceList.put("Afu5g10230","Afu5g10120 cluster");
		referenceList.put("Afu5g10240","Afu5g10120 cluster");
		referenceList.put("Afu5g10250","Afu5g10120 cluster");
		
		//Afu5g12730
		referenceList.put("Afu5g12680","Afu5g12730 cluster");
		referenceList.put("Afu5g12690","Afu5g12730 cluster");
		
		referenceList.put("Afu5g12700","Afu5g12730 cluster");
		referenceList.put("Afu5g12710","Afu5g12730 cluster");
		referenceList.put("Afu5g12720","Afu5g12730 cluster");
		referenceList.put("Afu5g12730","Afu5g12730 cluster");
		referenceList.put("Afu5g12740","Afu5g12730 cluster");
		referenceList.put("Afu5g12750","Afu5g12730 cluster");
		referenceList.put("Afu5g12760","Afu5g12730 cluster");
		referenceList.put("Afu5g12770","Afu5g12730 cluster");
		referenceList.put("Afu5g12780","Afu5g12730 cluster");
		referenceList.put("Afu5g12790","Afu5g12730 cluster");
		
		referenceList.put("Afu5g12800","Afu5g12730 cluster");
		referenceList.put("Afu5g12810","Afu5g12730 cluster");
		referenceList.put("Afu5g12820","Afu5g12730 cluster");
		referenceList.put("Afu5g12830","Afu5g12730 cluster");
		referenceList.put("Afu5g12840","Afu5g12730 cluster");
		
		//Afu6g03480
		referenceList.put("Afu6g03400","Afu6g03480 cluster");
		referenceList.put("Afu6g03410","Afu6g03480 cluster");
		referenceList.put("Afu6g03420","Afu6g03480 cluster");
		referenceList.put("Afu6g03430","Afu6g03480 cluster");
		referenceList.put("Afu6g03440","Afu6g03480 cluster");
		referenceList.put("Afu6g03450","Afu6g03480 cluster");
		referenceList.put("Afu6g03460","Afu6g03480 cluster");
		referenceList.put("Afu6g03470","Afu6g03480 cluster");
		referenceList.put("Afu6g03480","Afu6g03480 cluster");
		referenceList.put("Afu6g03490","Afu6g03480 cluster");
		
		referenceList.put("Afu6g03500","Afu6g03480 cluster");
		referenceList.put("Afu6g03510","Afu6g03480 cluster");
		referenceList.put("Afu6g03520","Afu6g03480 cluster");
		referenceList.put("Afu6g03530","Afu6g03480 cluster");
		referenceList.put("Afu6g03540","Afu6g03480 cluster");
		referenceList.put("Afu6g03550","Afu6g03480 cluster");
		referenceList.put("Afu6g03560","Afu6g03480 cluster");
		referenceList.put("Afu6g03570","Afu6g03480 cluster");
		referenceList.put("Afu6g03580","Afu6g03480 cluster");
		referenceList.put("Afu6g03590","Afu6g03480 cluster");
		
		referenceList.put("Afu6g03600","Afu6g03480 cluster");
		referenceList.put("Afu6g03610","Afu6g03480 cluster");
		referenceList.put("Afu6g03620","Afu6g03480 cluster");
		
		//Afu6g08560
		referenceList.put("Afu6g08520","Afu6g08560 cluster");
		referenceList.put("Afu6g08530","Afu6g08560 cluster");
		referenceList.put("Afu6g08540","Afu6g08560 cluster");
		referenceList.put("Afu6g08550","Afu6g08560 cluster");
		referenceList.put("Afu6g08560","Afu6g08560 cluster");
		referenceList.put("Afu6g08570","Afu6g08560 cluster");
		referenceList.put("Afu6g08580","Afu6g08560 cluster");
		referenceList.put("Afu6g08590","Afu6g08560 cluster");
		
		referenceList.put("Afu6g08600","Afu6g08560 cluster");
		referenceList.put("Afu6g08610","Afu6g08560 cluster");
		referenceList.put("Afu6g08620","Afu6g08560 cluster");
		referenceList.put("Afu6g08630","Afu6g08560 cluster");
		referenceList.put("Afu6g08640","Afu6g08560 cluster");
		
		//Afu6g12080
		referenceList.put("Afu6g11980","Afu6g12080 cluster");
		referenceList.put("Afu6g11990","Afu6g12080 cluster");
		
		referenceList.put("Afu6g12000","Afu6g12080 cluster");
		referenceList.put("Afu6g12010","Afu6g12080 cluster");
		referenceList.put("Afu6g12020","Afu6g12080 cluster");
		referenceList.put("Afu6g12030","Afu6g12080 cluster");
		referenceList.put("Afu6g12040","Afu6g12080 cluster");
		referenceList.put("Afu6g12050","Afu6g12080 cluster");
		referenceList.put("Afu6g12060","Afu6g12080 cluster");
		referenceList.put("Afu6g12070","Afu6g12080 cluster");
		referenceList.put("Afu6g12080","Afu6g12080 cluster");
		referenceList.put("Afu6g12090","Afu6g12080 cluster");
		
		referenceList.put("Afu6g12100","Afu6g12080 cluster");
		referenceList.put("Afu6g12110","Afu6g12080 cluster");
		referenceList.put("Afu6g12120","Afu6g12080 cluster");
		referenceList.put("Afu6g12130","Afu6g12080 cluster");
		referenceList.put("Afu6g12140","Afu6g12080 cluster");
		referenceList.put("Afu6g12150","Afu6g12080 cluster");
		referenceList.put("Afu6g12160","Afu6g12080 cluster");
		
		//---------Afu6g13930
		//exceptions
		//Afu6g13945
		referenceList.put("Afu6g13945","Afu6g13930 cluster");
		
		referenceList.put("Afu6g13820","Afu6g13930 cluster");
		referenceList.put("Afu6g13830","Afu6g13930 cluster");
		referenceList.put("Afu6g13840","Afu6g13930 cluster");
		referenceList.put("Afu6g13850","Afu6g13930 cluster");
		referenceList.put("Afu6g13860","Afu6g13930 cluster");
		referenceList.put("Afu6g13870","Afu6g13930 cluster");
		referenceList.put("Afu6g13880","Afu6g13930 cluster");
		referenceList.put("Afu6g13890","Afu6g13930 cluster");
		
		referenceList.put("Afu6g13900","Afu6g13930 cluster");
		referenceList.put("Afu6g13910","Afu6g13930 cluster");
		referenceList.put("Afu6g13920","Afu6g13930 cluster");
		referenceList.put("Afu6g13930","Afu6g13930 cluster");
		referenceList.put("Afu6g13940","Afu6g13930 cluster");
		referenceList.put("Afu6g13950","Afu6g13930 cluster");
		referenceList.put("Afu6g13960","Afu6g13930 cluster");
		referenceList.put("Afu6g13970","Afu6g13930 cluster");
		referenceList.put("Afu6g13980","Afu6g13930 cluster");
		referenceList.put("Afu6g13990","Afu6g13930 cluster");
		
		referenceList.put("Afu6g14000","Afu6g13930 cluster");
		referenceList.put("Afu6g14010","Afu6g13930 cluster");
		referenceList.put("Afu6g14020","Afu6g13930 cluster");
		referenceList.put("Afu6g14030","Afu6g13930 cluster");
		referenceList.put("Afu6g14040","Afu6g13930 cluster");
		referenceList.put("Afu6g14050","Afu6g13930 cluster");
		
		//Afu7g00170
		referenceList.put("Afu7g00100","Afu7g00170 cluster");
		referenceList.put("Afu7g00110","Afu7g00170 cluster");
		referenceList.put("Afu7g00120","Afu7g00170 cluster");
		referenceList.put("Afu7g00130","Afu7g00170 cluster");
		referenceList.put("Afu7g00140","Afu7g00170 cluster");
		referenceList.put("Afu7g00150","Afu7g00170 cluster");
		referenceList.put("Afu7g00160","Afu7g00170 cluster");
		referenceList.put("Afu7g00170","Afu7g00170 cluster");
		referenceList.put("Afu7g00180","Afu7g00170 cluster");
		referenceList.put("Afu7g00190","Afu7g00170 cluster");
		referenceList.put("Afu7g00200","Afu7g00170 cluster");
		
		//Afu8g00540
		referenceList.put("Afu8g00310","Afu8g00540 cluster");
		referenceList.put("Afu8g00320","Afu8g00540 cluster");
		referenceList.put("Afu8g00330","Afu8g00540 cluster");
		referenceList.put("Afu8g00340","Afu8g00540 cluster");
		referenceList.put("Afu8g00350","Afu8g00540 cluster");
		referenceList.put("Afu8g00360","Afu8g00540 cluster");
		referenceList.put("Afu8g00370","Afu8g00540 cluster");
		
		//------Afu8g00620
		//exception
		//Afu8g00595
		referenceList.put("Afu8g00595","Afu8g00620 cluster");
		
		referenceList.put("Afu8g00390","Afu8g00620 cluster");
		
		referenceList.put("Afu8g00400","Afu8g00620 cluster");
		referenceList.put("Afu8g00410","Afu8g00620 cluster");
		referenceList.put("Afu8g00420","Afu8g00620 cluster");
		referenceList.put("Afu8g00430","Afu8g00620 cluster");
		referenceList.put("Afu8g00440","Afu8g00620 cluster");
		referenceList.put("Afu8g00450","Afu8g00620 cluster");
		referenceList.put("Afu8g00460","Afu8g00620 cluster");
		referenceList.put("Afu8g00470","Afu8g00620 cluster");
		referenceList.put("Afu8g00480","Afu8g00620 cluster");
		referenceList.put("Afu8g00490","Afu8g00620 cluster");
		
		referenceList.put("Afu8g00500","Afu8g00620 cluster");
		referenceList.put("Afu8g00510","Afu8g00620 cluster");
		referenceList.put("Afu8g00520","Afu8g00620 cluster");
		referenceList.put("Afu8g00530","Afu8g00620 cluster");
		referenceList.put("Afu8g00540","Afu8g00620 cluster");
		referenceList.put("Afu8g00550","Afu8g00620 cluster");
		referenceList.put("Afu8g00560","Afu8g00620 cluster");
		referenceList.put("Afu8g00570","Afu8g00620 cluster");
		referenceList.put("Afu8g00580","Afu8g00620 cluster");
		referenceList.put("Afu8g00590","Afu8g00620 cluster");
		
		referenceList.put("Afu8g00600","Afu8g00620 cluster");
		referenceList.put("Afu8g00610","Afu8g00620 cluster");
		referenceList.put("Afu8g00620","Afu8g00620 cluster");
		referenceList.put("Afu8g00630","Afu8g00620 cluster");
		referenceList.put("Afu8g00640","Afu8g00620 cluster");
		referenceList.put("Afu8g00650","Afu8g00620 cluster");
		referenceList.put("Afu8g00660","Afu8g00620 cluster");
		referenceList.put("Afu8g00670","Afu8g00620 cluster");
		referenceList.put("Afu8g00680","Afu8g00620 cluster");
		referenceList.put("Afu8g00690","Afu8g00620 cluster");
		
		referenceList.put("Afu8g00700","Afu8g00620 cluster");
		referenceList.put("Afu8g00710","Afu8g00620 cluster");
		referenceList.put("Afu8g00720","Afu8g00620 cluster");
		
		//-----------Afu8g01640
		//exceptions
		//Afu8g01637
		//Afu8g01638
		
		referenceList.put("Afu8g01637","Afu8g01640 cluster");
		referenceList.put("Afu8g01638","Afu8g01640 cluster");
		
		referenceList.put("Afu8g01600","Afu8g01640 cluster");
		referenceList.put("Afu8g01610","Afu8g01640 cluster");
		referenceList.put("Afu8g01620","Afu8g01640 cluster");
		referenceList.put("Afu8g01630","Afu8g01640 cluster");
		referenceList.put("Afu8g01640","Afu8g01640 cluster");
		referenceList.put("Afu8g01650","Afu8g01640 cluster");
		referenceList.put("Afu8g01660","Afu8g01640 cluster");
		referenceList.put("Afu8g01670","Afu8g01640 cluster");
		referenceList.put("Afu8g01680","Afu8g01640 cluster");
		referenceList.put("Afu8g01690","Afu8g01640 cluster");
		
		referenceList.put("Afu8g01700","Afu8g01640 cluster");
		referenceList.put("Afu8g01710","Afu8g01640 cluster");
		referenceList.put("Afu8g01720","Afu8g01640 cluster");
		referenceList.put("Afu8g01730","Afu8g01640 cluster");
		
		
		//-------------Afu8g02350
		//exceptions
		//Afu8g02315
		//Afu8g02335
		referenceList.put("Afu8g02315","Afu8g02350 cluster");
		referenceList.put("Afu8g02335","Afu8g02350 cluster");
		
		
		referenceList.put("Afu8g02280","Afu8g02350 cluster");
		referenceList.put("Afu8g02290","Afu8g02350 cluster");
		
		referenceList.put("Afu8g02300","Afu8g02350 cluster");
		referenceList.put("Afu8g02310","Afu8g02350 cluster");
		referenceList.put("Afu8g02320","Afu8g02350 cluster");
		referenceList.put("Afu8g02330","Afu8g02350 cluster");
		referenceList.put("Afu8g02340","Afu8g02350 cluster");
		referenceList.put("Afu8g02350","Afu8g02350 cluster");
		referenceList.put("Afu8g02360","Afu8g02350 cluster");
		referenceList.put("Afu8g02370","Afu8g02350 cluster");
		referenceList.put("Afu8g02380","Afu8g02350 cluster");
		referenceList.put("Afu8g02390","Afu8g02350 cluster");
		
		referenceList.put("Afu8g02400","Afu8g02350 cluster");
		referenceList.put("Afu8g02410","Afu8g02350 cluster");
		referenceList.put("Afu8g02420","Afu8g02350 cluster");
		referenceList.put("Afu8g02430","Afu8g02350 cluster");
		referenceList.put("Afu8g02440","Afu8g02350 cluster");
		referenceList.put("Afu8g02450","Afu8g02350 cluster");
		referenceList.put("Afu8g02460","Afu8g02350 cluster");
		
		referenceList.put("Afu8g02470","Afu8g02350 cluster");
		referenceList.put("Afu8g02470","Afu8g02350 cluster");
		referenceList.put("Afu8g02490","Afu8g02350 cluster");
		
		//No PKS or NRPS backone 1
		
		//No PKS or NRPS backone 2
		
		//No PKS or NRPS backone 3
		
		//No PKS or NRPS backone 4
		
		//No PKS or NRPS backone 5
		
		
	}//end initReferenceList()

}
