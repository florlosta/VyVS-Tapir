package tapir;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import GUISudoku.GUI;
import LogicaSudoku.*;

public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
			
		
		// Testing setup for Matriz class
		//Definition of the methods and their corresponding symbols
		
		
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("LogicaSudoku.Matriz.<init>", "i");
		mapMethodsToSymbols.put("LogicaSudoku.Matriz.inicializarTablero", "t");
		mapMethodsToSymbols.put("LogicaSudoku.Matriz.accionar", "a");
		mapMethodsToSymbols.put("LogicaSudoku.Matriz.chequearTablero", "c");
		mapMethodsToSymbols.put("LogicaSudoku.Matriz.rendirse", "r");
		//Definition of the regular expression
		regularExpression = Pattern.compile("it(a|c)*r");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Account class is testing is store in a TestingInformation instance
		TestingInformation ti = new TestingInformation(Matriz.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(Matriz.class.toString(), ti);
		
		mapObjectsToCallSequence = null; 
		mapMethodsToSymbols = null; 
		regularExpression = null; 
		matcher = null;
		
		// Testing setup for GUI class
		//Definition of the methods and their corresponding symbols
		
		
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("GUISudoku.GUI.<init>", "c");
		mapMethodsToSymbols.put("GUISudoku.GUI.inicializarJuego", "i");
		mapMethodsToSymbols.put("GUISudoku.GUI.inicializarTablero", "d");
		mapMethodsToSymbols.put("GUISudoku.GUI.actualizarIncorrectas", "a");
		mapMethodsToSymbols.put("GUISudoku.GUI.actualizarRendirse", "r");
		//Definition of the regular expression
		regularExpression = Pattern.compile("cdia*r");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Check Account class is testing is store in a TestingInformation instance
		ti = new TestingInformation(GUI.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, false);
		TestingCore.mapClassToTestingInformation.put(GUI.class.toString(), ti);
		
		
}
	
}
