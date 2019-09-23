package View;

import Util.SystemUtil;
import Model.Cube;

public class Main {

    private Integer T; // Casos de prueba

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        SystemUtil util = new SystemUtil();

        System.out.println("Ingerese la cantidad de casos de prueba");

        do {
            T = util.getInt();
            util.skip();
        } while (T < 0 && T > 50);

        do {
            Cube cube = new Cube();
            do {
                System.out.println("Ingerese N y M. Ej: 4 5");
                String nm = util.getString();

                cube.setN(Integer.parseInt(nm.split(" ")[0]));
                cube.setM(Integer.parseInt(nm.split(" ")[1]));
            } while ((cube.getN() < 0 && cube.getN() > 100) && (cube.getM() < 0 && cube.getM() > 1000));

            cube.initCube();

            String output = "";
            do {

                System.out.println("Que accion desea realizar:\n"
                        + "1. UPDATE x y z W\n"
                        + "2. QUERY  x1 y1 z1 x2 y2 z2");
                cube.setA(util.getInt());
                util.skip();

                if (cube.getA() == 1) {
                    do {
                        System.out.println("Ingerese x,y,z y W. Ej: 1 1 1 23");
                        String update = util.getString();
                        cube.setX(Integer.parseInt(update.split(" ")[0]));
                        cube.setY(Integer.parseInt(update.split(" ")[1]));
                        cube.setZ(Integer.parseInt(update.split(" ")[2]));
                        cube.setW(Integer.parseInt(update.split(" ")[3]));
                    } while ((cube.getX() > cube.getN()) || (cube.getY() > cube.getN()) || (cube.getZ() > cube.getN()) || (cube.getW() < (Math.pow(-10, 9)) || cube.getW() > (Math.pow(10, 9))) );

                    System.out.println("INSERT VALUE");
                    cube.updateCube();
                } else {
                    do {

                    } while ((cube.getX1() > cube.getN() && cube.getX2() < cube.getN()) || (cube.getY1() > cube.getN() && cube.getY2() < cube.getN()) || (cube.getZ1() > cube.getN() && cube.getZ2() < cube.getN()));
                    System.out.println("Ingerese x1 y1 z1 x2 y2 z2. Ej: 1 1 1 2 2 2");
                    String query = util.getString();

                    cube.setX1(Integer.parseInt(query.split(" ")[0]));
                    cube.setY1(Integer.parseInt(query.split(" ")[1]));
                    cube.setZ1(Integer.parseInt(query.split(" ")[2]));
                    cube.setX2(Integer.parseInt(query.split(" ")[3]));
                    cube.setY2(Integer.parseInt(query.split(" ")[4]));
                    cube.setZ2(Integer.parseInt(query.split(" ")[5]));

                    output += cube.queryCube() + "\n";
                }
                cube.setM(cube.getM() - 1);
            } while (cube.getM() > 0);
            System.out.println("Output:\n");
            System.out.println(output);
            T--;
        } while (T > 0);

    }

}
