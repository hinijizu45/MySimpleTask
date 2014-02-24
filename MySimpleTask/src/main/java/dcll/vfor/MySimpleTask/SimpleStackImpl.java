package dcll.vfor.MySimpleTask;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {
	
	Stack<Item> myStack;
	
	public SimpleStackImpl(){
		myStack = new Stack<Item>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return myStack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return myStack.size();
	}

	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		myStack.push(item);
	}

	@Override
	public Item peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return myStack.peek();
	}

	@Override
	public Item pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return myStack.pop();
	}

}
