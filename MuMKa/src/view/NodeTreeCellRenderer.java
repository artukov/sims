/***********************************************************************
 * Module:  NodeTreeCellRenderer.java
 * Author:  Saki
 * Purpose: Defines the Class NodeTreeCellRenderer
 ***********************************************************************/

package view;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import model.Dokument;
import model.Kolekcija;
import model.RadniProstor;

/** @pdOid 8fb5e466-47a5-43b7-b73b-17e89dbe77e0 */
public class NodeTreeCellRenderer extends DefaultTreeCellRenderer {
   /** @param tree 
    * @param value 
    * @param sel 
    * @param expander 
    * @param leaf 
    * @param row 
    * @param hasFocus
    * @pdOid 2e89f8b4-cc97-4a2b-b61e-fa15321a2a5d */
   public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expander, boolean leaf, int row, boolean hasFocus) {
      // TODO: implement
	   
	   super.getTreeCellRendererComponent(tree, value, sel, expander, leaf, row, hasFocus);

		if (value instanceof DefaultMutableTreeNode) {

			Object node = ((DefaultMutableTreeNode)value).getUserObject();
			
			if (node == null) {
				return this;
			}
			
			String iconPath, text = "";
			
			if (node instanceof RadniProstor) {
				iconPath = "images/title.png";
				text = ((RadniProstor)node).getNaziv();
			} else if (node instanceof Kolekcija) {
				iconPath = "images/book.png";
				text = ((Kolekcija)node).getNaziv();
			} else {
				iconPath = "images/page.png";
				text = ((Dokument)node).getNaziv();
			} 
			
			setIcon(new ImageIcon(iconPath));
			setText(text);
		}

		return this;
   }

}