package androidx.compose.ui.draw;

import androidx.compose.ui.node.i;
import defpackage.a12;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.o40;
import defpackage.qj1;
import defpackage.ql4;
import defpackage.sh0;
import defpackage.tx8;
import defpackage.v25;

/* JADX INFO: loaded from: classes.dex */
public final class b implements qj1 {
    public sh0 a = a12.a;
    public ql4 b;

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.getDensity().O();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    public final ql4 a(final v25 v25Var) {
        return b(new dp2() { // from class: androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) throws Exception {
                i iVar = (i) obj;
                v25Var.invoke(iVar);
                iVar.a();
                return tx8.a;
            }
        });
    }

    public final ql4 b(dp2 dp2Var) {
        ql4 ql4Var = new ql4(17, false);
        ql4Var.b = dp2Var;
        this.b = ql4Var;
        return ql4Var;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }
}
