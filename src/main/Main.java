package main;

import java.io.File;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        File[] filesList;
        File filesPath = new java.io.File("E:\\folder\\folder\\gifs\\"); // создаем объект на папку с файлами

        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for (int i = 0; i < Objects.requireNonNull(filesList).length; i++) {
            String buf = filesList[i].getName(); // читаем текущее имя файла
            filesList[i].renameTo(new File("E:\\folder\\folder\\gifs\\" + buf + ".gif"));
        }
    }
}
