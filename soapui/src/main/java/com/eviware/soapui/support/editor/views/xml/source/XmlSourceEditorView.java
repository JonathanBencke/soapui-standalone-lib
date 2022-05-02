/*
 * SoapUI, Copyright (C) 2004-2019 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent 
 * versions of the EUPL (the "Licence"); 
 * You may not use this work except in compliance with the Licence. 
 * You may obtain a copy of the Licence at: 
 * 
 * http://ec.europa.eu/idabc/eupl 
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is 
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either 
 * express or implied. See the Licence for the specific language governing permissions and limitations 
 * under the Licence. 
 */

package com.eviware.soapui.support.editor.views.xml.source;

import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.support.editor.views.AbstractXmlEditorView;
import com.eviware.soapui.support.editor.xml.XmlDocument;
import com.eviware.soapui.support.editor.xml.XmlEditor;


import javax.swing.JComponent;

/**
 * Default "XML" source editor view in SoapUI
 *
 * @author ole.matzura
 */

public class XmlSourceEditorView<T extends ModelItem> extends AbstractXmlEditorView<XmlDocument> {

	public XmlSourceEditorView(String title, XmlEditor<XmlDocument> xmlEditor, String viewId) {
		super(title, xmlEditor, viewId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean saveDocument(boolean validate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JComponent getComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEditable(boolean enabled) {
		// TODO Auto-generated method stub
		
	}
 
}
