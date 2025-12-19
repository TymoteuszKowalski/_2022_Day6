import org.example.Main;

class MainTest {
    @org.junit.jupiter.api.Test
    void przyklad1() {
        org.junit.jupiter.api.Assertions.assertEquals(
                7,
                Main.znajdzMarker("mjqjpqmgbljsphdztnvjfqwrcgsmlb")
        );
    }

}