package androidx.datastore.core.okio;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {170, 177}, m = "readData$suspendImpl", v = 1)
final class OkioReadScope$readData$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Exception {
        /*
            r3 = this;
            r3.a = r4
            int r0 = r3.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r3.b = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            r1 = 0
            if (r0 == 0) goto L3d
            r2 = 1
            if (r0 == r2) goto L30
            r2 = 2
            if (r0 != r2) goto L28
            kotlin.b.b(r4)     // Catch: java.lang.Throwable -> L1a
            r0 = r1
            goto L1d
        L1a:
            r4 = move-exception
            r0 = r4
            r4 = r1
        L1d:
            if (r0 != 0) goto L20
            goto L3a
        L20:
            throw r0     // Catch: java.lang.Exception -> L21
        L21:
            r4 = move-exception
            boolean r0 = r4 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L27
            throw r1
        L27:
            throw r4
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L30:
            kotlin.b.b(r4)     // Catch: java.lang.Throwable -> L35
            r0 = r1
            goto L38
        L35:
            r4 = move-exception
            r0 = r4
            r4 = r1
        L38:
            if (r0 != 0) goto L3b
        L3a:
            return r4
        L3b:
            throw r0     // Catch: java.io.FileNotFoundException -> L3c
        L3c:
            throw r1
        L3d:
            kotlin.b.b(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope$readData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
