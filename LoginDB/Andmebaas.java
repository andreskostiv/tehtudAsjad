package LoginDB;

public class Andmebaas {
 /*   Connection conn;


    public Andmebaas() {
        seadistaAndmebaas();


    }

    private void seadistaAndmebaas() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:login.db");
            System.out.println("Andmebaas käivitus edukalt");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void sulgeYhendus() {

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

public void seadistaTabel() {
        try {
            Statement stat = conn.createStatement();
            // SQL'is pole vahet suurel ja väiksel tähel, paroole krüptitakse progemisel
            String sql = "CREATE TABLE USER (ID INT AUTO_INCREMENT, USERNAME TEXT, PASSWORD TEXT, FULLNAME TEXT, ADDRESS TEXT); ";
            stat.executeUpdate(sql);
            stat.close();
            System.out.println("TABEL ON LOODUD");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registreeriKasutaja(String kasutajaNimi, String parool) {
        try {

            Statement stat = conn.createStatement();
            String sql = "INSERT INTO USER (USERNAME, PASSWORD) VALUES() ('" + kasutajaNimi + "', '" + parool + "')";
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e)
        e.printStackTrace();
    }

}

    public void kuvaRad() {
        try{

            Statement stat = conn.createStatement();
            String sql = " SELECT * FROM USERNAME WHERE USERNAME = " +kasutajaNimi;
            stat.executeUpdate(sql);
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

*/
}