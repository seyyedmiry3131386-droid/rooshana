package com.microsoft.clarity.models.display.commands;

import com.microsoft.clarity.models.display.paints.Color4f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DrawImageBase extends PaintableCommand {
    private Integer imageIndex;
    private Color4f maskedColor;
    private Integer maskedHeight;
    private Integer maskedWidth;

    public DrawImageBase(Integer num, Integer num2) {
        super(num2);
        this.imageIndex = num;
    }

    public final Integer getImageIndex() {
        return this.imageIndex;
    }

    public final Color4f getMaskedColor() {
        return this.maskedColor;
    }

    public final Integer getMaskedHeight() {
        return this.maskedHeight;
    }

    public final Integer getMaskedWidth() {
        return this.maskedWidth;
    }

    public final void setImageIndex(Integer num) {
        this.imageIndex = num;
    }

    public final void setMaskedColor(Color4f color4f) {
        this.maskedColor = color4f;
    }

    public final void setMaskedHeight(Integer num) {
        this.maskedHeight = num;
    }

    public final void setMaskedWidth(Integer num) {
        this.maskedWidth = num;
    }
}
