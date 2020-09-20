/***********************************************************************
 * Module:  IzmenaDokumenta.java
 * Author:  Saki
 * Purpose: Defines the Class IzmenaDokumenta
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Dokument;
import model.Kolekcija;
import observer.EventType;
import view.Window;

/** @pdOid 433cc842-10ec-4a63-a96c-b44d5bc83bae */
public class IzmenaDokumenta extends AbstractAction {
   /** @param e
    * @pdOid 21aa834a-effd-4037-8c64-1f8d8d733dbc */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
	   
	   if (childNodeView == null) {
			return;
		}

	   String inputName = JOptionPane.showInputDialog("Unesite novi naziv dokumenta: ");
		
		if (inputName == "" || inputName == null) {
			return;
		}
		
	   Dokument col = (Dokument)childNodeView.getUserObject();
	   col.setNaziv(inputName);
	   col.notifyObserver(EventType.CHANGED);
   }

}