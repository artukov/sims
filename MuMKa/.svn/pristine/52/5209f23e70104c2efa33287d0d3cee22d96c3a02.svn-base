/***********************************************************************
 * Module:  IzmenaKolekcije.java
 * Author:  Saki
 * Purpose: Defines the Class IzmenaKolekcije
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Kolekcija;
import observer.EventType;
import view.Window;

/** @pdOid 777609ee-3b7e-4599-be4d-9f65cafe2e88 */
public class IzmenaKolekcije extends AbstractAction {
   /** @param e
    * @pdOid c21ae951-1011-454b-83c2-cba05356b3ef */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
	   
	   if (childNodeView == null) {
			return;
		}

	   String inputName = JOptionPane.showInputDialog("Unesite novi naziv kolekcije: ");
		
		if (inputName == "" || inputName == null) {
			return;
		}
		
	   Kolekcija col = (Kolekcija)childNodeView.getUserObject();
	   col.setNaziv(inputName);
	   col.notifyObserver(EventType.CHANGED);
   }

}