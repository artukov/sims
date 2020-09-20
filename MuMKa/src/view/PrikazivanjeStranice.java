package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Dokument;

public class PrikazivanjeStranice extends JPanel {

	public static Dokument dokument;
	
	
	private pageContent pagePanel;
	private JButton sledeca;
	private JButton prethodna;
	private static JLabel sveStr;
	private static JTextField trenutnaStr;
	private JButton izbrisi;
	
	public PrikazivanjeStranice() {
		super();
		pagePanel=new pageContent();
		sledeca=new JButton("Sledeca");
		sledeca.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.exit(0);
				int br=Integer.parseInt(trenutnaStr.getText());
				if(br<dokument.getListaStranica().size()) {
					br++;
				}
				trenutnaStr.setText(""+br);
				
			}
		   });
		prethodna=new JButton("Prethodna");
		prethodna.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.exit(0);
				int br=Integer.parseInt(trenutnaStr.getText());
				if(br>1) {
					br--;
				}
				trenutnaStr.setText(""+br);
				
			}
		   });
		trenutnaStr=new JTextField();
		sveStr=new JLabel();
		izbrisi=new JButton("Izbrisi");
		izbrisi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.exit(0);
				try {
					int br=Integer.parseInt(trenutnaStr.getText());
					dokument.getListaStranica().remove(br-1);
				}catch(Exception eh) {
					
				}
				
			}
		   });
		initGui();
		
	}
	private void initGui() {
		this.setLayout(new BorderLayout());
		this.add(pagePanel, BorderLayout.CENTER);
		JPanel novi=new JPanel();
		novi.add(prethodna);
		novi.add(trenutnaStr);
		novi.add(sveStr);
		novi.add(sledeca);
		novi.add(izbrisi);
		this.add(novi, BorderLayout.SOUTH);
		
	}
	public static void ucitajDokument(Dokument doc) {
		try {
			dokument=doc;
			if(!dokument.getListaStranica().isEmpty()) {
				
				sveStr.setText(""+dokument.getListaStranica().size());
				trenutnaStr.setText("1");
			}else {
				sveStr.setText(""+dokument.getListaStranica().size());
				trenutnaStr.setText("0");
			}
		}catch(Exception ej) {
			
		}
	}
}
