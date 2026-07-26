package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import defpackage.g51;
import defpackage.lh0;
import defpackage.q81;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {115, 122}, m = "invokeSuspend", v = 1)
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements qp2 {
    public lh0 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ContentResolver d;
    public final /* synthetic */ Uri e;
    public final /* synthetic */ q81 f;
    public final /* synthetic */ kotlinx.coroutines.channels.a g;
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, q81 q81Var, kotlinx.coroutines.channels.a aVar, Context context, g51 g51Var) {
        super(2, g51Var);
        this.d = contentResolver;
        this.e = uri;
        this.f = q81Var;
        this.g = aVar;
        this.h = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.d, this.e, this.f, this.g, this.h, g51Var);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.c = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r10.b
            r2 = 2
            r3 = 1
            q81 r4 = r10.f
            android.content.ContentResolver r5 = r10.d
            if (r1 == 0) goto L30
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            lh0 r1 = r10.a
            java.lang.Object r6 = r10.c
            ze2 r6 = (defpackage.ze2) r6
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            lh0 r1 = r10.a
            java.lang.Object r6 = r10.c
            ze2 r6 = (defpackage.ze2) r6
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            kotlin.b.b(r11)
            java.lang.Object r11 = r10.c
            ze2 r11 = (defpackage.ze2) r11
            android.net.Uri r1 = r10.e
            r6 = 0
            r5.registerContentObserver(r1, r6, r4)
            kotlinx.coroutines.channels.a r1 = r10.g     // Catch: java.lang.Throwable -> L1c
            lh0 r6 = new lh0     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.c = r11     // Catch: java.lang.Throwable -> L1c
            r10.a = r6     // Catch: java.lang.Throwable -> L1c
            r10.b = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.d(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.f()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.h     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.c = r6     // Catch: java.lang.Throwable -> L1c
            r10.a = r1     // Catch: java.lang.Throwable -> L1c
            r10.b = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
        L7f:
            return r0
        L80:
            r5.unregisterContentObserver(r4)
            tx8 r11 = defpackage.tx8.a
            return r11
        L86:
            r5.unregisterContentObserver(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
