package CollectionsFramework;

import java.util.Arrays;

//show advantage of using Vector in multithreading environment in java
//element at index 0 = 54
public class VectorCustomExample {

	public static void main(String[] args) throws InterruptedException {
		final VectorCustom<Integer> list = new VectorCustom<Integer>();

		new Thread() {
			public void run() {
				list.add(54);
			}
		}.start();

		Thread.sleep(10);

		new Thread() {
			public void run() {
				System.out.println("element at index " + 0 + " = " + list.get(0));
			}
		}.start();

	}

}

class VectorCustom<E> {

	private static final int INITIAL_CAPACITY = 10;
	private Object elementData[] = {};
	private int size = 0;

	public VectorCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public synchronized void add(E e) {
		if (size == elementData.length) {
			ensureCapacity();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		elementData[size++] = e;
	}

	@SuppressWarnings("unchecked")
	public synchronized E get(int index) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elementData[index];
	}

	public synchronized Object remove(int index) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement = elementData[index];
		for (int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;

		return removedElement;
	}

	private void ensureCapacity() {
		int newIncreasedCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}

	public void display() {
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
	}

}