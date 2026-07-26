package androidx.compose.animation;

import defpackage.ab0;
import defpackage.al;
import defpackage.bb0;
import defpackage.cb0;
import defpackage.dp2;
import defpackage.eq;
import defpackage.j52;
import defpackage.j82;
import defpackage.js3;
import defpackage.k22;
import defpackage.kr8;
import defpackage.lb7;
import defpackage.lq8;
import defpackage.lt8;
import defpackage.mt8;
import defpackage.o38;
import defpackage.rq3;
import defpackage.sc2;
import defpackage.uy7;
import defpackage.wo0;
import defpackage.y97;
import defpackage.yh0;
import defpackage.zd7;
import defpackage.zq3;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final mt8 a = new mt8(new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            long j = ((lq8) obj).a;
            return new al(lq8.b(j), lq8.c(j));
        }
    }, new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            al alVar = (al) obj;
            return new lq8(lb7.a(alVar.a, alVar.b));
        }
    });
    public static final o38 b = y97.c0(0.0f, 400.0f, null, 5);
    public static final o38 c = y97.c0(0.0f, 400.0f, null, 5);
    public static final o38 d;
    public static final o38 e;

    static {
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        d = y97.c0(0.0f, 400.0f, new rq3(j2), 1);
        e = y97.c0(0.0f, 400.0f, new zq3(j2), 1);
    }

    public static k22 a(lt8 lt8Var, int i) {
        ab0 ab0Var = eq.q;
        Object obj = yh0.g;
        sc2 sc2VarC0 = lt8Var;
        if ((i & 1) != 0) {
            long j = 1;
            sc2VarC0 = y97.c0(0.0f, 400.0f, new zq3((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            obj = ab0Var;
        }
        cb0 cb0Var = js3.i(obj, eq.o) ? eq.f : js3.i(obj, ab0Var) ? eq.h : eq.g;
        final EnterExitTransitionKt$expandHorizontally$1 enterExitTransitionKt$expandHorizontally$1 = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                ((Number) obj2).intValue();
                return 0;
            }
        };
        return b(cb0Var, sc2VarC0, new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                long j2 = ((zq3) obj2).a;
                return new zq3((((long) ((Number) enterExitTransitionKt$expandHorizontally$1.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32) | (4294967295L & ((long) ((int) (j2 & 4294967295L)))));
            }
        });
    }

    public static final k22 b(cb0 cb0Var, sc2 sc2Var, dp2 dp2Var) {
        return new k22(new kr8((j82) null, (uy7) null, new wo0(cb0Var, sc2Var, dp2Var), (zd7) null, (LinkedHashMap) null, 123));
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
    public static k22 c(lt8 lt8Var, int i) {
        sc2 sc2VarC0 = lt8Var;
        if ((i & 1) != 0) {
            long j = 1;
            sc2VarC0 = y97.c0(0.0f, 400.0f, new zq3((j & 4294967295L) | (j << 32)), 1);
        }
        bb0 bb0Var = eq.n;
        cb0 cb0Var = bb0Var.equals(eq.l) ? eq.d : bb0Var.equals(bb0Var) ? eq.j : eq.g;
        final EnterExitTransitionKt$expandVertically$1 enterExitTransitionKt$expandVertically$1 = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return 0;
            }
        };
        return b(cb0Var, sc2VarC0, new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                long j2 = ((zq3) obj).a;
                return new zq3((((long) ((int) (j2 >> 32))) << 32) | (4294967295L & ((long) ((Number) enterExitTransitionKt$expandVertically$1.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue())));
            }
        });
    }

    public static k22 d(sc2 sc2Var, int i) {
        if ((i & 1) != 0) {
            sc2Var = y97.c0(0.0f, 400.0f, null, 5);
        }
        return new k22(new kr8(new j82(sc2Var), (uy7) null, (wo0) null, (zd7) null, (LinkedHashMap) null, 126));
    }

    public static j52 e(lt8 lt8Var, int i) {
        sc2 sc2VarC0 = lt8Var;
        if ((i & 1) != 0) {
            sc2VarC0 = y97.c0(0.0f, 400.0f, null, 5);
        }
        return new j52(new kr8(new j82(sc2VarC0), (uy7) null, (wo0) null, (zd7) null, (LinkedHashMap) null, 126));
    }

    public static k22 f(lt8 lt8Var) {
        return new k22(new kr8((j82) null, (uy7) null, (wo0) null, new zd7(0.92f, lq8.b, lt8Var), (LinkedHashMap) null, 119));
    }

    public static j52 g(lt8 lt8Var, int i) {
        ab0 ab0Var = eq.q;
        Object obj = yh0.g;
        sc2 sc2VarC0 = lt8Var;
        if ((i & 1) != 0) {
            long j = 1;
            sc2VarC0 = y97.c0(0.0f, 400.0f, new zq3((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            obj = ab0Var;
        }
        cb0 cb0Var = js3.i(obj, eq.o) ? eq.f : js3.i(obj, ab0Var) ? eq.h : eq.g;
        final EnterExitTransitionKt$shrinkHorizontally$1 enterExitTransitionKt$shrinkHorizontally$1 = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                ((Number) obj2).intValue();
                return 0;
            }
        };
        return h(cb0Var, sc2VarC0, new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                long j2 = ((zq3) obj2).a;
                return new zq3((((long) ((Number) enterExitTransitionKt$shrinkHorizontally$1.invoke(Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32) | (4294967295L & ((long) ((int) (j2 & 4294967295L)))));
            }
        });
    }

    public static final j52 h(cb0 cb0Var, sc2 sc2Var, dp2 dp2Var) {
        return new j52(new kr8((j82) null, (uy7) null, new wo0(cb0Var, sc2Var, dp2Var), (zd7) null, (LinkedHashMap) null, 123));
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
    public static j52 i(lt8 lt8Var, int i) {
        sc2 sc2VarC0 = lt8Var;
        if ((i & 1) != 0) {
            long j = 1;
            sc2VarC0 = y97.c0(0.0f, 400.0f, new zq3((j & 4294967295L) | (j << 32)), 1);
        }
        bb0 bb0Var = eq.n;
        cb0 cb0Var = bb0Var.equals(eq.l) ? eq.d : bb0Var.equals(bb0Var) ? eq.j : eq.g;
        final EnterExitTransitionKt$shrinkVertically$1 enterExitTransitionKt$shrinkVertically$1 = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return 0;
            }
        };
        return h(cb0Var, sc2VarC0, new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                long j2 = ((zq3) obj).a;
                return new zq3((((long) ((int) (j2 >> 32))) << 32) | (4294967295L & ((long) ((Number) enterExitTransitionKt$shrinkVertically$1.invoke(Integer.valueOf((int) (j2 & 4294967295L)))).intValue())));
            }
        });
    }

    public static k22 j(lt8 lt8Var) {
        final EnterExitTransitionKt$slideInVertically$1 enterExitTransitionKt$slideInVertically$1 = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            }
        };
        return new k22(new kr8((j82) null, new uy7(new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return new rq3((((long) 0) << 32) | (4294967295L & ((long) ((Number) enterExitTransitionKt$slideInVertically$1.invoke(Integer.valueOf((int) (((zq3) obj).a & 4294967295L)))).intValue())));
            }
        }, lt8Var), (wo0) null, (zd7) null, (LinkedHashMap) null, 125));
    }
}
