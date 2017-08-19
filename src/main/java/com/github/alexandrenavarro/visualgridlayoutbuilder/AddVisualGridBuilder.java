package com.github.alexandrenavarro.visualgridlayoutbuilder;

/**
 * Created by anavarro on 20/02/17.
 */
public interface AddVisualGridBuilder<C, L> extends LayoutCstrVisualGridBuilder<L> {

    AddVisualGridBuilder<C, L> add(final C component);

}
