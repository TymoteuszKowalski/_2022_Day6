import org.example.Main;

class MainTest {
    @org.junit.jupiter.api.Test
    void przyklad1() {
        org.junit.jupiter.api.Assertions.assertEquals(
                5,
                Main.znajdzMarker("bvwbjplbgvbhsrlpgdmjqwftvncz")
        );
    }
    @org.junit.jupiter.api.Test
    void przyklad2() {
        org.junit.jupiter.api.Assertions.assertEquals(
                6,
                Main.znajdzMarker("nppdvjthqldpwncqszvftbrmjlhg")
        );
    }
    @org.junit.jupiter.api.Test
    void przyklad3() {
        org.junit.jupiter.api.Assertions.assertEquals(
                10,
                Main.znajdzMarker("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg")
        );
    }
    @org.junit.jupiter.api.Test
    void przyklad4() {
        org.junit.jupiter.api.Assertions.assertEquals(
                11,
                Main.znajdzMarker("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw")
        );
    }
    @org.junit.jupiter.api.Test
    void prostyPrzypadek() {
        org.junit.jupiter.api.Assertions.assertEquals(
                4,
                Main.znajdzMarker("abcd")
        );
    }
}