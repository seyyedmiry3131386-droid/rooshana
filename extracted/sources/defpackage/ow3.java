package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ow3 extends u0 {
    public final uu3 f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow3(pu3 pu3Var, uu3 uu3Var) {
        super(pu3Var, null);
        js3.p(pu3Var, "json");
        this.f = uu3Var;
        this.g = uu3Var.a.size();
        this.h = -1;
    }

    @Override // defpackage.u0
    public final String Q(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return String.valueOf(i);
    }

    @Override // defpackage.u0
    public final kv3 S() {
        return this.f;
    }

    @Override // defpackage.u0
    public final kv3 d(String str) {
        js3.p(str, "tag");
        return (kv3) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.tz0
    public final int i(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
