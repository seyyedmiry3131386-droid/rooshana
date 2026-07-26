package androidx.compose.ui.text.font;

import androidx.compose.runtime.g;
import defpackage.dp2;
import defpackage.nv8;
import defpackage.s08;
import defpackage.u48;
import defpackage.wb5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements u48 {
    public final List a;
    public final nv8 b;
    public final dp2 c;
    public final a d;
    public final wb5 e;
    public boolean f = true;

    public b(List list, Object obj, nv8 nv8Var, c cVar, dp2 dp2Var, a aVar) {
        this.a = list;
        this.b = nv8Var;
        this.c = dp2Var;
        this.d = aVar;
        this.e = g.h(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:34:0x009e, B:21:0x004b, B:23:0x0050, B:27:0x007b, B:32:0x0094), top: B:39:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009e -> B:35:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.p67 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            p67 r7 = r0.a
            kotlin.b.b(r8)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            return r8
        L2a:
            r8 = move-exception
            goto L4c
        L2c:
            r7 = move-exception
            goto L75
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.b.b(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.a = r7     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = kotlinx.coroutines.a.n(r2, r8, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r7 != r1) goto L4b
            return r1
        L4b:
            return r7
        L4c:
            w61 r1 = r0.getContext()
            fz1 r2 = defpackage.fz1.f
            u61 r1 = r1.r0(r2)
            z61 r1 = (defpackage.z61) r1
            if (r1 == 0) goto L7f
            w61 r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.y(r0, r2)
            goto L7f
        L75:
            w61 r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.a.j(r8)
            if (r8 == 0) goto L80
        L7f:
            return r4
        L80:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.b.c(p67, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return ((s08) this.e).getValue();
    }
}
