package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc8 implements rb7 {
    public final cc8 a;
    public final String b;
    public boolean c;

    public hc8(cc8 cc8Var, String str) {
        this.a = cc8Var;
        this.b = str;
    }

    @Override // defpackage.rb7
    public boolean a0() {
        return getLong(0) != 0;
    }

    public final void b() {
        if (this.c) {
            ln2.i(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.rb7
    public void o() {
        b();
    }

    @Override // defpackage.rb7
    public void reset() {
        b();
    }
}
