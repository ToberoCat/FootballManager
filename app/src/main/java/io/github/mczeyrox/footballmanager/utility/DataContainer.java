package io.github.mczeyrox.footballmanager.utility;

import java.net.MalformedURLException;
import java.net.URL;

import io.github.mczeyrox.footballmanager.soccerplayer.SoccerPlayerRegistry;

public class DataContainer {

    public static SoccerPlayerRegistry SOCCER_PLAYER_REGISTRY;

    public static void init() {
        try {
            SOCCER_PLAYER_REGISTRY = (SoccerPlayerRegistry) JsonUtility.ReadObjectFromURL(
                    new URL("https://raw.githubusercontent.com/ToberoCat/FootballManager/master/GAME_DATA/soccer_players.json"),
                    SoccerPlayerRegistry.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
