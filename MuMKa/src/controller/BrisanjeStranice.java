package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import model.RadniProstor;

public class BrisanjeStranice extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int inputBr = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stranice koju zelite da izbrisete: "));
	
		
		   
	}

}
