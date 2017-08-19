package com.github.alexandrenavarro.visualgridlayoutbuilder;

/**
 * Created by anavarro on 20/02/17.
 */
public interface LayoutCstrVisualGridBuilder<L> extends RowCstrVisualGridBuilder<L> {

    RowCstrVisualGridBuilder<L> layoutCstr(final String alayoutCstr);
}
