package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w96 {
    public static final w96 c = new w96(0, false);
    public final boolean a;
    public final int b;

    public w96() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w96)) {
            return false;
        }
        w96 w96Var = (w96) obj;
        return this.a == w96Var.a && this.b == w96Var.b;
    }

    public final int hashCode() {
        return ((this.a ? 1231 : 1237) * 31) + this.b;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) n02.a(this.b)) + ')';
    }

    public w96(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
