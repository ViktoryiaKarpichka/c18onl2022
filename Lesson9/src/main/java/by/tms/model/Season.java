package by.tms.model;

import by.tms.utils.Seasons;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
        System.out.println();
    }

    public void seasonsDescription() {
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " " + season.getDescription());
        }
    }
}
