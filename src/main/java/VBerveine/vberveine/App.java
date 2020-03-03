package VBerveine.vberveine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.json.JsonWriter;
import com.thoughtworks.xstream.io.xml.CompactWriter;

import io.proleap.vb6.asg.metamodel.Program;
import io.proleap.vb6.asg.params.VbParserParams;
import io.proleap.vb6.asg.params.impl.VbParserParamsImpl;
import io.proleap.vb6.asg.runner.impl.VbParserRunnerImpl;

public class App {

	public static void main(String[] args) throws IOException {
		final File[] inputFile = new File("C:\\Users\\santiago\\Downloads\\exports\\exports\\")
				.listFiles(f -> !f.isDirectory());
		final Program program = parseFileString(Arrays.asList(inputFile));
		
		
		XStream xstream = new XStream(new JettisonMappedXmlDriver());
		
	
		
		
		
		xstream.setMode(XStream.ID_REFERENCES);

		FileOutputStream fos = null;

		fos = new FileOutputStream("C:\\Users\\santiago\\Downloads\\exports\\stuff.json");
		byte[] bytes = xstream.toXML(program).getBytes("UTF-8");
		fos.write(bytes);
		fos.flush();
		fos.close();
		
		/*
		 * FileWriter writer = new
		 * FileWriter("C:\\Users\\santiago\\Downloads\\exports\\stuff.json"); Gson gson
		 * = new Gson();
		 * 
		 * gson.toJson(program, writer);
		 */
		final io.proleap.vb6.asg.metamodel.Module module = program.getClazzModule("Form_fBuAccueil");
	}

	private static Program parseFileString(final List<File> inputFiles) {
		final VbParserParams parameters = new VbParserParamsImpl();
		parameters.setCharset(Charset.forName("windows-1252"));

		try {
			return new VbParserRunnerImpl().analyzeFiles(inputFiles, parameters);
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}
}
