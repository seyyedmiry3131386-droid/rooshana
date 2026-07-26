package androidx.compose.foundation.relocation;

import defpackage.tg0;
import defpackage.zb5;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final zb5 a = new zb5(0, new tg0[16]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.sy6 r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r10 = r0.d
            int r2 = r0.c
            java.lang.Object[] r4 = r0.b
            sy6 r5 = r0.a
            kotlin.b.b(r11)
            r11 = r5
            goto L66
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            kotlin.b.b(r11)
            zb5 r11 = r9.a
            java.lang.Object[] r2 = r11.a
            int r11 = r11.c
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r8
            r8 = r4
            r4 = r2
            r2 = r8
        L48:
            if (r2 >= r10) goto L68
            r5 = r4[r2]
            tg0 r5 = (defpackage.tg0) r5
            x2 r6 = new x2
            r7 = 11
            r6.<init>(r7, r11)
            r0.a = r11
            r0.b = r4
            r0.c = r2
            r0.d = r10
            r0.g = r3
            java.lang.Object r5 = androidx.compose.ui.relocation.a.a(r5, r6, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            int r2 = r2 + r3
            goto L48
        L68:
            tx8 r10 = defpackage.tx8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.a(sy6, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
