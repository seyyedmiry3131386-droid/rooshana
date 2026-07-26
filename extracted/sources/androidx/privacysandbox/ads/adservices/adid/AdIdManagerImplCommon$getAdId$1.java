package androidx.privacysandbox.ads.adservices.adid;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", l = {40}, m = "getAdId$suspendImpl")
public final class AdIdManagerImplCommon$getAdId$1 extends ContinuationImpl {
    public AdIdManagerImplCommon a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AdIdManagerImplCommon c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdIdManagerImplCommon$getAdId$1(AdIdManagerImplCommon adIdManagerImplCommon, g51 g51Var) {
        super(g51Var);
        this.c = adIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AdIdManagerImplCommon.N(this.c, this);
    }
}
