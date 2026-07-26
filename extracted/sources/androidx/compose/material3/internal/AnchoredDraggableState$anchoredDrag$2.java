package androidx.compose.material3.internal;

import defpackage.dh4;
import defpackage.dp2;
import defpackage.g51;
import defpackage.ie;
import defpackage.je;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {518}, m = "invokeSuspend")
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ rp2 c;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    @tb1(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {519}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ rp2 c;
        public final /* synthetic */ d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g51 g51Var, rp2 rp2Var, d dVar) {
            super(2, g51Var);
            this.c = rp2Var;
            this.d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(g51Var, this.c, this.d);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((dh4) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                dh4 dh4Var = (dh4) this.b;
                je jeVar = this.d.m;
                this.a = 1;
                if (this.c.a(jeVar, dh4Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$2(g51 g51Var, rp2 rp2Var, d dVar) {
        super(1, g51Var);
        this.b = dVar;
        this.c = rp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AnchoredDraggableState$anchoredDrag$2(g51Var, this.c, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.b;
            ie ieVar = new ie(dVar, 2);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, this.c, dVar);
            this.a = 1;
            if (b.a(ieVar, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
