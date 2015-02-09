package com.neuronrobotics.cloj;
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
	public static void main(String[] args) {
		DyIO dyio = new DyIO(ConnectionDialog.promptConnection());
		// TODO Auto-generated method stub
		REQUIRE.invoke(CLOJURE_MAIN);
	    MAIN.applyTo(RT.seq(args));
	}

}
