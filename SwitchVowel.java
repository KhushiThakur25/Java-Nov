import java.util.Scanner;

public class SwitchVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character..");
        char c = sc.next().charAt(0);
        switch(c){
            case 'a':{
                System.out.println("Character is vowel");
                break;
            }
            case 'e':{
                System.out.println("Character is vowel");
                break;
            }
            case 'i':{
                System.out.println("Character is vowel");
                break;
            }
            case 'o':{
                System.out.println("Character is vowel");
                break;
            }
            case 'u':{
                System.out.println("Character is vowel");
                break;
            }
            case 'A':{
                System.out.println("Character is vowel");
                break;
            }
            case 'E':{
                System.out.println("Character is vowel");
                break;
            }
            case 'I':{
                System.out.println("Character is vowel");
                break;
            }
            case 'O':{
                System.out.println("Character is vowel");
                break;
            }
            case 'U':{
                System.out.println("Character is vowel");
                break;
            }
            default:
            System.out.println("Character is consonant");
            break;
        }
    sc.close();
    }
}
