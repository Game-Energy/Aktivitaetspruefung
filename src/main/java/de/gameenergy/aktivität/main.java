package de.gameenergy.aktivität;



import de.gameenergy.commands.cmdInfo;
import de.gameenergy.event.events;
import de.gameenergy.filemanager.FileManager;
import de.gameenergy.util.timer;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.Timer;

public class main extends JavaPlugin implements Listener {
    PluginDescriptionFile pdf = this.getDescription(); //Gets plugin.yml
    PluginManager pm = Bukkit.getPluginManager();
        Timer timer = new Timer();


    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§aPlugin-Name:§6 " + pdf.getName());
        Bukkit.getConsoleSender().sendMessage("§aVersion: §6" + pdf.getVersion());
        Bukkit.getConsoleSender().sendMessage("§aAuthor: §6" + pdf.getAuthors());
        Bukkit.getConsoleSender().sendMessage("§aWebsite: §6" + pdf.getWebsite());
        try {
            FileManager.createDatumFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        registerCommands();

        Bukkit.getConsoleSender().sendMessage("§b-------------");

        timer.schedule(new timer(), 0, 10000);
    }


    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§b-------------");
        Bukkit.getConsoleSender().sendMessage("§bDas Plugin §6" + pdf.getName() + "§b wurde §cdeaktiviert");
        Bukkit.getConsoleSender().sendMessage("§b-------------");
        timer.cancel();
    }

    public void registerCommands() {

        getCommand("info").setExecutor(new cmdInfo());
        pm.registerEvents(new events(), this);

    }



}
