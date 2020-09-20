/***********************************************************************
  * Module:  KreiranjeDokumenta.java
 * Author:  Saki
 * Purpose: Defines the Class KreiranjeDokumenta
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Dokument;
import model.Kolekcija;
import view.Window;

/** @pdOid bc114900-e20f-423e-8014-06d40ae8b39d */
public class KreiranjeDokumenta extends AbstractAction {
   /** @param e
    * @pdOid 14d3a008-a34f-4f22-b132-a6babbd9b737 */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window
				.getInstance().getTreeHandler().getTree().getLastSelectedPathComponent();
		
		if (childNodeView == null) {
			return;
		}
		
		String inputName = JOptionPane.showInputDialog("Unesite naziv dokumenta: ");
		
		if (inputName == "" || inputName == null) {
			return;
		}
			
		Kolekcija p = (Kolekcija)childNodeView.getUserObject();
		Dokument newCountry = new Dokument(inputName);
		p.getListaKomponenti().add(newCountry);
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(newCountry);
		
		Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node, childNodeView,
				childNodeView.getChildCount());
   }

}