public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung(" tabung");
        Kubus kubus = new Kubus(" kubus");
        Balok balok = new Balok(" balok");

        //Setter
        tabung.setName("Tabung");
        kubus.setName("Kubus");
        balok.setName("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
        System.out.println("\n");

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();
        System.out.println("\n");

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
}
}
