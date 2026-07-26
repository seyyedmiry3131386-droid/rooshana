package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ri2 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public /* synthetic */ ri2(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public abstract void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var);

    public ge b(vl1 vl1Var) {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String strD = g27.a(getClass()).d();
                return strD == null ? "" : strD;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri2(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.a = 1;
    }
}
