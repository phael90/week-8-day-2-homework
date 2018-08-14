package models;

import db.DBHelper;

import java.util.List;

public class Runner {
    public static void main(String[] args) {


        //TODO: Create(save) folders
        Folder movies = new Folder("Movies");
        DBHelper.save(movies);

        Folder photos = new Folder("Photos");
        DBHelper.save(photos);

        Folder data = new Folder("Data");
        DBHelper.save(data);

        //TODO: Create(save) files
        File drama = new File("Green Mile", "mp4",3, movies);
        DBHelper.save(movies);

        File summerTrip = new File("New Zeland", "jpg",300, photos);
        DBHelper.save(photos);

        File projectX = new File("Project 01", "zip",100, data);
        DBHelper.save(data);


//        //TODO: Check getAll on Folders & Files
//        List<Folder> folders = DBHelper.getAll(Folder.class);
//        List<File> files = DBHelper.getAll(File.class);


//        //TODO: Check update method on Folder
//        Folder movie1 = new Folder("Java is Great!");
//        DBHelper.update(movies);
//
//
//        //TODO: Check update method on File
//        File movie2 = new File("Trainspotting", "mp4",3, movies);
//        DBHelper.update(movies);

//
//        //TODO: Check delete method on Folder & Files
//        DBHelper.delete(movies);
//        DBHelper.delete(photos);
//        DBHelper.delete(data);
//
//        List<Folder> folders = DBHelper.getAll(Folder.class);
//        List<File> files = DBHelper.getAll(File.class);
//






    }
}
