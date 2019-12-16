package laba2;

    public class TestAuthor {
            public TestAuthor() {
            }

            public static void main(String[] args) {
                Author a1 = new Author("Bogdan", "Bogd.sim@mail.ru", 'M');
                System.out.println(a1);
                a1.setEmail("Bogdan.sim@mail.ru");
                System.out.println(a1);
            }
        }
