package Main;

import model.*;
import service.*;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        Etapa 1
//        Scanner myObj = new Scanner(System.in);
//        int ok = 1;
//        while(ok == 1) {
//            System.out.println("Introduceti optiunea dorita: ");
//            System.out.println("Introduceti Medici: 1");
//            System.out.println("Introduceti Clienti: 2");
//            System.out.println("Introduceti Retete: 3");
//            System.out.println("Introduceti Cabinete: 4");
//            System.out.println("Introduceti Programari: 5");
//            System.out.println("Oprire: 6");
//            System.out.println("Optiune: ");
//            int opt = Integer.parseInt(myObj.nextLine());
//            switch (opt) {
//                case 1:
//                    MedicService medicService = new MedicService();
//                    medicService.displayMedics();
//                    break;
//                case 2:
//                    ClientService clientService = new ClientService();
//                    clientService.displayClients();
//                    break;
//                case 3:
//                    RetetaService retetaService = new RetetaService();
//                    retetaService.displayRetete();
//                    retetaService.displaySortedRetete();
//                    break;
//                case 4:
//                    CabinetService cabinetService = new CabinetService();
//                    cabinetService.displayCabinets();
//                    break;
//                case 5:
//                    ProgramareService programareService = new ProgramareService();
//                    programareService.displayProgramares();
//                    break;
//                case 6:
//                    ok = 0;
//                    break;
//            }
//        }

//        Etapa 2
        final MedicService medicService = MedicService.getInstance();
        final MedicService2 medicService2 = MedicService2.getInstance();
        medicService2.saveMedics();
        System.out.println(medicService.getMedics());

        final ClientService clientService = ClientService.getInstance();
        final ClientService2 clientService2 = ClientService2.getInstance();
        clientService2.saveClients();
        System.out.println(clientService.getClients());

        final CabinetService cabinetService = CabinetService.getInstance();
        final CabinetService2 cabinetService2 = CabinetService2.getInstance();
        cabinetService2.saveCabinets();
        System.out.println(cabinetService.getCabinets());

        final ProgramareService programareService = ProgramareService.getInstance();
        final ProgramareService2 programareService2 = ProgramareService2.getInstance();
        programareService2.saveProgramares();
        System.out.println(programareService.getProgramares());

        final RetetaService retetaService = RetetaService.getInstance();
        final RetetaService2 retetaService2 = RetetaService2.getInstance();
        retetaService2.saveRetetas();
        System.out.println(retetaService.getRetetas());

    }
}
