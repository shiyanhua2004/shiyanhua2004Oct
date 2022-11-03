package edu.sdccd.cisc191;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import static edu.sdccd.cisc191.User.*;

//save user's info to the txt file (for future uses), implements Serializable
public class SaveInfo {

    public SaveInfo() throws Exception{

        Save object = new Save();
        //haven't done yet
        object. info =  getLastName()  + getEmail();;

        File file  = new File("NewCustomerInfo.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);

    }
    //Or here we can write some member-numbers "i", and push them to a txt file
    class Save implements Serializable{
        String info;
    }
}