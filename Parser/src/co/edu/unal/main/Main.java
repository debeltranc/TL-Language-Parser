package co.edu.unal.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import co.edu.unal.antlr.TLLexer;
import co.edu.unal.antlr.TLParser;
import co.edu.unal.parser.ParserErrorsApp;

public class Main {

	public static void main(String[] args) throws Exception {
		try{
			TLLexer lexer;
			if (args.length>0)
				lexer = new TLLexer(CharStreams.fromFileName(args[0]));
			else
				lexer = new TLLexer(CharStreams.fromStream(System.in));
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			TLParser parser = new TLParser(tokens);
			
			parser.removeErrorListeners();
	        parser.addErrorListener(new ParserErrorsApp());
			
			ParseTree tree = parser.parse(); 
			tree.toStringTree(parser);
			System.out.println("El analisis sintactico ha finalizado correctamente.");
			
		} catch (Exception e){
			System.err.println("Error (Test): " + e);
		}
		
	}
}
