package View;

import Controller.SMLookupController;
import Model.SMLookupModel;

public class SMClusterLookupRUN {
	
	public static void main(String[] args)
	{
		SMLookupView view = new SMLookupView();
		SMLookupModel model = new SMLookupModel();
		SMLookupController controller = new SMLookupController(view,model);
	}

}
