package novoda.lib.httpservice.service.executor;

import static novoda.lib.httpservice.util.HttpServiceLog.Core.d;
import static novoda.lib.httpservice.util.HttpServiceLog.Core.debugIsEnable;

import java.util.concurrent.Callable;

import novoda.lib.httpservice.exception.HandlerException;
import novoda.lib.httpservice.provider.Provider;
import novoda.lib.httpservice.request.Request;
import novoda.lib.httpservice.request.Response;

/**
 * Wrapper for the callable.
 * 
 * @author luigi@novoda.com
 *
 */
public class CallableWrapper implements Callable<Response> {
	
	private Provider provider;
	
	private Request request;
	
	public CallableWrapper(Provider provider, Request request) {
		if(provider == null) {
			throw new HandlerException("Configuration problem! A Provider must be specified!");
		}
		this.provider = provider;
		if(request == null) {
			throw new HandlerException("Configuration problem! Request must be specified!");
		}
		this.request = request;
	}
	
	@Override
	public Response call() throws Exception {
		if(debugIsEnable()) {
			d("Executing request : " + request);
		}
		Response response = provider.execute(request);
		if(debugIsEnable()) {
			d("Response received");
		}
		return response;
	}

}