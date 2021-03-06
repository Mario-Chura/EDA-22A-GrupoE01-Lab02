<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td colspan="2"><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td></tr>
    </tbody>
</table>
</div>

<div align="center">
</div>
<div align="center">
	<span style="font-weight:bold;">INFORME DE LABORATORIO</span>

<table>
		<theader>
			<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
		</theader>
		<tbody>
			<tr>
				<td><span style="font-weight:bold;">ASIGNATURA:</span></td>
				<td colspan="5">Estructura de datos y algoritmos Lab-E</td>
			</tr>
			<tr>
				<td><span style="font-weight:bold;">TÍTULO DE LA PRÁCTICA:<span></td>
				<td colspan="5">Revisión de elementos de programación (Parte I)</td>
			</tr>
			<tr>
				<td>NÚMERO DE PRÁCTICA:</td>
				<td>02</td><td>AÑO LECTIVO:</td>
				<td>2022 A</td>
				<td>NRO. SEMESTRE:</td>
				<td>III</td>
			</tr>
			<tr>
				<td>FECHA DE PRESENTACIÓN::</td>
				<td>15-May-2022</td>
				<td>HORA DE PRESENTACIÓN:</td>
				<td> 11:55 pm.</td>
			</tr>
			<tr>
				<td colspan="3">INTEGRANTES:
					<ul>
					<li><a href="https://github.com/fernandocoylaA">Fernando Jesús Coyla Alvarez</a></li>
				 	<li><a href="https://github.com/Icielo23">Valery Cielo Iquise Mamani</a></li>
					<li><a href="https://github.com/Mario-Chura">Mario Franco Chura Puma</a></li>
					</ul>
				</td>
				<td colspan="">NOTA:</td>
				<td></td>
			</tr>
			<tr>
				<td colspan="6">DOCENTE:
					<ul>
					<li>Richart Smith Escobedo Quispe (<a href="rescobedoq@unsa.edu.pe">rescobedoq@unsa.edu.pe</a>)</li>
					</ul>
				</td>
			</tr>
		</tdbody>
</table>
</div>
	
<div align="center"><h2> SOLUCIÓN Y RESULTADOS </h2></div>	

### I.	SOLUCIÓN DE EJERCICIOS/PROBLEMAS
	
- Invertir un matriz de enteros (2 pts)

En este ejercicio consistia invertir el orden de lo valores en un array , para ello se utilizo un array auxiliar donde se iba almacenando estos valores pero con la posicion invertida.
```sh
     for (int i = 0; i < iteraciones; i++){
         int auxiliar = matriz[i];
         matriz[i] = matriz[longitud - i - 1];
         matriz[longitud - i -1] = auxiliar;
     }
```
#	
- Rotación a la Izquierda (3 pts)

En este ejercicio se trabajo con un conjunto de numeros almacenados en un array, para los cuales se tenia que realizar el movimiento uno en uno a la izquierda. Para resolverlo se creo un metodo que recorre una vez las posiciones del array con ello los valores del mismo, en el main y con ayuda del bucle for este metodo es llamado para mostrar la lista del recorrido que hacen los elementos a la izquierda hasta terminar en una posicion inicial. El codigo del metodo implementado para recorrer en una posicion los elementos del array es el siguiente:
```sh
	int aux = numeros[0];
	for(int i=0 ; i<numeros.length - 1 ; i++ ){
		numeros[i] = numeros[i+1];
	}
	numeros[ numeros.length - 1] = aux;
```
#	
- Triángulo recursivo (4 pts)

En este ejercicio se tuvo que usar dos parámetros uno que es el valor de la base del triangulo y un String que es una cadena vacía para que pueda terminar de iterar el método hasta que llegue a un valor de 0 mientras la base va decreciendo como se muestra en el código a continuación:
#	
```sh
else {
	System.out.println("*" + cadena);
	cadena += "*";
	trianguloRecursivo(numeroCaracteres-1,  cadena);
}
```     
#	
- Lista (11 pts)

Primeramente, se realizó la clase list para tipos genéricos, dentro de ella se creó un objeto de tipo Node, además se crearon los constructores uno sin argumentos y otro que recibe un tipo genérico. También creamos los métodos set y get, con el método toString para la impresión. Luego implementamos dos métodos: insertFront para insertar un Nodo por al frente e insertBack para insertar el Nodo por detrás. Todo esto lo llevamos al método Main y lo probamos con un ejemplo creando un objeto de tipo Double con la interfaz List para tipos genéricos
#
### II.	SOLUCIÓN DEL CUESTIONARIO
- ¿Qué diferencia hay entre un List y un ArrayList en Java? <br>
#
Se diferencia en lo siguiente:<br>
La lista es una interface y el arraylist es una clase.<br>
Mientras la interface amplia un marco de colección, mientras que el arraylist extiende de AbstractList e implemente interfaz List.<br>
La lista no puede crear instancias, mientras que el arraylist si lo puede hacer.<br>
La inteface de lista se usa para crear una lista de objetos asociados a un índice, mientras que el arralist crea una matriz que contiene objetos y esta puede 	crecer dinámicamente.<br> 
#	
- ¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?
#
Entre los beneficios que nos ofrecen las clases genéricas están en que nos permiten reutilizar el código, así evitamos crear una clase diferente para cada objeto que tenemos que crear.
#
### III.	CONCLUSIONES
#
- Las clases genericas nos permiten especificar tipos generales, especificando con un solo método un conjunto de metodos relacionados.
- Las clases genericas nos ayudan a espeficicar con la declaracion interface un conjunto de tipos relacionados.
- Las listas enlazadas nos permiten eliminar e insertar nodos en cualquier punto de la lista.
- Java se encarga de eliminar los nodos que no utilicemos a diferencia de otros lenguajes de programacion.
- Un método recursivo se llama a si mismo en sus instrucciones, lo cual esta tecnica la podemos usar en vez de una iteración para resolver diferentes problemas.
#
<div align="center"><h2>  RETROALIMENTACIÓN GENERAL </h2></div> <br>

<div align="center"><h2> REFERENCIAS Y BIBLIOGRAFÍAL </h2></div> <br>
    - https://docs.oracle.com/javase/7/docs/api/java/util/List.html <br>
    - https://docs.oracle.com/javase/tutorial/java/generics/types.html <br>
    - https://www.w3schools.com/java/java_arraylist.asp <br>
    - https://es.acervolima.com/diferencia-entre-list-y-arraylist-en-java/#:~:text=Lista%20vs%20ArrayList%20en%20Java&text=Se%20puede%20crear%20una%20instancia,matriz%20din%C3%A1mica%20que%20contiene%20objetos.<br>
    -https://www.youtube.com/watch?v=TjlPQPRfWFk&ab_channel=makigas%3Atutorialesdeprogramaci%C3%B3n <br>
	
