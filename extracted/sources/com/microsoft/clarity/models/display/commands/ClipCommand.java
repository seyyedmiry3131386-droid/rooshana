package com.microsoft.clarity.models.display.commands;

import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ClipCommand extends DisplayCommand {
    public static final Companion Companion = new Companion(null);
    private final boolean antiAlias;
    private final int op;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        /* JADX INFO: renamed from: extractAntiAliasFromFlags-WZ4Q5Ns, reason: not valid java name */
        public final boolean m17extractAntiAliasFromFlagsWZ4Q5Ns(int i) {
            return ((i >>> 4) & 1) != 0;
        }

        /* JADX INFO: renamed from: extractClipOpFromFlags-WZ4Q5Ns, reason: not valid java name */
        public final int m18extractClipOpFromFlagsWZ4Q5Ns(int i) {
            return i & 15;
        }

        private Companion() {
        }
    }

    public ClipCommand(int i, boolean z) {
        this.op = i;
        this.antiAlias = z;
    }

    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    public final int getOp() {
        return this.op;
    }
}
