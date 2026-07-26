package androidx.compose.material3.internal;

import defpackage.dh4;
import defpackage.dp2;
import defpackage.g51;
import defpackage.ie;
import defpackage.je;
import defpackage.qp2;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ sp2 d;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    @tb1(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ sp2 c;
        public final /* synthetic */ d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(sp2 sp2Var, d dVar, g51 g51Var) {
            super(2, g51Var);
            this.c = sp2Var;
            this.d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, this.d, g51Var);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((Pair) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                Pair pair = (Pair) this.b;
                dh4 dh4Var = (dh4) pair.a;
                Object obj2 = pair.b;
                je jeVar = this.d.m;
                this.a = 1;
                if (this.c.g(jeVar, dh4Var, obj2, this) == coroutineSingletons) {
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
    public AnchoredDraggableState$anchoredDrag$4(d dVar, Object obj, sp2 sp2Var, g51 g51Var) {
        super(1, g51Var);
        this.b = dVar;
        this.c = obj;
        this.d = sp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AnchoredDraggableState$anchoredDrag$4(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AnchoredDraggableState$anchoredDrag$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = this.c;
            d dVar = this.b;
            dVar.i(obj2);
            ie ieVar = new ie(dVar, 3);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, dVar, null);
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
