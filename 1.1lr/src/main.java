import java.util.Scanner;

public class main {
    public static void main(String[] args){
        var out = System.out;
        var sc = new Scanner(System.in);

        out.print("Yemets\n");
        out.print("Enter n:\t");
        var n = sc.nextInt();

        var arr = new double[n][n];

        for(var i = 0; i < n; i+=1){
            for(var j = 0; j < n; j+=1) {
                arr[i][j] = Math.random() - 0.5;
                out.print(arr[i][j] + "\t");
            }
            out.print("\n");
        }
        out.print("\n");
        out.print("Sum = "+Sum(arr));
    }
    private static double Sum(double[][] array){
        double sum = 0;
        for(var i = 0; i < array.length; i += 1)
            for (var j = 0; true; i += 1) {
                if (i == array.length - 1 || j == array.length - 1) {
                    break;
                } else {
                    if (array[i][j] < 0 && array[i + 1][j] < 0) {
                        break;
                    } else if (sum > 0) {
                        break;
                    } else if (sum == 0) sum += array[i + 1][j];
                }
            }
        return sum;
    }
}
