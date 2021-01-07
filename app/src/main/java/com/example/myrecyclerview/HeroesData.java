package com.example.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Iron Man",
            "Captain Marvel",
            "Thor",
            "Scarlet Witch",
            "Doctor Strange",
            "Captain America",
            "Invisible Woman",
            "Human Torch",
            "Black Panther",
            "Ghost Rider"
    };

    private static String[]heroDetails = {
            "Having created a wondrous suit of armor to keep himself alive, Tony has revised it dozens of times, each version with increased capabilities, faster operation, reduced energy usage, and adaptability to the greatest threats the universe has to offer.",
            "Near death, Carol Danvers was transformed into a powerful warrior for the Kree. Now, returning to Earth years later, she must remember her past in order to to prevent a full invasion by shapeshifting aliens, the Skrulls.",
            "Thor Odinson wields the power of the ancient Asgardians to fight evil throughout the Nine Realms and beyond.",
            "Notably powerful, Wanda Maximoff has fought both against and with the Avengers, attempting to hone her abilities and do what she believes is right to help the world.",
            "Once a highly successful, yet notably egotistical, surgeon, Doctor Stephen Strange endured a terrible accident that led him to evolve in ways he could have never foreseen.",
            "Recipient of the Super-Soldier serum, World War II hero Steve Rogers fights for American ideals as one of the world’s mightiest heroes and the leader of the Avengers.",
            "Susan Storm Richards overcame losing her parents at a young age to become a motherly figure to her brother. After receiving superpowers, she co-founded the Fantastic Four and emerged as the single-most powerful member of the group.",
            "Johnny Storm yearns for adventure and frequently finds it either with the Fantastic Four, another super group, or by himself. With his fiery form, he can burn through just about any adversity and put a smile on it while he does.",
            "T’Challa is the king of the secretive and highly advanced African nation of Wakanda - as well as the powerful warrior known as the Black Panther.",
            "Bonded with the demon Zarathos, the motorcycle stunt man Johnny Blaze becomes the feared Ghost Rider, who craves vengeances against the souls of those who would do harm in the world."
    };

    private static int[] heroesImages = {
            R.drawable.iron_man,
            R.drawable.captain_marvel,
            R.drawable.thor,
            R.drawable.scarlet_witch,
            R.drawable.doctor_strange,
            R.drawable.captain_america,
            R.drawable.invisible_woman,
            R.drawable.human_tourch,
            R.drawable.black_panther,
            R.drawable.ghost_rider
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}