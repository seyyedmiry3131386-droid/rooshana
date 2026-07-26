package com.microsoft.clarity.models.display.commands;

import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DrawViewAnnotation extends DisplayCommand {
    private final int id;
    private final boolean isClipRectSource;

    public /* synthetic */ DrawViewAnnotation(int i, boolean z, int i2, yd1 yd1Var) {
        this(i, (i2 & 2) != 0 ? true : z);
    }

    public final int getId() {
        return this.id;
    }

    public final boolean isClipRectSource() {
        return this.isClipRectSource;
    }

    public DrawViewAnnotation(int i, boolean z) {
        this.id = i;
        this.isClipRectSource = z;
    }
}
