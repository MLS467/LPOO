package control;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro);
        carro.setMarca("Chevrolle");
        System.out.println(carro);
        System.out.println(carro.getMarca());


        Carro carro1 = new Carro("Ford", "Fiesta", 2010, 1);
        Carro carro2 = new Carro("Chevrolet", "Cruze", 2015, 2);
        Carro carro3 = new Carro("Toyota", "Corolla", 2018, 3);
        Carro carro4 = new Carro("Honda", "Civic", 2017, 4);
        Carro carro5 = new Carro("Volkswagen", "Golf", 2016, 5);

        System.out.println(carro1);
        carro1.setMarca("Chevrolle");
        System.out.println(carro1);
        System.out.println(carro1.getMarca());

        System.out.println();
        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        System.out.println(carros);

        carros.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println();
        System.out.println(carros);

        Carro carro6 = new Carro("Nissan", "Altima", 2019, 1);
        Carro carro7 = new Carro("Hyundai", "Elantra", 2020, 2);
        Carro carro8 = new Carro("Kia", "Sorento", 2022, 3);
        Carro carro9 = new Carro("Mazda", "CX-5", 2021, 4);
        Carro carro10 = new Carro("Subaru", "Outback", 2018, 5);


        Map<Integer, Carro> carroMap = new HashMap<>();
        carroMap.put(carro6.getId(), carro6);
        carroMap.put(carro6.getId(), carro7);
        carroMap.put(carro8.getId(), carro8);
        carroMap.put(carro9.getId(), carro9);
        carroMap.put(carro10.getId(), carro10);
        System.out.println(carroMap);

        System.out.println("---id 3 -----");
        System.out.print("Carro de id 3 do tipo lista " + carro3);
        System.out.print("\nCarro de id 3 do tipo Map " + carro8);
    }
}
