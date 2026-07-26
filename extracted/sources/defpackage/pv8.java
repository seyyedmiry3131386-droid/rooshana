package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pv8 implements qv8 {
    public final Object a;
    public final boolean b;

    public pv8(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    @Override // defpackage.qv8
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return this.a;
    }
}
