package ir.myket.network.server;

import defpackage.js3;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final String a;
    public final CopyOnWriteArrayList b;
    public int c;

    public b(String str) {
        js3.p(str, "url");
        this.a = str;
        this.b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ir.myket.network.server.ServerInfo$decreaseNetworkErrorWeight$1
            if (r0 == 0) goto L13
            r0 = r10
            ir.myket.network.server.ServerInfo$decreaseNetworkErrorWeight$1 r0 = (ir.myket.network.server.ServerInfo$decreaseNetworkErrorWeight$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ir.myket.network.server.ServerInfo$decreaseNetworkErrorWeight$1 r0 = new ir.myket.network.server.ServerInfo$decreaseNetworkErrorWeight$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.f
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            int r9 = r0.b
            int r2 = r0.a
            java.util.Iterator r6 = r0.c
            kotlin.b.b(r10)
            r10 = r9
            r9 = r2
            goto L5a
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.b.b(r10)
            if (r9 <= 0) goto L41
            r10 = r4
            goto L42
        L41:
            r10 = r5
        L42:
            r2 = 0
            defpackage.lw.f(r2, r2, r10)
            int r10 = r8.c
            if (r10 > 0) goto L4b
            goto L7d
        L4b:
            int r10 = r10 - r9
            r8.c = r10
            if (r10 >= 0) goto L52
            r8.c = r5
        L52:
            java.util.concurrent.CopyOnWriteArrayList r10 = r8.b
            java.util.Iterator r10 = r10.iterator()
            r6 = r10
            r10 = r5
        L5a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r6.next()
            cp7 r2 = (defpackage.cp7) r2
            r0.c = r6
            r0.a = r9
            r0.b = r10
            r0.f = r4
            int r7 = r2.e
            if (r7 > 0) goto L73
            goto L7a
        L73:
            int r7 = r7 - r9
            r2.e = r7
            if (r7 >= 0) goto L7a
            r2.e = r5
        L7a:
            if (r3 != r1) goto L5a
            return r1
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.network.server.b.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:31:0x0091, B:32:0x0093], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d2 -> B:49:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.network.server.b.b(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String toString() {
        return "ServerInfo(url='" + this.a + "', networkErrorWeight=" + this.c + ")";
    }
}
