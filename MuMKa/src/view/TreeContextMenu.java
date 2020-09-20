/***********************************************************************
 * Module:  TreeContextMenu.java
 * Author:  Saki
 * Purpose: Defines the Class TreeContextMenu
 ***********************************************************************/

package view;

import javax.swing.JMenuItem;
import javax.swing.JTree;

/** @pdOid 7f8dd758-7d1e-4d26-8a79-70ca62d2f970 */
public class TreeContextMenu {
   /** @pdOid 11434488-cbe8-41c6-b45f-a98c904cb376 */
   private JMenuItem addCollection;
   /** @pdOid 71bfa3e5-5290-4eea-bfd8-5c924fbccd10 */
   private JMenuItem changeCollection;
   /** @pdOid 6c4028ea-3c9b-40e7-90eb-7a5700f8572f */
   private JMenuItem removeCollection;
   /** @pdOid e03b74f5-80fd-4f01-9c68-116785915666 */
   private JMenuItem addDocument;
   /**  @pdOid 51f19f97-afd3-4614-80aa-5f61103802d6 
    * 
    * 
    * @pdOid cd51824b-9035-46ce-a2f5-c2bbadaef1e3 */
   private JMenuItem changeDocument;
   /** @pdOid 0ca35838-a5df-4f55-a352-1164af8a18b4 */
   private JMenuItem removeDocument;
   /** @pdOid d9d45d6d-b64d-4bc1-aa85-4a3799dff1f8 */
   private JMenuItem show;
   
   /** @param tree 
    * @param item
    * @pdOid 9a07cc9a-b9e3-4b07-86bc-09f88f1571c7 */
   public TreeContextMenu(JTree tree, Object item) {}

}