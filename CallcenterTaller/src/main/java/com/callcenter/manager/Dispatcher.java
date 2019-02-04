package com.callcenter.manager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.callcenter.util.Call;
import com.callcenter.util.Employees;

/**
 * Dispatcher.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-04-2019 10:49:22 AM 2019
 */
public class Dispatcher extends Thread {

	/** Attribute that determine call. */
	Call call;
	
	/** Attribute that determine EmployeesGeneral. */
	List<Employees> EmployeesGeneral;

	/**
	 * Gets the call.
	 *
	 * @return the call
	 */
	public Call getCall() {
		return call;
	}

	/**
	 * Sets the call.
	 *
	 * @param call the new call
	 */
	public void setCall(Call call) {
		this.call = call;
	}

	/**
	 * Gets the employees general.
	 *
	 * @return the employees general
	 */
	public List<Employees> getEmployeesGeneral() {
		return EmployeesGeneral;
	}

	/**
	 * Sets the employees general.
	 *
	 * @param EmployeesGeneral the new employees general
	 */
	public void setEmployeesGeneral(List<Employees> EmployeesGeneral) {
		this.EmployeesGeneral = EmployeesGeneral;
	}

	/**
	 * Instantiates a new dispatcher.
	 *
	 * @param call the call
	 * @param EmployeesGeneral the employees general
	 */
	public Dispatcher(Call call, List<Employees> EmployeesGeneral) {

		this.call = call;
		this.EmployeesGeneral = EmployeesGeneral;
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		dispatchCall(this.call, this.EmployeesGeneral);
	}

	/**
	 * Dispatch call.
	 *
	 * @param call the call
	 * @param EmployeesGeneral the employees general
	 */
	public static void dispatchCall(Call call, List<Employees> EmployeesGeneral) {

		Date date = new Date();
		int flag = 0;
		int delayTime = (int) (Math.random() * numberLimit()) + numberLimit()-10;
		
		delayProcess(delayTime);
		if (date.before(timerCall(call.getDuration(), (6+(delayTime/1000))))) {
			flag = processManager("operator", EmployeesGeneral, call, (6+(delayTime/1000)));
		}
		date = new Date();
		delayProcess(delayTime);
		if (date.before(timerCall(call.getDuration(), (8+(delayTime/1000)))) && flag == 0) {
			flag = processManager("supervisor", EmployeesGeneral, call, (8+(delayTime/1000)));
		}
		date = new Date();
		delayProcess(delayTime);
		if (date.before(timerCall(call.getDuration(), (10+(delayTime/1000)))) && flag == 0) {
			flag = processManager("director", EmployeesGeneral, call, (10+(delayTime/1000)));
		}

		if (flag == 0) {

			List<Call> callLost = new ArrayList<Call>();
			callLost.add(call);
			System.out.println(callLost.toString());
		}
	}

	/**
	 * Timer call.
	 *
	 * @param call the call
	 * @param time the time
	 * @return the date
	 */
	private static Date timerCall(Date call, int time) {
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(call);
			calendar.add(Calendar.SECOND, time);
			Date dateOut = calendar.getTime();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String fechaFinal = dateFormat.format(dateOut);

			Date convertDate = dateFormat.parse(fechaFinal);
			return convertDate;
		} catch (ParseException e) {
			System.out.println(e);
		}
		return null;
	}

	/**
	 * Processor call.
	 *
	 * @param EmployeesType the employees type
	 * @param Employees the employees
	 * @return the int
	 */
	private static int processorCall(String EmployeesType, List<Employees> Employees) {

		int count = 0;
		for (Employees EmployeesDisponibility : Employees) {
			if (EmployeesDisponibility.getTypeEmployee().equals(EmployeesType) && EmployeesDisponibility.isdisponibility()) {
				// logica de llamada

				EmployeesDisponibility.setdisponibility(false);
				System.out.println("LLAMADA CONSTESTADA");
				System.out.println(EmployeesDisponibility.getTypeEmployee() + ": " + EmployeesDisponibility.getFirstName()
						+ " " + EmployeesDisponibility.getSecondName());

				count = 1;
				return count;
			}
		}
		return count;

	}

	/**
	 * Process manager.
	 *
	 * @param EmployeesType the employees type
	 * @param Employees the employees
	 * @param call the call
	 * @param number the number
	 * @return the int
	 */
	public static int processManager(String EmployeesType, List<Employees> Employees, Call call, int number) {
		int result = processorCall(EmployeesType, Employees);
		Date date = new Date();
		if (result == 0) {
			do {
				result = processorCall(EmployeesType, Employees);
				date = new Date();
			} while (date.before(timerCall(call.getDuration(), number)) && result == 0);
		}
		return result;
	}
	
	/**
	 * Delay process.
	 *
	 * @param time the time
	 */
	private static void delayProcess(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
	/**
	 * Number limit.
	 *
	 * @return the int
	 */
	private static int numberLimit() {
		int delayTime = (int) (Math.random() * 1000) + 500;
		return delayTime;
	}
}
