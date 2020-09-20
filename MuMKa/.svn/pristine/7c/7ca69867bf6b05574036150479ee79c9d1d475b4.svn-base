/***********************************************************************
 * Module:  MyMenubar.java
 * Author:  Saki
 * Purpose: Defines the Class MyMenubar
 ***********************************************************************/

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import controller.BrisanjeDokumenta;
import controller.BrisanjeKolekcije;
import controller.BrisanjeRadnogProstora;
import controller.IzmenaDokumenta;
import controller.IzmenaKolekcije;
import controller.IzmenaProstoraRadnogProstora;
import controller.KopirajDokument;
import controller.KreiranjeDokumenta;
import controller.KreiranjeKolekcije;
import controller.KreiranjeRadnogProstora;
import controller.KreiranjeStranice;
import controller.PasteDokument;
import controller.PrikaziStranice;

/** @pdOid 3c0305a2-6f44-4c32-aa82-715b71bd441e */
public class MyMenubar extends JMenuBar{
   /** @pdOid 04ef5c40-1a48-44b2-86d1-1748a3879834 */
   private JMenu dodaj;
   private JMenu izmeni;
   private JMenu podeli;
   private JMenu izbrisi;
   private JMenu ostalo;
   /** @pdOid d38e06cf-0b40-4aff-b721-13987e0ab809 */
   private JMenuItem dradniprostor;
   private JMenuItem dkolekcija;
   private JMenuItem ddokument;
   private JMenuItem dstranica;
   
   private JMenuItem iradniprostor;
   private JMenuItem ikolekcija;
   private JMenuItem idokument;
   
   private JMenuItem oradniprostor;
   private JMenuItem okolekcija;
   private JMenuItem odokument;
   /** @pdOid 2b2e5662-be3f-48c7-9bf9-23b7f59ae1b5 */
   
   private JMenuItem pomoc;
   private JMenuItem about;
   private JMenuItem exit;
   private JMenuItem prikaziStr;
   private JMenuItem copy;
   private JMenuItem paste;
   /** @pdOid ca4be9a7-b850-4027-9442-141c6204461b */
   private JCheckBoxMenuItem tekst;
   private JCheckBoxMenuItem audio;
   private JCheckBoxMenuItem video;
   private JCheckBoxMenuItem slika;
   
   /** @pdOid c5c80ca9-2889-4035-9497-ebaba7be615a */
   public MyMenubar() {
      // TODO: implement
	   
	   dodaj = new JMenu("Dodaj");
	   izmeni = new JMenu("Izmeni");
	   izbrisi = new JMenu("Izbrisi");
	   podeli = new JMenu("Podeli");
	   ostalo = new JMenu("Ostalo");
	   
	   tekst = new JCheckBoxMenuItem("Tekst");
	   //tekst.setSelected(Window.getInstance().getPars().getText());
	   tekst.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Window.getInstance().getPars().setText(tekst.isSelected());
		}
	});
	   audio = new JCheckBoxMenuItem("Audio");
	   //audio.setSelected(Window.getInstance().getPars().getAudio());
	   audio.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Window.getInstance().getPars().setAudio(audio.isSelected());
		}
	});
	   video = new JCheckBoxMenuItem("Video");
	   //video.setSelected(Window.getInstance().getPars().getVideo());
	   video.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Window.getInstance().getPars().setVideo(video.isSelected());
		}
	});
	   slika = new JCheckBoxMenuItem("Slika");
	   //slika.setSelected(Window.getInstance().getPars().getPicture());
	   slika.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Window.getInstance().getPars().setPicture(slika.isSelected());
		}
	});
	   
	   dradniprostor = new JMenuItem("Radni prostor");
	   dradniprostor.addActionListener(new KreiranjeRadnogProstora());
	   dkolekcija = new JMenuItem("Kolekciju");
	   dkolekcija.addActionListener(new KreiranjeKolekcije());
	   ddokument = new JMenuItem("Dokument");
	   ddokument.addActionListener(new KreiranjeDokumenta());
	   dstranica = new JMenuItem("Stranica");
	   dstranica.addActionListener(new KreiranjeStranice());
	   iradniprostor = new JMenuItem("Radni prostor");
	   iradniprostor.addActionListener(new IzmenaProstoraRadnogProstora());
	   ikolekcija = new JMenuItem("Kolekciju");
	   ikolekcija.addActionListener(new IzmenaKolekcije());
	   idokument = new JMenuItem("Dokument");
	   idokument.addActionListener(new IzmenaDokumenta());
	   oradniprostor = new JMenuItem("Radni prostor");
	   oradniprostor.addActionListener(new BrisanjeRadnogProstora());
	   okolekcija = new JMenuItem("Kolekciju");
	   okolekcija.addActionListener(new BrisanjeKolekcije());
	   odokument = new JMenuItem("Dokument");
	   odokument.addActionListener(new BrisanjeDokumenta());
	   pomoc = new JMenuItem("Ucitaj parametre");
	   pomoc.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			update();
		}
	});
	   about = new JMenuItem("O programu");
	   about.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Jako zbrzana verzija, potrudili smo se :/", "About", JOptionPane.INFORMATION_MESSAGE);
		}
	});
	   exit = new JMenuItem("Izlaz");
	   exit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
			
		}
	   });
	   prikaziStr = new JMenuItem("Prikazi stranice");
	   prikaziStr.addActionListener(new PrikaziStranice());
	   copy = new JMenuItem("Copy");
	   copy.addActionListener(new KopirajDokument());
	   paste = new JMenuItem("Paste");
	   paste.addActionListener(new PasteDokument());
	   dodaj.add(dradniprostor);
	   dodaj.add(dkolekcija);
	   dodaj.add(ddokument);
	   dodaj.add(dstranica);
	   
	   izmeni.add(iradniprostor);
	   izmeni.add(ikolekcija);
	   izmeni.add(idokument);
	   
	   izbrisi.add(oradniprostor);
	   izbrisi.add(okolekcija);
	   izbrisi.add(odokument);
	   
	   ostalo.add(pomoc);
	   ostalo.add(about);
	   ostalo.add(exit);
	   ostalo.add(prikaziStr);
	   ostalo.add(copy);
	   ostalo.add(paste);
	   
	   add(dodaj);
	   add(izmeni);
	   add(izbrisi);
	   add(ostalo);
	   
	   add(tekst);
	   add(audio);
	   add(video);
	   add(slika);
   }
   
   void update() {
	   tekst.setSelected(Window.getInstance().getPars().getText());
	   audio.setSelected(Window.getInstance().getPars().getAudio());
	   video.setSelected(Window.getInstance().getPars().getVideo());
	   slika.setSelected(Window.getInstance().getPars().getPicture());
   }

}