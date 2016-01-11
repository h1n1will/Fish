/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fishsimm;

//import fishing.sim.Start_window;

/**
 *
 * @author gingwill185
 */
public class Main {
int[] inv_num ={1,2,3,4};
String[] inv_name={"Bait","Fishing rodd","Fish","Ebola"};

    public static void main(String[] args) {


//Start_window start_win = new Start_window();
//start_win.setVisible(true);
    }
    public void inv_man(){

    int x=0;
    String inv_out="";
    while(x<5){
    inv_out=inv_name[x]+": "+inv_num[x]+"\n"+inv_out;

    }
    System.out.println(inv_out);

    }


}
