package lab5.io.ch1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts;

    public PhoneBook(String inputFileName){
        importContacts(inputFileName);
    }

    private void importContacts(String file){
        contacts = new Contact[10];

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
            String name;
            Long phoneNumber;
            int i=0;
            while (scanner.hasNext()){
                name = scanner.next();
                if(scanner.hasNextLong()){
                    phoneNumber = scanner.nextLong();
                    contacts[i] = new Contact(name, phoneNumber);
                    i++;
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toString(){
        String toReturn="";

        for(Contact c : contacts){
            if(c!=null){
                toReturn += c + "\n";
            }
            else{
                return toReturn;
            }
        }
        return toReturn;
    }

    public Long getNumberByName(String name){
        int i=0;

        while(contacts[i]!=null){
            if(contacts[i].getName().equals(name)){
                return contacts[i].getPhoneNumber();
            }
            i++;
        }

        return null;
    }
}
