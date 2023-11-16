
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1000;
        int result = tax(num1);
        System.out.println(num1 + "円の商品の税込価格は" + (num1+result) + "円(消費税は" + result + "円)です。");
    }

    public static int tax (int price) {
        int result = (int) (price * 0.1);
        return result;
    }
}