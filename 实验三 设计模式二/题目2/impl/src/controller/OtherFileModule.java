package controller;

import features.FileAnalyzer;
import features.FileDisplay;
import features.FileReader;
import features.XMLconverter;

public class OtherFileModule extends AbstractModule {

   private FileReader fileReader;

   private FileAnalyzer fileAnalyzer;

   private FileDisplay fileDisplay;

   private XMLconverter xMLconverter;

   public OtherFileModule() {
      fileReader = new FileReader();
      fileAnalyzer = new FileAnalyzer();
      fileDisplay = new FileDisplay();
      xMLconverter = new XMLconverter();
   }

   @Override
   public void dataDisplay(String fileName) {
      fileReader.readFile(fileName);
      xMLconverter.convertToXML(fileName);
      fileAnalyzer.analysisFile(fileName);
      fileDisplay.displayFile(fileName);
   }
}