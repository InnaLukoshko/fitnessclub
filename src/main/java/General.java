import java.util.ArrayList;
import java.util.List;

public class General {
    public static void main(String[] args) {
        Sections section1 = new Sections("section1", 20, RoomType.ROOM_A);
        Sections section2 = new Sections("section2", 25, RoomType.ROOM_B);
        Sections section3 = new Sections("section3", 30, RoomType.ROOM_C);
        Sections section4 = new Sections("section4", 20, RoomType.SWIMMING_POOL);

        List<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Ivan", 25, section1, 3, "sport_manager"));
        instructors.add(new Instructor("Petr", 28, section2, 7, "psychologist"));
        instructors.add(new Instructor("Misha", 35, section3, 13, "instructor"));
        instructors.add(new Instructor("Sergey", 33, section4, 15, "trainer"));

        long count = instructors.stream()
                .filter(i -> i.getAge() > 30)
                .filter(i -> i.getSection().getRoomType().equals(RoomType.ROOM_A)
                        || i.getSection().getRoomType().equals(RoomType.SWIMMING_POOL) )
                .count();

        System.out.println(count);
    }
}
