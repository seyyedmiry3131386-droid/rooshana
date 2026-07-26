package androidx.compose.foundation.text.input.internal;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {87}, m = "platformSpecificTextInputSession", v = 1)
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.a = r6
            int r6 = r5.b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.b = r6
            boolean r6 = r5 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            if (r6 == 0) goto L1a
            int r6 = r5.b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L1a
            int r6 = r6 - r0
            r5.b = r6
            r6 = r5
            goto L1f
        L1a:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r6 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r6.<init>(r5)
        L1f:
            java.lang.Object r0 = r6.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r6.b
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.b.b(r0)
            goto L4b
        L36:
            kotlin.b.b(r0)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r0 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r2 = 0
            r4 = 0
            r0.<init>(r4, r2)
            r6.b = r3
            java.lang.Object r6 = defpackage.js3.v(r0, r6)
            if (r6 != r1) goto L4b
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r6
        L4b:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
