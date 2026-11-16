package utility;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
    private static FileInputStream fileInputStream;
    private static Properties properties;

 public static void setupProperty(){
     File file= new File("C:\\Users\\hp\\IdeaProjects\\untitled1\\src\\main\\resources\\TestData.properties");

 try{
     fileInputStream  =new FileInputStream(file);
      properties=new Properties();
     properties.load(fileInputStream);
 }
 catch(FileNotFoundException e){
     Assert.fail("ERROR: OCCURE DURING PROPERTY FILE LOAD");
 } catch(IOException e){
        Assert.fail("ERROR: OCCURE DURING PROPERTY FILE LOAD");
    }
 }
public static String getProperty(String key){
     setupProperty();
     String property=properties.getProperty(key);
     return property;
}
public static void main(String[] args){
    System.out.println(getProperty("url"));

}
}

