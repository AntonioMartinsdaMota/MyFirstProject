package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Diogo");
        Player player2 = new Player("Antonio");

        Game game = new Game();

        Utils utils = new Utils(1,5);

        System.out.println(utils.secretNumber());

        game.guessNumber(5,5, utils, player1, player2);
    }
}


/*começa com um secret number
                2 jogadores
            cada jogador adivinh o secret number
                ver quem acertou nesse nummero

                ninguem acertou
                        um acertou outro nao
                ou acertarm os 2 no numero temos empate
                o numero e entre minimo e maximo
                o jogo vai ser um objeto
                com 2 objetos do tipo player */