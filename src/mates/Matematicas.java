/*Copyright [2025] [Rita Barragan]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

	/**
	 * Esta clase contiene un metodo para generar el numero pi 
	 * @author Rita
	 * @version 1.0 02/03/2025
	 */
package mates;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static double generarNumeroPiIterativo(long pasos){
        int i = 0;
		int count = 0;

		double pi;

		double x = 0;
		double y = 0;

        while(i < pasos) {

			x = Math.random();
			y = Math.random();

			if ((x * x) + (y * y) < 1) {
				count++;
			}
			i++;

		}



		pi = 4.0 * ((float) count / (float) pasos);
        	return pi;

    }
}

//este es mi codigo
//el metodo montecarlo te saca el numero pi con numeros aleatorios
//area circulo = pi*r^2
//area cuadrado = 2r*2r = 4r^2
//(area circulo)/(area cuadrado) = (pi*r^2)/(4r^2) = pi/4
//(area circulo/area cuadrado) * 4 = pi
//int i y count son mis contadores
//vas a inicializar los contadores
//voy a poner todo = 0 para darle un valor inicial
//uso double para que pueda usar numeros decimales
//x e y van a ser mis lados donde, x=horizontal e y=vertical
//comparamos el conteo de i siendo menor que la cantidad de posiciones de pi que deseamos
//el while lo va a hacer 100 mil veces
//cuando usamos math.ramdom es un metodo para que calcule un numero aleatorio
//hace una condicion que es la formula del metodo: ((x * x) + (y * y) < 1)
//((x * x) + (y * y) < 1) va a ser mi formula
//usamos el i++ para que no sea un bucle infinito
//la ultima linea del codigo return pi: te devuelve el numero pi