package CollectionsFramework;

//implementing custom LinkedHashSet in java
/*LinkedHashSetCustom contains 21 =true
LinkedHashSetCustom contains 51 =false
Displaying LinkedHashSetCustom: 21 25 30 33 35 

21 removed: true
22 removed: false
Displaying LinkedHashSetCustom: 25 30 33 35 */

public class LinkedHashSetCustomApp {

	public static void main(String[] args) {
		LinkedHashSetCustom<Integer> linkedHashSetCustom = new LinkedHashSetCustom<Integer>();
		linkedHashSetCustom.add(21);
		linkedHashSetCustom.add(25);
		linkedHashSetCustom.add(30);
		linkedHashSetCustom.add(33);
		linkedHashSetCustom.add(35);

		System.out.println("LinkedHashSetCustom contains 21 =" + linkedHashSetCustom.contains(21));
		System.out.println("LinkedHashSetCustom contains 51 =" + linkedHashSetCustom.contains(51));

		System.out.print("Displaying LinkedHashSetCustom: ");
		linkedHashSetCustom.display();

		System.out.println("\n\n21 removed: " + linkedHashSetCustom.remove(21));
		System.out.println("22 removed: " + linkedHashSetCustom.remove(22));

		System.out.print("Displaying LinkedHashSetCustom: ");
		linkedHashSetCustom.display();

	}

}

class LinkedHashSetCustom<E> {

	private LinkedHashMapCustom1<E, Object> linkedHashMapCustom;

	public LinkedHashSetCustom() {
		linkedHashMapCustom = new LinkedHashMapCustom1<>();
	}

	public void add(E value) {
		linkedHashMapCustom.put(value, null);

	}

	public boolean contains(E obj) {
		return linkedHashMapCustom.contains(obj) != null ? true : false;
	}

	public void display() {
		linkedHashMapCustom.displaySet();
	}

	public boolean remove(E obj) {
		return linkedHashMapCustom.remove(obj);
	}

}

class LinkedHashMapCustom1<K, V> {

	private Entry<K, V>[] table;
	private int capacity = 4;
	private Entry<K, V> header;
	private Entry<K, V> last;

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;
		Entry<K, V> before;
		Entry<K, V> after;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	@SuppressWarnings("unchecked")
	public LinkedHashMapCustom1() {
		table = new Entry[capacity];
	}

	public void put(K newKey, V data) {
		if (newKey == null)
			return;

		int hash = hash(newKey);

		Entry<K, V> newEntry = new Entry<K, V>(newKey, data, null);
		maintainOrderAfterInsert(newEntry);
		if (table[hash] == null) {
			table[hash] = newEntry;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];
			while (current != null) {
				if (current.key.equals(newKey)) {
					if (previous == null) {
						newEntry.next = current.next;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current.next;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}
	}

	private void maintainOrderAfterInsert(Entry<K, V> newEntry) {

		if (header == null) {
			header = newEntry;
			last = newEntry;
			return;
		}

		if (header.key.equals(newEntry.key)) {
			deleteFirst();
			insertFirst(newEntry);
			return;
		}

		if (last.key.equals(newEntry.key)) {
			deleteLast();
			insertLast(newEntry);
			return;
		}

		Entry<K, V> beforeDeleteEntry = deleteSpecificEntry(newEntry);
		if (beforeDeleteEntry == null) {
			insertLast(newEntry);
		} else {
			insertAfter(beforeDeleteEntry, newEntry);
		}

	}

	private void maintainOrderAfterDeletion(Entry<K, V> deleteEntry) {

		if (header.key.equals(deleteEntry.key)) {
			deleteFirst();
			return;
		}

		if (last.key.equals(deleteEntry.key)) {
			deleteLast();
			return;
		}

		deleteSpecificEntry(deleteEntry);

	}

	private void insertAfter(Entry<K, V> beforeDeleteEntry, Entry<K, V> newEntry) {
		Entry<K, V> current = header;
		while (current != beforeDeleteEntry) {
			current = current.after;
		}

		newEntry.after = beforeDeleteEntry.after;
		beforeDeleteEntry.after.before = newEntry;
		newEntry.before = beforeDeleteEntry;
		beforeDeleteEntry.after = newEntry;

	}

	void deleteFirst() {

		if (header == last) {
			header = last = null;
			return;
		}
		header = header.after;
		header.before = null;

	}

	void insertFirst(Entry<K, V> newEntry) {

		if (header == null) {
			header = newEntry;
			last = newEntry;
			return;
		}

		newEntry.after = header;
		header.before = newEntry;
		header = newEntry;

	}

	void insertLast(Entry<K, V> newEntry) {

		if (header == null) {
			header = newEntry;
			last = newEntry;
			return;
		}
		last.after = newEntry;
		newEntry.before = last;
		last = newEntry;

	}

	void deleteLast() {

		if (header == last) {
			header = last = null;
			return;
		}

		last = last.before;
		last.after = null;
	}

	private Entry<K, V> deleteSpecificEntry(Entry<K, V> newEntry) {

		Entry<K, V> current = header;
		while (!current.key.equals(newEntry.key)) {
			if (current.after == null) {
				return null;
			}
			current = current.after;
		}

		Entry<K, V> beforeDeleteEntry = current.before;
		current.before.after = current.after;
		current.after.before = current.before;
		return beforeDeleteEntry;
	}

	public V get(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key))
					return temp.value;
				temp = temp.next;
			}
			return null;
		}
	}

	public boolean remove(K deleteKey) {

		int hash = hash(deleteKey);

		if (table[hash] == null) {
			return false;
		} else {
			Entry<K, V> previous = null;
			Entry<K, V> current = table[hash];

			while (current != null) {
				if (current.key.equals(deleteKey)) {
					maintainOrderAfterDeletion(current);
					if (previous == null) {
						table[hash] = table[hash].next;
						return true;
					} else {
						previous.next = current.next;
						return true;
					}
				}
				previous = current;
				current = current.next;
			}
			return false;
		}

	}

	public void display() {

		Entry<K, V> currentEntry = header;
		while (currentEntry != null) {
			System.out.print("{" + currentEntry.key + "=" + currentEntry.value + "}" + " ");
			currentEntry = currentEntry.after;
		}

	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public K contains(K key) {
		int hash = hash(key);
		if (table[hash] == null) {
			return null;
		} else {
			Entry<K, V> temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key))
					return key;
				temp = temp.next;
			}
			return null;
		}
	}

	public void displaySet() {

		Entry<K, V> currentEntry = header;
		while (currentEntry != null) {
			System.out.print(currentEntry.key + " ");
			currentEntry = currentEntry.after;
		}

	}
}