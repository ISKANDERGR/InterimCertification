import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InterimCertification1 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Введи длину забора в см: ");
        int length = Integer.parseInt(reader.readLine());

        if (length >= 346) {
            System.out.println("Длина забора соответствует! Пиши.");
        } else {
            System.out.println("Забор коротковат! Ищи другой.");
        }
    }
}
