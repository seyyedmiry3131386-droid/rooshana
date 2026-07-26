package androidx.compose.foundation.gestures;

import defpackage.e49;
import defpackage.g51;
import defpackage.hm5;

/* JADX INFO: loaded from: classes.dex */
public final class l implements hm5 {
    public final o a;
    public boolean b;

    public l(o oVar, boolean z) {
        this.a = oVar;
        this.b = z;
    }

    @Override // defpackage.hm5
    public final /* synthetic */ long G(int i, long j) {
        return 0L;
    }

    @Override // defpackage.hm5
    public final Object c0(long j, g51 g51Var) {
        return new e49(0L);
    }

    @Override // defpackage.hm5
    public final long u(long j, int i, long j2) {
        if (!this.b) {
            return 0L;
        }
        o oVar = this.a;
        if (oVar.a.a()) {
            return 0L;
        }
        return oVar.h(oVar.d(oVar.a.e(oVar.d(oVar.g(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hm5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(long r5, long r7, defpackage.g51 r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r5 == 0) goto L13
            r5 = r9
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r5 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r5
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.d = r6
            goto L1a
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r5 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r9 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r7 = r5.a
            kotlin.b.b(r6)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.b.b(r6)
            boolean r6 = r4.b
            r2 = 0
            if (r6 == 0) goto L56
            androidx.compose.foundation.gestures.o r6 = r4.a
            boolean r0 = r6.i
            if (r0 == 0) goto L43
            goto L52
        L43:
            r5.a = r7
            r5.d = r1
            java.lang.Object r6 = r6.a(r7, r5)
            if (r6 != r9) goto L4e
            return r9
        L4e:
            e49 r6 = (defpackage.e49) r6
            long r2 = r6.a
        L52:
            long r2 = defpackage.e49.d(r7, r2)
        L56:
            e49 r5 = new e49
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.l.v(long, long, g51):java.lang.Object");
    }
}
