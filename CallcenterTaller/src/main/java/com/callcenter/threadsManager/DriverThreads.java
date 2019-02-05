package com.callcenter.threadsManager;

import com.callcenter.manager.Dispatcher;
import com.callcenter.util.Call;

/**
 * DriverThreads.
 *
 * @author Cindy Sarahi Lopez Argueta <mailto:csargueta@stefanini.com />
 * @version 
 * @see 
 * @since 02-05-2019 11:40:36 AM 2019
 */
public class DriverThreads implements Runnable{
	
	/** Attribute that determine call. */
	private final Call call;

	/**
	 * Instantiates a new worker thread.
	 *
	 * @param call the call
	 */
	public DriverThreads(Call call) {
		super();
		this.call = call;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

		Dispatcher.dispatchCall(call);

	}

}
