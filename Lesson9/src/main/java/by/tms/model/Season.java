package by.tms.model;

import by.tms.utils.Seasons;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Season {
    private Seasons seasons;

    public String myFavouriteSeason() {
        return "My favourite season is " + seasons;
    }

    public String getDescription(Seasons winter) {
        if (seasons == Seasons.WINTER || seasons == Seasons.AUTUMN) {
            return "Cold season";
        }
        return "Warm season";
    }

    public void getLikeSeasons(Seasons season) {
        switch (seasons) {
            case AUTUMN -> System.out.println("I like autumn");
            case SPRING -> System.out.println("I like spring");
            case SUMMER -> System.out.println("I like summer");
            case WINTER -> System.out.println("I like winter");
            default -> System.out.println("I like all seasons");
        }
    }

    public void printSeasons() {
        for (Seasons seasons : Seasons.values()) {
            System.out.print(seasons.name() + " ");
            System.out.print(seasons.getAverageTemp() + " ");
        }
    }
}
