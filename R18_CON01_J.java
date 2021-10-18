final class ControlledStop implements Runnable {
	private boolean done = false;

	@Override public void run() {
		while (!done) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Reset interrupted status
				Thread.currentThread().interrupt(); }
		}
	}

	public void shutdown() {
		this.done = true;
	}
}