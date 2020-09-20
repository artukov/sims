/***********************************************************************
 * Module:  KreiranjeKolekcije.java
 * Author:  Saki
 * Purpose: Defines the Class KreiranjeKolekcije
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Kolekcija;
import model.RadniProstor;
import view.Window;

/** @pdOid 1e6e91b0-b539-4638-a4ec-4dc89d4a2b5f */
public class KreiranjeKolekcije extends AbstractAction {
   /** @param e
    * @pdOid 85c09c0a-2c28-44c0-afc8-b2c858cf5937 */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window
				.getInstance().getTreeHandler().getTree().getLastSelectedPathComponent();
		
		if (childNodeView == null) {
			return;
		}
		
		String inputName = JOptionPane.showInputDialog("Unesite naziv kolekcije: ");
		
		if (inputName == "" || inputName == null) {
			return;
		}
		
		if (childNodeView.getUserObject() instanceof RadniProstor) {
			
			RadniProstor ws = (RadniProstor)childNodeView.getUserObject();
			if(ws == null)
				System.out.println("greska");
			
			Kolekcija newPackage = new Kolekcija(inputName);
			ws.getListaKolekcija().add(newPackage);
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(newPackage);
			
			Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node, childNodeView,
					childNodeView.getChildCount());
			
		} else if (childNodeView.getUserObject() instanceof Kolekcija) {
			
			Kolekcija p = (Kolekcija)childNodeView.getUserObject();
			Kolekcija newPackage = new Kolekcija(inputName);
			p.getListaKomponenti().add(newPackage);
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(newPackage);
			
			Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node, childNodeView, 
					childNodeView.getChildCount());
		}
   }

}