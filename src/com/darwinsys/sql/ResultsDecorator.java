package com.darwinsys.sql;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.darwinsys.util.Verbosity;

/** Base class for a series of ResultSet printers.
 * @version $Id$
 */
public abstract class ResultsDecorator {
	ResultsDecoratorPrinter parent;
	Verbosity verbosity;

	ResultsDecorator(ResultsDecoratorPrinter wr, Verbosity v) {
		this.parent = wr;
		this.verbosity = v;
	}
	
	/** Print the name of this Decorator's output format */
	abstract String getName();
	
	/** Print the contents of a ResultSet */
	abstract void write(ResultSet rs) throws IOException, SQLException;
	
	/** Print the results of an operation as a Count */
	abstract void write(int rowCount) throws IOException;
	
	void println(String line) throws IOException {
		parent.println(line);
	}
	void println() throws IOException {
		parent.println();
	}
	void print(String lineSeg) throws IOException {
		parent.print(lineSeg);
	}
}
