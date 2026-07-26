package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xg4 implements cv4 {
    public cv4[] a;

    @Override // defpackage.cv4
    public final iv6 a(Class cls) {
        for (cv4 cv4Var : this.a) {
            if (cv4Var.b(cls)) {
                return cv4Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.cv4
    public final boolean b(Class cls) {
        for (cv4 cv4Var : this.a) {
            if (cv4Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
