package chapter2.item02;

public class UserTest {

    public static void main(String[] args) {
        // when
        User user = User
                        .Builder()
                        .id("blueKim")
                        .password("bluePassword123")
                        .name("blue")
                        .email("blue@email.com")
                        .build();
        // then
        System.out.println(user.toString());

        // when
        try {
            User incompleteUser = User
                                    .Builder()
                                    .id("blueKim")
                                    .name("blue")
                                    .email("blue@email.com")
                                    .build();
        } catch (IllegalStateException e) {
            // then
            System.out.println(e.getMessage());
        }


    }
}
