import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //Змініть текст наступним чином:
        //в кожному реченні тексту видалити вказаний символ
        var out = System.out;
        Scanner in = new Scanner(System.in);

        out.print("Yemets\n");
        out.print("Enter string\t");
        var str = in.nextLine();

        out.print("Enter symbol to delete\t");
        char sym = in.next().toCharArray()[0];

        out.print(removeChar(str, sym));
    }

    private static String removeChar(String string, char remove) {
        //StringBuilder объекты похожи на String объекты, за исключением того, что они могут быть изменены.
        //Внутренне эти объекты обрабатываются как массивы переменной длины, которые содержат последовательность
        //символов. В любой момент длина и содержание последовательности могут быть изменены посредством вызова метода.
        StringBuilder r = new StringBuilder(string.length());
        r.setLength(string.length());
        var current = 0;
        for (var i = 0; i < string.length(); i ++) {
            char cur = string.charAt(i);
            if (cur != remove)
                //Заменяет указанный символ (символы) в этом построителе строк.
                r.setCharAt(current++, cur);//void setCharAt(int index, char c)
        }
        return r.toString();
    }
}
