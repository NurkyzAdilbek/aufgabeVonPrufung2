import java.util.ArrayList;
import java.util.Scanner;

public class User extends Id{

    private String email;
    private String password;
    private String fullName;
    private String gender;

    public User( int uniqueID,String email, String password, String fullName, String gender) {
        super(uniqueID);
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" E-Mail-Adress Jayzynyz:");
        this.email = scanner.nextLine();
        System.out.println("Passwort jazynyz:");
        this.password = scanner.nextLine();
        System.out.println("Atynyzdy jazynyz:");
        this.fullName = scanner.nextLine();
        System.out.println(" Jynysyndy jasynyz:");
        this.gender = scanner.nextLine();

        System.out.println("Registratiadan  ottunuz: " );
    }

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println( fullName+ "  siz iygiliktuu kirdiniz: " );
            return true;
        } else {
            System.out.println(" Login jana parolunuzdu tersherip korunuz");
            return false;
        }
    }
    public static User getUserByEmail(String email, ArrayList<User> userList) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

   
}

