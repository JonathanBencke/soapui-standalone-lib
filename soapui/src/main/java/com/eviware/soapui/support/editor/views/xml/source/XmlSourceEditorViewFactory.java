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

import com.eviware.soapui.impl.rest.RestRequest;
import com.eviware.soapui.impl.rest.RestRequestInterface;
import com.eviware.soapui.impl.rest.mock.RestMockResponse;
import com.eviware.soapui.impl.support.http.HttpRequestInterface;
import com.eviware.soapui.impl.wadl.support.WadlValidator;
import com.eviware.soapui.impl.wsdl.WsdlOperation;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlRequest;
import com.eviware.soapui.impl.wsdl.actions.mockresponse.AddWsaHeadersToMockResponseAction;
import com.eviware.soapui.impl.wsdl.actions.mockresponse.ApplyOutgoingWSSToMockResponseAction;
import com.eviware.soapui.impl.wsdl.actions.mockresponse.RemoveAllOutgoingWSSFromMockResponseAction;
import com.eviware.soapui.impl.wsdl.actions.mockresponse.RemoveWsaHeadersFromMockResponseAction;
import com.eviware.soapui.impl.wsdl.actions.request.AddWSSUsernameTokenAction;
import com.eviware.soapui.impl.wsdl.actions.request.AddWSTimestampAction;
import com.eviware.soapui.impl.wsdl.actions.request.AddWsaHeadersToRequestAction;
import com.eviware.soapui.impl.wsdl.actions.request.ApplyOutgoingWSSToRequestAction;
import com.eviware.soapui.impl.wsdl.actions.request.RemoveAllOutgoingWSSFromRequestAction;
import com.eviware.soapui.impl.wsdl.actions.request.RemoveWsaHeadersFromRequestAction;
import com.eviware.soapui.impl.wsdl.mock.WsdlMockResponse;
import com.eviware.soapui.impl.wsdl.mock.WsdlMockResult;
import com.eviware.soapui.impl.wsdl.panels.mockoperation.WsdlMockResponseMessageExchange;
import com.eviware.soapui.impl.wsdl.panels.mockoperation.WsdlMockResultMessageExchange;
import com.eviware.soapui.impl.wsdl.support.MessageExchangeModelItem;
import com.eviware.soapui.impl.wsdl.support.wsdl.WsdlValidator;
import com.eviware.soapui.impl.wsdl.support.wss.DefaultWssContainer;
import com.eviware.soapui.impl.wsdl.support.wss.OutgoingWss;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestRunContext;
import com.eviware.soapui.impl.wsdl.teststeps.AMFRequestTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.JdbcRequestTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.RestResponseMessageExchange;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlResponseMessageExchange;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestRequest;
import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.model.testsuite.AssertionError;
import com.eviware.soapui.support.editor.Editor;
import com.eviware.soapui.support.editor.EditorView;
import com.eviware.soapui.support.editor.registry.RequestEditorViewFactory;
import com.eviware.soapui.support.editor.registry.ResponseEditorViewFactory;
import com.eviware.soapui.support.editor.xml.XmlDocument;
import com.eviware.soapui.support.editor.xml.XmlEditor;
import com.eviware.soapui.support.editor.xml.XmlEditorView;
import com.eviware.soapui.support.editor.xml.support.ValidationError;
import com.eviware.soapui.support.propertyexpansion.PropertyExpansionPopupListener;

import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.util.List;

/**
 * Factory for default "XML" source editor view in SoapUI
 *
 * @author ole.matzura
 */

public class XmlSourceEditorViewFactory implements ResponseEditorViewFactory, RequestEditorViewFactory {

	@Override
	public String getViewId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EditorView<?> createRequestEditorView(Editor<?> editor, ModelItem modelItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EditorView<?> createResponseEditorView(Editor<?> editor, ModelItem modelItem) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
