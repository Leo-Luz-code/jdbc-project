import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.GenericDao;
import model.entities.Department;

public class App2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GenericDao<Department> departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("=== TEST 2: findById ===");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 3: update ===");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 4: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }
}