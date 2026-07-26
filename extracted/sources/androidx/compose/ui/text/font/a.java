package androidx.compose.ui.text.font;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;

    public a(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.p67 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            android.content.Context r3 = r10.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            p67 r11 = r0.a
            kotlin.b.b(r12)
            goto L77
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.b.b(r12)
            return r12
        L3a:
            kotlin.b.b(r12)
            boolean r12 = r11 instanceof defpackage.p67
            if (r12 == 0) goto L87
            r0.a = r11
            r0.d = r4
            om0 r12 = new om0
            g51 r0 = defpackage.ok4.I(r0)
            r12.<init>(r5, r0)
            r12.v()
            int r4 = r11.a
            jg r7 = new jg
            r7.<init>(r12, r11)
            java.lang.ThreadLocal r0 = defpackage.b77.a
            boolean r0 = r3.isRestricted()
            if (r0 == 0) goto L65
            r0 = -4
            r7.d(r0)
            goto L70
        L65:
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r8 = 0
            r9 = 0
            r6 = 0
            defpackage.b77.c(r3, r4, r5, r6, r7, r8, r9)
        L70:
            java.lang.Object r12 = r12.u()
            if (r12 != r1) goto L77
            return r1
        L77:
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            ej2 r11 = r11.c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L86
            android.graphics.Typeface r11 = defpackage.gv8.a(r12, r11, r3)
            return r11
        L86:
            return r12
        L87:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.a.a(p67, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
