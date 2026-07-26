package com.microsoft.clarity.models.display.commands;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PaintableCommand extends DisplayCommand {
    private Integer paintIndex;

    public PaintableCommand(Integer num) {
        this.paintIndex = num;
    }

    public final Integer getPaintIndex() {
        return this.paintIndex;
    }

    public final void setPaintIndex(Integer num) {
        this.paintIndex = num;
    }
}
