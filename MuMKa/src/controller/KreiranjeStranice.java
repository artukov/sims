package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Dokument;
import model.Kolekcija;
import model.Stranica;
import view.Window;

public class KreiranjeStranice extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window
				.getInstance().getTreeHandler().getTree().getLastSelectedPathComponent();
		
		if (childNodeView == null) {
			return;
		}
		try {
			Dokument d = (Dokument)childNodeView.getUserObject();
			Stranica nova = new Stranica(d.getListaStranica().size()+1);
			d.getListaStranica().add(nova);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		/*DefaultMutableTreeNode node = new DefaultMutableTreeNode(newCountry);
		
		Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node, childNodeView,
				childNodeView.getChildCount());*/
	}

}
