package Controller;
/// The Controller coordinates interactions between the View and Model

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import Model.SMLookupModel;
import View.SMLookupView;

public class SMLookupController {
	
	private SMLookupView view;
	private SMLookupModel model;
	
	
	
	public SMLookupController(SMLookupView view, SMLookupModel model)
	{
		this.view = view;
		this.model = model;
		
		model.initReferenceList();
		
		this.view.addButtonListener(new addButtonListener());
		//this.view.addButtonListenerToWriteButton(new addButtonListener());

	}
	
	class addButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				//System.out.print(view.getUserInput());
				model.setAccessionNumberFromInput(view.getUserInput());
				
				//model.printAccessionNumbers();
				//model.printReferenceList();
				
				model.searchReferenceList();
				//model.printOutputList();
				view.setOutputText(model.getOutputList());
				//view.setOutputText(model.searchReferenceList());
				
				
			}catch(Exception ex){
				System.out.println(ex);
			}
			
		}
		
	}
	


}
