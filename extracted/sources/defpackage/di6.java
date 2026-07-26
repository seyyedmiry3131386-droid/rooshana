package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di6 extends ci6 {
    public final Object c;

    public di6(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.ci6, defpackage.bi6
    public final boolean d(Object obj) {
        boolean zD;
        js3.p(obj, "instance");
        synchronized (this.c) {
            zD = super.d(obj);
        }
        return zD;
    }

    @Override // defpackage.ci6, defpackage.bi6
    public final Object e() {
        Object objE;
        synchronized (this.c) {
            objE = super.e();
        }
        return objE;
    }
}
