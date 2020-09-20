/***********************************************************************
 * Module:  KreiranjeRadnogProstora.java
 * Author:  Saki
 * Purpose: Defines the Class KreiranjeRadnogProstora
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Kolekcija;
import model.RadniProstor;
import observer.EventType;
import view.TreeHandler;
import view.Window;

/** @pdOid d633db76-a80b-4dde-b8f5-02b76eb2bcaa */
public class KreiranjeRadnogProstora extends AbstractAction {
   /** @param e
    * @pdOid ec52ffd4-e615-493e-ab5c-6f24c5528efd */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   File fr=new File("radniprostor.ws");
	   ObjectOutputStream oos=null;
	   /*DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window
				.getInstance().getTreeHandler().getTree().getLastSelectedPathComponent();*/
	   RadniProstor drvo=Window.getInstance().getTreeHandler().getWorkspace();
		
		if (drvo == null) {
			return;
		}
	   //DefaultMutableTreeNode cvor=new DefaultMutableTreeNode();
		
		String inputName = JOptionPane.showInputDialog("Unesite naziv radnog prostora: ");
		
		if (inputName == "" || inputName == null) {
			return;
		}
		
		
		//Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node,childNodeView,0);
		
		/*Window.getInstance().getTreeHandler().getTreeModel().insertNodeInto(node,childNodeView,
				childNodeView.getChildCount());*/
		
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fr)));
			oos.writeObject(drvo);
			oos.close();
		}catch( IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		RadniProstor rp=new RadniProstor(inputName);
		//DefaultMutableTreeNode node = new DefaultMutableTreeNode(rp);
		//Window.getInstance().getTreeHandler().initTree();
		TreeHandler th=Window.getInstance().getTreeHandler();
		rp.addObserver(th);
		th.setRadniProstor(rp);
		
		//Window.getInstance().setRadniProstor(rp);
		
		
		
		
		//Window.getInstance().initGUI();
		
		//rp.notifyObserver(EventType.CHANGED);
		/*Window.getInstance().setRadniProstor(rp);
		Window.getInstance().initGUI();*/
		
		
		
		
   }

}