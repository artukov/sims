/***********************************************************************
 * Module:  Window.java
 * Author:  Saki
 * Purpose: Defines the Class Window
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import controller.PrikaziStranice;
import controller.ZatvaranjeAlata;
import main.Parametri;
import model.RadniProstor;

/** @pdOid f8dd64a9-cb7e-4925-98ad-c20db414b726 */
public class Window extends JFrame{
   /** @pdOid b2c305f0-c5f1-4e85-89d6-286fb7495d3e */
   private MyMenubar menubar;
   /** @pdOid eef1a44b-c4ba-488e-8fad-44e0b63438cc */
   private MyToolbar toolbar;
   /** @pdOid cc61b57d-51b9-4a0f-a84d-975edf627629 */
   private static Window instance = null;
   /** @pdOid a3147fc0-4354-429a-8758-3d3b9b2c004d */
   private Parametri pars;
   /** @pdOid e31fc026-8dd0-4054-9a3f-40eeade43c4e */
   private TreeHandler treeHandler;
   /** @pdOid 22f85980-f2a3-4d9a-8deb-7333ffe761af */
   private RadniProstor radniProstor;
   
   private boolean flag=false;
   
   protected JLabel lclock;
   
   
   
   /** @pdOid 03e1d632-5128-4679-98f7-d3d9c4db28af */
   private Window() {
      // TODO: implement
	   initPars();
	   initGUI();
	   clock();
   }
   
   /** @pdRoleInfo migr=no name=MyToolbar assc=association1 mult=0..1 type=Composition */
   public MyToolbar myToolbar;
   /** @pdRoleInfo migr=no name=MyMenubar assc=association2 mult=0..1 type=Composition */
   public MyMenubar myMenubar;
   
   private JSplitPane splitPane;
   private JScrollPane scrollPaneView;
   
   /** @pdOid 07f8a56c-26de-4d40-bbcd-bcc9ef6188cf */
   public void initGUI() {
      // TODO: implement
	   
	    setLayout(new BorderLayout());
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		Dimension screensize = kit.getScreenSize();
		
		int screenWidth = screensize.width;
		
		setSize(900, 480);
		
		setVisible(true);
		
		treeHandler = new TreeHandler();
		
		if(flag==false) {
			radniProstor = new RadniProstor();
		}
		
		treeHandler.setWorkspace(this.radniProstor);
		
		treeHandler.initTree();
		
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		
		JScrollPane scrollPaneTree = new JScrollPane(this.treeHandler.getTree());
		
		//scrollPaneView = new JScrollPane(new JPanel(this.treeHandler.getTree().getLastSelectedPathComponent()));
		scrollPaneView = new JScrollPane(new PrikazivanjeStranice());
		scrollPaneView.setBackground(Color.WHITE);
		
		splitPane.add(scrollPaneTree);
		
		splitPane.add(scrollPaneView);
		
		this.add(splitPane, BorderLayout.CENTER);
		
		addWindowListener(new ZatvaranjeAlata());
		
		setMinimumSize(new Dimension(900, 480));
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("MuMKa");
		
		Image ico = kit.getImage("images/title.png");
		
		setIconImage(ico);
		
		menubar = new MyMenubar();
		this.setJMenuBar(menubar);
		
		//toolbar = new MyToolbar();
		//add(toolbar, BorderLayout.NORTH);
		
		JPanel pBottom = new JPanel();
		pBottom.setLayout(new BoxLayout(pBottom,BoxLayout.X_AXIS));
		pBottom.setPreferredSize(new Dimension(screenWidth * 3 / 4, 40));
		pBottom.setBackground(Color.LIGHT_GRAY);

		lclock = new JLabel();
		
		pBottom.add(Box.createHorizontalGlue());
		pBottom.add(lclock);
		pBottom.add(Box.createRigidArea(new Dimension(10, 10)));
		
		add(pBottom, BorderLayout.SOUTH);
   }
   
   private void initPars() {
	// TODO Auto-generated method stub
		File f = new File("parameters.p");
		File fr=new File("1.ws");
		ObjectInputStream oos=null;
		Parametri p=new Parametri();
		RadniProstor rp=new RadniProstor();
		if(f.exists()) {
			try {
				oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
				p=(Parametri)oos.readObject();
				oos.close();
				oos = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fr)));
				rp=(RadniProstor)oos.readObject();
				oos.close();
				
			} catch ( IOException | ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				
			}
		}else {
			p=new Parametri(false,false,false,false);
		}
		this.pars=p;
		this.radniProstor=rp;
		flag=true;
}

   public void clock() {
		
		Thread clock = new Thread() {
			public void run() {
				try {
					for(;;) {
					Calendar cal = new GregorianCalendar();
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int month = cal.get(Calendar.MONTH)+1;
					int year = cal.get(Calendar.YEAR);
					
					int hour = cal.get(Calendar.HOUR);
					int minute= cal.get(Calendar.MINUTE);
					int second = cal.get(Calendar.SECOND);
					
					lclock.setText(hour+":"+minute+":"+second+"   "+day+"."+month+"."+year+".");
					
					sleep(1000);
					}
					
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		clock.start();
	}
   
   /** @pdOid 5968d42e-8865-4d24-b22b-d34face84a6f */
   public static Window getInstance() {
      // TODO: implement
	   if(instance == null)
			instance = new Window();
		return instance;
   }
   
   /** @pdOid e76221ff-9b5f-49c2-b4ae-9827cc0f8ddb */
   public Parametri getPars() {
      return pars;
   }
   
   /** @param newPars
    * @pdOid 0325e556-a7cc-4035-9394-e515f8cef5b1 */
   public void setPars(Parametri newPars) {
      pars = newPars;
   }
   
   /** @pdOid 5f16e7f3-9627-4f72-9342-385c0d192910 */
   public TreeHandler getTreeHandler() {
      return treeHandler;
   }
   
   /** @param newTreeHandler
    * @pdOid 84093a16-3c23-4482-885c-a9a6b839634f */
   public void setTreeHandler(TreeHandler newTreeHandler) {
      treeHandler = newTreeHandler;
   }
   
   /** @pdOid 8bc295b5-1483-4c44-bbf1-d29407d1c880 */
   public RadniProstor getRadniProstor() {
      return radniProstor;
   }
   
   /** @param newRadniProstor
    * @pdOid 3760d93c-eecf-492d-bd4b-bf0cda35a8a5 */
   public void setRadniProstor(RadniProstor newRadniProstor) {
      radniProstor = newRadniProstor;
   }

}