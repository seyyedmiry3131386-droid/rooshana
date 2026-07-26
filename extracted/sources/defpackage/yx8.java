package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yx8 extends y61 {
    public static final yx8 c = new yx8();

    @Override // defpackage.y61
    public final void C0(w61 w61Var, Runnable runnable) {
        ug1.d.c.d(runnable, true, true);
    }

    @Override // defpackage.y61
    public final y61 F0(int i) {
        bt2.r(i);
        return i >= if8.d ? this : super.F0(i);
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        ug1.d.c.d(runnable, true, false);
    }

    @Override // defpackage.y61
    public final String toString() {
        return "Dispatchers.IO";
    }
}
