package com.neuronrobotics.cloj;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.neuronrobotics.sdk.commands.bcs.io.GetDyIOChannelCountCommand;
import com.neuronrobotics.sdk.dyio.DyIO;
import com.neuronrobotics.sdk.ui.ConnectionDialog;

import clojure.lang.Symbol;
import clojure.lang.Var;
import clojure.lang.RT;
public class ClojureWrap {
	final static private Symbol CLOJURE_MAIN = Symbol.intern("clojure.main");
	final static private Var REQUIRE = RT.var("clojure.core", "require");
	final static private Var MAIN = RT.var("clojure.main", "main");
	/**
	 * @param args
	 */
	
	static JPanel getDyIORepell( DyIO dyio){
		String mac = dyio.getAddress().toString();
		// TODO Auto-generated method stub
				REQUIRE.invoke(CLOJURE_MAIN);
				
			    MAIN.applyTo(RT.seq(new String[0]));
		return null;
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		DyIO dyio = new DyIO(ConnectionDialog.promptConnection());
		frame.add(getDyIORepell(dyio));
		
	}

}
