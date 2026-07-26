package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm2 implements ir5, zp2 {
    public final /* synthetic */ vt a;

    public gm2(vt vtVar) {
        this.a = vtVar;
    }

    @Override // defpackage.ir5
    public final /* synthetic */ void a(Object obj) throws Throwable {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ir5) || !(obj instanceof zp2)) {
            return false;
        }
        return this.a.equals(((zp2) obj).getFunctionDelegate());
    }

    @Override // defpackage.zp2
    public final np2 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
