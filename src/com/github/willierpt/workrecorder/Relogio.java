package com.github.willierpt.workrecorder;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Relogio {
	static Relogio tempo = new Relogio();

	public long getTime() {
		Date data = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(data);
		long time = data.getTime();
		return time;
	}

	public String getRelogio() {
		int hora, minuto, segundo;
		hora = tempo.obtemHora();
		minuto = tempo.obtemMinuto();
		segundo = tempo.obtemSegundo();
		String relogio = String.format("%02d:%02d:%02d", hora, minuto, segundo);

		return relogio;
	}

	public int obtemHora() {
		int hora;
		Date data = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(data);
		hora = calendar.get(Calendar.HOUR_OF_DAY);
		return hora;
	}

	public int obtemMinuto() {
		int min;
		Date data = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(data);
		min = calendar.get(Calendar.MINUTE);
		return min;
	}

	public int obtemSegundo() {
		int sec;
		Date data = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(data);
		sec = calendar.get(Calendar.SECOND);
		return sec;
	}
}
