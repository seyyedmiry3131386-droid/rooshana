package defpackage;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.c;
import androidx.compose.runtime.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class tg7 implements bh7 {
    public static final bn6 j = new bn6(new yd7(1), new vd7(13), 5);
    public final n08 a;
    public float f;
    public final ck1 h;
    public final ck1 i;
    public final n08 b = g.e(0);
    public final n08 c = g.e(0);
    public final ab5 d = new ab5();
    public final n08 e = g.e(Integer.MAX_VALUE);
    public final c g = new c(new a67(5, this));

    public tg7(int i) {
        this.a = g.e(i);
        final int i2 = 0;
        this.h = g.c(new bp2(this) { // from class: sg7
            public final /* synthetic */ tg7 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        tg7 tg7Var = this.b;
                        return Boolean.valueOf(tg7Var.f() < tg7Var.e.h());
                    default:
                        return Boolean.valueOf(this.b.f() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = g.c(new bp2(this) { // from class: sg7
            public final /* synthetic */ tg7 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        tg7 tg7Var = this.b;
                        return Boolean.valueOf(tg7Var.f() < tg7Var.e.h());
                    default:
                        return Boolean.valueOf(this.b.f() > 0);
                }
            }
        });
    }

    @Override // defpackage.bh7
    public final boolean a() {
        return this.g.a();
    }

    @Override // defpackage.bh7
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final Object c(MutatePriority mutatePriority, qp2 qp2Var, ContinuationImpl continuationImpl) {
        Object objC = this.g.c(mutatePriority, qp2Var, continuationImpl);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    @Override // defpackage.bh7
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.bh7
    public final float e(float f) {
        return this.g.e(f);
    }

    public final int f() {
        return this.a.h();
    }
}
