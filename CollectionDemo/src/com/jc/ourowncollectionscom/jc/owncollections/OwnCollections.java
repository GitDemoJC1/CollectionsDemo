package com.jc.ourowncollectionscom.jc.owncollections;

public class OwnCollections {
	Object obj[] = new Object[10];
	int elementCount = 0;

	public void add(Object bj) {
		if (size() == capacity()) {
			incrementCapacity();
			obj[elementCount] = bj;
		} else {
			obj[elementCount] = bj;
			elementCount++;
		}
	}

	private void incrementCapacity() {
		Object[] temp = new Object[obj.length * 2];
		for (int i = 0; i < obj.length; i++) {
			temp[i] = obj[i];
		}
		obj = temp;
	}

	public long size() {
		return elementCount;
	}

	public long getSize() {
		return elementCount;
	}

	public int capacity() {
		return obj.length;
	}

	public long getCapacity() {
		return obj.length;
	}

	public Object[] getItems() {
		Object[] obj1 = new Object[elementCount];
		for (int i = 0; i < elementCount; i++) {
			obj1[i] = obj[i];
		}
		return obj1;
	}

}
