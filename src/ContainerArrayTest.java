import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ContainerArrayTest {
    private ContainerArray<String> myContainer = null;

    @Before
    public void setUp () {
        myContainer = new ContainerArray<>();
    }

    @Test
    public void testSizeChangeWithAdd () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Camel");
        assertEquals("Size should be 3", 3, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertEquals("Should be same reference", alligator, myContainer.get(0));
    }

    @Test
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Size should be 1", 1, myContainer.size());
    }

    @Test
    public void testObjectIsRemoved () {
        String alligator = "Alligator";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        assertEquals("Should be same reference", alligator, myContainer.get(0));
    }
    
    @Test
    public void testAddingMultiple() {
    	for(int i=0; i<11; i++){
    		myContainer.add("");
    	}
    }
    
    @Test
    public void testObjectActuallyGone() {
    	String alligator = "Alligator";
    	String bear = "Bear";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        myContainer.add("Iguana");
        assertTrue(!myContainer.get(1).equals(bear));
    }
    
    @Test
    public void testSizePositive() {
    	myContainer.remove("NULL");
    	assertTrue(myContainer.size()>0);
    }
    
    @Test
    public void testSizeChangeOnlyIfPresent() {
    	myContainer.add("Bear");
    	int size = myContainer.size();
    	myContainer.remove("Tiger");
    	assertEquals(size, myContainer.size());
    }
    
}
