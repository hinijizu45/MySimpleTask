package dcll.vfor.MySimpleTask;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleStackImplTest {
	
	SimpleStackImpl s;
	Item i;

	@Before
	public void setUp() throws Exception {
		s = new SimpleStackImpl();
		i = new Item();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testIsEmpty() throws Exception {
		assertEquals(true,s.isEmpty());
		s.push(i);
		assertEquals(false,s.isEmpty());
		s.pop();
		assertEquals(true,s.isEmpty());
	}

	@Test
	public void testGetSize() throws Exception {
		assertEquals(0,s.getSize());
		s.push(i);
		assertEquals(1,s.getSize());
		s.pop();
		assertEquals(0,s.getSize());
	}
	
}
