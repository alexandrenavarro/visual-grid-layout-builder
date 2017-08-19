package com.github.alexandrenavarro.visualgridlayoutbuilder.core;

import com.github.alexandrenavarro.visualgridlayoutbuilder.AddCtrlRowVisualGridBuilder;
import com.github.alexandrenavarro.visualgridlayoutbuilder.ColumnCstrVisualGridBuilder;
import com.github.alexandrenavarro.visualgridlayoutbuilder.LayoutCstrVisualGridBuilder;
import com.github.alexandrenavarro.visualgridlayoutbuilder.RowCstrVisualGridBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anavarro on 22/02/17.
 */
public abstract class AbstractVisualGridBuilder<L> implements LayoutCstrVisualGridBuilder<L>, RowCstrVisualGridBuilder<L>, ColumnCstrVisualGridBuilder<L>, AddCtrlRowVisualGridBuilder<L> {

    protected final List<String> ctrlRowList = new ArrayList<String>();
    protected final List<String> specificRowCstrList = new ArrayList<>();
    protected String layoutCstr = "";
    protected String columnCstr = "";
    protected String rowCstr = "";

    public LayoutCstrVisualGridBuilder<L> layoutCstr(final String aLayoutCstr) {
        if (aLayoutCstr != null) {
            this.layoutCstr = aLayoutCstr;
        }
        return this;
    }

    public RowCstrVisualGridBuilder<L> rowCstr(final String aRowCstr) {
        if (aRowCstr != null) {
            this.rowCstr = aRowCstr;
        }
        return this;
    }

    public AddCtrlRowVisualGridBuilder<L> columnCstr(final String aColumnCstr) {
        if (aColumnCstr != null) {
            this.columnCstr = aColumnCstr;
        }
        return this;
    }

    public AddCtrlRowVisualGridBuilder<L> addCtrlRow(final String aCtrlRow) {
        return addCtrlRow(aCtrlRow, "");
    }

    public AddCtrlRowVisualGridBuilder<L> addCtrlRow(final String aCtrlRow, final String specificRowCstr) {
        if (aCtrlRow != null) {
            ctrlRowList.add(aCtrlRow);
            if (specificRowCstr != null) {
                specificRowCstrList.add(specificRowCstr);
            } else {
                specificRowCstrList.add("");
            }
        } else {
            throw new IllegalArgumentException("ctrlRow must not be null");
        }
        return this;
    }
}
