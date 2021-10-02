package mirea.pract7;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class pract7 {
    Queue<Integer> first, second;

    public pract7(String fp, String sp) {
        this.first = new ArrayDeque<>();
        this.second = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.first.add(Integer.parseInt(fp.substring(i, i+1)));
            this.second.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!first.isEmpty() && !second.isEmpty() && count < 106){
            if(first.peek() > second.peek() && second.peek() != 0){
                first.add(first.remove());
                first.add(second.remove());

            }else{
                second.add(first.remove());
                second.add(second.remove());
            }
            count++;
        }
        String res = "";
        if(count >= 106){
            res = "botva";
        }else{
            if(first.isEmpty()){
                res = "second " + count;
            }
            else if (second.isEmpty()){
                res += "first " + count;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String firstPlayer, secondPlayer;
        Scanner sc = new Scanner(System.in);
        firstPlayer = sc.nextLine();
        secondPlayer = sc.nextLine();
        System.out.println(new pract7(firstPlayer, secondPlayer).play());
        sc.close();
    }

}
