package chips;

import java.awt.Color;

//Colors based off "Monte-Carlos-14-Gram-Poker-Chips-scaled.jpg"
//Converted using http://www.shodor.org/~efarrow/trunk/html/rgbint.html
public class ChipValues {
    public static Chip CENT_5 = new Chip(0.05f, new Color(16203153), new Color(5007728), new Color(12628272));
    public static Chip CENT_10 = new Chip(0.10f, new Color(2957086), new Color(2042214), new Color(16578797));
    public static Chip CENT_25 = new Chip(0.25f, new Color(4990238), new Color(2239067), new Color(13080875));
    public static Chip CENT_50 = new Chip(0.50f, new Color(5007217), new Color(2173270), new Color(12825651));
    public static Chip DOLLAR_1 = new Chip(1, new Color(14473429), new Color(6521227), new Color(2241654));
    public static Chip DOLLAR_5 = new Chip(5, new Color(6631215), new Color(13282377), new Color(7878242));
    public static Chip DOLLAR_10 = new Chip(10, new Color(1976932), new Color(4163188), new Color(10129734));
    public static Chip DOLLAR_25 = new Chip(25, new Color(2254942), new Color(11974039), new Color(10919496));
    public static Chip DOLLAR_50 = new Chip(50, new Color(3230366), new Color(6718605), new Color(9522542));
    public static Chip HUNDRED_1 = new Chip(100, new Color(2960689), new Color(12953163), new Color(14013907));
    public static Chip HUNDRED_5 = new Chip(500, new Color(2368582), new Color(5274759), new Color(14013391));
    public static Chip THOUSAND_1 = new Chip(1000, new Color(11840562), new Color(9905442), new Color(13750475));
    public static Chip THOUSAND_5 = new Chip(5000, new Color(11616599), new Color(3096167), new Color(3641472));
    public static Chip THOUSAND_10 = new Chip(10000, new Color(10636315), new Color(2368296), new Color(13420996));
    public static Chip THOUSAND_25 = new Chip(25000, new Color(5843757), new Color(13815756), new Color(2763567));

    public static Chip[] allChips = new Chip[] { CENT_5, CENT_10, CENT_25, CENT_50, DOLLAR_1, DOLLAR_5, DOLLAR_10,
            DOLLAR_25, DOLLAR_50, HUNDRED_1, HUNDRED_5, THOUSAND_1, THOUSAND_5, THOUSAND_10, THOUSAND_25 };

}
