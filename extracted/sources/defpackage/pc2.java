package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pc2 implements ho7 {
    public final ho7 a;
    public final boolean b;
    public final dp2 c;

    public pc2(ho7 ho7Var, boolean z, dp2 dp2Var) {
        js3.p(dp2Var, "predicate");
        this.a = ho7Var;
        this.b = z;
        this.c = dp2Var;
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        return new oc2(this);
    }
}
