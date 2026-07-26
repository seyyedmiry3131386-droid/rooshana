package ir.myket.vpn.vpn;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.vpn.vpn.VpnThread", f = "VpnThread.kt", l = {170}, m = "run", v = 1)
final class VpnThread$run$1 extends ContinuationImpl {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnThread$run$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return a.a(this.c, this);
    }
}
