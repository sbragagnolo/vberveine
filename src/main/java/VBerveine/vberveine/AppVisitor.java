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

public class AppVisitor {

	public static void main(String[] args) throws IOException {
		final File[] inputFile = new File("C:\\Users\\santiago\\Downloads\\exports\\exports\\")
				.listFiles(f -> !f.isDirectory());
		final Program program = parseFileString(Arrays.asList(inputFile));
		
		io.proleap.vb6.asg.visitor.VBASGVisitor visitor =  new VBASGVisitorFamixExtractor();
		
		program.acceptVisitor(visitor);

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
