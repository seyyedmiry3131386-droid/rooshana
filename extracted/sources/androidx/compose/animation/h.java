package androidx.compose.animation;

import defpackage.j52;
import defpackage.k22;
import defpackage.l08;
import defpackage.ny7;
import defpackage.qp2;
import defpackage.y97;
import defpackage.zq3;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final k22 a;
    public final j52 b;
    public final l08 c;
    public final ny7 d;

    public h(k22 k22Var, j52 j52Var, float f, ny7 ny7Var) {
        this.a = k22Var;
        this.b = j52Var;
        this.c = androidx.compose.runtime.g.d(f);
        this.d = ny7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(k22 k22Var, j52 j52Var) {
        this(k22Var, j52Var, 0.0f, new ny7(new qp2() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                long j = ((zq3) obj).a;
                long j2 = ((zq3) obj2).a;
                long j3 = 1;
                return y97.c0(0.0f, 400.0f, new zq3((j3 & 4294967295L) | (j3 << 32)), 1);
            }
        }));
        int i = a.b;
    }
}
