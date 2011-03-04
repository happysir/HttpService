package com.novoda.lib.httpservice.provider;

import static com.novoda.lib.httpservice.utils.Log.Provider.v;
import static com.novoda.lib.httpservice.utils.Log.Provider.verboseLoggingEnabled;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;

import android.net.Uri;

import com.novoda.lib.httpservice.actor.Actor;

public class LocalProvider implements Provider {
	
	public HashMap<Uri, String> map = new HashMap<Uri, String>();
	
	
	public LocalProvider(Uri uri, String content) {
		map.put(uri, content);
	}
	
	public void add(Uri uri, String content) {
		map.put(uri, content);
	}
	
	public void add(String url, String content) {
		map.put(Uri.parse(url), content);
	}
	
	public InputStream getContent(Uri uri) {
		if(map.containsKey(uri)) {			
			return new ByteArrayInputStream(map.get(uri).getBytes());
		} else {
			if(verboseLoggingEnabled()) {
				v("There is no resource registered for the local provider for url : " + uri);
			}
			return null;
		}
	}
	
	@Override
	public void execute(Actor actor) {
		//TODO
//		InputStream content = getContent(req.getUri());
//		if(content == null) {
//			eventBus.fireOnThrowable(req, new Throwable("Content not found"));
//			throw new ProviderException("Content not found");
//		}
//		Response response = new Response();
//		response.setIntentWrapper(req);
//		response.setContent(content);
//		eventBus.fireOnContentReceived(response);
	}

}
