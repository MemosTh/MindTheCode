package com.example.demo;

import com.example.demo.enumeration.UserStatusEnum;
import com.example.demo.pojos.Tour;
import com.example.demo.pojos.TourPackage;
import com.example.demo.pojos.Users;
import com.example.demo.repositories.TourPackageRepository;
import com.example.demo.repositories.TourRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner //to run code in application start up
{

    @Autowired //dependency injection
            TourPackageRepository tourPackageRepository;

    @Autowired
    TourRepository tourRepository;

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TourPackage aegean = new TourPackage("Best tour package", 10000, "Aegean");
        TourPackage tourPackage2 = new TourPackage("Mapa tour package", 500, "SalaMykonos");
        TourPackage tourPackage3 = new TourPackage("Relax in Ionio", 3000, "Ionio");
        TourPackage peloponnese = new TourPackage("Peloponese mountains", 2000, "Peloponese");

        tourPackageRepository.save(aegean);
        tourPackageRepository.save(tourPackage2);
        tourPackageRepository.save(tourPackage3);
        tourPackageRepository.save(peloponnese);

        Tour tour1 = new Tour(1000, 100, "katamaran in Mykonos", "Enjoy hal day in a Katamaran", "Eat and drink without limit while enjoyinh the local beaches");
        Tour tour2 = new Tour(600, 60, "Ouzaki tasting", "Drink ouzo", "Enjoy half day drinking the best ouzo in Greece");

        Tour karitena = new Tour(400, 50, "Full day in Karitena", "East and drink on mountain village", "East and drink on mountain village");
        Tour dimitsana = new Tour(400, 50, "Full day in Dimitsana", "East and drink on mountain village", "East and drink on mountain village");
        Tour rafting = new Tour(400, 80, "Rafting in Lousios", "Rafting in Lousios very good", "Rafting in Lousios very good");

        tour1.setTourPackage(aegean);
        tour2.setTourPackage(aegean);

        karitena.setTourPackage(peloponnese);
        dimitsana.setTourPackage(peloponnese);
        rafting.setTourPackage(peloponnese);


        //This crashes the app, because we have not saved fake tourPackage in the database
/*      TourPackage fakeTourPackage = new TourPackage("this si fake", 0, "does not exist");
        tour2.setTourPackage(fakeTourPackage);*/

        tourRepository.save(tour1);
        tourRepository.save(tour2);
        tourRepository.save(karitena);
        tourRepository.save(dimitsana);
        tourRepository.save(rafting);

        Users user1 = new Users("Basilis","Tsotos",5, UserStatusEnum.GOLD);


    }
}
