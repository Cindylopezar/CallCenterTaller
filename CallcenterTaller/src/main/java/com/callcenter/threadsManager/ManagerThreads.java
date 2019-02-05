package com.callcenter.threadsManager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.callcenter.util.Call;

/**
 * ManagerThreads.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-05-2019 11:40:40 AM 2019
 */
public class ManagerThreads extends Thread implements Serializable{

	/** Attribute that determine a Constant of serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Attribute that determine call. */
	private final ArrayList<Call> call;

	/** Attribute that determine executorService. */
	private final ThreadPoolExecutor executorService;

	/** Attribute that determine workingQueue. */
	private final BlockingQueue<Runnable> workingQueue;

	/**
	 * Instantiates a new master thread.
	 *
	 * @param listCall the list call
	 */
	public ManagerThreads(ArrayList<Call> listCall) {
		super();
		this.call = listCall;
		this.workingQueue = new ArrayBlockingQueue<Runnable>(10);
		this.executorService = new ThreadPoolExecutor(this.call.size(), this.call.size(),
				Integer.parseInt("200"), TimeUnit.MILLISECONDS, this.workingQueue);
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {

		try {

			for (int a = 0; a < this.call.size(); a++) {
				validateResponse(call.get(a));
			}
			Thread.sleep(200);
		} catch (Exception e) {
			if (e instanceof InterruptedException) {

			}
		}

		this.executorService.shutdown();
	}

	/**
	 * Validate response.
	 *
	 * @param response the response
	 */
	private void validateResponse(final Call response) {

		final DriverThreads worker = new DriverThreads(response);
		this.executorService.submit(worker);

	}

	/**
	 * Gets the executor service.
	 *
	 * @return the executor service
	 */
	public ThreadPoolExecutor getExecutorService() {
		return executorService;
	}
	
}
