package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Dokument;
import model.Kolekcija;
import view.Window;

public class KopirajDokument extends AbstractAction {

	public static Dokument kopiran;
	//public static listaStranica k;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
	   
	   if (childNodeView == null) {
			return;
		}
	   
	   Dokument childNodeModel = (Dokument)childNodeView.getUserObject(); 
	   
	   kopiran=childNodeModel;

	}

}
