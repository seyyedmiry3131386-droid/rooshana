package coil3.decode;

import android.graphics.ImageDecoder;
import defpackage.bc1;
import defpackage.pn7;
import defpackage.uv5;

/* JADX INFO: loaded from: classes.dex */
public final class b implements bc1 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final uv5 c;
    public final pn7 d;

    public b(ImageDecoder.Source source, AutoCloseable autoCloseable, uv5 uv5Var, pn7 pn7Var) {
        this.a = source;
        this.b = autoCloseable;
        this.c = uv5Var;
        this.d = pn7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof coil3.decode.StaticImageDecoder$decode$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.decode.StaticImageDecoder$decode$1 r0 = (coil3.decode.StaticImageDecoder$decode$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coil3.decode.StaticImageDecoder$decode$1 r0 = new coil3.decode.StaticImageDecoder$decode$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pn7 r0 = r0.a
            kotlin.b.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.b.b(r6)
            pn7 r6 = r5.d
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r6.a(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r6
        L42:
            java.lang.AutoCloseable r6 = r5.b     // Catch: java.lang.Throwable -> L68
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            android.graphics.ImageDecoder$Source r2 = r5.a     // Catch: java.lang.Throwable -> L6a
            q58 r3 = new q58     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6a
            android.graphics.Bitmap r2 = android.graphics.ImageDecoder.decodeBitmap(r2, r3)     // Catch: java.lang.Throwable -> L6a
            zb1 r3 = new zb1     // Catch: java.lang.Throwable -> L6a
            mc0 r4 = new mc0     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6a
            boolean r1 = r1.a     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L6a
            r1 = 0
            defpackage.m91.i(r6, r1)     // Catch: java.lang.Throwable -> L68
            r0.e()
            return r3
        L68:
            r6 = move-exception
            goto L71
        L6a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L6c
        L6c:
            r2 = move-exception
            defpackage.m91.i(r6, r1)     // Catch: java.lang.Throwable -> L68
            throw r2     // Catch: java.lang.Throwable -> L68
        L71:
            r0.e()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
