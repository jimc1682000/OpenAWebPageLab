package tw.studio.jimmy.lab;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenWebPagePrintTest1 {

	public static void main(String[] args) {
		try {
			new OpenWebPagePrintTest1()
					.openUriOnDefaultBrowser("http://www.google.com");
		} catch (IOException | URISyntaxException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void openUriOnDefaultBrowser(String strUri) throws IOException,
			URISyntaxException, InterruptedException {
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			if (desktop.isSupported(Desktop.Action.BROWSE)) {
				URI oURL = new URI(strUri);
				desktop.browse(oURL);
				Thread.sleep(15000); // 1000 milliseconds is one second.
				// Terminate Chrome Browser by Command
				// Runtime.getRuntime().exec(
				// "cmd.exe /C taskkill /f /im chrome.exe");
				System.out.println("Pretend to Delete Chrome");
			} else {
				System.out.println("desktop not supported @@");
			}
		}
	}
}
