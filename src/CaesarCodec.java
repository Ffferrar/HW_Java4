import java.util.HashMap;
import java.util.Map;

public class CaesarCodec implements Coder {
    int code_part;
    Map map_encode;
    Map map_decode;
    public CaesarCodec(int code_part){
        this.code_part = code_part;
        this.map_encode = new HashMap();
        this.map_decode = new HashMap();

        //Заполняем шифровальную карту
        for (int i = 1; i <= 26; i++){
            if (i + code_part - 26 > 0){
                int x = i + code_part - 26;
                map_encode.put((char) (i + 64), (char) (x + 64));
                map_encode.put((char) (i + 96), (char) (x + 96));
            }
            else {
                map_encode.put((char)(i + 64), (char) (i + code_part + 64));
                map_encode.put((char)(i + 96), (char) (i + code_part + 96));
            }

        }

        //Заполняем дешифровальную карту
        for (int i = 1; i <= 26; i++){
            if (i + code_part - 26 > 0){
                int x = i + code_part - 26;
                map_decode.put((char) (x + 64), (char) (i + 64));
                map_decode.put((char) (x + 96), (char) (i + 96));
            }
            else {
                map_decode.put((char) (i + code_part + 64), (char)(i + 64));
                map_decode.put((char) (i + code_part + 96), (char)(i + 96));
            }

        }
    }

    public String decode(String input) { //расшифровка
        int length = input.length();
        String output = "";
        for (int i = 0; i < length; i++){
             char c = (char) map_decode.get(input.charAt(i));
             output += c;
        }
        return output;
    }

    public String encode(String input) { //шифровка
        int length = input.length();
        String output = "";
        for (int i = 0; i < length; i++){
            char c = (char) map_encode.get(input.charAt(i));
            output += c;
        }
        return output;
    }

    public static void main(String[] args) {
       CaesarCodec test = new CaesarCodec(1);
       String a = "BCdE";
       System.out.println(test.decode(a));
        System.out.println(test.encode(a));
    }
}