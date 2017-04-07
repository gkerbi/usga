package at.usga.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import at.usga.OsterhaseFactory;
import at.usga.OsterhasenSchiessen;

public class XmlHandler {
	
	public static void saveData(String fileName, OsterhasenSchiessen osterhasenschiessen) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(fileName));
		resource.getContents().add(osterhasenschiessen);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static OsterhasenSchiessen loadData(String fileName) throws FileNotFoundException, IOException {
		XMIResourceImpl resource = new XMIResourceImpl();
		File source = new File(fileName);
		if(!source.exists()) {
			return OsterhaseFactory.eINSTANCE.createOsterhasenSchiessen();
		}
		resource.load(new FileInputStream(source), new HashMap<Object, Object>());
		OsterhasenSchiessen schiessen = (OsterhasenSchiessen) resource.getContents().get(0);
		return schiessen;
	}
}
