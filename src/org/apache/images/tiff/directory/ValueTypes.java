package org.apache.images.tiff.directory;

import java.util.ArrayList;

public class ValueTypes {
    public static Object getValue(IFDEntry entry) {
        switch (entry.getType()) {
        case UNDEFINED:
        case BYTE:
        case SBYTE:
            return entry.getValue();
        case ASCII:
            return getASCIIStrings(entry.getValue());
        case SHORT:

        }
        return null;
    }

    private static String[] getASCIIStrings(byte[] data) {
        int index = 0, lastIndex = 0;
        ArrayList<String> strings = new ArrayList<String>();
        while (index < data.length) {
            while ((index < data.length) && (data[index++] != 0));

            // When we encountered zero, means one string has ended
            strings.add(new String(data, lastIndex,
                    (index - lastIndex)));
            lastIndex = index;
        }
        return strings.toArray(new String[strings.size()]);
    }

    private static <T> T[] getArray(T[] array, byte[] data) {
        T[] ret = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(),
                array.length);
    }

    private static interface DataArray {
        <T> T getDataArray(byte[] data);
    }

    private static class BigEndianShortArray implements DataArray {

        public short[] getDataArray(byte[] data) {

            return null;
        }

    }
}
