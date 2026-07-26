package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class wf8 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public wf8(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf8)) {
            return false;
        }
        wf8 wf8Var = (wf8) obj;
        return js3.i(this.a, wf8Var.a) && zi8.c(this.b, wf8Var.b) && js3.i(this.c, wf8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((zi8.i(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) zi8.j(this.b)) + ", textClassification=" + this.c + ')';
    }
}
