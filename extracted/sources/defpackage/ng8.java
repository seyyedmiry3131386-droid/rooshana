package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class ng8 extends yf8 {
    public final TextClassification b;
    public final int c;

    public ng8(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.b = textClassification;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.b);
        sb.append(", index=");
        return dw1.q(sb, this.c, ')');
    }
}
