package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wg4 implements bv4 {
    public bv4[] a;

    @Override // defpackage.bv4
    public final hv6 a(Class cls) {
        for (bv4 bv4Var : this.a) {
            if (bv4Var.b(cls)) {
                return bv4Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.bv4
    public final boolean b(Class cls) {
        for (bv4 bv4Var : this.a) {
            if (bv4Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
