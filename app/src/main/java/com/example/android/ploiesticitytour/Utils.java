package com.example.android.ploiesticitytour;

import java.util.ArrayList;

/**
 * Created by nibos on 3/8/2018.
 */

public class Utils {
    public static ArrayList<Location> getHotels() {
        ArrayList<Location> hotelsList=new ArrayList<Location>();
        hotelsList.add(new Location("Hotel Europa", R.drawable.hotel_europa, "24/7", "0344 103 766", "Strada Gheorghe Grigore Cantacuzino 57, Ploiești",""));
        hotelsList.add(new Location("Hotel Central", R.drawable.hotel_central, "24/7", "0244 526 641", "Bulevardul Republicii 1, Ploiești 100008", ""));
        hotelsList.add(new Location("Hotel Tiara", R.drawable.hotel_tiara, "24/7", "0244 590 441", "Strada Tache Ionescu 6, Ploiești 100022", ""));
        hotelsList.add(new Location("Hotel Vigo Grand", R.drawable.hotel_vigo_grand_hotel, "24/7", "0760 174 339", "Bulevardul Independenței 25, Ploiești 100028", ""));
        hotelsList.add(new Location("Hotel Albert", R.drawable.hotel_albert, "24/7", "0344 802 788", "Bulevardul Republicii 173, Ploiești", ""));
        hotelsList.add(new Location("Hotel Acapulco", R.drawable.hotel_acapulco, "24/7", "0244 520 300", "Strada George Coșbuc, Ploiești", ""));
        hotelsList.add(new Location("Hotel Yarus", R.drawable.hotel_yarus, "24/7", "0737 599 600", "str Republicii, nr 228, Cartier Albert, Ploiești 100072", ""));
        return hotelsList;
    }

    public static ArrayList<Location> getMuseums() {
        ArrayList<Location> museumsList=new ArrayList<Location>();
        museumsList.add(new Location("Natural Sciences",R.drawable.muze_stiintele_naturii,"09:00 - 16:30","0244 597 896","Strada Erou Sublocotenent Călin Cătălin 1, Ploiești 100066",""));
        museumsList.add(new Location("Clock Museum",R.drawable.muzeul_ceasului,"09:00 - 17:00","0244 542 861","Strada Nicolae Simache 1, Ploiești",""));
        museumsList.add(new Location("National Oil Museum",R.drawable.muzeul_petrolului,"09:00 - 17:00","0244 597 585","Strada Doctor Dumitru Bagdazar 8, Ploiești 100575",""));
        museumsList.add(new Location("I.L. Caragiale Museum",R.drawable.museum_caragiale,"09:00 - 17:00","0244 514 552","Strada Kutuzov 1, Ploiești",""));
        return museumsList;
    }

    public static ArrayList<Location> getRestaurants() {
        ArrayList<Location> restaurantsList=new ArrayList<Location>();
        restaurantsList.add(new Location("Tres Olivos",R.drawable.restaurant_tres_olivos,"12:00 - 23:30","0724 443 448","Strada Rahovei 4, Ploiești 100223",""));
        restaurantsList.add(new Location("Da Vinci",R.drawable.restaurant_davinci,"12:00 - 23:30","0244 531 873","Piața Mihai Viteazul 110, Ploiești",""));
        restaurantsList.add(new Location("New London House",R.drawable.restaurant_london,"10:30 - 00:30","0344 802 600","Rondul 2, Bulevardul Independenței, Ploiești" ,""));
        restaurantsList.add(new Location("Pub OK",R.drawable.restaurant_pubok,"08:00 - 00:00","0723 617 654","Strada Golești 25, Ploiești 100032",""));
        restaurantsList.add(new Location("Casa Grande Lazarini",R.drawable.restaurant_casa_grande_lazzarini,"09:00 - 23:00","0723 707 030","Bulevardul Republicii 192, Ploiești 107071",""));
        return restaurantsList;
    }

    public static ArrayList<Location> getNearBy() {
        ArrayList<Location> nearByList=new ArrayList<Location>();
        nearByList.add(new Location("Peleș Castle",R.drawable.atractii_peles_castle,"09:00 - 17:00","0244 310 918","Aleea Peleșului 2, Sinaia 106100",""));
        nearByList.add(new Location("Cantacuzino Castle",R.drawable.atractii_cantacuzino,"09:00 - 19:00","0722 960 606","Strada Zamorei 1, Bușteni 105500",""));
        nearByList.add(new Location("Bucegi Natural Park",R.drawable.atractii_bucegi_natural_park,"24/7","-","Near Sinaia",""));
        nearByList.add(new Location("Sphinx",R.drawable.atractii_sphinx,"24/7"," - ","Near Busteni",""));
        nearByList.add(new Location("Babele",R.drawable.atractii_babele,"24/7"," - ","Near Busteni",""));
        return nearByList;
    }
}
