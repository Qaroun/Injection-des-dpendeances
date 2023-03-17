package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        /*
        se connecter a la BD pour récupérer la tempéature
         */
        System.out.println("version base de donnée");
        double temp=Math.random()*40;

        return temp;
    }
}
