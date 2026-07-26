package ir.mservices.market.app.update.common.manager;

import defpackage.dp2;
import defpackage.tb1;
import ir.mservices.market.core.notification.PushMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.manager.AppUpdateManager", f = "AppUpdateManager.kt", l = {69}, m = "refreshAppUpdate", v = 1)
final class AppUpdateManager$refreshAppUpdate$1 extends ContinuationImpl {
    public dp2 a;
    public PushMessage b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManager$refreshAppUpdate$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, null, null, null, this);
    }
}
