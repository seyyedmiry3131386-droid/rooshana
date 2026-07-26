package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vq8 implements ho7 {
    public final ho7 a;
    public final dp2 b;

    public vq8(ho7 ho7Var, dp2 dp2Var) {
        this.a = ho7Var;
        this.b = dp2Var;
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        return new uq8(this);
    }
}
