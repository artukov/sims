/***********************************************************************
 * Module:  Kolekcija.java
 * Author:  Saki
 * Purpose: Defines the Class Kolekcija
 ***********************************************************************/

package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

import observer.Observer;

/** @pdOid d3caa78f-5f6d-4b6e-ac6b-69aebfc17be6 */
public class Kolekcija implements Component, Serializable, observer.Observable {
   /** @pdOid 24d4726b-b6aa-41db-aef2-0d5d3d5aace4 */
   private String naziv;
   /** @pdOid 0d59f98f-de3a-4523-bc4f-15d6ef2e4cef */
   private ArrayList<Component> listaKomponenti;
   
   List<Observer> observers = new ArrayList<Observer>();
   
   /** @pdRoleInfo migr=no name=Dokument assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Dokument> dokument;
   
   /** @pdOid efeccf18-8938-4df6-ad32-e2b470b7680c */
   public String getNaziv() {
      return naziv;
   }
   
   /** @param newNaziv
    * @pdOid c1a4d3a5-593e-44d8-adfd-08939e6d6086 */
   public void setNaziv(String newNaziv) {
      naziv = newNaziv;
   }
   
   /** @pdOid 8d6af65c-6816-40d9-a50a-9ac499b4cf7b */
   public ArrayList<Component> getListaKomponenti() {
      return listaKomponenti;
   }
   
   /** @param newListaDokumenata
    * @pdOid cbbf2fa2-3897-4603-875b-a428df9f3e2c */
   public void setListaDokumenata(ArrayList<Component> newListaDokumenata) {
      listaKomponenti = newListaDokumenata;
   }
   
   /** @pdOid dd8eaa7e-8e33-428d-9e7b-dcde336292d4 */
   public Kolekcija() {
      // TODO: implement
   }
   
   public Kolekcija(String inputName) {
	// TODO Auto-generated constructor stub
	   naziv = inputName;
	   this.listaKomponenti = new ArrayList<Component>();
}

/** @param root
    * @pdOid c78a4491-7ca9-4ebd-98af-11b079ef4a7e */
   public void addChild(DefaultMutableTreeNode root) {
      // TODO: implement
	   for (Component c : this.listaKomponenti) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(c);
			if(c instanceof Kolekcija) {
				c.addChild(node);
			}
			root.add(node);
		}
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Dokument> getDokument() {
      if (dokument == null)
         dokument = new java.util.HashSet<Dokument>();
      return dokument;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDokument() {
      if (dokument == null)
         dokument = new java.util.HashSet<Dokument>();
      return dokument.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDokument */
   public void setDokument(java.util.Collection<Dokument> newDokument) {
      removeAllDokument();
      for (java.util.Iterator iter = newDokument.iterator(); iter.hasNext();)
         addDokument((Dokument)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDokument */
   public void addDokument(Dokument newDokument) {
      if (newDokument == null)
         return;
      if (this.dokument == null)
         this.dokument = new java.util.HashSet<Dokument>();
      if (!this.dokument.contains(newDokument))
         this.dokument.add(newDokument);
   }
   
   /** @pdGenerated default remove
     * @param oldDokument */
   public void removeDokument(Dokument oldDokument) {
      if (oldDokument == null)
         return;
      if (this.dokument != null)
         if (this.dokument.contains(oldDokument))
            this.dokument.remove(oldDokument);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDokument() {
      if (dokument != null)
         dokument.clear();
   }

@Override
public void notifyObserver(Object arg0) {
	// TODO Auto-generated method stub
	for (Observer o : observers) {
		o.update(this, arg0);
	}
}

@Override
public void addObserver(Observer arg0) {
	// TODO Auto-generated method stub
	this.observers.add(arg0);
}

@Override
public void removeObserver(Observer arg0) {
	// TODO Auto-generated method stub
	this.observers.remove(arg0);
}

}