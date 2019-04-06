package controller;

import features.FileAnalyzer;
import features.FileDisplay;
import features.FileReader;

public class XMLModule extends AbstractModule {

   private FileReader fileReader;

   private FileAnalyzer fileAnalyzer;

   private FileDisplay fileDisplay;

   public XMLModule() {
      fileReader = new FileReader();
      fileAnalyzer = new FileAnalyzer();
      fileDisplay = new FileDisplay();
   }

   @Override
   public void dataDisplay(String fileName) {
      fileReader.readFile(fileName);
      fileAnalyzer.analysisFile(fileName);
      fileDisplay.displayFile(fileName);
   }
}