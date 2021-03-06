/***********************************************************************
 * Module:  Dokument.java
 * Author:  Saki
 * Purpose: Defines the Class Dokument
 ***********************************************************************/

package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

import observer.Observer;

/** @pdOid cedfaa9f-10d9-4af7-85b7-88503919963e */
public class Dokument implements Component, Serializable, observer.Observable {
   /** @pdOid 02370ce5-d59a-44cf-b233-b6a8d4e59c28 */
   private String naziv;
   /** @pdOid f6ab0e2d-b5ed-40cc-b3c3-d424f552aa2b */
   private List<Stranica> listaStranica=new ArrayList<Stranica>();
   
   List<Observer> observers = new ArrayList<Observer>();
   
   /** @pdRoleInfo migr=no name=Stranica assc=association4 mult=1..1 type=Aggregation */
   public Stranica stranica;
   
   /** @pdOid 830405ad-80be-499e-90c7-1f5305f35e6c */
   public String getNaziv() {
      return naziv;
   }
   
   /** @param newNaziv
    * @pdOid 7822ca9a-df5d-41b5-b742-f7bda3c1bb5d */
   public void setNaziv(String newNaziv) {
      naziv = newNaziv;
   }
   
   /** @pdOid 4ad8aa5c-9e6f-4f1a-b7c7-424a8b881a2b */
   public List<Stranica> getListaStranica() {
      return listaStranica;
   }
   
   /** @param newListaStranica
    * @pdOid 049621be-ed37-4792-ac71-ee801dc166bd */
   public void setListaStranica(List<Stranica> newListaStranica) {
      listaStranica = newListaStranica;
   }
   
   /** @pdOid 2687fc54-adf5-4b24-905a-0c80c9154f10 */
   public Dokument() {
      // TODO: implement
   }
   
   public Dokument(String inputName) {
	// TODO Auto-generated constructor stub
	   naziv = inputName;
}
   public Dokument(Dokument doc) {
		// TODO Auto-generated constructor stub
		   naziv = doc.naziv;
		   for(int i=0;i<doc.listaStranica.size();i++) {
			   //listaStranica=doc.listaStranica;
			   listaStranica.add(i,new Stranica(doc.listaStranica.get(i)));
		   }
	}

/** @param root
    * @pdOid dd36f463-0b70-4376-aae2-1e978c79ea5e */
   public void addChild(DefaultMutableTreeNode root) {
      // TODO: implement
   }

@Override
public void notifyObserver(Object arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void addObserver(Observer arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void removeObserver(Observer arg0) {
	// TODO Auto-generated method stub
	
}

}