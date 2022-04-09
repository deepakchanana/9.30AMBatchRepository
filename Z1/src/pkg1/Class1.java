package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Class1
{
public static void main(String[] args) throws IOException
{
File f=new File("../Z1/dcdc.txt");
FileWriter fw=new FileWriter(f,false);
BufferedWriter b=new BufferedWriter(fw);
System.out.println("Changes done by dc welcome to all of you");
b.newLine();
b.write("third line of code");
b.newLine();
b.write("fourth line of code");
b.close(); // for saving and closing the file

}
}
