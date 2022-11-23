package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VueController {
	
	@FXML
	private Button btnClickMe;
	
	@FXML
	private TextField screen;
	
	private boolean reset = false;
	
	public void clickMe(ActionEvent e) {
		
		int longueur = e.getSource().toString().length();
		char valeur = e.getSource().toString().charAt(longueur - 2);
		
		if (valeur == '=') {
			String equation = screen.getText();
			reset = true;
			if (screen.getText().contains("+")){
				String nb1 = "";
				String nb2 = "";
				boolean b = false;
				for (int i=0; i<equation.length(); i++) {
					char c = equation.charAt(i);
					if (c != '+') {
						if (b==false) {
							nb1 += c;
						}
						else {
							nb2 += c;
						}
					}
					else {
						b=true;
					}
				}
				
				int nbInt1 = Integer.parseInt(nb1);
				int nbInt2 = Integer.parseInt(nb2);
				int val = nbInt1 + nbInt2;
				
				String valString = val + "";
				
				screen.setText(valString);
				
			}
			if (screen.getText().contains("-")){
				String nb1 = "";
				String nb2 = "";
				boolean b = false;
				for (int i=0; i<equation.length(); i++) {
					char c = equation.charAt(i);
					if (c != '-') {
						if (b==false) {
							nb1 += c;
						}
						else {
							nb2 += c;
						}
					}
					else {
						b=true;
					}
				}
				
				int nbInt1 = Integer.parseInt(nb1);
				int nbInt2 = Integer.parseInt(nb2);
				int val = nbInt1 - nbInt2;
				
				String valString = val + "";
				
				screen.setText(valString);
				
			}
			
			if (screen.getText().contains("*")){
				String nb1 = "";
				String nb2 = "";
				boolean b = false;
				for (int i=0; i<equation.length(); i++) {
					char c = equation.charAt(i);
					if (c != '*') {
						if (b==false) {
							nb1 += c;
						}
						else {
							nb2 += c;
						}
					}
					else {
						b=true;
					}
				}
				
				int nbInt1 = Integer.parseInt(nb1);
				int nbInt2 = Integer.parseInt(nb2);
				int val = nbInt1 * nbInt2;
				
				String valString = val + "";
				
				screen.setText(valString);	
			}
			
			if (screen.getText().contains("/")){
				String nb1 = "";
				String nb2 = "";
				boolean b = false;
				for (int i=0; i<equation.length(); i++) {
					char c = equation.charAt(i);
					if (c != '/') {
						if (b==false) {
							nb1 += c;
						}
						else {
							nb2 += c;
						}
					}
					else {
						b=true;
					}
				}
				
				int nbInt1 = Integer.parseInt(nb1);
				int nbInt2 = Integer.parseInt(nb2);
				int val = nbInt1 / nbInt2;
				
				String valString = val + "";
				
				screen.setText(valString);
			}
		}
		else {
			if (reset == true) {
				screen.setText("" + valeur);
				reset = false;
			}
			else {
				screen.setText(screen.getText() + valeur);
			}	
		}
	}
}
