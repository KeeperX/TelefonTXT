import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 16.08.2016.
 */
public class Telefontxt {
public static String file = "c://1.txt";
public static String fileSave = "c://phone.txt";
public static String[] list;
//public static ArrayList<String>;
public static String[] list2;
    public static int j=0;

 public static void main(String[] args){
 ArrayList<String> array;
     array=readFile();
     list = new String[array.size()];
     System.out.println(array.size());
for (int i=0;i<array.size();i++) {
    list[i]=array.get(i);
}
array.clear();
for (int i=17;i<list.length-9;i++){
    array.add(list[i]);
}
list = new String[array.size()];
for (int i=0;i<array.size();i++) {
         list[i]=array.get(i);
}
saveToFile(list);




 }

 public static ArrayList<String> readFile(){

     j++;
     System.out.println(j);
  ArrayList<String> array = new ArrayList<>();
     try{
     File f = new File(file);
         BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
         String r=bf.readLine();
         while (r!=null)
         { array.add(r);
           r=bf.readLine();
         }

     }catch (Exception e){System.out.println(e.toString());};

     return array;
 }

 public static void saveToFile(String[] listSave){
     ArrayList<String> array = new ArrayList<>();
        try{
            File f = new File(fileSave);
            BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(f),"UTF-8"));
            for (int i=0;i<listSave.length;i++){
                bw.write(listSave[i]);
                if (i!=listSave.length-1){bw.write("\n");}
            }
            bw.close();
        }catch (Exception e){System.out.println(e.toString());};


    }
}
