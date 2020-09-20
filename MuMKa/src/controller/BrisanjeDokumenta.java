/***********************************************************************
 * Module:  BrisanjeDokumenta.java
 * Author:  Saki
 * Purpose: Defines the Class BrisanjeDokumenta
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Dokument;
import model.Kolekcija;
import model.RadniProstor;
import observer.EventType;
import view.Window;

/** @pdOid a22a60e7-9885-46c2-a2cb-6ba5644d16fc */
public class BrisanjeDokumenta extends AbstractAction {
   /** @param e
    * @pdOid 8fe55125-9a6f-44b7-b1c5-685e31c2fbaf */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
	   
	   if (childNodeView == null) {
			return;
		}
	   
	   Dokument childNodeModel = (Dokument)childNodeView.getUserObject(); 
	   
	   DefaultMutableTreeNode parentPackage = (DefaultMutableTreeNode)childNodeView.getParent();
			
	   ((Kolekcija)parentPackage.getUserObject()).getListaKomponenti().remove(childNodeModel);
		
	   Window.getInstance().getTreeHandler().getTreeModel().removeNodeFromParent(childNodeView);

   }

}