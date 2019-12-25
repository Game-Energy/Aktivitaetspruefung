package de.gameenergy.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import de.gameenergy.filemanager.FileManager;
import java.io.File;

public class cmdInfo implements CommandExecutor {
    private File file = FileManager.getDatumFile();
    private FileConfiguration DatumFile = (FileConfiguration) YamlConfiguration.loadConfiguration(this.file);
    private String System = this.DatumFile.getString("Plugin");




    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        p.sendMessage("§b-----------------------------------------");
        p.sendMessage("§a§LAktivitätsüberprüfung");
        p.sendMessage("§b-----------------------------------------");

        p.sendMessage("");
        p.sendMessage("§bIn regelmäßigen Abständen überprüft Game-Energy, ob gesponsorte Server aktiv genutzt werden!");
        p.sendMessage("§bWir haben die Vermutung das dein Server nicht aktiv genutzt wird.");
        p.sendMessage("");
        p.sendMessage("§bDarum bitten wir dich, solltest du der Server-Owner sein, ein Ticket auf der Website zu erstellen: → https://g-e.link");
        p.sendMessage("§bGebe uns bitte kurz Rückmeldung, ob es ein Problem gibt.");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("§aReagierst du nicht bis zum §c§l " + String.valueOf(DatumFile.getString(String.valueOf(this.System) + ".Datum") + " §awird dein Server gesperrt und wenig später unwiederbringlich gelöscht. In diesem Fall werden wir kein Backup bereitstellen.!"));
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("");
        p.sendMessage("§bVielen Dank für dein Vertrauen und deine Mitarbeit.");
        p.sendMessage("");
        p.sendMessage("Game-EnergyTeam");
        p.sendMessage("§b-----------------------------------------");

        return true;
    }
}
