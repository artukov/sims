/***********************************************************************
 * Module:  Observer.java
 * Author:  Saki
 * Purpose: Defines the Interface Observer
 ***********************************************************************/

package observer;

import java.util.*;

/** @pdOid 05192f83-0fb9-4451-a033-6fd54393e97d */
public interface Observer {
   /** @param arg0 
    * @param arg1
    * @pdOid 772681c3-b6f0-4833-b513-d1acc45f95f2 */
   void update(Observable arg0, Object arg1);

}