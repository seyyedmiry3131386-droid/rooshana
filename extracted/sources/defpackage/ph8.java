package defpackage;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.g;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ph8 implements bh7 {
    public final /* synthetic */ bh7 a;
    public final ck1 b;
    public final ck1 c;

    public ph8(bh7 bh7Var, final qh8 qh8Var) {
        this.a = bh7Var;
        final int i = 0;
        this.b = g.c(new bp2() { // from class: oh8
            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qh8 qh8Var2 = qh8Var;
                        return Boolean.valueOf(qh8Var2.a() < qh8Var2.b.h());
                    default:
                        return Boolean.valueOf(qh8Var.a() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = g.c(new bp2() { // from class: oh8
            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qh8 qh8Var2 = qh8Var;
                        return Boolean.valueOf(qh8Var2.a() < qh8Var2.b.h());
                    default:
                        return Boolean.valueOf(qh8Var.a() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.bh7
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.bh7
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final Object c(MutatePriority mutatePriority, qp2 qp2Var, ContinuationImpl continuationImpl) {
        return this.a.c(mutatePriority, qp2Var, continuationImpl);
    }

    @Override // defpackage.bh7
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final float e(float f) {
        return this.a.e(f);
    }
}
