package com.github.alexandrenavarro.visualgridlayoutbuilder;

/**
 * Created by anavarro on 20/02/17.
 */
public interface VisualGridBuilder<C, L> extends AddVisualGridBuilder<C, L>, LayoutCstrVisualGridBuilder<L>, RowCstrVisualGridBuilder<L>, ColumnCstrVisualGridBuilder<L>, AddCtrlRowVisualGridBuilder<L>, BuildVisualGridBuilder<L>   {

}
