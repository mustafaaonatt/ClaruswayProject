package week9.ListPractice;

import java.util.LinkedList;

public class Lists {
    private String lname;
    private LinkedList<String> list;

    public Lists(String lname) {
        this.lname = lname;
        this.list = new LinkedList<String>();
    }

    public String getLname() {
        return lname;
    }

    public void A(String in){
        list.add(in);
    }

    public void AF(String in){
        list.addFirst(in);
    }

    public void AL(String in){
        list.addLast(in);
    }

    public void R(int in){
        list.remove(in);
    }

    public void RF(){
        list.removeFirst();
    }

    public void RL(String in){
        list.removeLast();
    }

    public int S(){return  list.size();}

    public void SW(int F, int N){
        String temp = list.get(F);
        list.set(F, list.get(N));
        list.set(N, temp);
    }
    public void D(){
        int counter = 1;
        System.out.println("\n\n\n-------------- " + this.lname+ " ------------------" );
        for (String str : list){
            System.out.println((counter++) + ". " + str);
        }
    }


}
