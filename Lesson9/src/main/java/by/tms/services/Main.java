package by.tms.services;

import by.tms.model.Season;

import static by.tms.utils.Seasons.AUTUMN;

public class Main {
    public static void main(String[] args) {
        Season season = new Season(AUTUMN);
        season.getLikeSeasons(season.getSeasons());
        System.out.println(season.myFavouriteSeason());
        season.printSeasons();
        season.seasonsDescription();
    }
}
