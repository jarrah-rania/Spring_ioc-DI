package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
     public static void main(String[] args)
     {
         DaoImpl dao = new DaoImpl();
         MetierImpl metier= new MetierImpl(dao);
       //  metier.setDao(dao); we don't use this injection it is not recommanded
         System.out.print(metier.calcul());
     }
}
