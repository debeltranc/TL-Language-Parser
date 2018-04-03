package co.edu.unal.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParserErrorsApp extends BaseErrorListener {

	@Override
	public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, 
			int line, int charPositionInLine, String msg, RecognitionException e) {
		++charPositionInLine;
		System.out.println("<"+line+":"+charPositionInLine+">" + " Error sintactico. Encontrado: "+ offendingSymbol.toString() +"; se esperaba: " + "TOKEN" +".");
		System.exit(0);
	}

}
