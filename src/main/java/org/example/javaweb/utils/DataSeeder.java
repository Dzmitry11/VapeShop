/*package org.example.javaweb.utils;

import com.github.javafaker.Faker;
import org.example.javaweb.model.Dog;
import org.example.javaweb.model.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class DataSeeder {
    @Autowired
    DogRepository dogRepository;

    Faker faker = new Faker();

    public void Seed() throws URISyntaxException, IOException {
        if(dogRepository.count() > 0 ){
            return;
        }
        for(int i =0; i < 100; i++) {
            dogRepository.save(RandomDog());
        }
    }

    private Dog RandomDog() throws URISyntaxException, IOException{
        Dog dog = new Dog();
        dog.setAge(faker.dog().age());
        dog.setName(faker.dog().name());
        dog.setBreed(faker.dog().breed());
        dog.setGender(faker.dog().gender());
        dog.setPrice(faker.random().nextInt(4,20) * 1000);
        dog.setSize(faker.dog().size());
        dog.setImage("/images/dogs/" + getRandomImage());
        return dog;
    }


        private String getRandomImage() throws URISyntaxException, IOException {
            int []arr={0,1,2,3,8,9,24,25,30,34,36,38,40,42,50,60,61,63,66,84,85,88,91,92,94,197,110,111,112,116,117,135,144,146,152};
            int rnd = new Random().nextInt(arr.length);
            String s = String.valueOf(arr[rnd]);
            return "dog." + s + ".jpg";
        //Get all files in dir
//        URL resource = getClass().getClassLoader().getResource("static/images/dogs");
//        Path dir = Paths.get(resource.toURI());
//
//        Set<String> allFiles =  Stream.of(new File(String.valueOf(dir)).listFiles())
//                .filter(file -> !file.isDirectory())
//                .map(File::getName)
//                .collect(Collectors.toSet());
//
//
//
//        return getByRandomClass(allFiles);
    }

    public static <T> T getByRandomClass(Set<T> set) {
        if (set == null || set.isEmpty()) {
            throw new IllegalArgumentException("The Set cannot be empty.");
        }
        int randomIndex = new Random().nextInt(set.size());
        int i = 0;
        for (T element : set) {
            if (i == randomIndex) {
                return element;
            }
            i++;
        }
        throw new IllegalStateException("Something went wrong while picking a random element.");
    }
}
*/

package org.example.javaweb.utils;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.example.javaweb.model.Dog;
import org.example.javaweb.model.DogRepository;
import org.example.javaweb.model.VapeProducts;
import org.example.javaweb.model.VapeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class DataSeeder {
    @Autowired
    VapeRepository vapeRepository;

    @PostConstruct
    public void init() throws URISyntaxException, IOException {
        Seed();
    }


    //DogRepository dogRepository;


    //Faker faker = new Faker();

    public void Seed() throws URISyntaxException, IOException {
        if (vapeRepository.count() > 0) {
            return;
        }
        VapeProducts vape1 = new VapeProducts();
        vape1.setFlavor("Test Vape 1");
        vape1.setVolume("10ml");
        vape1.setNicotine("3mg");
        vape1.setImage("/images/VapeProducts/IMG_Vape1.jpg");
        vape1.setPrice(100);

        VapeProducts vape2 = new VapeProducts();
        vape2.setFlavor("Test Vape 2");
        vape2.setVolume("10ml");
        vape2.setNicotine("6mg");
        vape2.setImage("/images/VapeProducts/IMG_Vape2.jpg");
        vape2.setPrice(150);

        vapeRepository.save(vape1);
        vapeRepository.save(vape2);
    }
}




//        for (int i = 0; i < 100; i++) {
//            //vapeRepository.save(new VapeProducts());
//            VapeProducts vape = new VapeProducts();
//            vape.setFlavor("Flavor " + i);
//            vape.setVolume("10ml");
//            vape.setNicotine("3mg");
//            vape.setImage("/images/VapeProducts/IMG_Vape" + (i % 2 + 1) + ".jpg");
////            vape.setImage("default.jpg");
//            vape.setPrice(10 + i);
//            vapeRepository.save(vape);
//        }
//    }

//    private Dog RandomDog() throws URISyntaxException, IOException {
//        Dog dog = new Dog();
//        dog.setAge(faker.dog().age());
//        dog.setName(faker.dog().name());
//        dog.setBreed(faker.dog().breed());
//        dog.setGender(faker.dog().gender());
//        dog.setPrice(faker.random().nextInt(4, 20) * 1000);
//        dog.setSize(faker.dog().size());
//        dog.setImage("/images/dogs/" + getRandomImage());
//        return dog;
//    }

//    private String getRandomImage() throws URISyntaxException, IOException {
//        int []arr={0,1,2,3,8,9,24,25,30,34,36,38,40,42,50,60,61,63,66,84,85,88,91,92,94,197,110,111,112,116,117,135,144,146,152};
//        int rnd = new Random().nextInt(arr.length);
//        String s = String.valueOf(arr[rnd]);
//        return "vape." + s + ".jpg";

//        Path dir = Paths.get(resource.toURI());
//
//        Set<String> allFiles =  Stream.of(new File(String.valueOf(dir)).listFiles())
//                .filter(file -> !file.isDirectory())
//                .map(File::getName)
//                .collect(Collectors.toSet());
//
//        return getByRandomClass(allFiles);
//    }
//
//    public static String getRandom(String[] array) {
//        int rnd = new Random().nextInt(array.length);
//        return array[rnd];
//    }
//
//    public static <T> T getByRandomClass(Set<T> set) {
//        if (set == null || set.isEmpty()) {
//            throw new IllegalArgumentException("The Set cannot be empty.");
//        }
//        int randomIndex = new Random().nextInt(set.size());
//        int i = 0;
//        for (T element : set) {
//            if (i == randomIndex) {
//                return element;
//            }
//            i++;
//        }
//        throw new IllegalStateException("Something went wrong while picking a random element.");
//    }
//}