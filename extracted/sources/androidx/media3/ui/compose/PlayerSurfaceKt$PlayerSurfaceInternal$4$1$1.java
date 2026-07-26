package androidx.media3.ui.compose;

import android.view.View;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.gb6;
import defpackage.qp2;
import defpackage.sg4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1", f = "PlayerSurface.kt", l = {114}, m = "invokeSuspend")
final class PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ gb6 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ qp2 d;
    public final /* synthetic */ qp2 e;

    /* JADX INFO: renamed from: androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1$2, reason: invalid class name */
    @tb1(c = "androidx.media3.ui.compose.PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1$2", f = "PlayerSurface.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ View a;
        public final /* synthetic */ qp2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(View view, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.a = view;
            this.b = qp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            View view = this.a;
            Object tag = view.getTag();
            gb6 gb6Var = tag instanceof gb6 ? (gb6) tag : null;
            if (gb6Var != null) {
                if (gb6Var.f0(27)) {
                    this.b.invoke(gb6Var, view);
                }
                view.setTag(null);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1(gb6 gb6Var, View view, qp2 qp2Var, qp2 qp2Var2, g51 g51Var) {
        super(2, g51Var);
        this.b = gb6Var;
        this.c = view;
        this.d = qp2Var;
        this.e = qp2Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerSurfaceKt$PlayerSurfaceInternal$4$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            qp2 qp2Var = this.e;
            View view = this.c;
            gb6 gb6Var = this.b;
            if (gb6Var != null) {
                Object tag = view.getTag();
                gb6 gb6Var2 = tag instanceof gb6 ? (gb6) tag : null;
                if (gb6Var2 != null && !gb6Var2.equals(gb6Var) && gb6Var2.f0(27)) {
                    qp2Var.invoke(gb6Var2, view);
                }
                if (gb6Var.f0(27)) {
                    this.d.invoke(gb6Var, view);
                    view.setTag(gb6Var);
                }
            } else {
                ug1 ug1Var = up1.a;
                kotlinx.coroutines.android.a aVar = sg4.a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(view, qp2Var, null);
                this.a = 1;
                if (bt2.Z(aVar, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
