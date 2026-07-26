package androidx.compose.animation;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a96;
import defpackage.b96;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.dr8;
import defpackage.el4;
import defpackage.fs3;
import defpackage.js3;
import defpackage.ny7;
import defpackage.oj;
import defpackage.qd;
import defpackage.sc2;
import defpackage.tx8;
import defpackage.u48;
import defpackage.wb5;
import defpackage.y97;
import defpackage.yk4;
import defpackage.yq8;
import defpackage.zq3;
import defpackage.zq8;

/* JADX INFO: loaded from: classes.dex */
public final class d extends fs3 {
    public zq8 p;
    public wb5 q;
    public oj r;
    public long s;

    @Override // defpackage.fs3, defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        final long j2;
        final b96 b96VarT = yk4Var.t(j);
        if (el4Var.Q()) {
            j2 = (((long) b96VarT.a) << 32) | (((long) b96VarT.b) & 4294967295L);
        } else {
            zq8 zq8Var = this.p;
            if (zq8Var == null) {
                j2 = (((long) b96VarT.a) << 32) | (((long) b96VarT.b) & 4294967295L);
                this.s = j2;
            } else {
                final long j3 = (((long) b96VarT.b) & 4294967295L) | (((long) b96VarT.a) << 32);
                yq8 yq8VarA = zq8Var.a(new dp2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        long j4;
                        sc2 sc2Var;
                        dr8 dr8Var = (dr8) obj;
                        Object objB = dr8Var.b();
                        d dVar = this.g;
                        if (js3.i(objB, dVar.r.b())) {
                            j4 = zq3.b(dVar.s, a.a) ? j3 : dVar.s;
                        } else {
                            u48 u48Var = (u48) dVar.r.d.g(dr8Var.b());
                            j4 = u48Var != null ? ((zq3) u48Var.getValue()).a : 0L;
                        }
                        u48 u48Var2 = (u48) dVar.r.d.g(dr8Var.c());
                        long j5 = u48Var2 != null ? ((zq3) u48Var2.getValue()).a : 0L;
                        ny7 ny7Var = (ny7) dVar.q.getValue();
                        return (ny7Var == null || (sc2Var = (sc2) ny7Var.a.invoke(new zq3(j4), new zq3(j5))) == null) ? y97.c0(0.0f, 400.0f, null, 5) : sc2Var;
                    }
                }, new dp2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        long j4;
                        d dVar = this.g;
                        if (js3.i(obj, dVar.r.b())) {
                            j4 = zq3.b(dVar.s, a.a) ? j3 : dVar.s;
                        } else {
                            u48 u48Var = (u48) dVar.r.d.g(obj);
                            j4 = u48Var != null ? ((zq3) u48Var.getValue()).a : 0L;
                        }
                        return new zq3(j4);
                    }
                });
                this.r.getClass();
                j2 = ((zq3) yq8VarA.getValue()).a;
                this.s = ((zq3) yq8VarA.getValue()).a;
            }
        }
        return el4Var.D((int) (j2 >> 32), (int) (4294967295L & j2), kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                qd qdVar = this.g.r.b;
                b96 b96Var = b96VarT;
                a96.i((a96) obj, b96Var, qdVar.a((((long) b96Var.b) & 4294967295L) | (((long) b96Var.a) << 32), j2, LayoutDirection.a));
                return tx8.a;
            }
        });
    }

    @Override // defpackage.gx4
    public final void w0() {
        this.s = a.a;
    }
}
