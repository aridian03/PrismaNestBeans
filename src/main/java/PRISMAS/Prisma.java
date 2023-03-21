/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRISMAS;

/**
 *
 * @author aridi
 */
public class Prisma {
     private int baseTriangulo;
	    private int alturaPrisma;
	    /**
	     * Constructor que inicializa los valores de la base del triángulo y la altura del prisma para un objeto de la clase Prisma.
	     * @param baseTriangulo valor de la base del triángulo.
	     * @param alturaPrisma valor de la altura del prisma.
	     */
	    public Prisma(int baseTriangulo, int alturaPrisma) {
	        this.baseTriangulo = baseTriangulo;
	        this.alturaPrisma = alturaPrisma;
	    }
	    /**
	     * Método que devuelve el valor de la variable baseTriangulo.
	     * @return valor de la base del triángulo.
	     */
	    public int getBaseTriangulo() {
	        return baseTriangulo;
	    }
	    /**
	     * Método que establece el valor de la variable baseTriangulo.
	     * @param baseTriangulo valor de la base del triángulo.
	     */
	    
	    public void setBaseTriangulo(int baseTriangulo) {
	        this.baseTriangulo = baseTriangulo;
	    }
	    /**
	     * Método que devuelve el valor de la variable alturaPrisma.
	     * @return valor de la altura del prisma.
	     */
	    
	    public int getAlturaPrisma() {
	        return alturaPrisma;
	    }
	    /**
	     * Método que establece el valor de la variable alturaPrisma.
	     * @param alturaPrisma valor de la altura del prisma.
	     */
	    
	    public void setAlturaPrisma(int alturaPrisma) {
	        this.alturaPrisma = alturaPrisma;
	    }
	    /**
	     * Método que calcula la altura del triángulo de la base del prisma.
	     * @return valor de la altura del triángulo.
	     */
	    
	    public float alturaTriangulo() {
	        return (float) (Math.sqrt(3) / 2 * baseTriangulo);
	    }
	    /**
	     * Método que calcula el área de la base del prisma.
	     * @return valor del área de la base del prisma.
	     */
	    public float areaBase() {
	        return (baseTriangulo * alturaTriangulo() / 2);
	    }
	    /**
	     * Método que calcula el perímetro de la base del prisma.
	     * @return valor del perímetro de la base del prisma.
	     */
	    public float perimetro() {
	        return (3 * baseTriangulo);
	    }
	    /**
	     * Método que devuelve una cadena de caracteres representando al objeto Prisma.
	     * @return cadena de caracteres con la información del objeto Prisma.
	     */
	    
	    public float areaLateral() {
	        return (perimetro() * alturaPrisma);
	    }
	    /**
	     * Método que calcula el área total del prisma.
	     * @return valor del área total del prisma.
	     */
	    
	    public float areaTotal() {
	        return areaBase() * 2 + areaLateral();
	    }
	    /**
	     * Método que devuelve una cadena de caracteres representando al objeto Prisma.
	     * @return cadena de caracteres con la información del objeto Prisma.
	     */
	    
	    @Override
	    public String toString() {
	        return "Prisma con base " + baseTriangulo + " y altura " + alturaPrisma;
	    }
	    
	    
	}



