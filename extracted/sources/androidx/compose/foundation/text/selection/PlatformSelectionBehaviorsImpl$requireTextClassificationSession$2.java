package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import defpackage.dc5;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 extends SuspendLambda implements qp2 {
    public dc5 a;
    public a b;
    public int c;
    public final /* synthetic */ a d;
    public final /* synthetic */ SuspendLambda e;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ TextClassifier b;
        public final /* synthetic */ SuspendLambda c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(TextClassifier textClassifier, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.b = textClassifier;
            this.c = (SuspendLambda) qp2Var;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            TextClassifier textClassifier = this.b;
            if (textClassifier == null) {
                return null;
            }
            this.a = 1;
            Object objInvoke = this.c.invoke(textClassifier, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(a aVar, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.d = aVar;
        this.e = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r9.c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.b.b(r10)
            return r10
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            dc5 r1 = r9.a
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L22
            goto L68
        L22:
            r10 = move-exception
            goto L87
        L25:
            androidx.compose.foundation.text.selection.a r1 = r9.b
            dc5 r4 = r9.a
            kotlin.b.b(r10)
            r10 = r4
            goto L42
        L2e:
            kotlin.b.b(r10)
            androidx.compose.foundation.text.selection.a r1 = r9.d
            kotlinx.coroutines.sync.a r10 = r1.e
            r9.a = r10
            r9.b = r1
            r9.c = r4
            java.lang.Object r4 = r10.b(r9)
            if (r4 != r0) goto L42
            goto L85
        L42:
            android.view.textclassifier.TextClassifier r4 = r1.f     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L51
            boolean r6 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L6d
            goto L51
        L4d:
            r0 = move-exception
            r1 = r10
            r10 = r0
            goto L87
        L51:
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 r4 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L4d
            r9.a = r10     // Catch: java.lang.Throwable -> L4d
            r9.b = r5     // Catch: java.lang.Throwable -> L4d
            r9.c = r3     // Catch: java.lang.Throwable -> L4d
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r1 = kotlinx.coroutines.a.n(r6, r4, r9)     // Catch: java.lang.Throwable -> L4d
            if (r1 != r0) goto L65
            goto L85
        L65:
            r8 = r1
            r1 = r10
            r10 = r8
        L68:
            android.view.textclassifier.TextClassifier r4 = defpackage.y45.f(r10)     // Catch: java.lang.Throwable -> L22
            r10 = r1
        L6d:
            r10.d(r5)
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1 r10 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1
            kotlin.coroutines.jvm.internal.SuspendLambda r1 = r9.e
            r10.<init>(r4, r1, r5)
            r9.a = r5
            r9.b = r5
            r9.c = r2
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Object r10 = kotlinx.coroutines.a.n(r1, r10, r9)
            if (r10 != r0) goto L86
        L85:
            return r0
        L86:
            return r10
        L87:
            r1.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
