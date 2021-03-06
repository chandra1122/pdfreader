package Sonicwall.sampleproject;


import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;

public class PdfReadExample {

    private static final String FILE_NAME = "http://www.pdf995.com/samples/pdf.pdf";

    public static void main(String[] args) {

        PdfReader reader;

        try {

            reader = new PdfReader(FILE_NAME);

            // pageNumber = 1
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

            System.out.println(textFromPage);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
