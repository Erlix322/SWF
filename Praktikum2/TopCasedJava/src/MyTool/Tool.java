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
 * Class Tool<br />
 * 
 * @author Eric
 */
public class Tool 
{
    // Owned attributes
    public int version = 0;

    // Attributes from associations
    public TextViewer textViewer = new TextViewer();

    // Start of user code for extra fields
    // End of user code for extra fields

    /**
     * Default constructor
     */
    public Tool ()
    {
        // Start of user code for the default constructor
        super();
        // Attributes TODO
        // End of user code for the default constructor
    }

    // Start of user code for parameterized constructors
    // End of user code for parameterized constructors

    // Accessors from associations
    /**
     * Return textViewer
     * @return TextViewer
     */
    public TextViewer getTextViewer()
    {
        // Start of user code for Tool.getTextViewer():TextViewer
        return textViewer;
        // End of user code
    }

    /**
     * Set the value of textViewer
     * @param textViewer
     */
    public void setTextViewer(TextViewer textViewer)
    {
        // Start of user code for Tool.setTextViewer(TextViewer)
        this.textViewer = textViewer;
        // End of user code
    }


    // Methods 

    /**
     * @return 
     */
    public int getVersion()
    {
        // Start of user code for Tool.getVersion():int
        return version;
        // End of user code
    }

    /**
     * @param x 
     */
    public void setVersion(int x)
    {
        // Start of user code for Tool.setVersion(int)
        this.version = x;
        // End of user code
    }

    /**
     */
    public void start()
    {
        // Start of user code for Tool.start()
        System.out.println("started");
        // End of user code
    }

    /**
     */
    public void initialize()
    {
        // Start of user code for Tool.initialize()
    	System.out.println("initialized");
    	this.setVersion(2);
    	this.setTextViewer(new TextViewer());
        // End of user code
    }


    // Start of user code for extra methods
    // End of user code for extra methods

    // Start of user code for Tool.main	
    public static void main (String[] args) {	
    	Tool t = new Tool();
    	t.initialize();
    	t.start();
    	t.textViewer.printStdout("Test");
    }   
    // End of user code
	
}
