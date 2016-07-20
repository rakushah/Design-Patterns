package hashtableproblem;

import java.util.Hashtable;

public class LargeHashTable extends Hashtable {
    // The OriginalHashTable that this is a proxy for.
    private OriginalHashTable mHashTable;

    public LargeHashTable() {
        mHashTable = new OriginalHashTable();
    }

    // Return the number of key-value pairs in this hashtable.
    public int size() {
        return mHashTable.size();
    }

    // Return the value associated with the specified key.
    public Object get(Object key) {
        return mHashTable.get(key);
    }

    // Add the given key-value pair to this Hashtable.
    public Object put(Object key, Object value) {
        copyOnWrite();
        return mHashTable.put(key, value);
    }

    // Return a copy of this proxy that accesses the same Hashtable.
    public synchronized Object clone() {
        Object copy = super.clone();
        mHashTable.addProxy();
        return copy;
    }

    // This method is called before modifying the underlying
    // Hashtable. If it is being shared then this method clones it.
    private void copyOnWrite() {
        if (mHashTable.getProxyCount() > 1) {
            synchronized (mHashTable) {
                mHashTable.removeProxy();
                try {
                    mHashTable = (OriginalHashTable)
                            mHashTable.clone();
                } catch (Throwable e) {
                    mHashTable.addProxy();
                }
            }
        }
    }
}
