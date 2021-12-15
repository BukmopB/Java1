package com.gmail.bukmopbacob;

import static java.lang.System.out;

class ReadOnlyStorage<T extends Comparable<? super T>> {
	private T data;
	
	public boolean isGeater(T x) {
		return data.compareTo(x) > 0;
	}
	
	public T getData() {
		return data;
	}

	public ReadOnlyStorage(T data) {
		super();
		this.data = data;
	}
	
}

public class MyGenerics {
	
	public static <T extends Comparable<? super T>> boolean isGreater(T a, T b) {
		return a.compareTo(b) > 0;
	}

	public static void main(String[] args) {
		ReadOnlyStorage<Integer> r1 = new ReadOnlyStorage<Integer>(5);
		ReadOnlyStorage<Double> r2 = new ReadOnlyStorage<Double>(2.5);
		
		out.println(2 * r1.getData());
		out.println(r2.getData());
	}

}
