package com.diegoasmat.aplicacion;
import com.diegoasmat.estructuras.*;

public class Aplicacion {

	public static void main(String[] args) {
		DLL listaNumeros = new DLL();

		NodoDLL nodo1 = new NodoDLL(10);
		NodoDLL nodo2 = new NodoDLL(20);
		NodoDLL nodo3 = new NodoDLL(30);
		NodoDLL nodo4 = new NodoDLL(40);
		NodoDLL nodo5 = new NodoDLL(50);
		
		listaNumeros.agregaAlFinal(nodo1);
		listaNumeros.agregaAlFinal(nodo2);
		listaNumeros.agregaAlFinal(nodo3);
		listaNumeros.agregaAlFinal(nodo4);
		listaNumeros.agregaAlFinal(nodo5);
		
		listaNumeros.eliminaEnPosicion(4);
		
		listaNumeros.imprimePrincipioFin();
		System.out.println("\n");
		listaNumeros.imprimeFinPrincipio();
		
		ArbolBinario arbolNumeros = new ArbolBinario();
		
		NodoArbol nodoArbol1 = new NodoArbol(100);
		NodoArbol nodoArbol2 = new NodoArbol(50);
		NodoArbol nodoArbol3 = new NodoArbol(200);
		NodoArbol nodoArbol4 = new NodoArbol(10);
		NodoArbol nodoArbol5 = new NodoArbol(80);
		NodoArbol nodoArbol6 = new NodoArbol(150);
		NodoArbol nodoArbol7 = new NodoArbol(500);
		
		arbolNumeros.agregar(nodoArbol1);
		arbolNumeros.agregar(nodoArbol2);
		arbolNumeros.agregar(nodoArbol3);
		arbolNumeros.agregar(nodoArbol4);
		arbolNumeros.agregar(nodoArbol5);
		arbolNumeros.agregar(nodoArbol6);
		arbolNumeros.agregar(nodoArbol7);
		
		System.out.println("\n");
		arbolNumeros.inOrder(arbolNumeros.getRaiz());
		
		NodoArbol resultado=arbolNumeros.buscaValor(200);
		System.out.println("\n");
		if(resultado == null) {
			System.out.println("El valor no se encuentra en el arbol.");
		}else {
			System.out.println(resultado.getValor());
		}
	}

}
