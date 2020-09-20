/***********************************************************************
 * Module:  Stranica.java
 * Author:  Saki
 * Purpose: Defines the Class Stranica
 ***********************************************************************/

package model;

import java.io.Serializable;
import java.util.List;

import javax.swing.tree.DefaultMutableTreeNode;

import observer.Observer;

/** @pdOid 164efe9e-12ce-44e2-919d-6b486601e6e2 */
public class Stranica implements Component, Serializable, observer.Observable{
   /** @pdOid c7e40beb-b4a2-40ce-909e-30e2e691bacd */
   private int broj;
   /** @pdOid 6926ffea-e07a-4fa5-b3c6-2a2a3abeabcf */
   private List<Slot> listaSlotova;
   
   /** @pdRoleInfo migr=no name=Slot assc=association5 mult=1..1 type=Aggregation */
   public Slot slot;
   
   /** @pdOid 8119a851-c54b-4d4e-8da2-243f2dd2ced3 */
   public int getBroj() {
      return broj;
   }
   
   /** @param newNaziv
    * @pdOid a597c1f6-da95-4d0e-9f31-ea56906fedc4 */
   public void setBroj(int newBroj) {
      broj = newBroj;
   }
   
   /** @pdOid 49f39937-14c5-4478-95aa-0d6b1663d97a */
   public List<Slot> getListaSlotova() {
      return listaSlotova;
   }
   
   /** @param newListaSlotova
    * @pdOid 42108a7f-98ce-4324-8732-9588788230ab */
   public void setListaSlotova(List<Slot> newListaSlotova) {
      listaSlotova = newListaSlotova;
   }
   
   /** @pdOid c370343e-d69c-4369-b26b-69a0a328facd */
   public Stranica(int br) {
      // TODO: implement
	   this.broj=br;
   }
   public Stranica(Stranica s) {
	      // TODO: implement
		   this.broj=s.broj;
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

@Override
public void addChild(DefaultMutableTreeNode root) {
	// TODO Auto-generated method stub
	
}

}