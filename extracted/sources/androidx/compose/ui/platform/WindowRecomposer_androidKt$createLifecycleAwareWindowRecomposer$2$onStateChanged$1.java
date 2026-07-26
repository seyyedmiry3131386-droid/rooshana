package androidx.compose.ui.platform;

import android.view.View;
import defpackage.e71;
import defpackage.g51;
import defpackage.g64;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend", v = 1)
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ androidx.compose.runtime.k d;
    public final /* synthetic */ g64 e;
    public final /* synthetic */ r f;
    public final /* synthetic */ View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef ref$ObjectRef, androidx.compose.runtime.k kVar, g64 g64Var, r rVar, View view, g51 g51Var) {
        super(2, g51Var);
        this.c = ref$ObjectRef;
        this.d = kVar;
        this.e = g64Var;
        this.f = rVar;
        this.g = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.c, this.d, this.e, this.f, this.g, g51Var);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.b = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r10.a
            androidx.compose.ui.platform.r r2 = r10.f
            g64 r3 = r10.e
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L20
            if (r1 != r4) goto L18
            java.lang.Object r0 = r10.b
            wt3 r0 = (defpackage.wt3) r0
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L16
            goto L69
        L16:
            r11 = move-exception
            goto L7c
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.b
            e71 r11 = (defpackage.e71) r11
            kotlin.jvm.internal.Ref$ObjectRef r1 = r10.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L57
            ny4 r1 = (defpackage.ny4) r1     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L5a
            android.view.View r6 = r10.g     // Catch: java.lang.Throwable -> L57
            android.content.Context r6 = r6.getContext()     // Catch: java.lang.Throwable -> L57
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L57
            v48 r6 = androidx.compose.ui.platform.s.a(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L57
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L57
            float r7 = r7.floatValue()     // Catch: java.lang.Throwable -> L57
            l08 r8 = r1.a     // Catch: java.lang.Throwable -> L57
            r8.i(r7)     // Catch: java.lang.Throwable -> L57
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch: java.lang.Throwable -> L57
            r7.<init>(r6, r1, r5)     // Catch: java.lang.Throwable -> L57
            r1 = 3
            li1 r11 = defpackage.bt2.G(r11, r5, r5, r7, r1)     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r11 = move-exception
            r0 = r5
            goto L7c
        L5a:
            r11 = r5
        L5b:
            androidx.compose.runtime.k r1 = r10.d     // Catch: java.lang.Throwable -> L78
            r10.b = r11     // Catch: java.lang.Throwable -> L78
            r10.a = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r1.Y(r10)     // Catch: java.lang.Throwable -> L78
            if (r1 != r0) goto L68
            return r0
        L68:
            r0 = r11
        L69:
            if (r0 == 0) goto L6e
            r0.g(r5)
        L6e:
            i64 r11 = r3.D()
            r11.f(r2)
            tx8 r11 = defpackage.tx8.a
            return r11
        L78:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L7c:
            if (r0 == 0) goto L81
            r0.g(r5)
        L81:
            i64 r0 = r3.D()
            r0.f(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
