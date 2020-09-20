/***********************************************************************
 * Module:  BrisanjeKolekcije.java
 * Author:  Saki
 * Purpose: Defines the Class BrisanjeKolekcije
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Kolekcija;
import model.RadniProstor;
import observer.EventType;
import view.Window;

/** @pdOid b274e5a2-9465-4c19-aff9-d839a2ca315b */
public class BrisanjeKolekcije extends AbstractAction {
   /** @param e
    * @pdOid 835cec85-3c34-49bb-95d8-72d28b0d8991 */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
	   
	   if (childNodeView == null) {
			return;
		}
	   
	   Kolekcija childNodeModel = (Kolekcija)childNodeView.getUserObject(); 
	   
	   DefaultMutableTreeNode parentPackage = (DefaultMutableTreeNode)childNodeView.getParent();
	   
		if(parentPackage.getUserObject() instanceof RadniProstor) {
			
		((RadniProstor)parentPackage.getUserObject()).getListaKolekcija().remove(childNodeModel);
		
		Window.getInstance().getTreeHandler().getTreeModel().removeNodeFromParent(childNodeView);
		
		
		} else {
			((Kolekcija)parentPackage.getUserObject()).getListaKomponenti().remove(childNodeModel);
			
			Window.getInstance().getTreeHandler().getTreeModel().removeNodeFromParent(childNodeView);
			
		}
   }

}