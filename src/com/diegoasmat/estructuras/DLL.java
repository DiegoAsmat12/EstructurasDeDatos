package com.diegoasmat.estructuras;

public class DLL {
	private NodoDLL head;
	private NodoDLL tail;
	private int length;
	public DLL() {
		this.head = null;
		this.tail = null;
		this.length=0;
	}
	
	public void agregaAlFrente(NodoDLL nuevoNodo) {
		if(this.head == null) {
			this.head = nuevoNodo;
			this.tail = nuevoNodo;
		}
		else {
			nuevoNodo.setNext(this.head);
			this.head.setPrev(nuevoNodo);
			this.head = nuevoNodo;
		}
		this.length++;
	}
	public void agregaAlFinal(NodoDLL nuevoNodo) {
		if(this.tail==null) {
			this.head = nuevoNodo;
			this.tail = nuevoNodo;
		}
		else {
			nuevoNodo.setPrev(this.tail);
			this.tail.setNext(nuevoNodo);
			this.tail = nuevoNodo;
		}
		this.length++;
	}
	
	public void agregaEnPosicion(NodoDLL nuevoNodo, int indice) {
		if(indice<=length) {
			if(this.head == null) {
				agregaAlFrente(nuevoNodo);
			}
			else {
				if(indice == this.length) {
					agregaAlFinal(nuevoNodo);
				}
				else {
					NodoDLL aux1 = this.head;
					NodoDLL aux2 = aux1;
					int contador = 0;
					while(contador<indice) {
						aux1 = aux2;
						aux2 = aux2.getNext();
						contador++;		
					}
					
					aux1.setNext(nuevoNodo);
					aux2.setPrev(nuevoNodo);
					nuevoNodo.setNext(aux2);
					nuevoNodo.setPrev(aux1);
					this.length++;
				}
			}
			
		}
		else {
			System.out.println("La lista aún no contiene el numero correspondiente al indice proporcionado.");
		}
	}
	
	public void eliminaAlFrente() {
		if(this.length==1) {
			this.head = null;
			this.tail = null;
		}
		else if(this.length>1) {
			
			NodoDLL aux = this.tail.getPrev();
			
			this.head.setNext(null);
			this.head = aux;
			this.head.setPrev(null);
		}
		this.length--;
	}
	
	
	
	public void eliminaAlFinal() {
		if(this.length==1) {
			this.head = null;
			this.tail = null;
		}
		else if(this.length>1) {
			NodoDLL aux = this.tail.getPrev();
			
			this.tail.setPrev(null);
			this.tail = aux;
			this.tail.setNext(null);
		}
		this.length--;
	}
	
	public void eliminaEnPosicion(int indice) {
		if(indice<length) {
			if(indice == 0) {
				eliminaAlFrente();
			}
			else {
				if(indice == this.length-1) {
					eliminaAlFinal();
				}
				else {
					NodoDLL aux = this.head;
					int contador = 0;
					while(contador<indice) {
						aux = aux.getNext();
						contador++;		
					}
					NodoDLL prev = aux.getPrev();
					NodoDLL next = aux.getNext();
					prev.setNext(next);
					next.setPrev(prev);
					aux.setPrev(null);
					aux.setNext(null);
					this.length--;
				}
			}
			
		}
		else {
			System.out.println("La lista aún no contiene la cantidad de elementos suficientes para el indice proporcionado.");
		}
	}
	
	
	public void imprimePrincipioFin() {
		NodoDLL aux = this.head;
		
		while(aux != null) {
			System.out.print(aux.getValor()+" - ");
			aux = aux.getNext();
		}
	}
	public void imprimeFinPrincipio() {
		NodoDLL aux = this.tail;
		
		while(aux != null) {
			System.out.print(aux.getValor()+" - ");
			aux = aux.getPrev();
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
