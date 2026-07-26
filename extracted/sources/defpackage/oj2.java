package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oj2 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public oj2(int i, int i2, String str, String str2) {
        js3.p(str, "from");
        js3.p(str2, "to");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oj2 oj2Var = (oj2) obj;
        js3.p(oj2Var, "other");
        int i = this.a - oj2Var.a;
        return i == 0 ? this.b - oj2Var.b : i;
    }
}
