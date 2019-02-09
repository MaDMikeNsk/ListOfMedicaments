/* [M5_L4] Написать программу, в которую можно добавлять через консоль и хранить перечень лекарств,
    а также распечатывать весь их список командой LIST.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> medicaments  = new HashSet<>();
        for (;;) {
            System.out.println("Введите название лекарства или команду");
            String command = reader.readLine().trim();
            if (command.equals("LIST")) {
                if (medicaments.isEmpty()){
                    System.out.println("Список пуст");
                } else {
                    for (String item : medicaments) {
                        System.out.println(item);
                    }
                }
            } else {
                medicaments.add(command);
            }
        }
    }
}