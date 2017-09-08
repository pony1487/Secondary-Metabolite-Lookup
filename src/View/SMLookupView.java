package View;
//This is the View. Its only job is to display what the user sees 
//It performs no calculations, but instead passes information entered by the user to whomever needs it.

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SMLookupView extends JFrame {
	
	private final int width = 600;
	private final int height = 600;

	
	
	private JPanel TextPanel;
	private JPanel controlPanel;
	
	private JTextArea inputText;
	private JTextArea outputText;
	private JScrollPane scrollpane;
	private JButton button;
	private JButton writeFileButton;
	
	
	
	public SMLookupView()
	{
		//enterAccessionNumbers = new JTextField("Enter numbers");
		
		JFrame frame = new JFrame("SMClusterLookup");
		
		
		inputText = new JTextArea(5,20);
		scrollpane = new JScrollPane(inputText);
		
		outputText = new JTextArea(5,20);
		//outputText.setEditable(false);//does this stop it being able to be updated by program??
		
		
		
		//text panel stuff
		TextPanel = new JPanel();
		TextPanel.setLayout(new FlowLayout());
	
		TextPanel.add(scrollpane);
		TextPanel.add(outputText);
		
	
		button = new JButton("Search");
		writeFileButton = new JButton("Write To File");
		
		TextPanel.add(button);
		TextPanel.add(writeFileButton);
	

		frame.add(TextPanel);
	
		
		frame.setSize(height,width);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(null);
		
		
	}
	
	public String getUserInput()
	{
		return inputText.getText();
	}
	
	public void setOutputText(ArrayList<String> list)
	{
		for(int i = 0; i < list.size();i++)
		{
			//outputText.setText(list.get(i));
			outputText.append(i + ") " + list.get(i));
			outputText.append("\n");
			//System.out.println(list.get(i));
		}
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
		
	public void addButtonListener(ActionListener listenForButton)
	{
		
		button.addActionListener(listenForButton);
		
		
	}
	
	public void addButtonListenerToWriteButton(ActionListener listenForButton)
	{
		writeFileButton.addActionListener(listenForButton);
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage)
	{
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}

}
