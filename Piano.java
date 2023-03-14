package com.cursoceat.proyectomusica;



	
	public class Piano extends Instrumento {
		//podemos añadir tantos atributos y métodos como necesitemos
		public Piano () {
			super();//constructor de la superclass
		}

		@Override
	public	void interpretar() {
			for (Notas notas : melodia) {
				switch (notas) {
				case DO:
					System.out.println("do");
					break;
				case RE:
					System.out.println("re");
					break;
				case MI:
					System.out.println("mi");
					break;
				case FA:
					System.out.println("fa");
					break;
				case SOL:
					System.out.println("sol");
					break;
				case LA:
					System.out.println("la");
					break;
				case SI:
					System.out.println("si");
					break;
					
				
				}
				
			}
			System.out.println("");
			
		
		}   


	
	
	
	
}
