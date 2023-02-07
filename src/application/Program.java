package application;

import java.util.Locale;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		ConcretePrinter printer = new ConcretePrinter("1080");
		printer.processDoc("My Letter");
		printer.print("My Letter");

		System.out.println();
		ConcreteScanner scanner = new ConcreteScanner("2003");
		scanner.processDoc("My Email");
		System.out.println("Scan result: " + scanner.scan());

		System.out.println();
		ComboDevice cd = new ComboDevice("2801");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: " + cd.scan());

	}
}
