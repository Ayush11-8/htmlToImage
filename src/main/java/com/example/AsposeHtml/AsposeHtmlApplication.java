package com.example.AsposeHtml;

//import com.aspose.html.HTMLDocument;
//import com.aspose.html.rendering.image.ImageFormat;
import org.jsoup.Jsoup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class AsposeHtmlApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(AsposeHtmlApplication.class, args);


//		File file = new File("index.html");
//		byte[] bytes = new byte[(int) file.length()];
			// file to bytes[]
//			byte[] bytes = Files.readAllBytes(Paths.get(filePath));

			// bytes[] to file
//			Path path = Paths.get("result.png");
			// create the object of ByteArrayInputStream class
			// and initialized it with the byte array.
//			ByteArrayInputStream inStreambj = new ByteArrayInputStream(bytes);

			// read image from byte array
//			BufferedImage newImage = ImageIO.read(inStreambj);

			// write output image
//			Files.write((Path)(newImage), bytes);
//			ImageIO.write(newImage, "jpg", new File("outputImage.jpg"));
//
//			System.out.println("Done");




		File inputFile = new File("document.html");
		Html2Image imageGenerator = new Html2Image();
		imageGenerator.getParser().load(inputFile);
		imageGenerator.getImageRenderer().setAutoHeight(false);
		imageGenerator.getImageRenderer().saveImage("/home/me/Temp/hello-world.png");


		// quality being compromised using JEditorPane
//		final int WIDTH = 1204;
//		final int HEIGHT = 768;
//
//			// open HTML page
//			JEditorPane editorPane = new JEditorPane();
//			editorPane.setEditable(false);
//			URL urlToPage = new File("document.html").toURI().toURL();
//			editorPane.setPage(urlToPage);
//			editorPane.setSize(WIDTH, HEIGHT);
//
//			// render the page
//			BufferedImage renderedImage = new BufferedImage(1204, 768, BufferedImage.TYPE_INT_RGB);
//			editorPane.print(renderedImage.getGraphics());
//
//			Graphics2D g2d = (Graphics2D) renderedImage.getGraphics();
//			g2d.setRenderingHint(
//					RenderingHints.KEY_TEXT_ANTIALIASING,
//					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
//			g2d.setRenderingHint(
//					RenderingHints.KEY_RENDERING,
//					RenderingHints.VALUE_RENDER_QUALITY);
//			g2d.dispose();
//			// write result to file
//			ImageIO.write(renderedImage, "PNG", new File("hello-world.png"));
		
		// Prepare an HTML code and save it to the file.  ASPOSE
//		String code = "<span>Hello</span> <span>World!!</span>";
//		try (FileWriter fileWriter = new FileWriter("document.html")) {
//			fileWriter.write(code);
//		}

// Initialize an HTML document from the html file
//		HTMLDocument document = new HTMLDocument("index.html");
//		try {
//			// Initialize ImageSaveOptions
//			com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(ImageFormat.Jpeg);
//
//			// Convert HTML to JPG
//			com.aspose.html.converters.Converter.convertHTML(document, options, "output.jpg");
//		} finally {
//			if (document != null) {
//				document.dispose();
//			}
//		}
	}

}
