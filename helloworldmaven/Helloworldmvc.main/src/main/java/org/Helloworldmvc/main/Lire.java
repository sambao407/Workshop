package org.Helloworldmvc.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lire {

    public static void main(String[] args) throws IOException{
        Path path = Paths.get("HelloWorld.txt");

        List<String> lignes = Files.readAllLines(path);

        for(String ligne : lignes){
            System.out.println(ligne);
        }
    }
}
