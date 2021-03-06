package com.novoda.httpservice.util;

public class Log {
	
	//Default
	private static final String TAG = "httpservice";
	
	private static boolean isLoggable(String tag, int  level) {
	    try {
	        return android.util.Log.isLoggable(tag, level);
	    } catch (UnsatisfiedLinkError e) {
	        return false;
	    }
	}
	
	public static final boolean verboseLoggingEnabled() {
		return isLoggable(TAG, android.util.Log.VERBOSE);
	}
	
	public static final boolean infoLoggingEnabled() {
		return isLoggable(TAG, android.util.Log.INFO);
	}
	
	public static final boolean errorLoggingEnabled() {
		return isLoggable(TAG, android.util.Log.ERROR);
	}
	
	public static final void e(String msg) {
		android.util.Log.e(TAG, msg);
	}
	
	public static final void e(String msg, Throwable t) {
		android.util.Log.e(TAG, msg, t);
	}
	
	public static final void w(String msg, Throwable t) {
		android.util.Log.w(TAG, msg, t);
	}
	
	public static final void v(String msg) {
		android.util.Log.v(TAG, msg);
	}
	
	public static final void i(String msg) {
		android.util.Log.i(TAG, msg);
	}
	
	public static class Provider {
		
		private static final String TAG = "httpservice-provider";
		
		public static final boolean verboseLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.VERBOSE);
		}
		
		public static final boolean errorLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.ERROR);
		}
		
		public static final boolean warnLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.WARN);
		}
		
		public static final void v(String msg) {
			android.util.Log.v(TAG, msg);
		}
		
		public static final void w(String msg) {
			android.util.Log.w(TAG, msg);
		}
		
		public static final void e(String msg) {
			android.util.Log.e(TAG, msg);
		}
		
		public static final void e(String msg, Throwable t) {
			android.util.Log.e(TAG, msg, t);
		}
	}
	
	public static class Processor {
	    
		private static final String TAG = "httpservice-processor";
		
		public static final boolean verboseLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.VERBOSE);
		}
		
		public static final boolean infoLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.INFO);
		}
		
		public static final boolean errorLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.ERROR);
		}
		
		public static final void e(String msg) {
			android.util.Log.e(TAG, msg);
		}
		
		public static final void e(String msg, Throwable t) {
			android.util.Log.e(TAG, msg, t);
		}
		
		public static final void w(String msg, Throwable t) {
			android.util.Log.w(TAG, msg, t);
		}
		
		public static final void v(String msg) {
			android.util.Log.v(TAG, msg);
		}
		
		public static final void i(String msg) {
			android.util.Log.i(TAG, msg);
		}
	}
	
	public static class Bus {
		
		private static final String TAG = "httpservice-bus";
				
		public static final boolean verboseLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.VERBOSE);
		}
		
		public static final boolean infoLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.INFO);
		}
		
		public static final boolean errorLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.ERROR);
		}
		
		public static final boolean warnLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.WARN);
		}
		
		public static final void e(String msg) {
			android.util.Log.e(TAG, msg);
		}
		
		public static final void e(String msg, Throwable t) {
			android.util.Log.e(TAG, msg, t);
		}
		
		public static final void w(String msg) {
			android.util.Log.w(TAG, msg);
		}
		
		public static final void v(String msg) {
			android.util.Log.v(TAG, msg);
		}
		
		public static final void i(String msg) {
			android.util.Log.i(TAG, msg);
		}
	}
	
	public static class Registry {
		
		private static final String TAG = "httpservice-registry";
				
		public static final boolean verboseLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.VERBOSE);
		}
		
		public static final void v(String msg) {
			android.util.Log.v(TAG, msg);
		}
	}
	
	public static class Con {
		
		private static final String TAG = "httpservice-con";
				
		public static final boolean verboseLoggingEnabled() {
			return isLoggable(TAG, android.util.Log.VERBOSE);
		}
		
		public static final void v(String msg) {
			android.util.Log.v(TAG, msg);
		}
	}
}