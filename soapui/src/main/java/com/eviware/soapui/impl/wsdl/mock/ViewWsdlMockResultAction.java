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

package com.eviware.soapui.impl.wsdl.mock;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.impl.wsdl.panels.request.StringToStringsMapTableModel;
import com.eviware.soapui.support.UISupport;
import com.eviware.soapui.support.swing.JTableFactory;
import com.eviware.soapui.support.xml.SyntaxEditorUtil;
import com.eviware.soapui.support.xml.XmlUtils;
import com.eviware.soapui.ui.desktop.DesktopPanel;
import com.eviware.soapui.ui.support.DefaultDesktopPanel;
import com.jgoodies.forms.builder.ButtonBarBuilder;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Date;

/**
 * Shows a desktop-panel with the MessageExchange for a WsdlMockResult
 *
 * @author Ole.Matzura
 */

public class ViewWsdlMockResultAction extends AbstractAction {
    private final WsdlMockResult result;
    private DefaultDesktopPanel desktopPanel;

    public ViewWsdlMockResultAction(WsdlMockResult result) {
        super("Show Results");

        this.result = result;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (result.isDiscarded()) {
                UISupport.showInfoMessage("Request has been discarded..");
            } else {
                UISupport.showDesktopPanel(buildFrame());
            }
        } catch (Exception ex) {
            SoapUI.logError(ex);
        }
    }

    private DesktopPanel buildFrame() {
        if (desktopPanel == null) {
            String title = "Mock Result for [" + result.getMockResponse().getName() + "]";
            desktopPanel = new DefaultDesktopPanel(title, title, buildContent());
        }

        return desktopPanel;
    }

    private JComponent buildContent() {
        JTabbedPane messageTabs = new JTabbedPane();
        messageTabs.setPreferredSize(new Dimension(500, 400));

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(UISupport.createTabPanel(messageTabs, true), BorderLayout.CENTER);

        ButtonBarBuilder builder = new ButtonBarBuilder();
        builder.addFixed(new JLabel("Mock Request handled at " + new Date(result.getTimestamp()) + ", time taken: "
                + result.getTimeTaken() + "ms"));
        builder.addGlue();
        builder.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        panel.add(builder.getPanel(), BorderLayout.PAGE_START);

        return panel;
    }

}
