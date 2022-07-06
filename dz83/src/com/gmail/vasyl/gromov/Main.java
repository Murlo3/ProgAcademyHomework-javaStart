package com.gmail.vasyl.gromov;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\Javka\\Java Start";
        getListOfDirsInAFolder(path);

    }

    public static void getListOfDirsInAFolder(String folderAddress) {
        File folder = new File(folderAddress);
        File [] folders = folder.listFiles();
        for (File elem:folders) {
            if (elem.isDirectory()){
                System.out.println(elem.toString());
            }
        }
    }
}
