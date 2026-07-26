package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k02 implements j02 {
    public final int a;
    public int b = -1;
    public int c = -1;

    public k02(int i) {
        this.a = i;
    }

    @Override // defpackage.j02
    public final boolean g(CharSequence charSequence, int i, int i2, lv8 lv8Var) {
        int i3 = this.a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.b = i;
        this.c = i2;
        return false;
    }

    @Override // defpackage.j02
    public final Object a() {
        return this;
    }
}
