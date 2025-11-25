package overloading;

public class employee {
    int[] employeeIds = {101, 102, 103};
    String[] employeeName = {"ASHWIN", "SURESH", "ROHAN"};


    void searchEmployee(int id) {
        boolean found = false;
        for (int a = 0; a < employeeIds.length; a++) {
            if (employeeIds[a] == id) {
                System.out.println("employee id:" + id);
                System.out.println("employeeName:" + employeeName[a]);

                found = true;
            }
            if (found = false) {
                System.out.println("EMPLOYEE NOT FOUND");
            }

        }

    }
    void searchEmployee1(String name ) {
        boolean found = false;
        for (int a = 0; a < employeeName.length; a++) {
            if (employeeName[a].equalsIgnoreCase(name)) {
                System.out.println("employee id:" + employeeIds[a]);
                System.out.println("employeeName" + name);

                found = true;
            }
            if (found = false) {
                System.out.println("EMPLOYEE NOT FOUND");
            }
        }

    }
}





