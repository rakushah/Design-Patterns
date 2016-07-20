package hashtableproblem;

import java.util.Hashtable;
import java.util.*;

public class OriginalHashTable extends Hashtable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5634191316918326823L;
	private int proxyCount = 1;

	public OriginalHashTable() {
		super();
	}

	// Return a copy of this object with proxyCount set back to 1.
	@Override
	public Object clone() {
		OriginalHashTable copy = (OriginalHashTable) super.clone();
		copy.proxyCount = 1;
		return copy;
	}

	int getProxyCount() {
		return proxyCount;
	}

	// Increment the number of proxies using this object by one.
	void addProxy() {
		proxyCount++;
	}

	// Decrement the number of proxies using this object by one.
	void removeProxy() {
		proxyCount--;
	}

}
