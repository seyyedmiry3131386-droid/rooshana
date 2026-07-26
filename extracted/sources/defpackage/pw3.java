package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class pw3 extends nw3 {
    public final cw3 j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw3(pu3 pu3Var, cw3 cw3Var) {
        super(pu3Var, cw3Var, (String) null, 12);
        js3.p(pu3Var, "json");
        this.j = cw3Var;
        List listP0 = a.P0(cw3Var.a.keySet());
        this.k = listP0;
        this.l = listP0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.nw3, defpackage.u0
    public final String Q(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.nw3, defpackage.u0
    public final kv3 S() {
        return this.j;
    }

    @Override // defpackage.nw3
    /* JADX INFO: renamed from: X */
    public final cw3 S() {
        return this.j;
    }

    @Override // defpackage.nw3, defpackage.u0, defpackage.tz0
    public final void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
    }

    @Override // defpackage.nw3, defpackage.u0
    public final kv3 d(String str) {
        js3.p(str, "tag");
        return this.m % 2 == 0 ? mv3.b(str) : (kv3) b.J(this.j, str);
    }

    @Override // defpackage.nw3, defpackage.tz0
    public final int i(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
