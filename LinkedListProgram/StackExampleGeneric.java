package LinkedListProgram;

/* OUTPUT
 * Popped items: Employee [id=11, name=sam] Employee [id=44, name=sam] Employee
 * [id=33, name=sam] Employee [id=22, name=sam] Employee [id=11, name=sam]
 */

public class StackExampleGeneric {

	public static void main(String[] args) {
		Stack<Employee> stack = new Stack<Employee>(10); 
		stack.push(new Employee("11", "sam"));
		stack.push(new Employee("22", "sam"));
		stack.push(new Employee("33", "sam"));
		stack.push(new Employee("44", "sam"));
		stack.push(new Employee("11", "sam"));
		System.out.print("Popped items: ");
		System.out.print(stack.pop() + " ");
		System.out.print(stack.pop() + " ");
		System.out.print(stack.pop() + " ");
		System.out.print(stack.pop() + " ");
		System.out.print(stack.pop() + " ");
	}
}

class Employee {
	private String id;
	private String name;
	public Employee(String id, String name) { 
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]   ";
	}
}

class StackFullException extends RuntimeException {
	public StackFullException() {
		super();
	}
	public StackFullException(String message) {
		super(message);
	}
}

class StackEmptyException extends RuntimeException {
	public StackEmptyException() {
		super();
	}
	public StackEmptyException(String message) {
		super(message);
	}
}

class Stack<T> {
	private int size;
	private T[] stackAr;
	private int top; 
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.size = size;
		stackAr = (T[]) new Object[size]; 
		top = -1; 
	}
	public void push(T value) {
		if (isFull()) {
			throw new StackFullException("Cannot push " + value + ", Stack is full");
		}
		stackAr[++top] = value;
	}
	public T pop() {
		if (isEmpty()) {
			throw new StackEmptyException("Stack is empty");
		}
		return stackAr[top--]; 
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == size - 1);
	}
}