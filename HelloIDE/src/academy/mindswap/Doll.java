package academy.mindswap;

public class Doll {

    private static int numberOfDollsWithBlueEyes;

    private String skinTone;
    private String hairColor;
    private String eyeColor;
    private String name;


    public Doll (String skinTone, String hairColor, String eyeColor, String name) {

        this.skinTone = skinTone;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
        if(eyeColor.equals("Blue")) {
            numberOfDollsWithBlueEyes++;
        }
    }

    public static int getNumberOfDollsWithBlueEyes() {
        return numberOfDollsWithBlueEyes++;
    }

    public String getSkinTone() {
        return skinTone;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getName() {
        return name;
    }
}
