package enzocesarano;

import enzocesarano.Adapter.DataSource;
import enzocesarano.Adapter.Info;
import enzocesarano.Adapter.InfoAdapter;
import enzocesarano.Adapter.UserData;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.JANUARY, 1);
        info.setDataDiNascita(cal.getTime());

        DataSource infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}