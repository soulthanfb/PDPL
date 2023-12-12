package Tugas10.Builder;

import java.util.ArrayList;
import java.util.List;

import Tugas10.AbstrakClass;

public class CDType {
        private List<Packing> items = new ArrayList<Packing>();
    public void addItem(Samsung samsung) {
        this.items.add(samsung);
    }

    public void getCost(){
        for(Packing packs : this.items){
            packs.price();
        }
    }

    public void showItems(){
        for(Packing packing : items){
            System.out.print("CD name : " + packing.pack());
            System.out.println("\nPrice : " + packing.price());
        }
    }
}
