package dcll.vfor.MySimpleTask;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

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
	
	@Test
	public void testPush() throws Exception {
		s.push(i);
		assertEquals(i,s.pop());
	}
	
	@Test (expected = EmptyStackException.class)
	public void testPeek() throws Exception {
		s.push(i);
		assertEquals(i,s.peek());
		assertEquals(1,s.getSize());
		s.pop();
		s.peek();
	}
	
	@Test (expected = EmptyStackException.class)
	public void testPop() throws Exception {
		s.push(i);
		assertEquals(i,s.pop());
		assertEquals(0,s.getSize());
		s.pop();
	}
	
	
}
