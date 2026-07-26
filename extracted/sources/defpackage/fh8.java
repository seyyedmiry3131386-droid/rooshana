package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh8 implements iv0, zp2 {
    public final /* synthetic */ bp2 a;

    public fh8(bp2 bp2Var) {
        this.a = bp2Var;
    }

    @Override // defpackage.iv0
    public final /* synthetic */ long a() {
        return ((zu0) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iv0) || !(obj instanceof zp2)) {
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
