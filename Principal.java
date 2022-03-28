// --------------------> Principal

class Principal{
	public static void main(String[] args){
		TRacional r1 = new TRacional(-4,2);
		TRacional r2 = new TRacional(2,4);
		TRacional r3 = new TRacional();
		
		TOperaRacionales tor = new TOperaRacionales();
		
		//SUMA
		r3 = tor.sumaRacional(r1,r2);
		r3.simplificaRacional();
		System.out.println(r1.toString() + " + " + r2.toString() + " = " + r3.toString());
		
		//RESTA
		r3 = tor.restaRacional(r1,r2);
		r3.simplificaRacional();
		System.out.println(r1.toString() + " - " + r2.toString() + " = " + r3.toString());
		
		//MULTIPLICACION
		r3 = tor.multiplicaRacional(r1,r2);
		r3.simplificaRacional();
		System.out.println(r1.toString() + " * " + r2.toString() + " = " + r3.toString());
		
		//DIVISION
		r3 = tor.divideRacional(r1,r2);
		r3.simplificaRacional();
		System.out.println(r1.toString() + " \u00f7 " + r2.toString() + " = " + r3.toString());
		
	}//FIN MAIN
	
}//FIN CALSE PRINCIPAL
