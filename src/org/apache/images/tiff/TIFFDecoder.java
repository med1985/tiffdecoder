package org.apache.images.tiff;

public class TIFFDecoder {

    public static void main(String[] args) {
        if (args.length != 3) {
            String errorMsg = "You have given more than 3 arguments.\n"
                    + "The arguments given should be in this order:\n"
                    + "inputFile : the TIFF being decoded\n"
                    + "numBytes : the number of bytes you wish to analyse";
            System.out.println(errorMsg);
        }
    }
}
