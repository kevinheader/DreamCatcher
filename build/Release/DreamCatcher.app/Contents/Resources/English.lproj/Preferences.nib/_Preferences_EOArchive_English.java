// _Preferences_EOArchive_English.java
// Generated by EnterpriseObjects palette at Thursday, April 20, 2006 10:54:13 PM US/Pacific

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.eointerface.swing.EOTable._EOTableColumn;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _Preferences_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    DSFileTypeDrag _nsCustomView0;
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOTable _nsTableView0;
    com.webobjects.eointerface.swing.EOTable._EOTableColumn _eoTableColumn0;
    com.webobjects.eointerface.swing.EOTextField _nsTextField0, _nsTextField1, _nsTextField2, _nsTextField3, _nsTextField4, _nsTextField5, _nsTextField6;
    com.webobjects.foundation.NSNumberFormatter _nsNumberFormatter0;
    javax.swing.JButton _nsButton0, _nsButton1, _nsButton2, _nsButton3;
    javax.swing.JComboBox _popup0, _popup1, _popup2;
    javax.swing.JPanel _nsView0;

    public _Preferences_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsNumberFormatter0 = (com.webobjects.foundation.NSNumberFormatter)_registered(new com.webobjects.foundation.NSNumberFormatter("0;-0"), "");
        _nsTextField6 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2211");
        _nsTextField5 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField23");
        _nsTextField4 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField221");
        _nsTextField3 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField22");
        _nsTextField2 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField21");
        _nsTextField1 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField2");
        _nsButton3 = (javax.swing.JButton)_registered(new javax.swing.JButton("+"), "NSButton3");
        _nsButton2 = (javax.swing.JButton)_registered(new javax.swing.JButton("-"), "NSButton31");
        _nsButton1 = (javax.swing.JButton)_registered(new javax.swing.JButton("Save Changes"), "NSButton");
        _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Cancel"), "NSButton1");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "parserChooser")) != null)) {
            _popup2 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JComboBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_popup2");
        } else {
            _popup2 = (javax.swing.JComboBox)_registered(new javax.swing.JComboBox(), "NSPopUpButton11");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "scriptHandlerWell")) != null)) {
            _nsCustomView0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (DSFileTypeDrag)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsCustomView0");
        } else {
            _nsCustomView0 = (DSFileTypeDrag)_registered(new DSFileTypeDrag(), "View");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "encodingChooser")) != null)) {
            _popup1 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JComboBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_popup1");
        } else {
            _popup1 = (javax.swing.JComboBox)_registered(new javax.swing.JComboBox(), "NSPopUpButton1");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "languageChooser")) != null)) {
            _popup0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JComboBox)replacement;
            _replacedObjects.setObjectForKey(replacement, "_popup0");
        } else {
            _popup0 = (javax.swing.JComboBox)_registered(new javax.swing.JComboBox(), "NSPopUpButton");
        }

        _eoTableColumn0 = (com.webobjects.eointerface.swing.EOTable._EOTableColumn)_registered(new com.webobjects.eointerface.swing.EOTable._EOTableColumn(), "NSTableColumn");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "addedWordsList")) != null)) {
            _nsTableView0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTable)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTableView0");
        } else {
            _nsTableView0 = (com.webobjects.eointerface.swing.EOTable)_registered(new com.webobjects.eointerface.swing.EOTable(), "NSTableView");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "maxSpiderDepthField")) != null)) {
            _nsTextField0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOTextField)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsTextField0");
        } else {
            _nsTextField0 = (com.webobjects.eointerface.swing.EOTextField)_registered(new com.webobjects.eointerface.swing.EOTextField(), "NSTextField");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Window");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();
        _nsButton3.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "addWord", _nsButton3), ""));
        _nsButton2.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "removeWord", _nsButton2), ""));
        _nsButton1.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "apply", _nsButton1), ""));
        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "cancel", _nsButton0), ""));

        if (_replacedObjects.objectForKey("_popup2") == null) {
            _popup2.setModel(new javax.swing.DefaultComboBoxModel());
            _popup2.addItem("DreamCatcher");
            _popup2.addItem("Tidy");
        }

        if (_replacedObjects.objectForKey("_popup2") == null) {
            _connect(_owner(), _popup2, "parserChooser");
        }

        if (_replacedObjects.objectForKey("_nsCustomView0") == null) {
            _connect(_owner(), _nsCustomView0, "scriptHandlerWell");
        }

        if (_replacedObjects.objectForKey("_popup1") == null) {
            _popup1.setModel(new javax.swing.DefaultComboBoxModel());
            _popup1.addItem("Item1");
            _popup1.addItem("Item2");
            _popup1.addItem("Item3");
        }

        if (_replacedObjects.objectForKey("_popup1") == null) {
            _connect(_owner(), _popup1, "encodingChooser");
        }

        if (_replacedObjects.objectForKey("_popup0") == null) {
            _popup0.setModel(new javax.swing.DefaultComboBoxModel());
            _popup0.addItem("Item1");
            _popup0.addItem("Item2");
            _popup0.addItem("Item3");
        }

        if (_replacedObjects.objectForKey("_popup0") == null) {
            _connect(_owner(), _popup0, "languageChooser");
        }

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _connect(_nsTableView0, _owner(), "dataSource");
        }

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _connect(_owner(), _nsTableView0, "addedWordsList");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }

        if (_replacedObjects.objectForKey("_nsTextField0") == null) {
            _connect(_owner(), _nsTextField0, "maxSpiderDepthField");
        }
    }

    protected void _init() {
        super._init();
        _nsNumberFormatter0.setMinimum(new java.math.BigDecimal("0"));
        _setFontForComponent(_nsTextField6, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField6.setEditable(false);
        _nsTextField6.setOpaque(false);
        _nsTextField6.setText("HTML Parser:");
        _nsTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField6.setSelectable(false);
        _nsTextField6.setEnabled(true);
        _nsTextField6.setBorder(null);
        _setFontForComponent(_nsTextField5, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField5.setEditable(false);
        _nsTextField5.setOpaque(false);
        _nsTextField5.setText("Drag an Applescript into the well on the right to handle spelling corrections.\n");
        _nsTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        _nsTextField5.setSelectable(false);
        _nsTextField5.setEnabled(true);
        _nsTextField5.setBorder(null);
        _setFontForComponent(_nsTextField4, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField4.setEditable(false);
        _nsTextField4.setOpaque(false);
        _nsTextField4.setText("Default character encoding:\n\n:");
        _nsTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField4.setSelectable(false);
        _nsTextField4.setEnabled(true);
        _nsTextField4.setBorder(null);
        _setFontForComponent(_nsTextField3, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField3.setEditable(false);
        _nsTextField3.setOpaque(false);
        _nsTextField3.setText("Spellchecker language:\n");
        _nsTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField3.setSelectable(false);
        _nsTextField3.setEnabled(true);
        _nsTextField3.setBorder(null);
        _setFontForComponent(_nsTextField2, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField2.setEditable(false);
        _nsTextField2.setOpaque(false);
        _nsTextField2.setText("DreamCatcher dictionary:\n\n");
        _nsTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField2.setSelectable(false);
        _nsTextField2.setEnabled(true);
        _nsTextField2.setBorder(null);
        _setFontForComponent(_nsTextField1, "Lucida Grande", 13, Font.PLAIN);
        _nsTextField1.setEditable(false);
        _nsTextField1.setOpaque(false);
        _nsTextField1.setText("Maximum depth to follow links:\n:\n:");
        _nsTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        _nsTextField1.setSelectable(false);
        _nsTextField1.setEnabled(true);
        _nsTextField1.setBorder(null);
        _setFontForComponent(_nsButton3, "Lucida Grande", 11, Font.PLAIN + Font.BOLD);
        _nsButton3.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_nsButton2, "Lucida Grande", 11, Font.PLAIN + Font.BOLD);
        _nsButton2.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_nsButton1, "Lucida Grande", 13, Font.PLAIN);
        _nsButton1.setMargin(new Insets(0, 2, 0, 2));
        _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
        _nsButton0.setMargin(new Insets(0, 2, 0, 2));

        if (_replacedObjects.objectForKey("_popup2") == null) {
            _setFontForComponent(_popup2, "Lucida Grande", 11, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_popup1") == null) {
            _setFontForComponent(_popup1, "Lucida Grande", 11, Font.PLAIN);
        }

        if (_replacedObjects.objectForKey("_popup0") == null) {
            _setFontForComponent(_popup0, "Lucida Grande", 11, Font.PLAIN);
        }

        _eoTableColumn0.setMinWidth(40);
        _eoTableColumn0.setMaxWidth(1000);
        _eoTableColumn0.setPreferredWidth(259);
        _eoTableColumn0.setWidth(259);
        _eoTableColumn0.setResizable(true);
        _eoTableColumn0.setHeaderValue("");
        if ((_eoTableColumn0.getHeaderRenderer() != null)) {
        	((DefaultTableCellRenderer)(_eoTableColumn0.getHeaderRenderer())).setHorizontalAlignment(javax.swing.JTextField.LEFT);
        }

        if (_replacedObjects.objectForKey("_nsTableView0") == null) {
            _nsTableView0.table().addColumn(_eoTableColumn0);
            _setFontForComponent(_nsTableView0.table().getTableHeader(), "Lucida Grande", 11, Font.PLAIN);
            _nsTableView0.table().setRowHeight(20);
        }

        if (_replacedObjects.objectForKey("_nsTextField0") == null) {
            _setFontForComponent(_nsTextField0, "Lucida Grande", 13, Font.PLAIN);
            _nsTextField0.setEditable(true);
            _nsTextField0.setOpaque(true);
            _nsTextField0.setText("");
            _nsTextField0.setHorizontalAlignment(javax.swing.JTextField.LEFT);
            _nsTextField0.setSelectable(true);
            _nsTextField0.setEnabled(true);
        }

        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _nsTextField0.setSize(57, 22);
        _nsTextField0.setLocation(221, 14);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField0);
        _nsTextField1.setSize(205, 17);
        _nsTextField1.setLocation(11, 16);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField1);
        _nsTextField2.setSize(446, 17);
        _nsTextField2.setLocation(11, 199);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField2, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField2);
        _nsTableView0.setSize(264, 129);
        _nsTableView0.setLocation(13, 226);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTableView0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTableView0);
        _nsButton3.setSize(25, 25);
        _nsButton3.setLocation(254, 198);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton3, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton3);
        _nsButton2.setSize(25, 25);
        _nsButton2.setLocation(226, 198);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton2, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton2);
        _nsButton1.setSize(120, 26);
        _nsButton1.setLocation(161, 454);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton1, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton1);
        _nsButton0.setSize(75, 26);
        _nsButton0.setLocation(79, 454);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);
        _nsTextField3.setSize(158, 17);
        _nsTextField3.setLocation(11, 45);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField3, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField3);
        _popup0.setSize(263, 22);
        _popup0.setLocation(15, 69);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_popup0, EOViewLayout.MinYMargin);
        _nsView0.add(_popup0);
        _nsTextField4.setSize(197, 17);
        _nsTextField4.setLocation(11, 95);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField4, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField4);
        _popup1.setSize(263, 22);
        _popup1.setLocation(15, 119);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_popup1, EOViewLayout.MinYMargin);
        _nsView0.add(_popup1);
        _nsCustomView0.setSize(97, 73);
        _nsCustomView0.setLocation(180, 363);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsCustomView0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsCustomView0);
        _nsTextField5.setSize(165, 73);
        _nsTextField5.setLocation(11, 363);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField5, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField5);
        _nsTextField6.setSize(197, 17);
        _nsTextField6.setLocation(11, 145);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsTextField6, EOViewLayout.MinYMargin);
        _nsView0.add(_nsTextField6);
        _popup2.setSize(263, 22);
        _popup2.setLocation(15, 169);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_popup2, EOViewLayout.MinYMargin);
        _nsView0.add(_popup2);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(290, 490);
            _eoFrame0.setTitle("DreamCatcher Preferences");
            _eoFrame0.setLocation(184, 442);
            _eoFrame0.setSize(290, 490);
        }
    }
}
