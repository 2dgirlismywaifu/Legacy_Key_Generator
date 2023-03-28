/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.windows95generatekey;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class DefaultContextMenu extends JPopupMenu
{
    private final Clipboard clipboard;

    private final UndoManager undoManager;
    
    private JMenuItem undo;
    private JMenuItem redo;
    private JMenuItem cut;
    private JMenuItem copy;
    private JMenuItem paste;
    private JMenuItem delete;
    private JMenuItem selectAll;

    private JTextComponent textComponent;

    public DefaultContextMenu()
    {
        undoManager = new UndoManager();
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        addPopupMenuItems();
    }

    private void addPopupMenuItems()
    {
        undo = new JMenuItem("Undo");
        undo.setEnabled(false);
        undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        undo.addActionListener(event -> undoManager.undo());
        add(undo);

        redo = new JMenuItem("Redo");
        redo.setEnabled(false);
        redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        redo.addActionListener(event -> undoManager.redo());
        add(redo);

        add(new JSeparator());

        cut = new JMenuItem("Cut");
        cut.setEnabled(false);
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        cut.addActionListener(event -> textComponent.cut());
        add(cut);

        copy = new JMenuItem("Copy");
        copy.setEnabled(false);
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        copy.addActionListener(event -> textComponent.copy());
        add(copy);

        paste = new JMenuItem("Paste");
        paste.setEnabled(false);
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        paste.addActionListener(event -> textComponent.paste());
        add(paste);

        delete = new JMenuItem("Delete");
        delete.setEnabled(false);
        delete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        delete.addActionListener(event -> textComponent.replaceSelection(""));
        add(delete);

        add(new JSeparator());

        selectAll = new JMenuItem("Select All");
        selectAll.setEnabled(false);
        selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        selectAll.addActionListener(event -> textComponent.selectAll());
        add(selectAll);
    }

    private void addTo(JTextComponent textComponent)
    {
        textComponent.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent pressedEvent)
            {
                if ((pressedEvent.getKeyCode() == KeyEvent.VK_Z)
                        && ((pressedEvent.getModifiersEx() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0))
                {
                    if (undoManager.canUndo())
                    {
                        undoManager.undo();
                    }
                }

                if ((pressedEvent.getKeyCode() == KeyEvent.VK_Y)
                        && ((pressedEvent.getModifiersEx() & Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()) != 0))
                {
                    if (undoManager.canRedo())
                    {
                        undoManager.redo();
                    }
                }
            }
        });

        textComponent.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent releasedEvent)
            {
                handleContextMenu(releasedEvent);
            }

            @Override
            public void mouseReleased(MouseEvent releasedEvent)
            {
                handleContextMenu(releasedEvent);
            }
        });

        textComponent.getDocument().addUndoableEditListener(event -> undoManager.addEdit(event.getEdit()));
    }

    private void handleContextMenu(MouseEvent releasedEvent)
    {
        if (releasedEvent.getButton() == MouseEvent.BUTTON3)
        {
            processClick(releasedEvent);
        }
    }

    private void processClick(MouseEvent event)
    {
        textComponent = (JTextComponent) event.getSource();
        textComponent.requestFocus();

        boolean enableUndo = undoManager.canUndo();
        boolean enableRedo = undoManager.canRedo();
        boolean enableCut = false;
        boolean enableCopy = false;
        boolean enablePaste = false;
        boolean enableDelete = false;
        boolean enableSelectAll = false;

        String selectedText = textComponent.getSelectedText();
        String text = textComponent.getText();

        if (text != null)
        {
            if (text.length() > 0)
            {
                enableSelectAll = true;
            }
        }

        if (selectedText != null)
        {
            if (selectedText.length() > 0)
            {
                enableCut = true;
                enableCopy = true;
                enableDelete = true;
            }
        }

        if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor) && textComponent.isEnabled())
        {
            enablePaste = true;
        }

        undo.setEnabled(enableUndo);
        redo.setEnabled(enableRedo);
        cut.setEnabled(enableCut);
        copy.setEnabled(enableCopy);
        paste.setEnabled(enablePaste);
        delete.setEnabled(enableDelete);
        selectAll.setEnabled(enableSelectAll);

        // Shows the popup menu
        show(textComponent, event.getX(), event.getY());
    }

    public static void addDefaultContextMenu(JTextComponent component)
    {
        DefaultContextMenu defaultContextMenu = new DefaultContextMenu();
        defaultContextMenu.addTo(component);
    }
}
