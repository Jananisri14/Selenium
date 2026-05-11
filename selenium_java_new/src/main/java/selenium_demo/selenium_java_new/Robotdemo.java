package selenium_demo.selenium_java_new;

import java.awt.AWTException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robotdemo {

	public static void main(String[] args) throws AWTException {

		Robot rb = new Robot();

		StringSelection str = new StringSelection(
				"C:\\Users\\janan\\Downloads\\Resume(1).pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}

