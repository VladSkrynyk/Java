package task6_1;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bouquette {
    int size;
    Item[] flowers;
    String name;
    void addFlower(Item x){
        flowers[size++] = x;
    }
    boolean removeFlower(Item x){
        int k= 0;
        for(Item it: flowers){
            if (it.equals(x)){
                for(int i=k; i<flowers.length; i++){
                    flowers[k] = flowers[k+1];
                }
            }
            k++;
        }
        return false;
    }
    float getPrice(){
        float sum = 0f;
        for(Item it: flowers){
            sum += it.getPrice();
        }
        return sum;
    }
    float getFresh(){
        int sum =0;
        int num =0;
        LocalDate today = LocalDate.now();
        for(Item it: flowers){
            if(!(it instanceof Flower)){
                continue;
            }
            long diff = ChronoUnit.DAYS.between(it.getTime(),today);
            sum += diff;
            num++;
        }
        if (num>0) return (float) sum/num;
        return Float .POSITIVE_INFINITY;
    }
    public String toString(){
        String res = "";
        for(Item f: flowers){
            res += f.toString();
        }
        return res;
    }
    Flower getByLength(float a, float b ){
        for(Item it: flowers){
            if(it instanceof Flower){
                Flower z = (Flower) it;
                if(z.getLength() >= a && z.getLength()<=b){
                    return z;
                }
            }
        }
        return new Flower();
    }
    public void sort(){
        List <Item> list = Arrays.asList(flowers);
        Collections.sort(list, null);
        this.flowers = (Item []) list.toArray();
    }

    public static void main(String[] args){
        Rose rose1 = new Rose();
        Rose rose2 = new Rose();
        Bouquette buk = new Bouquette();
        buk.addFlower(rose1);
        buk.addFlower(rose2);
        Float p = buk.getPrice();
        System.out.println();
    }
}
