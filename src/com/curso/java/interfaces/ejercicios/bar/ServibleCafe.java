package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.excepciones.TooColdTemperatureException;
import com.curso.java.excepciones.TooHotTemperatureException;

public interface ServibleCafe {
	public void tomarCafe(TazaCafe tazaCafe) throws TooHotTemperatureException, TooColdTemperatureException;
	
}
