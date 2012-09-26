package org.apache.images.tiff.directory;

public class IFDEntry {

    private final byte tag;

    private final Types type;

    private final int count;

    private final byte[] data;

    public IFDEntry(byte tag, Types type, int count, byte[] data) {
        this.tag = tag;
        this.type = type;
        this.count = count;
        this.data = data;
    }

    public Types getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public byte[] getValue() {
        return data;
    }

    public String toString() {
        return "tag= " + tag + " type=" + type + " count=" + count + " data=" + data;
    }
}
