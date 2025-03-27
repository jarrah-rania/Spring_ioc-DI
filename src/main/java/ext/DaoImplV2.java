package ext;

import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("ext")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("web service");
        return 41;
    }
}
