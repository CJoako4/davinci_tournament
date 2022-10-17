import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date comienzoDeCursada = new Date(2022,7,18);
        Date finDeCursada = new Date(2023, 8, 30);
        Season torneoDaVinci = new Season("torneo davinci", comienzoDeCursada, finDeCursada);
        torneoDaVinci.setName("torneito");

        torneoDaVinci.setStartDate(comienzoDeCursada);
    }
}
