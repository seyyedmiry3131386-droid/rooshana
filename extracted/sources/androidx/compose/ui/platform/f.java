package androidx.compose.ui.platform;

import android.view.View;
import defpackage.ca6;
import defpackage.e71;
import defpackage.ii8;
import defpackage.w61;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ca6, e71 {
    public final View a;
    public final ii8 b;
    public final e71 c;
    public final AtomicReference d = new AtomicReference(null);

    public f(View view, ii8 ii8Var, e71 e71Var) {
        this.a = view;
        this.b = ii8Var;
        this.c = e71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ca6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final defpackage.y44 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.b.b(r6)
            goto L48
        L2f:
            kotlin.b.b(r6)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r6.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r5 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r2 = 0
            r5.<init>(r4, r2)
            r0.c = r3
            java.util.concurrent.atomic.AtomicReference r2 = r4.d
            java.lang.Object r5 = androidx.compose.ui.b.d(r2, r6, r5, r0)
            if (r5 != r1) goto L48
            return
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.f.d(y44, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.c.getCoroutineContext();
    }

    @Override // defpackage.ca6
    public final View u() {
        return this.a;
    }
}
