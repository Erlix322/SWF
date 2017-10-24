/*******************************************************************************
 * Copyright (c) 2007 TOPCASED. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Topcased contributors and others - initial API and implementation
*******************************************************************************/

package MyTool;

//Start of user code for imports

//End of user code for imports

/**
 * Class TextViewer<br />
 * 
 * @author Eric
 */
public class TextViewer 
{
    // Owned attributes
    public String Property1 = new String();


    // Start of user code for extra fields
    // End of user code for extra fields

    /**
     * Default constructor
     */
    public TextViewer ()
    {
        // Start of user code for the default constructor
        super();
        // Attributes TODO
        // End of user code for the default constructor
    }

    // Start of user code for parameterized constructors
    // End of user code for parameterized constructors

    // Accessors
    /**
     * Return Property1
     * @return String
     */
    public String getProperty1()
    {
        // Start of user code for TextViewer.getProperty1():String
        return Property1;
        // End of user code
    }

    /**
     * Set the value of Property1
     * @param Property1
     */
    public void setProperty1(String Property1)
    {
        // Start of user code for TextViewer.setProperty1(String)
        this.Property1 = Property1;
        // End of user code
    }


    // Methods 

    /**
     * @param s 
     */
    public void printStdout(String s)
    {
        // Start of user code for TextViewer.printStdout(String)
       System.out.println(s);
        // End of user code
    }


    // Start of user code for extra methods
    // End of user code for extra methods

    // Start of user code for TextViewer.main	
    /*public static void main (String[] args) {	
    }
    */
    // End of user code
	
}
