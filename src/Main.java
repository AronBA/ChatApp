public class Main {

    public static void main(String[] args) {

        com.formdev.flatlaf.intellijthemes.FlatNordIJTheme.setup();

        ConnectGui c1 = new ConnectGui();
        MainGui g1 = new MainGui();
        Host host = new Host(5000,g1);
        Client client = new Client(c1.getIp(),5000);





    }


}
