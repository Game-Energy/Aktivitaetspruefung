package de.gameenergy.filemanager;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileManager {
    public static void createDatumFile() throws IOException {
        File file = new File("plugins/Aktivitaet", "datum.yml");
        YamlConfiguration conf = YamlConfiguration.loadConfiguration((File) file);

        if (!file.exists()) {
            conf.set("Plugin", "System");

            conf.set("System.Datum", "01.01.2019");


        }
        try {
            conf.save(file);
        } catch (IOException e) {
            System.out.println("Fehler im conf");
        }
    }

    public static File getDatumFile() {
        return new File("plugins/Aktivitaet", "datum.yml");
    }


}