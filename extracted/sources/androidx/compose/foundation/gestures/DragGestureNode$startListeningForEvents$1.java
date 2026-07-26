package androidx.compose.foundation.gestures;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {499, 501, 503, 510, 512, 515}, m = "invokeSuspend", v = 1)
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements qp2 {
    public Ref$ObjectRef a;
    public Ref$ObjectRef b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    @tb1(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {506}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public Ref$ObjectRef a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Ref$ObjectRef d;
        public final /* synthetic */ e e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, e eVar, g51 g51Var) {
            super(2, g51Var);
            this.d = ref$ObjectRef;
            this.e = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.e, g51Var);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((dp2) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0041 -> B:25:0x0053). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:24:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r6.b
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                kotlin.jvm.internal.Ref$ObjectRef r1 = r6.a
                java.lang.Object r3 = r6.c
                dp2 r3 = (defpackage.dp2) r3
                kotlin.b.b(r7)
                goto L50
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.b.b(r7)
                java.lang.Object r7 = r6.c
                dp2 r7 = (defpackage.dp2) r7
                r3 = r7
            L23:
                kotlin.jvm.internal.Ref$ObjectRef r1 = r6.d
                java.lang.Object r7 = r1.a
                boolean r4 = r7 instanceof defpackage.ru1
                if (r4 != 0) goto L56
                boolean r4 = r7 instanceof defpackage.ou1
                if (r4 != 0) goto L56
                boolean r4 = r7 instanceof defpackage.pu1
                r5 = 0
                if (r4 == 0) goto L37
                pu1 r7 = (defpackage.pu1) r7
                goto L38
            L37:
                r7 = r5
            L38:
                if (r7 == 0) goto L3d
                r3.invoke(r7)
            L3d:
                androidx.compose.foundation.gestures.e r7 = r6.e
                kotlinx.coroutines.channels.a r7 = r7.u
                if (r7 == 0) goto L53
                r6.c = r3
                r6.a = r1
                r6.b = r2
                java.lang.Object r7 = r7.l(r6)
                if (r7 != r0) goto L50
                return r0
            L50:
                r5 = r7
                su1 r5 = (defpackage.su1) r5
            L53:
                r1.a = r5
                goto L23
            L56:
                tx8 r7 = defpackage.tx8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(e eVar, g51 g51Var) {
        super(2, g51Var);
        this.e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.e, g51Var);
        dragGestureNode$startListeningForEvents$1.d = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureNode$startListeningForEvents$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
    
        if (androidx.compose.foundation.gestures.e.F0(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Path cross not found for [B:44:0x00c3, B:40:0x00b1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:46:0x00c7, B:19:0x0056], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r4
      0x0032: PHI (r1v11 kotlin.jvm.internal.Ref$ObjectRef) = (r1v3 kotlin.jvm.internal.Ref$ObjectRef), (r1v15 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v6 e71) = (r4v4 e71), (r4v7 e71) binds: [B:13:0x002f, B:36:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r5
      0x0056: PHI (r5v7 e71) = (r5v0 e71), (r5v3 e71), (r5v3 e71), (r5v3 e71), (r5v5 e71), (r5v8 e71) binds: [B:18:0x004e, B:45:0x00c5, B:47:0x00d2, B:41:0x00be, B:30:0x0082, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c3, B:46:0x00c7), top: B:55:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:38:0x00ab, B:40:0x00b1, B:44:0x00c3, B:46:0x00c7), top: B:55:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00be -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c5 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d2 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e0 -> B:11:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
