package com.jc.ourowncollectionscom.jc.owncollections;

public class Cilent {
	public static void main(String[] args) {
		OwnCollections coll = new OwnCollections();
		// System.out.println(coll.getSize());
		int ascil = 67;
		char ch = 'A';
		System.out.println("initial capacity before adding elements:" + coll.getCapacity());
		for (int i = 0; i < 9; i++) {
			coll.add(ch);
			ch++;
		}
		System.out.println(coll.getSize());
		System.out.println("After Adding Elements:" + coll.getCapacity());
		Object obj[] = coll.getItems();

		for (int i = 0; i < obj.length; i++) {

			System.out.print(obj[i]);
		}
		System.out.println();
		System.out.println("Replacing ::");
		coll.replace(2, "$");
		;
		Object replac[] = coll.getItems();
		for (int i = 0; i < obj.length; i++) {
			System.out.print(replac[i] + " ");
		}
		System.out.println();
		System.out.println("After Remove ::");
	//	coll.remove(4);
		System.out.println();
		System.out.println(coll.getSize());
		
		
		coll.insertOper(5, "%");
		Object afterRemove[] = coll.getItems();
		for (int i = 0; i < afterRemove.length; i++) {
			System.out.print(afterRemove[i] + " ");
		}
	}

}
