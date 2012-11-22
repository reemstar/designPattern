package designpattern.template.method;

/**
 * das ist die abstrakte klasse die den algorythmus innehat, welcher von den
 * unterklassen verwendet wird. dieser algo ist so getrickt, dass die
 * unterklassen ihn gemeinsam nutzen k�nnen. durch das muster wird er jedoch so
 * realisiert, dass er zwar einzeln nicht ver�ndert werden kann, die
 * teilschritte des algos jedoch von den unterklassen angepasst werden k�nnen.
 * 
 * @author reemstar
 * 
 */
public abstract class KoffeinhaltigesGetraenk {
	/**
	 * das ist der tats�chliche algo der in der oberklasse definiert wird. er
	 * ist final und muss somit in dieser form (reihenfolge der aufrufe)
	 * verwendet werden und kann von den subklassen nicht variiert werden.
	 * jedoch k�nnen die methodenaufrufe innerhalb des algos von den
	 * unterklassen individuell realisert werden
	 */
	public final void zubereitungsRezept() {

		kocheWasser();
		aufgie�en();
		inTasseSch�tten();
		zutatenHinzuf�gen();
	}

	/**
	 * diese beiden methoden muessen/koennen von den unterklassen ralisiert
	 * werden
	 */
	public abstract void zutatenHinzuf�gen();

	/**
	 * diese beiden methoden muessen/koennen von den unterklassen ralisiert
	 * werden
	 */
	public abstract void aufgie�en();

	/**
	 * die anderen methoden werden geerbt und k�nnen einfach verwendet werden.
	 * weil sie identisch in der subklassen verwendet werden.
	 */
	public void inTasseSch�tten() {
		System.out.println("Schuette Getraenk in Tasse.");
	}

	public void kocheWasser() {
		System.out.println("Koche wasser!");
	}

}