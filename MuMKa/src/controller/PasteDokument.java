package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Dokument;
import model.Kolekcija;
import view.Window;

public class PasteDokument extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window
				.getInstance().getTreeHandler().getTree().getLastSelectedPathComponent();
		
		if (childNodeView == null) {
			return;
		}
		
		
			
		Kolekcija p = (Kolekcija)childNodeView.getUserObject();
		Dokument newCountry = new Dokument(KopirajDokument.kopiran);
		newCountry.addObserver(Window.getInstance().getTreeHandler());
		p.getListaKomponenti().add(newCountry);
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(newCountry);
		
		Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node, childNodeView,
				childNodeView.getChildCount());
		KopirajDokument.kopiran=null;
		
	}

}
