/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Cube {

    private Integer cube[][][];
    private Integer N;
    private Integer M; // Cantidad de acciones
    private Integer A; // Accion a realizar
    private Integer X, Y, Z; // posicion de la matriz a actualizar
    private Integer W; // Valor a insertar la pocision
    private Integer X1, Y1, Z1, X2, Y2, Z2; //Pocisiones a consultar

    public Integer getN() {
        return N;
    }

    public void setN(Integer N) {
        this.N = N;
    }

    public Integer getM() {
        return M;
    }

    public void setM(Integer M) {
        this.M = M;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer A) {
        this.A = A;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer X) {
        this.X = X;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer Y) {
        this.Y = Y;
    }

    public Integer getZ() {
        return Z;
    }

    public void setZ(Integer Z) {
        this.Z = Z;
    }

    public Integer getW() {
        return W;
    }

    public void setW(Integer W) {
        this.W = W;
    }

    public Integer getX1() {
        return X1;
    }

    public void setX1(Integer X1) {
        this.X1 = X1;
    }

    public Integer getY1() {
        return Y1;
    }

    public void setY1(Integer Y1) {
        this.Y1 = Y1;
    }

    public Integer getZ1() {
        return Z1;
    }

    public void setZ1(Integer Z1) {
        this.Z1 = Z1;
    }

    public Integer getX2() {
        return X2;
    }

    public void setX2(Integer X2) {
        this.X2 = X2;
    }

    public Integer getY2() {
        return Y2;
    }

    public void setY2(Integer Y2) {
        this.Y2 = Y2;
    }

    public Integer getZ2() {
        return Z2;
    }

    public void setZ2(Integer Z2) {
        this.Z2 = Z2;
    }
       
    public void initCube() {
        this.cube = new Integer[this.N][this.N][this.N];               
        
        for (int x = 0; x < this.N; x++) {
            for (int y = 0; y < this.N; y++) {
                for (int z = 0; z < this.N; z++) {
                    this.cube[x][y][z] = 0;
                }
            }
        }
    }

    public void updateCube() {
        this.cube[this.X][this.Y][this.Z] = this.W;
    }

    public Integer queryCube() {
        Integer sum = 0;

        for (int x = this.X1; x <= this.X2; x++) {
            for (int y = this.Y1; y <= this.Y2; y++) {
                for (int z = this.Z1; z <= this.Z2; z++) {
                    sum += this.cube[x][y][z];
                }
            }
        }
        return sum;
    }

}
