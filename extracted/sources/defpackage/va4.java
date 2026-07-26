package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class va4 extends k79 {
    public static final xl2 d = new xl2(1);
    public final m28 b = new m28(0);
    public boolean c = false;

    @Override // defpackage.k79
    public final void d() {
        m28 m28Var = this.b;
        int iF = m28Var.f();
        for (int i = 0; i < iF; i++) {
            ta4 ta4Var = (ta4) m28Var.g(i);
            fj9 fj9Var = ta4Var.l;
            fj9Var.a();
            fj9Var.c = true;
            ua4 ua4Var = ta4Var.n;
            if (ua4Var != null) {
                ta4Var.g(ua4Var);
            }
            ta4 ta4Var2 = fj9Var.a;
            if (ta4Var2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (ta4Var2 != ta4Var) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            fj9Var.a = null;
            if (ua4Var != null) {
                boolean z = ua4Var.b;
            }
            fj9Var.d = true;
            fj9Var.b = false;
            fj9Var.c = false;
            fj9Var.e = false;
        }
        int i2 = m28Var.d;
        Object[] objArr = m28Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        m28Var.d = 0;
        m28Var.a = false;
    }
}
