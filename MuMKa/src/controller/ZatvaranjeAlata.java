/***********************************************************************
 * Module:  ZatvaranjeAlata.java
 * Author:  Saki
 * Purpose: Defines the Class ZatvaranjeAlata
 ***********************************************************************/

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTree;

import main.Parametri;
import model.RadniProstor;
import view.Window;

/** @pdOid feed5616-d0f4-496b-9ce5-b62d240fbbe3 */
public class ZatvaranjeAlata implements WindowListener {
   /** @param e
    * @pdOid e3d86d14-2450-4193-952b-b2fbc503a27f */
   public void actionPerformed(ActionEvent e) {
      // TODO: implement
   }

@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowClosed(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowClosing(WindowEvent e) {
	// TODO Auto-generated method stub
	File f = new File("parameters.p");
	File fr=new File(Window.getInstance().getTreeHandler().getWorkspace().getNaziv()+".ws");
	ObjectOutputStream oos=null;
	
	Parametri p=Window.getInstance().getPars();
	RadniProstor drvo=Window.getInstance().getTreeHandler().getWorkspace();
		if(f.exists()) {
			f.delete();
		}
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			oos.writeObject(p);
			oos.close();
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fr)));
			oos.writeObject(drvo);
			oos.close();
			
			
		} catch ( IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Window.getInstance().dispose();
		System.exit(1);
}

@Override
public void windowDeactivated(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowIconified(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void windowOpened(WindowEvent e) {
	// TODO Auto-generated method stub
	
}

}