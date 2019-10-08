package nz.ac.massey.cs.marven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {   
    	Calc special =new Calc();
    	int a=3;
    	int b=2;
        assertTrue(special.add(a, b)==5);
        assertTrue(special.substract(a, b)==5);
    }
	
}
