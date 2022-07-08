package com.iitdh.sonusourav.instigo.Mess;

import android.view.View;
import android.widget.RatingBar;

import java.util.ArrayList;
import java.util.Calendar;


@SuppressWarnings({"unused", "WeakerAccess"})
public class Item {

    private String messPart;
    private String messTime;
    private String messItems;
    private String messRatings;
    private int day;

    private View.OnClickListener submitBtnClickListener;
    private RatingBar.OnRatingBarChangeListener ratingBarChangeListener;

    public Item() {
    }

    public Item(int day,String messPart, String messTime, String messItems, String messRatings) {
        this.day=day;
        this.messPart = messPart;
        this.messTime = messTime;
        this.messItems = messItems;
        this.messRatings = messRatings;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMessPart() {
        return messPart;
    }

    public void setMessPart(String messPart) {
        this.messPart = messPart;
    }

    public String getMessTime() {
        return messTime;
    }

    public void setMessTime(String messTime) {
        this.messTime = messTime;
    }

    public String getMessItems() {
        return messItems;
    }

    public void setMessItems(String messItems) {
        this.messItems = messItems;
    }

    public String getMessRatings() {
        return messRatings;
    }

    public void setMessRatings(String messRatings) {
        this.messRatings = messRatings;
    }

    public View.OnClickListener getSubmitBtnClickListener() {
        return submitBtnClickListener;
    }

    public void setSubmitBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.submitBtnClickListener = requestBtnClickListener;
    }

    public RatingBar.OnRatingBarChangeListener getRatingBarClickListener() {

        return ratingBarChangeListener;
    }

    public void setRatingBarClickListener(RatingBar.OnRatingBarChangeListener ratingBarClickListener) {
        this.ratingBarChangeListener = ratingBarClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (messPart != null ? !messPart.equals(item.messPart) : item.messPart != null)
            return false;
        if (messTime != null ? !messTime.equals(item.messTime) : item.messTime != null)
            return false;
        if (messItems != null ? !messItems.equals(item.messItems) : item.messItems != null)
            return false;


        return messRatings != null ? messRatings.equals(item.messRatings) : item.messRatings == null;

    }

    @Override
    public int hashCode() {
        int result = messPart != null ? messPart.hashCode() : 0;
        result = 31 * result + (messTime != null ? messTime.hashCode() : 0);
        result = 31 * result + (messItems != null ? messItems.hashCode() : 0);
        result = 31 * result + (messRatings != null ? messRatings.hashCode() : 0);

        return result;
    }

    public static ArrayList<Item> makeMenu(int index) {

        ArrayList<Item> sundayMenu = new ArrayList<>();
        ArrayList<Item> mondayMenu = new ArrayList<>();
        ArrayList<Item> tuesdayMenu = new ArrayList<>();
        ArrayList<Item> wednesdayMenu = new ArrayList<>();
        ArrayList<Item> thursdayMenu = new ArrayList<>();
        ArrayList<Item> fridayMenu = new ArrayList<>();
        ArrayList<Item> saturdayMenu = new ArrayList<>();

        sundayMenu.add(new Item(0,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am",  "" + "puri,\n" + "Sagu,\n" + "Coconut Chutney,\n" + "Tea,Coffee,Milk,\n"  , null));
        sundayMenu.add(new Item(0,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "butter milk,\n" + "Geera Rice,\n" + "Curd Rice,\n"  + "Ice Cream,\n" , null));
        sundayMenu.add(new Item(0,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "chilly bhajji,\n" + "Tea,Badam Milk,\n", null));
        sundayMenu.add(new Item(0,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Steamed Rice,\n" + "Sambhar,\n"   + "Curd,\n"  , null));

        mondayMenu.add(new Item(1,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Tomato Bath,\nCoconut Chutney ,\n tea , coffee ,milk,\n", null));
        mondayMenu.add(new Item(1,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "sambhar,\n" + "Butter Milk,\n" , null));
        mondayMenu.add(new Item(1,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "Tea,Coffee,Milk\n" + "Dimple puffed Rice,\n", null));
        mondayMenu.add(new Item(1,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Curd,\n" , null));

        tuesdayMenu.add(new Item(2,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Idli,Vada\n" + "Coconut Chutney,\n" + "Sambhar,\n" + "Tea,Coffee,Milk\n", null));
        tuesdayMenu.add(new Item(2,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n"  + "Steamed Rice,\n" + "Sambhar", null));
        tuesdayMenu.add(new Item(2,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "Uppittu,\n" + "Tea,milk,Coffee,\n", null));
        tuesdayMenu.add(new Item(2,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Parota,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Curd,\n" + "Banana,\n"  , null));


        wednesdayMenu.add(new Item(3,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Palak Rice\n" + "Coconut Chutney\n" + "Tea,Coffee,Milk\n"  , null));
        wednesdayMenu.add(new Item(3,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Puri,\n" + "Sagu,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Butter Milk,\n" , null));
        wednesdayMenu.add(new Item(3,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "Tiger Biscuit +\n" + " Tea,Coffee,Milk,\n", null));
        wednesdayMenu.add(new Item(3,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steeamed Rice,\n" + "Sambhar,\n" + "Curd,\n" , null));

        thursdayMenu.add(new Item(4,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Vangibath,\n" + "Coconut Chutney,\n" + "Tea,Coffee,Milk\n" , null));
        thursdayMenu.add(new Item(4,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Steamed Rice,\n" + "Sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n" , null));
        thursdayMenu.add(new Item(4,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "Flattened rice,\n" + "Tea,Milk,Coffee,\n", null));
        thursdayMenu.add(new Item(4,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Curd,\n" , null));

        fridayMenu.add(new Item(5,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Idli,Vada,\n" + "Coconut Chutney,\n" + "Sambhar,\n" + "Tea,Coffee,Milk,\n" , null));
        fridayMenu.add(new Item(5,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Steamed Rice,\n" + "Sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n" , null));
        fridayMenu.add(new Item(5,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "Masala Flattened Rice,\n" + " Tea,Coffee,Milk,\n", null));
        fridayMenu.add(new Item(5,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Lemon Rice,\n" + "Roti,\n" + "Brinjal Sabhji,\n" , null));

        saturdayMenu.add(new Item(6,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Pulav,\n" + "Dhai Chutney,\n" + "Ta,Coffee,Milk,\n" , null));
        saturdayMenu.add(new Item(6,"L\nU\nN\nC\nH\n", "12:15 - 2:15 pm", "" + "Steamed Rice,\n" + "Sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n" , null));
        saturdayMenu.add(new Item(6,"S\nN\nA\nC\nK\nS", "5:00 - 6:15 pm", "" + "masala puuffed rice,\n" + "tea,milkCoffee,\n", null));
        saturdayMenu.add(new Item(6,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Steamed Rice,\n" + "sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Curd,\n"  , null));

        switch (index) {
            case 0:
                return sundayMenu;

            case 1:
                return mondayMenu;

            case 2:

                return tuesdayMenu;

            case 3:
                return wednesdayMenu;

            case 4:
                return thursdayMenu;

            case 5:
                return fridayMenu;

            case 6: {
                return saturdayMenu;
            }

            default:
                return sundayMenu;


        }
    }
    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item>sunday = new ArrayList<>();
        ArrayList<Item>monday = new ArrayList<>();
        ArrayList<Item>tuesday = new ArrayList<>();
        ArrayList<Item>wednesday = new ArrayList<>();
        ArrayList<Item>thursday = new ArrayList<>();
        ArrayList<Item>friday = new ArrayList<>();
        ArrayList<Item>saturday = new ArrayList<>();

        sunday.add(new Item(0,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", ""  + "puri\n" + "Sagu\n" + "Coconut Chutney,\n" + "Tea,Coffee,Milk,\n"  , null));
        sunday.add(new Item(0,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "butter milk,\n" + "Geera Rice,\n" + "Curd Rice,\n"  + "Ice Cream,\n" , null));
        sunday.add(new Item(0,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" + "chilly bhajji,\n" + "Tea,Badam Milk,\n", null));
        sunday.add(new Item(0,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" +"Steamed Rice,\n" + "Sambhar,\n"   + "Curd,\n"  , null));

        monday.add(new Item(1,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Tomato Bath,\nCoconut Chutney ,\n tea , coffee ,milk,\n", null));
        monday.add(new Item(1,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "sambhar,\n" + "Butter Milk,\n" , null));
        monday.add(new Item(1,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" + "Tea,Coffee,Milk\n" + "Dimple puffed Rice,\n", null));
        monday.add(new Item(1,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Curd,\n" , null));

        tuesday.add(new Item(2,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" +  "Idli,Vada\n" + "Coconut Chutney,\n" + "Sambhar,\n" + "Tea,Coffee,Milk\n", null));
        tuesday.add(new Item(2,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n"  + "Steamed Rice,\n" + "Sambhar", null));
        tuesday.add(new Item(2,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" +  "Uppittu,\n" + "Tea,milk,Coffee,\n", null));
        tuesday.add(new Item(2,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" +"Parota,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Curd,\n" + "Banana,\n"  , null));


        wednesday.add(new Item(3,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Palak Rice\n" + "Coconut Chutney\n" + "Tea,Coffee,Milk\n"  , null));
        wednesday.add(new Item(3,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" +"Puri,\n" + "Sagu,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Butter Milk,\n" , null));
        wednesday.add(new Item(3,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" +"Tiger Biscuit ,\n" + " Tea,Coffee,Milk,\n", null));
        wednesday.add(new Item(3,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steeamed Rice,\n" + "Sambhar,\n" + "Curd,\n" , null));

        thursday.add(new Item(4,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" +  "Vangibath,\n" + "Coconut Chutney,\n" + "Tea,Coffee,Milk\n" , null));
        thursday.add(new Item(4,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" +"Steamed Rice,\n" + "Sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n" , null));
        thursday.add(new Item(4,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" + "Flattened rice,\n" + "Tea,Milk,Coffee,\n", null));
        thursday.add(new Item(4,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Chapathi,\n" + "Sabhji,\n" + "Steamed Rice,\n" + "Sambhar,\n" + "Curd,\n" , null));

        friday.add(new Item(5,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" +"Idli,Vada,\n" + "Coconut Chutney,\n" + "Sambhar,\n" + "Tea,Coffee,Milk,\n" , null));
        friday.add(new Item(5,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" +"Steamed Rice,\n" + "Sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n" , null));
        friday.add(new Item(5,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" +"Masala Flattened Rice,\n" + " Tea,Coffee,Milk,\n", null));
        friday.add(new Item(5,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" +  "Lemon Rice,\n" + "Roti,\n" + "Brinjal Sabhji,\n" , null));

        saturday.add(new Item(6,"B\nR\nE\nA\nK\nF\nA\nS\nT", "7:30 - 9:30 am", "" + "Pulav,\n" + "Dhai Chutney,\n" + "Ta,Coffee,Milk,\n" , null));
        saturday.add(new Item(6,"L\nU\nN\nC\nH\n", "12:00 - 2:15 pm", "" +  "Steamed Rice,\n" + "Sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Butter Milk,\n" , null));
        saturday.add(new Item(6,"S\nN\nA\nC\nK\nS", "4:45 - 6:15 pm", "" +  "masala puuffed rice,\n" + "tea,milkCoffee,\n", null));
        saturday.add(new Item(6,"D\nI\nN\nN\nE\nR", "7:30 - 9:45 pm", "" + "Steamed Rice,\n" + "sambhar,\n" + "Chapathi,\n" + "Sabhji,\n" + "Curd,\n"  , null));

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                // Current day is Sunday
                return sunday;

            case Calendar.MONDAY:
                // Current day is Monday
                return monday;

            case Calendar.TUESDAY:
                // etc.
                return tuesday;

            case Calendar.WEDNESDAY:
                return wednesday;

            case Calendar.THURSDAY:
                return thursday;

            case Calendar.FRIDAY:
                return friday;

            case Calendar.SATURDAY:{
                return saturday;
            }

                default:return sunday;



        }



    }

}
