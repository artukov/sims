/***********************************************************************
 * Module:  IzmenaProstoraRadnogProstora.java
 * Author:  Saki
 * Purpose: Defines the Class IzmenaProstoraRadnogProstora
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Kolekcija;
import model.RadniProstor;
import observer.EventType;
import view.Window;

/** @pdOid 7f6f11de-fa1f-446f-8cff-c9f360435be7 */
public class IzmenaProstoraRadnogProstora extends AbstractAction {
   /** @param e
    * @pdOid bef14a79-01d9-467a-a902-fe6c073fdede */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
	   
	   if (childNodeView == null) {
			return;
		}

	   String inputName = JOptionPane.showInputDialog("Unesite novi naziv Radnog prostora: ");
		
		if (inputName == "" || inputName == null) {
			return;
		}
		
	   RadniProstor rp = (RadniProstor)childNodeView.getUserObject();
	   rp.setNaziv(inputName);
	   rp.notifyObserver(EventType.CHANGED);
   }

}