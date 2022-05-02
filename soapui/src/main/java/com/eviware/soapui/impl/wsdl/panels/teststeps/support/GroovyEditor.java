package com.eviware.soapui.impl.wsdl.panels.teststeps.support;

import com.eviware.soapui.support.components.JEditorStatusBar.JEditorStatusBarTarget;

import javax.swing.JPanel;
import javax.swing.event.CaretListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GroovyEditor extends JPanel implements JEditorStatusBarTarget, PropertyChangeListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCaretListener(CaretListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getCaretPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeCaretListener(CaretListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLineStartOffset(int line) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLineOfOffset(int offset) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
