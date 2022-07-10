package com.jc.ourowncollectionscom.jc.owncollections;

import java.util.Iterator;

import com.jc.exceptions.WrongIndexException;

public class OwnCollections {
	Object originalArray[] = new Object[10];
	int elementCount = 0;

	// adding new element into collection method
	public void add(Object bj) {
		if (getSize() == capacity()) {
			incrementCapacity();
			originalArray[elementCount] = bj;
		} else {
			originalArray[elementCount] = bj;
			elementCount++;
		}
	}

	// increase capacity method
	private void incrementCapacity() {
		Object[] tempArray = new Object[originalArray.length * 2];
		for (int i = 0; i < originalArray.length; i++) {
			tempArray[i] = originalArray[i];
		}
		originalArray = tempArray;
	}

	public long getSize() {
		return elementCount;
	}

	public int capacity() {
		return originalArray.length;
	}

	public long getCapacity() {
		return originalArray.length;
	}

	// to reterive the values
	public Object[] getItems() {
		Object[] obj1 = new Object[elementCount];
		for (int i = 0; i < elementCount; i++) {
			obj1[i] = originalArray[i];
		}
		return obj1;
	}

	// to get a specific index value
	public Object get(int index) {
		if (index < 0 || index > originalArray.length) {
			throw new WrongIndexException("Please check length  and pass index::    given index is ::" + index);
		}
		return originalArray[index];
	}

	// replace
	public void replace(int index, Object obj) {
		if (index < 0 || index > originalArray.length) {
			throw new WrongIndexException("Please check length  and pass index::    given index is ::" + index);
		} else {
			originalArray[index] = obj;
		}
	}

	// remove operation
	public void remove(int index) {
		for (int i = index; i < getSize() - 1; i++) {
			originalArray[i] = originalArray[i + 1];
		}
		
	}

	public void insertOper(int index, Object obj) {
		for (int i = (int) (getSize() - 1); i >= index; i--) {
			originalArray[i + 1] = originalArray[i];
		}
		originalArray[index] = obj;
	}

}
