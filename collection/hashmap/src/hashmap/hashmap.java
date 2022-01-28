package hashmap;

public class hashmap<K, V>  {

	Object[] items;
	Object[] keyId;
	Object[] valueName;

	public hashmap() {
		super();
	}


	public void put(V value) {
		if (items == null) {
			items = new Object[1];
			items[0] = value;
		} else {
			Object[] tmpCity = new Object[items.length];
			tmpCity = items;
			items = new String[items.length + 1];
			for (int i = 0; i < tmpCity.length; i++) {
				items[i] = tmpCity[i];
			}
			items[tmpCity.length] = value;
		}
	}
	

	
	public Object get(K key) {
		return items[(int) key];
	}
	

	public void remove(K key) {
		int j = 0;
		Object[] tmpCity = new Object[items.length - 1];
		for (int i = 0; i < tmpCity.length; i++) {
			if (i == (int) key) {
				j = 1;
				tmpCity[i] = items[i + j];
			} else {
				tmpCity[i] = items[i + j];
			}
		}
		items = tmpCity;
	}


	public int size() {
		return items.length;
	}

	public void clear() {
		items = new Object[0];
		keyId = new Object[0];
		valueName = new Object[0];
	}
	

	public Object[] l() {
		return items;

	}

	public void myToString() {
		System.out.print("{");
		for (int i = 0; i < items.length; i++) {
			System.out.println((i + 1) + ". elemaný - " + items[i]);
		}

		System.out.println("}");
	}
	
	public void list() {
		for (Object string : items) {
			System.out.println(string);
		}
	}

	
}
