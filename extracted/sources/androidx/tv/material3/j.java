package androidx.tv.material3;

import defpackage.ab5;
import defpackage.au1;
import defpackage.av;
import defpackage.bg0;
import defpackage.bp2;
import defpackage.cb0;
import defpackage.dp2;
import defpackage.eg0;
import defpackage.eq;
import defpackage.ex4;
import defpackage.fe0;
import defpackage.gg2;
import defpackage.gr3;
import defpackage.gu9;
import defpackage.hg2;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jz0;
import defpackage.kv0;
import defpackage.my6;
import defpackage.ng0;
import defpackage.o40;
import defpackage.o87;
import defpackage.ok4;
import defpackage.qc8;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.rj6;
import defpackage.rq4;
import defpackage.s01;
import defpackage.s08;
import defpackage.s7;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.u48;
import defpackage.u58;
import defpackage.um;
import defpackage.wb5;
import defpackage.xg9;
import defpackage.xr7;
import defpackage.xt2;
import defpackage.y97;
import defpackage.zk8;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final int[] a = {23, 66, 160};
    public static final s01 b = new s01(new bp2() { // from class: androidx.tv.material3.SurfaceImplKt$LocalAbsoluteTonalElevation$1
        @Override // defpackage.bp2
        public final Object invoke() {
            return new au1(0);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.tv.material3.SurfaceImplKt$SurfaceImpl$1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void a(final hx4 hx4Var, final boolean z, final xr7 xr7Var, final long j, final long j2, final float f, final fe0 fe0Var, final xt2 xt2Var, final float f2, final ab5 ab5Var, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i, final int i2) {
        hx4 hx4Var2;
        int i3;
        xr7 xr7Var2;
        int i4;
        ?? r9;
        ab5 ab5Var2;
        qz0 qz0Var2;
        qz0Var.c0(1092979258);
        if ((i & 6) == 0) {
            hx4Var2 = hx4Var;
            i3 = (qz0Var.f(hx4Var2) ? 4 : 2) | i;
        } else {
            hx4Var2 = hx4Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= qz0Var.g(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= qz0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            xr7Var2 = xr7Var;
            i3 |= qz0Var.f(xr7Var2) ? 2048 : 1024;
        } else {
            xr7Var2 = xr7Var;
        }
        int i5 = i3;
        if ((i & 24576) == 0) {
            i5 |= qz0Var.e(j) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 |= qz0Var.e(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= qz0Var.c(f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= qz0Var.f(fe0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= qz0Var.f(xt2Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= qz0Var.c(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (qz0Var.f(ab5Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= qz0Var.h(aVar) ? 32 : 16;
        }
        if ((i5 & 306783379) == 306783378 && (i4 & 19) == 18 && qz0Var.B()) {
            qz0Var.U();
            qz0Var2 = qz0Var;
        } else {
            qz0Var.b0(194341376);
            if (ab5Var == null) {
                qz0Var.b0(194342027);
                Object objM = qz0Var.M();
                if (objM == jz0.a) {
                    objM = o40.r(qz0Var);
                }
                ab5Var2 = (ab5) objM;
                r9 = 0;
                qz0Var.q(false);
            } else {
                r9 = 0;
                ab5Var2 = ab5Var;
            }
            qz0Var.q(r9);
            final wb5 wb5VarA = androidx.compose.foundation.interaction.a.a(ab5Var2, qz0Var, r9);
            wb5 wb5VarB = androidx.compose.foundation.interaction.a.b(ab5Var2, qz0Var, r9);
            boolean zBooleanValue = ((Boolean) wb5VarA.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) wb5VarB.getValue()).booleanValue();
            float f3 = 0.8f;
            if ((z || !zBooleanValue2) && (z || !zBooleanValue)) {
                f3 = z ? 1.0f : 0.6f;
            }
            final ab5 ab5Var3 = ab5Var2;
            final float f4 = f3;
            s01 s01Var = b;
            qz0 qz0Var3 = qz0Var;
            final hx4 hx4Var3 = hx4Var2;
            final xr7 xr7Var3 = xr7Var2;
            zk8.c(new um[]{e.a.a(new zu0(j2)), s01Var.a(new au1(((au1) qz0Var.j(s01Var)).a + f2))}, s7.h(qz0Var3, -2008391942, new qp2() { // from class: androidx.tv.material3.SurfaceImplKt$SurfaceImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    qz0 qz0Var4 = (qz0) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && qz0Var4.B()) {
                        qz0Var4.U();
                    } else {
                        int[] iArr = j.a;
                        u48 u48VarB = androidx.compose.animation.core.b.b(((Boolean) wb5VarA.getValue()).booleanValue() ? 0.5f : 0.0f, null, "zIndex", null, qz0Var4, 3072, 22);
                        long jB = j.b(j, ((au1) qz0Var4.j(j.b)).a, qz0Var4);
                        qz0Var4.b0(1720087802);
                        gr3 gr3Var = (gr3) androidx.compose.runtime.g.a(ab5Var3.a, new gg2(), qz0Var4).getValue();
                        int i6 = 300;
                        if (!(gr3Var instanceof gg2)) {
                            if (gr3Var instanceof hg2) {
                                i6 = 500;
                            } else if (gr3Var instanceof rj6) {
                                i6 = 120;
                            }
                        }
                        u48 u48VarB2 = androidx.compose.animation.core.b.b(f, y97.e0(i6, 0, qc8.a, 2), "tv-surface-scale", null, qz0Var4, 3072, 20);
                        hx4 hx4VarB = androidx.compose.ui.graphics.d.b(hx4Var3, ((Number) u48VarB2.getValue()).floatValue(), ((Number) u48VarB2.getValue()).floatValue(), 0.0f, 0.0f, null, 131068);
                        qz0Var4.q(false);
                        boolean z2 = defpackage.f.a;
                        qz0Var4.b0(-463445277);
                        xt2 xt2Var2 = xt2Var;
                        long j3 = xt2Var2.a;
                        float f5 = xt2Var2.b;
                        long jB2 = j.b(j3, f5, qz0Var4);
                        float fS = ((qj1) qz0Var4.j(androidx.compose.ui.platform.l.h)).S(f5);
                        dp2 dp2Var = androidx.compose.ui.platform.o.a;
                        final xr7 xr7Var4 = xr7Var3;
                        i iVar = new i(xr7Var4, fS, jB2, dp2Var);
                        qz0Var4.q(false);
                        hx4 hx4VarD = tt3.C(hx4VarB, z2, iVar).d(new xg9(((Number) u48VarB.getValue()).floatValue()));
                        fe0 fe0Var2 = fe0.d;
                        hx4 hx4VarF = rq4.f(tt3.C(hx4VarD, !js3.i(r4, fe0Var2), new h(xr7Var4, fe0Var, dp2Var)), jB, xr7Var4);
                        qz0Var4.b0(-1618655552);
                        final float f6 = f4;
                        boolean zC = qz0Var4.c(f6) | qz0Var4.f(xr7Var4);
                        Object objM2 = qz0Var4.M();
                        av avVar = jz0.a;
                        if (zC || objM2 == avVar) {
                            objM2 = new dp2() { // from class: androidx.tv.material3.SurfaceImplKt$SurfaceImpl$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.dp2
                                public final Object invoke(Object obj3) {
                                    o87 o87Var = (o87) obj3;
                                    o87Var.b(f6);
                                    o87Var.l(xr7Var4);
                                    o87Var.e(true);
                                    return tx8.a;
                                }
                            };
                            qz0Var4.l0(objM2);
                        }
                        qz0Var4.q(false);
                        hx4 hx4VarA = androidx.compose.ui.graphics.d.a(hx4VarF, (dp2) objM2);
                        qz0Var4.b0(733328855);
                        cb0 cb0Var = eq.c;
                        eg0 eg0VarE = bg0.e(cb0Var, true, qz0Var4, 48);
                        qz0Var4.b0(-1323940314);
                        int iB = ok4.B(qz0Var4);
                        j56 j56VarL = qz0Var4.l();
                        hz0.d0.getClass();
                        bp2 bp2Var = androidx.compose.ui.node.d.b;
                        androidx.compose.runtime.internal.a aVarE = androidx.compose.ui.layout.e.e(hx4VarA);
                        qz0Var4.e0();
                        if (qz0Var4.S) {
                            qz0Var4.k(bp2Var);
                        } else {
                            qz0Var4.o0();
                        }
                        qp2 qp2Var = androidx.compose.ui.node.d.f;
                        ia7.o(qz0Var4, qp2Var, eg0VarE);
                        qp2 qp2Var2 = androidx.compose.ui.node.d.e;
                        ia7.o(qz0Var4, qp2Var2, j56VarL);
                        qp2 qp2Var3 = androidx.compose.ui.node.d.g;
                        if (qz0Var4.S || !js3.i(qz0Var4.M(), Integer.valueOf(iB))) {
                            o40.C(iB, qz0Var4, iB, qp2Var3);
                        }
                        aVarE.a(new qy7(qz0Var4), qz0Var4, 0);
                        qz0Var4.b0(2058660585);
                        qz0Var4.b0(-900243014);
                        final boolean z3 = z;
                        boolean zG = qz0Var4.g(z3);
                        Object objM3 = qz0Var4.M();
                        if (zG || objM3 == avVar) {
                            objM3 = new dp2() { // from class: androidx.tv.material3.SurfaceImplKt$SurfaceImpl$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.dp2
                                public final Object invoke(Object obj3) {
                                    ((o87) obj3).b(!z3 ? 0.8f : 1.0f);
                                    return tx8.a;
                                }
                            };
                            qz0Var4.l0(objM3);
                        }
                        qz0Var4.q(false);
                        hx4 hx4VarA2 = androidx.compose.ui.graphics.d.a(ex4.b, (dp2) objM3);
                        qz0Var4.b0(733328855);
                        eg0 eg0VarE2 = bg0.e(cb0Var, false, qz0Var4, 0);
                        qz0Var4.b0(-1323940314);
                        int iB2 = ok4.B(qz0Var4);
                        j56 j56VarL2 = qz0Var4.l();
                        androidx.compose.runtime.internal.a aVarE2 = androidx.compose.ui.layout.e.e(hx4VarA2);
                        qz0Var4.e0();
                        if (qz0Var4.S) {
                            qz0Var4.k(bp2Var);
                        } else {
                            qz0Var4.o0();
                        }
                        ia7.o(qz0Var4, qp2Var, eg0VarE2);
                        ia7.o(qz0Var4, qp2Var2, j56VarL2);
                        if (qz0Var4.S || !js3.i(qz0Var4.M(), Integer.valueOf(iB2))) {
                            o40.C(iB2, qz0Var4, iB2, qp2Var3);
                        }
                        aVarE2.a(new qy7(qz0Var4), qz0Var4, 0);
                        qz0Var4.b0(2058660585);
                        aVar.a(ng0.a, qz0Var4, 6);
                        qz0Var4.q(false);
                        qz0Var4.q(true);
                        qz0Var4.q(false);
                        qz0Var4.q(false);
                        qz0Var4.q(false);
                        qz0Var4.q(true);
                        qz0Var4.q(false);
                        qz0Var4.q(false);
                    }
                    return tx8.a;
                }
            }), qz0Var3, 48);
            qz0Var2 = qz0Var3;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.tv.material3.SurfaceImplKt$SurfaceImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(i | 1);
                    int iW2 = hs9.W(i2);
                    j.a(hx4Var, z, xr7Var, j, j2, f, fe0Var, xt2Var, f2, ab5Var, aVar, (qz0) obj, iW, iW2);
                    return tx8.a;
                }
            };
        }
    }

    public static final long b(long j, float f, qz0 qz0Var) {
        qz0Var.b0(-1026053668);
        u58 u58Var = d.a;
        if (zu0.c(j, ((kv0) qz0Var.j(u58Var)).c())) {
            kv0 kv0Var = (kv0) qz0Var.j(u58Var);
            j = au1.b(f, (float) 0) ? kv0Var.c() : gu9.l(zu0.b(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, ((zu0) ((s08) kv0Var.t).getValue()).a), kv0Var.c());
        }
        qz0Var.q(false);
        return j;
    }
}
