package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cx7 extends zp3 {
    public Object b;

    @Override // defpackage.zp3
    public final Object a(ry0 ry0Var) {
        Object obj = this.b;
        if (obj == null) {
            return super.a(ry0Var);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // defpackage.zp3
    public final Object b(ry0 ry0Var) {
        synchronized (this) {
            if (this.b == null) {
                this.b = a(ry0Var);
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
