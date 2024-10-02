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
		System.out.println("El cliente "+getNombre()+" está tomando café ("+tazaCafe.getTipoCafe()+")");
		double temperaturaCafe = tazaCafe.getTemperatura();
		if(temperaturaCafe<20) {
			TooColdTemperatureException tcte = new TooColdTemperatureException(ConsoleColors.BLUE_BOLD_BRIGHT+"El café del cliente "+getNombre()+" está demasiado frío!!\tTemperatura: "+Math.round(temperaturaCafe*10)/10.0+"º"+ConsoleColors.RESET);
			throw tcte;
		}
		else if (temperaturaCafe>80) {
			TooHotTemperatureException thte = new TooHotTemperatureException(ConsoleColors.RED_BOLD_BRIGHT+"El café del cliente "+getNombre()+" está demasiado caliente!!\tTemperatura: "+Math.round(temperaturaCafe*10)/10.0+"º"+ConsoleColors.RESET);
			throw thte;
		}
	}
}
