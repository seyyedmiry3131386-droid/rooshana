package androidx.privacysandbox.ads.adservices.appsetid;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", f = "AppSetIdManagerImplCommon.kt", l = {38}, m = "getAppSetId$suspendImpl")
public final class AppSetIdManagerImplCommon$getAppSetId$1 extends ContinuationImpl {
    public AppSetIdManagerImplCommon a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AppSetIdManagerImplCommon c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManagerImplCommon$getAppSetId$1(AppSetIdManagerImplCommon appSetIdManagerImplCommon, g51 g51Var) {
        super(g51Var);
        this.c = appSetIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return AppSetIdManagerImplCommon.S(this.c, this);
    }
}
