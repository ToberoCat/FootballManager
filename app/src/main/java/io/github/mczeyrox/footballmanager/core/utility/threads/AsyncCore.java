package io.github.mczeyrox.footballmanager.core.utility.threads;

import android.util.Log;

import io.github.mczeyrox.footballmanager.core.utility.callbacks.Callback;

public class AsyncCore implements Runnable {

    private Callback callback;

    public AsyncCore(Callback callback) {
        this.callback = callback;
    }

    public static AsyncTask RunAsync(Callback callback) {
        AsyncTask task = new AsyncTask(callback);
        return task.run();
    }

    @Override
    public void run() {
        callback.Callback();
    }

    public static class AsyncTask {
        private Thread thread;

        public AsyncTask(Callback callback) {
            this.thread = new Thread(new AsyncCore(callback));
        }

        public AsyncTask await() {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Log.d("ggg", e.getMessage());
                e.printStackTrace();
            }
            return this;
        }

        protected AsyncTask run() {
            thread.start();
            return this;
        }
    }
}
