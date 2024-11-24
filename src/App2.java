import model.dao.DaoFactory;
import model.dao.GenericDao;
import model.entities.Department;

public class App2 {

    public static void main(String[] args) {

        GenericDao<Department> departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

    }
}