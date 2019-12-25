package de.gameenergy.util;

import java.util.TimerTask;

public class timer  extends TimerTask {
    public void run() {
        method.SendTitleToAllPlayers("§a§lAktivitätsprüfung","§bvon Game-Energy ");
        method.SendMessageToAllPlayers("Für weitere Informationen gebe bitte &l/info ein");
    }
}