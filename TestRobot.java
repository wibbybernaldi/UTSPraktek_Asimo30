public class TestRobot
{
    public static void main(String[] args)
    {
        Asimo30 unit = new Asimo30 (30, 150, 100, 5);
        unit.CetakSpesifikasi();
        unit.Upgrade(20);
        unit.Upgrade(25);
    }
}
