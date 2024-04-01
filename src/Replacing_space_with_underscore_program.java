import java.util.Scanner;


public class Replacing_space_with_underscore_program {
    public static void main(String[] args) {
        String Content = "this content don't contain any underscores indeed ifykyk";
        String Conversion = Content.replace(' ', '_');
        System.out.println(Conversion);

        System.out.println("Some other solution of name template greeting ");
        String letter = "Dear <| name |> , All the best for Today";
        System.out.println("enter your name");
        Scanner Nameinput = new Scanner(System.in);
        String name = Nameinput.next();
        String Template = letter.replace("name", (name) );
        System.out.println(Template);

    }
}
