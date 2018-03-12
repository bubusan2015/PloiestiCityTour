package com.example.android.ploiesticitytour;

import android.content.Context;
import android.content.res.AssetManager;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<Location> getHotels(Context context) {
        ArrayList<Location> hotelsList=new ArrayList<Location>();
        hotelsList.add(new Location(context.getString(R.string.hotel_europa), R.drawable.hotel_europa, context.getString(R.string.hotel_europa_schedule), context.getString(R.string.hotel_europa_phone), context.getString(R.string.hotel_europa_address)));
        hotelsList.add(new Location(context.getString(R.string.hotel_central), R.drawable.hotel_central, context.getString(R.string.hotel_central_schedule), context.getString(R.string.hotel_central_phone), context.getString(R.string.hotel_central_address)));
        hotelsList.add(new Location(context.getString(R.string.hotel_tiara), R.drawable.hotel_tiara, context.getString(R.string.hotel_tiara_schedule), context.getString(R.string.hotel_tiara_phone), context.getString(R.string.hotel_tiara_address)));
        hotelsList.add(new Location(context.getString(R.string.hotel_vigo_grand), R.drawable.hotel_vigo_grand_hotel, context.getString(R.string.hotel_vigo_grand_schedule), context.getString(R.string.hotel_vigo_grand_phone), context.getString(R.string.hotel_vigo_grand_address)));
        hotelsList.add(new Location(context.getString(R.string.hotel_albert), R.drawable.hotel_albert, context.getString(R.string.hotel_vigo_grand_schedule), context.getString(R.string.hotel_albert_phone), context.getString(R.string.hotel_albert_address)));
        hotelsList.add(new Location(context.getString(R.string.hotel_acapulco), R.drawable.hotel_acapulco, context.getString(R.string.hotel_acapulco_address), context.getString(R.string.hotel_acapulco_phone), context.getString(R.string.hotel_acapulco_address)));
        hotelsList.add(new Location(context.getString(R.string.hotel_yarus), R.drawable.hotel_yarus, context.getString(R.string.hotel_yarus_address), context.getString(R.string.hotel_yarus_phone), context.getString(R.string.hotel_yarus_address)));
        return hotelsList;
    }

    public static ArrayList<Location> getMuseums(Context context) {
        ArrayList<Location> museumsList=new ArrayList<Location>();
        museumsList.add(new Location(context.getString(R.string.muzeu_stiinte_naturale),R.drawable.muze_stiintele_naturii,context.getString(R.string.muzeu_stiinte_naturale_schedule),context.getString(R.string.muzeu_stiinte_naturale_phone),context.getString(R.string.muzeu_stiinte_naturale_address)));
        museumsList.add(new Location(context.getString(R.string.muezul_ceasului),R.drawable.muzeul_ceasului,context.getString(R.string.muezul_ceasului_schedule),context.getString(R.string.muezul_ceasului_phone),context.getString(R.string.muezul_ceasului_address)));
        museumsList.add(new Location(context.getString(R.string.muzeul_petrolului),R.drawable.muzeul_petrolului,context.getString(R.string.muzeul_petrolului_schedule),context.getString(R.string.muzeul_petrolului_phone),context.getString(R.string.muzeul_petrolului_address)));
        museumsList.add(new Location(context.getString(R.string.muzeu_caragiale),R.drawable.museum_caragiale,context.getString(R.string.muzeu_caragiale_schedule),context.getString(R.string.muzeu_caragiale_phone),context.getString(R.string.muzeu_caragiale_address)));
        return museumsList;
    }

    public static ArrayList<Location> getRestaurants(Context context) {
        ArrayList<Location> restaurantsList=new ArrayList<Location>();
        restaurantsList.add(new Location(context.getString(R.string.restaurant_tres_olivos),R.drawable.restaurant_tres_olivos,context.getString(R.string.restaurant_tres_olivos_schedule),context.getString(R.string.restaurant_tres_olivos_schedule),context.getString(R.string.restaurant_tres_olivos_address)));
        restaurantsList.add(new Location(context.getString(R.string.restaurant_da_vinci),R.drawable.restaurant_davinci,context.getString(R.string.restaurant_da_vinci_schedule),context.getString(R.string.restaurant_da_vinci_phone),context.getString(R.string.restaurant_da_vinci_address)));
        restaurantsList.add(new Location(context.getString(R.string.restaurant_london_house),R.drawable.restaurant_london,context.getString(R.string.restaurant_london_house_schedule),context.getString(R.string.restaurant_london_house_phone),context.getString(R.string.restaurant_london_house_address) ));
        restaurantsList.add(new Location(context.getString(R.string.restaurant_pubok),R.drawable.restaurant_pubok,context.getString(R.string.restaurant_pubok_schedule),context.getString(R.string.restaurant_pubok_phone),context.getString(R.string.restaurant_london_house_address)));
        restaurantsList.add(new Location(context.getString(R.string.restaurant_casa_grande_lazarini),R.drawable.restaurant_casa_grande_lazzarini,context.getString(R.string.restaurant_casa_grande_lazarini_schedule),context.getString(R.string.restaurant_casa_grande_lazarini_phone),context.getString(R.string.restaurant_casa_grande_lazarini_address)));
        return restaurantsList;
    }

    public static ArrayList<Location> getNearBy(Context context) {
        ArrayList<Location> nearByList=new ArrayList<Location>();
        nearByList.add(new Location(context.getString(R.string.atractie_castel_peles),R.drawable.atractii_peles_castle,context.getString(R.string.atractie_castel_peles_schedule),context.getString(R.string.atractie_castel_peles_phone),context.getString(R.string.atractie_castel_peles_address)));
        nearByList.add(new Location(context.getString(R.string.atractie_cantacuzino),R.drawable.atractii_cantacuzino,context.getString(R.string.atractie_cantacuzino_schedule),context.getString(R.string.atractie_cantacuzino_phone),context.getString(R.string.atractie_cantacuzino_address)));
        nearByList.add(new Location(context.getString(R.string.atractie_parc_bucegi),R.drawable.atractii_bucegi_natural_park,context.getString(R.string.atractie_parc_bucegi_schedule),context.getString(R.string.atractie_parc_bucegi_phone),context.getString(R.string.atractie_parc_bucegi_address)));
        nearByList.add(new Location(context.getString(R.string.atractie_sfinx),R.drawable.atractii_sphinx,context.getString(R.string.atractie_sfinx_schedule),context.getString(R.string.atractie_sfinx_phone),context.getString(R.string.atractie_sfinx_address)));
        nearByList.add(new Location(context.getString(R.string.atractie_babele),R.drawable.atractii_babele,context.getString(R.string.atractie_babele_schedule),context.getString(R.string.atractie_babele_phone),context.getString(R.string.atractie_babele_address)));
        return nearByList;
    }
}
