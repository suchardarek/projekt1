package excercises.car;

import java.util.ArrayList;
import java.util.List;

/**
 * Wyzwanie
 * A teraz czas na wyzwanie. Tym razem zadanie będzie projektowe a nie algorytmiczne,
 * jak było to w przypadku wyzwania dotyczącego algorytmów i struktur danych w Javie.
 * <p>
 * Celem wyzwania jest stworzenie klas do systemu wypożyczalni pojazdów.
 * 
 * 
 * 
 * 
 * Każdy pojazd ma swój numer rejestracyjny, numer vin, kolor, cenę, spalanie,
 * stan zbiornika paliwa oraz licznik przejechanych kilometrów.
 * --> Klasa abstrakcyjną Vehicle
 *
 *Samochody dzielimy na osobowe,
 * dostawcze, motocykle i maszyny robocze.
 * --> Interfejs VehicleTypeEnabled który wymusza w klasie konkretnej (np. PassengerCar) zwracanie typu pojazdu
 *
 * 
 * W zależności od typu, pojazdy mogą mieć dodatkowe cechy
 * jak np. liczba drzwi w przypadku aut osobowych, której to cechy nie będą mieć motocykle.
 * 
 * 
 * Pojazdy będą mieć silnik diesla, silnik na benzynę lub elektryczny.
 * 
 * 
 * 
 * Należy korzystając z klas
 * i interfejsów stworzyć model obiektowy tego systemu. Całość należy przetestować analogicznie do klasy
 * ZooApplication, tworząc po kilka przykładowych samochodów. Klasy powinny mieć odpowiednie konstruktory
 * oraz metody jedź oraz tankuj, zmieniające pola licznika kilometrów oraz stanu zbiornika paliwa.
 */

public class TaskCar {

    public void startTascCarProject() {
        Vehicle mondeo = new PassengerCar();
        mondeo.setColor(Color.RED);

        Vehicle reanult = new PassengerCar();
        reanult.setColor(Color.GREEN);

        Vehicle kombajnBizon = new WorkingMachine();
        mondeo.setColor(Color.GREEN);

        List<Vehicle> allVehicles = new ArrayList<>();
        allVehicles.add(mondeo);
        allVehicles.add(reanult);
        allVehicles.add(kombajnBizon);

        System.out.println("Liczba pojazdów " + allVehicles.size());

//        for (int i = 0; i < allVehicles.size(); i++) {
//            System.out.println(allVehicles.get(i).getType());
//        }

        for (Vehicle vehicle : allVehicles) {
            System.out.println(vehicle.getType());
        }

    }


}
