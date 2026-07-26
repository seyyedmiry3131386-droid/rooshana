package coil3.network;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xm5;
import defpackage.ym5;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
final class NetworkFetcher$fetch$fetchResult$1 extends SuspendLambda implements qp2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ b e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ xm5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$fetchResult$1(Ref$ObjectRef ref$ObjectRef, b bVar, Ref$ObjectRef ref$ObjectRef2, xm5 xm5Var, g51 g51Var) {
        super(2, g51Var);
        this.d = ref$ObjectRef;
        this.e = bVar;
        this.f = ref$ObjectRef2;
        this.g = xm5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(this.d, this.e, this.f, this.g, g51Var);
        networkFetcher$fetch$fetchResult$1.c = obj;
        return networkFetcher$fetch$fetchResult$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkFetcher$fetch$fetchResult$1) create((ym5) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r11 == r3) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Exception {
        /*
            r10 = this;
            coil3.network.b r0 = r10.e
            java.lang.String r1 = r0.a
            java.lang.Object r2 = r10.c
            ym5 r2 = (defpackage.ym5) r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r4 = r10.b
            r5 = 2
            r6 = 1
            r7 = 0
            kotlin.jvm.internal.Ref$ObjectRef r8 = r10.f
            kotlin.jvm.internal.Ref$ObjectRef r9 = r10.d
            if (r4 == 0) goto L2b
            if (r4 == r6) goto L25
            if (r4 != r5) goto L1d
            kotlin.b.b(r11)
            goto L88
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            kotlin.jvm.internal.Ref$ObjectRef r4 = r10.a
            kotlin.b.b(r11)
            goto L44
        L2b:
            kotlin.b.b(r11)
            java.lang.Object r11 = r9.a
            zv6 r11 = (defpackage.zv6) r11
            java.lang.Object r4 = r8.a
            ym5 r4 = (defpackage.ym5) r4
            r10.c = r2
            r10.a = r9
            r10.b = r6
            java.lang.Object r11 = coil3.network.b.c(r0, r11, r4, r2, r10)
            if (r11 != r3) goto L43
            goto L87
        L43:
            r4 = r9
        L44:
            r4.a = r11
            java.lang.Object r11 = r9.a
            if (r11 == 0) goto L77
            zv6 r11 = (defpackage.zv6) r11
            ym5 r11 = r0.i(r11)
            r8.a = r11
            v18 r11 = new v18
            java.lang.Object r2 = r9.a
            defpackage.js3.m(r2)
            zv6 r2 = (defpackage.zv6) r2
            kb2 r0 = r0.h(r2)
            java.lang.Object r2 = r8.a
            ym5 r2 = (defpackage.ym5) r2
            if (r2 == 0) goto L6d
            rm5 r2 = r2.d
            if (r2 == 0) goto L6d
            java.lang.String r7 = r2.a()
        L6d:
            java.lang.String r1 = coil3.network.b.f(r1, r7)
            coil3.decode.DataSource r2 = coil3.decode.DataSource.d
            r11.<init>(r0, r1, r2)
            return r11
        L77:
            b28 r11 = r2.e
            if (r11 == 0) goto Lae
            r10.c = r2
            r10.a = r7
            r10.b = r5
            java.lang.Object r11 = coil3.network.internal.a.a(r11, r10)
            if (r11 != r3) goto L88
        L87:
            return r3
        L88:
            gh0 r11 = (defpackage.gh0) r11
            long r3 = r11.b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto Lad
            v18 r3 = new v18
            tb2 r0 = r0.e()
            x18 r4 = new x18
            r4.<init>(r11, r0, r7)
            rm5 r11 = r2.d
            java.lang.String r11 = r11.a()
            java.lang.String r11 = coil3.network.b.f(r1, r11)
            coil3.decode.DataSource r0 = coil3.decode.DataSource.d
            r3.<init>(r4, r11, r0)
            return r3
        Lad:
            return r7
        Lae:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "body == null"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$fetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
