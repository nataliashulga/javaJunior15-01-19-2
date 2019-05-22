package lesson1919.practika;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие джава 1.trec",
                "C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие джава 111.trec");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 2 java - 4, 8 апреля 2019.trec",
                "C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 2 java - 4, 8 апреля 201911.trec");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 7, java - 4.trec",
                "C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 7, java - 411.trec");
        CopyFileTaskImpl task4 = new CopyFileTaskImpl("C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 8, java - 4.trec",
                "C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 8, java - 411.trec");
        CopyFileTaskImpl task5 = new CopyFileTaskImpl("C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 9, java - 4.trec",
                "C:\\Users\\Natalia\\Documents\\Camtasia Studio\\занятие 9, java - 411.trec");


        FindFilesTaskImpl task6 = new FindFilesTaskImpl();
        task6.setDirectory("C:\\Users\\Natalia\\Documents");
        task6.setFileNameSearchString("111erjewr");
        task6.setPrintStream(System.out);


    }
}
