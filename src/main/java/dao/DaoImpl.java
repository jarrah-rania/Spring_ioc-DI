package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//quand il s'agit d'un component qui concerne la couche DAO on la nomme Repository
@Repository("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("version database");
        double temp=25;
        return temp;
    }
}
