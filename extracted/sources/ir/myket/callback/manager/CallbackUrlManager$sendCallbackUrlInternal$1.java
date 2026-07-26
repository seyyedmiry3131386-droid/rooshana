package ir.myket.callback.manager;

import defpackage.cn5;
import defpackage.ql0;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.callback.manager.CallbackUrlManager", f = "CallbackUrlManager.kt", l = {61, 64, 70, 73, 77, 82}, m = "sendCallbackUrlInternal", v = 1)
final class CallbackUrlManager$sendCallbackUrlInternal$1 extends ContinuationImpl {
    public ql0 a;
    public cn5 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackUrlManager$sendCallbackUrlInternal$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return a.a(this.f, null, this);
    }
}
