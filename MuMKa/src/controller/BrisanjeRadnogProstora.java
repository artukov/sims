/***********************************************************************
 * Module:  BrisanjeRadnogProstora.java
 * Author:  Saki
 * Purpose: Defines the Class BrisanjeRadnogProstora
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


import model.Kolekcija;
import model.RadniProstor;
import view.TreeHandler;
import view.Window;

/** @pdOid 235970b2-1477-47cd-ae99-20980bd469e0 */
public class BrisanjeRadnogProstora extends AbstractAction {
   /** @param e
    * @pdOid 37335038-7129-4bbb-9da9-a6a227802bb1 */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
	   
	   String inputName = JOptionPane.showInputDialog("Unesite naziv radnog prostora koji zelite da otvorite: ");
	   RadniProstor rp = null;
		
		if (inputName == "" || inputName == null) {
			return;
		}
		File fr=new File(inputName+".ws");
		   ObjectInputStream ois=null;
		   if(!fr.exists()) {
			   return;
		   }
		   
		   try {
			   ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fr)));
			   rp=(RadniProstor)ois.readObject();
			   ois.close();
			   			   
		   }catch(IOException | ClassNotFoundException e1) {
			   e1.printStackTrace();
		   }
		   
		   TreeHandler th=Window.getInstance().getTreeHandler();
		   rp.addObserver(th);
		   th.setRadniProstor(rp);
		   
		   
   }

}