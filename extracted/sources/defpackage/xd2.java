package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class xd2 implements ho7 {
    public final ho7 a;
    public final dp2 b;
    public final vd7 c;

    public xd2(ho7 ho7Var, dp2 dp2Var, vd7 vd7Var) {
        this.a = ho7Var;
        this.b = dp2Var;
        this.c = vd7Var;
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        return new oc2(this);
    }
}
