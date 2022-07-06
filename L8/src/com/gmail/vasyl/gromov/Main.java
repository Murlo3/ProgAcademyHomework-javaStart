package com.gmail.vasyl.gromov;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File fileOne = new File("a.txt");
        System.out.println("File is real: "+fileOne.exists());

        try {
            fileOne.createNewFile();
        } catch (IOException e){
            System.out.println(e);
        }

        File fileTwo = new File("b.txt");
        fileOne.renameTo(fileTwo);

        File folderTwo = new File("AAA");
        folderTwo.mkdirs();

        File fileThreee = new File(folderTwo, "x.doc");
        fileTwo.renameTo(fileThreee);

//        fileThreee.delete();
//        folderTwo.delete();

        deleteFolder(folderTwo);

        File folderOne = new File(".");
        File [] files = folderOne.listFiles();
        for (File file:files) {
            System.out.println(file+(file.isFile()?" - File":" - Folder"));
        }
    }

    public static void deleteFolder (File folder) {
        if (folder.isFile()){
            //System.out.println("Delete"+folder.getName());
            folder.delete();
        } else {
            File [] files = folder.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteFolder(files[i]);
            }
            //System.out.println("Delete"+folder.getName());
            folder.delete();
        }
    }
}
