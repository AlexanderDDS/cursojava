package com.curso.java.interfaces.ejercicios.bar;

import com.curso.java.excepciones.TooColdTemperatureException;
import com.curso.java.excepciones.TooHotTemperatureException;
import com.curso.java.utils.ConsoleColors;

public abstract class ClienteServibleCafe extends Cliente implements ServibleCafe{
	public ClienteServibleCafe(String nombre) {
		super(nombre);
	}
	@Override
	public void tomarCafe(TazaCafe tazaCafe) throws TooHotTemperatureException, TooColdTemperatureException{
		double temperaturaCafe = Math.round(tazaCafe.getTemperatura()*10)/10.0;
		if(temperaturaCafe<20) {
			TooColdTemperatureException tcte = new TooColdTemperatureException(ConsoleColors.CYAN_BACKGROUND_BRIGHT+ConsoleColors.BLUE_BOLD+"El "+tazaCafe.getTipoCafe()+" del cliente "+getNombre()+" está demasiado frío!!\tTEMP="+temperaturaCafe+"º"+ConsoleColors.RESET);
			throw tcte;
		}
		else if (temperaturaCafe>80) {
			TooHotTemperatureException thte = new TooHotTemperatureException(ConsoleColors.YELLOW_BACKGROUND_BRIGHT+ConsoleColors.RED_BOLD+"El "+tazaCafe.getTipoCafe()+" del cliente "+getNombre()+" está demasiado caliente!!\tTEMP="+temperaturaCafe+"º"+ConsoleColors.RESET);
			throw thte;
		}
	}
}
