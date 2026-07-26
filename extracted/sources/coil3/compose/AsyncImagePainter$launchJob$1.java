package coil3.compose;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xw;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", l = {234, 238}, m = "invokeSuspend")
final class AsyncImagePainter$launchJob$1 extends SuspendLambda implements qp2 {
    public AsyncImagePainter a;
    public int b;
    public final /* synthetic */ AsyncImagePainter c;
    public final /* synthetic */ xw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$launchJob$1(AsyncImagePainter asyncImagePainter, xw xwVar, g51 g51Var) {
        super(2, g51Var);
        this.c = asyncImagePainter;
        this.d = xwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AsyncImagePainter$launchJob$1(this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncImagePainter$launchJob$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.b
            r2 = 2
            coil3.compose.AsyncImagePainter r3 = r5.c
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            coil3.compose.AsyncImagePainter r0 = r5.a
            kotlin.b.b(r6)
            goto L54
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            kotlin.b.b(r6)
            goto L3a
        L20:
            kotlin.b.b(r6)
            coil3.compose.a r6 = r3.p
            xw r1 = r5.d
            if (r6 == 0) goto L3d
            pi3 r2 = r1.b
            pi3 r2 = coil3.compose.AsyncImagePainter.j(r3, r2, r4)
            hi3 r1 = r1.a
            r5.b = r4
            java.lang.Object r6 = r6.a(r1, r2, r5)
            if (r6 != r0) goto L3a
            goto L52
        L3a:
            zw r6 = (defpackage.zw) r6
            goto L8e
        L3d:
            pi3 r6 = r1.b
            r4 = 0
            pi3 r6 = coil3.compose.AsyncImagePainter.j(r3, r6, r4)
            hi3 r1 = r1.a
            r5.a = r3
            r5.b = r2
            coil3.a r1 = (coil3.a) r1
            java.lang.Object r6 = r1.b(r6, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            r0 = r3
        L54:
            ti3 r6 = (defpackage.ti3) r6
            r0.getClass()
            boolean r1 = r6 instanceof defpackage.ib8
            if (r1 == 0) goto L72
            coil3.compose.AsyncImagePainter$State$Success r1 = new coil3.compose.AsyncImagePainter$State$Success
            ib8 r6 = (defpackage.ib8) r6
            wh3 r2 = r6.a
            pi3 r4 = r6.b
            android.content.Context r4 = r4.a
            int r0 = r0.o
            g16 r0 = defpackage.rq4.d(r2, r4, r0)
            r1.<init>(r0, r6)
        L70:
            r6 = r1
            goto L8e
        L72:
            boolean r1 = r6 instanceof defpackage.p32
            if (r1 == 0) goto L94
            coil3.compose.AsyncImagePainter$State$Error r1 = new coil3.compose.AsyncImagePainter$State$Error
            p32 r6 = (defpackage.p32) r6
            wh3 r2 = r6.a
            if (r2 == 0) goto L89
            pi3 r4 = r6.b
            android.content.Context r4 = r4.a
            int r0 = r0.o
            g16 r0 = defpackage.rq4.d(r2, r4, r0)
            goto L8a
        L89:
            r0 = 0
        L8a:
            r1.<init>(r0, r6)
            goto L70
        L8e:
            coil3.compose.AsyncImagePainter.k(r3, r6)
            tx8 r6 = defpackage.tx8.a
            return r6
        L94:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
