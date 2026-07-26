package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ig8 extends yf8 {
    public final String b;
    public final int c;
    public final dp2 d;

    public ig8(Object obj, String str, int i, dp2 dp2Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = dp2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return dw1.q(sb, this.c, ')');
    }
}
