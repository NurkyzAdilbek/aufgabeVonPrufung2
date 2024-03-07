//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "nurkyz@gmail.com", "nurkyz2000", "Nurkyz Adilbek", "female");
        User user2 = new User(2, "asel@gmail.com", "asel123", "Asel Aibek", "female");
        User user3 = new User(3, "alimg@gmail.com", "alim32435", "Alim Alim", "male");
        User user4 = new User(4, "gulkan4@gmail.com", "gulkan3234", "Gulkan Gulkan", "female");
        User user5 = new User(5, "aaaaan@gmail.com", "asdfs", "sad SFDA", "male");

        User[] users = {user1, user2, user3, user4, user5};

        user1.register();


        user2.login("asel@gmail.com","asel123");

    }


}