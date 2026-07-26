package defpackage;

import androidx.compose.runtime.i;

/* JADX INFO: loaded from: classes.dex */
public final class s01 extends i {
    public final /* synthetic */ int b = 1;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(bp2 bp2Var) {
        super(bp2Var);
        th0 th0Var = th0.t;
        this.c = th0Var;
    }

    @Override // androidx.compose.runtime.i
    public final um a(Object obj) {
        switch (this.b) {
            case 0:
                return new um(this, obj, obj == null, null, true);
            default:
                return new um(this, obj, obj == null, (t08) this.c, true);
        }
    }

    @Override // androidx.compose.runtime.i
    public a39 b() {
        switch (this.b) {
            case 0:
                return (t01) this.c;
            default:
                return super.b();
        }
    }

    public s01(dp2 dp2Var) {
        super(new v7(29));
        this.c = new t01(dp2Var);
    }
}
