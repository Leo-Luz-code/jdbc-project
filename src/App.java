import model.dao.DaoFactory;
import model.dao.GenericDao;
import model.entities.Seller;

public class App {

    public static void main(String[] args) {

        GenericDao<Seller> sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}