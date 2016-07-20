package adapterlab;

import java.util.Arrays;

public class Adaptee {
	private String[] data;
	private int start;
	private int end;
	private int size = 5;

	public Adaptee() {
		data = new String[size];
		start=0;
		end=-1;
	}

	public String startString() {
		return data[start];
	}

	public int getEnd() {
		return end;
	}

	public int getStart() {
		return start;
	}

	public String endString() {
		return data[end];
	}

	public boolean empty() {
		return (end == -1);
	}

	public void add(String str) {
		end++;
		if(size ==end) resize();
		data[end] = str;
		
	}

	private void resize() {
		int len = data.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(data,0,temp,0,len);
		data = temp;
		
	}

	public void remove(int pos) {
		// remove the String object at position 'pos' and bring //forward all
		// items after it
		
		for (int i = pos; i < end; i++) {
			data[i] = data[i + 1];
		}
		--end;
	}

	public String get(int pos) {
		return data[pos];
	}
	public String getAsString(){
		return Arrays.toString(data);
	}
}
