package org.apache.images.tiff.directory;

public enum Types {
    BYTE(1),
    ASCII(1),
    SHORT(2),
    LONG(4),
    RATIONAL(8),
    SBYTE(1),
    UNDEFINED(1),
    SSHORT(2),
    SLONG(4),
    SRATIONAL(8),
    FLOAT(4),
    DOUBLE(8);
    private final int numberOfBytes;

    private Types(int numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * Returns the number of bytes in an array of count elements for a given type.
     * 
     * @param type the type of field
     * @param count the number of elements in the array
     * @return the number of bytes in an array of type elements
     */
    public static int getNumberOfBytes(byte type, byte count) {
        if (type <= 0 || type > 12) {
            throw new IllegalArgumentException("type can only have values between 1 and 12");
        }
        return Types.values()[type - 1].numberOfBytes * 4;
    }
}
