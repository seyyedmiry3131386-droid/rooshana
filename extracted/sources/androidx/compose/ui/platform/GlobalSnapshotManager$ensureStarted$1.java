package androidx.compose.ui.platform;

import defpackage.e71;
import defpackage.g51;
import defpackage.lh0;
import defpackage.pw6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements qp2 {
    public pw6 a;
    public lh0 b;
    public int c;
    public final /* synthetic */ kotlinx.coroutines.channels.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(kotlinx.coroutines.channels.a aVar, g51 g51Var) {
        super(2, g51Var);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new GlobalSnapshotManager$ensureStarted$1(this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalSnapshotManager$ensureStarted$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0033, B:19:0x003b, B:20:0x0049, B:26:0x0057, B:14:0x0026, B:28:0x005a, B:30:0x005f, B:31:0x0060, B:13:0x0020, B:21:0x004a, B:23:0x0050), top: B:38:0x0005, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:17:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            lh0 r1 = r6.b
            pw6 r3 = r6.a
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L11
            goto L33
        L11:
            r7 = move-exception
            goto L68
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.b.b(r7)
            kotlinx.coroutines.channels.a r3 = r6.d
            lh0 r7 = new lh0     // Catch: java.lang.Throwable -> L11
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L11
            r1 = r7
        L26:
            r6.a = r3     // Catch: java.lang.Throwable -> L11
            r6.b = r1     // Catch: java.lang.Throwable -> L11
            r6.c = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r1.d(r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L33
            return r0
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L11
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r7 == 0) goto L61
            java.lang.Object r7 = r1.f()     // Catch: java.lang.Throwable -> L11
            tx8 r7 = (defpackage.tx8) r7     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r7 = defpackage.wt2.b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = defpackage.g08.c     // Catch: java.lang.Throwable -> L11
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L11
            vt2 r5 = defpackage.g08.j     // Catch: java.lang.Throwable -> L5e
            sb5 r5 = r5.h     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L57
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L5e
            if (r5 != r2) goto L57
            r4 = r2
        L57:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L26
            defpackage.g08.a()     // Catch: java.lang.Throwable -> L11
            goto L26
        L5e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L61:
            r7 = 0
            r3.g(r7)
            tx8 r7 = defpackage.tx8.a
            return r7
        L68:
            throw r7     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            kotlinx.coroutines.channels.b.b(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
