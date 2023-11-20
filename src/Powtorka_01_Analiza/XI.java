package Powtorka_01_Analiza;

public class XI {
    public static void main(String[] args) {
        int a = 20, b = a;
        char c = 'b';
        float d = -1e10F;
        double e = a+3/2;
        String f = "ppj";

        boolean takCzyNie = !(a < 0B1001) && (b < 0x1A);

        System.out.println(e);
        System.out.println(takCzyNie);

        if(!takCzyNie) System.out.println("PPJ");
        else if (takCzyNie && (a != b)){
            switch (b){
                case 1 -> System.out.println("P");
                case 2 -> System.out.println("P");
                case 3 -> System.out.println("J");
                default -> {
                    b = 4;
                    c += b;
                }
            }
            System.out.println(b + ", " + c);
        } else if (d > 0) {
            switch (b) {
                case 9:
                    System.out.println("J");
                    break;
                case 10:
                    System.out.println("a");
                case 11:
                    System.out.println("v");
                    break;
                default:
                    System.out.println("a");
            }
            }else{
                c += switch (f){
                    case "ppj" -> 2;
                    case "tak" -> 3;
                    case "xyz" -> 4;
                    default -> 5;
                };
                System.out.println(c != 'd' ? c : f);
            }
        }
    }

