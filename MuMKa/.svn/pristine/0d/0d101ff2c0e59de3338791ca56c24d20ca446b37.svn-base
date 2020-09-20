/***********************************************************************
 * Module:  TreeHandler.java
 * Author:  Saki
 * Purpose: Defines the Class TreeHandler
 ***********************************************************************/

package view;


import java.io.Serializable;
import java.util.Enumeration;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import model.Component;
import model.Dokument;
import model.Kolekcija;
import model.RadniProstor;
import model.Stranica;
import observer.EventType;
import observer.Observable;
import observer.Observer;

/** @pdOid 74408331-abbb-4f2c-8c6f-00dec41d473e */
public class TreeHandler implements Observer, Serializable {
   /** @pdOid 2c373eda-1e2f-44d4-9059-6cdb642bbbe2 */
   private JTree tree;
   /** @pdOid aa1d8bc2-337c-4a9e-ab05-7c10f3f1e380 */
   private DefaultTreeModel treeModel;
   /** @pdOid 097d925c-cb6c-4918-b859-3478ac95ef82 */
   private DefaultMutableTreeNode root;
   /** @pdOid 87859e56-4dd1-4c15-b6a1-75b3e2c0fa49
       @pdRoleInfo migr=yes name=RadniProstor assc=association3 */
   private RadniProstor workspace;
   
   /** @param tree 
    * @param startingIndex 
    * @param rowCount
    * @pdOid 7da57829-99ef-4fb1-9061-76fccd30b399 */
   private void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
	   	
	   for(int i=startingIndex;i<rowCount;++i){
	        tree.expandRow(i);
	    }

	    if(tree.getRowCount()!=rowCount){
	        expandAllNodes(tree, rowCount, tree.getRowCount());
	    }
   }
   
   /** @pdOid 71272c52-cf7e-4625-99ae-db07fa052fb8 */
   public JTree getTree() {
      return tree;
   }
   
   /** @param newTree
    * @pdOid e825937b-9c2e-47a4-8272-e932ae5b06ef */
   public void setTree(JTree newTree) {
      tree = newTree;
   }
   
   /** @pdOid b26f2d03-e6c5-4a79-a6a7-61ffb5cce4f5 */
   public DefaultTreeModel getTreeModel() {
      return treeModel;
   }
   
   /** @param newTreeModel
    * @pdOid 86b4165b-8920-4904-8f5a-66801135a9bf */
   public void setTreeModel(DefaultTreeModel newTreeModel) {
      treeModel = newTreeModel;
   }
   
   /** @pdOid 3282dd71-ebaf-4a91-b1c3-7c6977d55ff0 */
   public DefaultMutableTreeNode getRoot() {
      return root;
   }
   
   /** @param newRoot
    * @pdOid 357f31eb-0777-4937-a604-a4f874e6e2e5 */
   public void setRoot(DefaultMutableTreeNode newRoot) {
      root = newRoot;
   }
   
   /** @pdOid 16529e43-df0e-454b-9fef-fd6210608e98 */
   public RadniProstor getWorkspace() {
      return workspace;
   }
   
   /** @param newWorkspace
    * @pdOid 4288a480-5351-4ebc-8ef7-96256d941ce7 */
   public void setWorkspace(RadniProstor newWorkspace) {
      workspace = newWorkspace;
   }
   
   /** @pdOid fe3cdece-5035-4fea-a3d6-394a54cf55b2 */
   public TreeHandler() {
      // TODO: implement
   }
   
   /** @param tree 
    * @param treeModel 
    * @param root
    * @pdOid 014456d9-6698-4f98-b967-191144587a71 */
   public TreeHandler(JTree tree, DefaultTreeModel treeModel, DefaultMutableTreeNode root) {
	    super();
		this.tree = tree;
		this.treeModel = treeModel;
		this.root = root;
   }
   
   /** @param workspace
    * @pdOid 6225c39a-6295-41e2-a38f-c1090c4900b4 */
   public TreeHandler(RadniProstor workspace) {}
   
   /** @pdOid fefa8f87-a3e1-437d-a0c3-b1adda2b8e66 */
   public void initTree() {
	   initData();
		
		this.treeModel = new DefaultTreeModel(this.root);
		this.treeModel.setAsksAllowsChildren(true);
		this.tree = new JTree(treeModel) {

			private static final long serialVersionUID = 2789999619139248302L;

			@Override
			public boolean isPathEditable(TreePath path) {
				return false;
			}
		};
		this.tree.setEditable(true);
		this.tree.setCellRenderer(new NodeTreeCellRenderer());
		expandAllNodes(this.tree, 0, tree.getRowCount());
		this.tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);	
		
		/*this.tree.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

			    if (SwingUtilities.isRightMouseButton(e)) {

			        int row = tree.getClosestRowForLocation(e.getX(), e.getY());
			        tree.setSelectionRow(row);
			        Object node = ((DefaultMutableTreeNode)tree.getLastSelectedPathComponent()).getUserObject();
			        new TreeContextMenu(tree, node).show(e.getComponent(), e.getX(), e.getY());
			    }
			}
		});*/
   }
   
   /** @pdOid e9507481-8872-4a03-aef2-405bd0a6dee9 */
   public void initData() {
	    this.root = new DefaultMutableTreeNode(this.workspace);
		this.workspace.addChild(root);
   }

@Override
public void update(Observable arg0, Object arg1) {
	// TODO Auto-generated method stub
	
	@SuppressWarnings("unchecked")	
	Enumeration<DefaultMutableTreeNode> en = ((DefaultMutableTreeNode) treeModel
			.getRoot()).breadthFirstEnumeration();
	
	if (arg1 == EventType.REMOVED) {
		if(arg0 instanceof Kolekcija) {
			Kolekcija col = (Kolekcija)arg0;
			while (en.hasMoreElements()) {
				DefaultMutableTreeNode curr = en.nextElement();
				// voditi racuna oko id-a i jedinstvenosti
				// u realnom radu sa bazom, id bi svakako bio jedinstven
				if (curr.getUserObject() instanceof Kolekcija && 
						((Kolekcija)curr.getUserObject()).getNaziv().equals(col.getNaziv())) {
					this.treeModel.removeNodeFromParent(curr);
				}
			}
		}else if(arg0 instanceof Dokument) {
			Dokument col = (Dokument)arg0;
			while (en.hasMoreElements()) {
				DefaultMutableTreeNode curr = en.nextElement();
				// voditi racuna oko id-a i jedinstvenosti
				// u realnom radu sa bazom, id bi svakako bio jedinstven
				if (curr.getUserObject() instanceof Dokument && 
						((Dokument)curr.getUserObject()).getNaziv().equals(col.getNaziv())) {
					this.treeModel.removeNodeFromParent(curr);
				}
			}
		}
	
		
		
	} else if (arg1 == EventType.ADDED) {
		if(arg0 instanceof Kolekcija) {
			Kolekcija col = (Kolekcija)arg0;
		
		
		DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
		
		this.treeModel.insertNodeInto(new DefaultMutableTreeNode(col), childNodeView, childNodeView.getChildCount());
		}else if(arg0 instanceof Dokument) {
			Dokument col = (Dokument)arg0;
		
		
		DefaultMutableTreeNode childNodeView = (DefaultMutableTreeNode) Window.getInstance()
				.getTreeHandler().getTree().getLastSelectedPathComponent();
		
		this.treeModel.insertNodeInto(new DefaultMutableTreeNode(col), childNodeView, childNodeView.getChildCount());
		}
	}else if (arg1==EventType.CHANGED) {
		
	}
	
}

public void setRadniProstor(RadniProstor rp) {
	// TODO Auto-generated method stub
	this.workspace=rp;
	this.workspace.addObserver(this);
	
	for(Component component: this.workspace.getListaKolekcija()) {
		setObservers(component);
	}
	initData();
	this.treeModel=new DefaultTreeModel(this.root);
	this.treeModel.setAsksAllowsChildren(true);
	this.tree.setModel(treeModel);
	expandAllNodes(this.tree,0,tree.getRowCount());
	
	
}
public void setObservers(Component k) {
	try {
		if(k instanceof Kolekcija) {
			((Kolekcija)k).addObserver(this);
			for(Component componentChild: ((Kolekcija)k).getListaKomponenti()) {
				setObservers(componentChild);
			}
		}else if(k instanceof Dokument) {
			((Dokument)k).addObserver(this);
			for(Component componentChild : ((Dokument)k).getListaStranica()) {
			setObservers(componentChild);
		}
		}else if(k instanceof Stranica) {
			((Stranica)k).addObserver(this);
		}
	}
	catch(NullPointerException e)
	{
		
	}
}

}