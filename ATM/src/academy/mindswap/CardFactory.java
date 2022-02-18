package academy.mindswap;

public class CardFactory {

    private static int cardCounter;
    private static int pinGenerator;

    public static Card createCard() {
        cardCounter++;
        pinGenerator++;
        Card card = new Card(cardCounter,pinGenerator);
        return card;
    }

}