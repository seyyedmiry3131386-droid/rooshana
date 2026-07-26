package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ct3 extends ow7 {
    public final /* synthetic */ String f;
    public final /* synthetic */ dp3 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct3(String str, dp3 dp3Var, int i) {
        super(2);
        this.f = str;
        this.g = dp3Var;
        this.h = i;
    }

    @Override // defpackage.ow7
    public final Object K(Object[] objArr) {
        String str = this.f;
        if (str == null || f88.n0(str)) {
            return zs3.d;
        }
        dp3 dp3Var = this.g;
        if (dp3Var.l(str) == null) {
            return zs3.c;
        }
        String[] packagesForUid = dp3Var.c.getPackageManager().getPackagesForUid(this.h);
        if (packagesForUid == null || !ew.t0(packagesForUid, str)) {
            return new at3(packagesForUid != null ? ew.X0(packagesForUid) : null);
        }
        return zs3.b;
    }
}
