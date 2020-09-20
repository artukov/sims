/***********************************************************************
 * Module:  RadniProstor.java
 * Author:  Saki
 * Purpose: Defines the Class RadniProstor
 ***********************************************************************/

package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

import observer.EventType;
import observer.Observer;

/** @pdOid 2cf49e95-049f-4d26-8d69-49c4c18d308c */
public class RadniProstor implements Serializable, observer.Observable{
   /** @pdOid 9a8d8063-1938-482f-8f84-69a07d3e5cb2 */
   private String naziv;
   /** @pdOid 238b2bd0-51df-4549-81c0-d1ac42ee9823 */
   private ArrayList<Kolekcija> listaKolekcija;
   
   List<Observer> observers = new ArrayList<Observer>();
   
   /** @pdRoleInfo migr=no name=Kolekcija assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation */
   public java.util.Collection<Kolekcija> kolekcija;
   
   /** @pdOid 58b6ed3a-c9c2-4a9e-9794-ad101170b5d4 */
   public RadniProstor() {
      // TODO: implement
	   this.naziv = "Test";
	   listaKolekcija = new ArrayList<Kolekcija>();
   }
   
   public RadniProstor(String inputName) {
	// TODO Auto-generated constructor stub
	   naziv = inputName;
	   listaKolekcija = new ArrayList<Kolekcija>();
}

/** @pdOid 66821e7b-e04a-47ba-9479-f337fa8561dc */
   public String getNaziv() {
      return naziv;
   }
   
   /** @param newNaziv
    * @pdOid 6546226a-ad53-40df-8952-d53ababdd444 */
   public void setNaziv(String newNaziv) {
      naziv = newNaziv;
   }
   
   /** @pdOid 48014b0c-7296-47ff-8771-b3f445d304ce */
   public ArrayList<Kolekcija> getListaKolekcija() {
      return listaKolekcija;
   }
   
   /** @param newListaKolekcija
    * @pdOid a8050452-a5ae-44f5-b216-380335134471 */
   public void setListaKolekcija(ArrayList<Kolekcija> newListaKolekcija) {
      listaKolekcija = newListaKolekcija;
   }
   
   /** @param root
    * @pdOid 716d718b-6133-4937-a11a-c1124f52b21d */
   public void addChild(DefaultMutableTreeNode root) {
      // TODO: implement
	   for (Kolekcija p : this.listaKolekcija) {
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(p);
			p.addChild(node);
			root.add(node);
		}
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Kolekcija> getKolekcija() {
      if (kolekcija == null)
         kolekcija = new java.util.HashSet<Kolekcija>();
      return kolekcija;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorKolekcija() {
      if (kolekcija == null)
         kolekcija = new java.util.HashSet<Kolekcija>();
      return kolekcija.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newKolekcija */
   public void setKolekcija(java.util.Collection<Kolekcija> newKolekcija) {
      removeAllKolekcija();
      for (java.util.Iterator iter = newKolekcija.iterator(); iter.hasNext();)
         addKolekcija((Kolekcija)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newKolekcija */
   public void addKolekcija(Kolekcija newKolekcija) {
      if (newKolekcija == null)
         return;
      if (this.kolekcija == null)
         this.kolekcija = new java.util.HashSet<Kolekcija>();
      if (!this.kolekcija.contains(newKolekcija))
         this.kolekcija.add(newKolekcija);
   }
   
   /** @pdGenerated default remove
     * @param oldKolekcija */
   public void removeKolekcija(Kolekcija oldKolekcija) {
      if (oldKolekcija == null)
         return;
      if (this.kolekcija != null)
         if (this.kolekcija.contains(oldKolekcija))
            this.kolekcija.remove(oldKolekcija);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllKolekcija() {
      if (kolekcija != null)
         kolekcija.clear();
   }

   
   public void notifyObserver(Object arg0) {
   	// TODO Auto-generated method stub
   	for (Observer o : observers) {
   		o.update(this, arg0);
   	}
   }

   
   public void addObserver(Observer arg0) {
   	// TODO Auto-generated method stub
   	this.observers.add(arg0);
   }

  
   public void removeObserver(Observer arg0) {
   	// TODO Auto-generated method stub
   	this.observers.remove(arg0);
   }

}

