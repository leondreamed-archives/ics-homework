public class Main {
	public static void main(String[] args) {
		Sketch sketch = new Sketch();
		while (true) {
			if (sketch.draw() == false) return;
		}
	}
}
