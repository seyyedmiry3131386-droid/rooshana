package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.m;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.f8;
import defpackage.g51;
import defpackage.is3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;
    public final /* synthetic */ m c;
    public final /* synthetic */ bp2 d;
    public final /* synthetic */ f8 e;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ b b;
        public final /* synthetic */ m c;
        public final /* synthetic */ bp2 d;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00061 extends FunctionReferenceImpl implements bp2 {
            public final /* synthetic */ b a;
            public final /* synthetic */ m b;
            public final /* synthetic */ bp2 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00061(b bVar, m mVar, bp2 bp2Var) {
                super(0, is3.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.a = bVar;
                this.b = mVar;
                this.c = bp2Var;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return b.C0(this.a, this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, m mVar, bp2 bp2Var, g51 g51Var) {
            super(2, g51Var);
            this.b = bVar;
            this.c = mVar;
            this.d = bp2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ b b;
        public final /* synthetic */ f8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, f8 f8Var, g51 g51Var) {
            super(2, g51Var);
            this.b = bVar;
            this.c = f8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.a = 1;
                if (androidx.compose.ui.relocation.a.a(this.b, this.c, this) == coroutineSingletons) {
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
    public BringIntoViewResponderNode$bringIntoView$2(b bVar, m mVar, bp2 bp2Var, f8 f8Var, g51 g51Var) {
        super(2, g51Var);
        this.b = bVar;
        this.c = mVar;
        this.d = bp2Var;
        this.e = f8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.b, this.c, this.d, this.e, g51Var);
        bringIntoViewResponderNode$bringIntoView$2.a = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        e71 e71Var = (e71) this.a;
        m mVar = this.c;
        bp2 bp2Var = this.d;
        b bVar = this.b;
        bt2.G(e71Var, null, null, new AnonymousClass1(bVar, mVar, bp2Var, null), 3);
        return bt2.G(e71Var, null, null, new AnonymousClass2(bVar, this.e, null), 3);
    }
}
