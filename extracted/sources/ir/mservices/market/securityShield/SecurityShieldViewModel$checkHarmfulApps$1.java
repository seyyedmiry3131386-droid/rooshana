package ir.mservices.market.securityShield;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel", f = "SecurityShieldViewModel.kt", l = {230}, m = "checkHarmfulApps", v = 1)
final class SecurityShieldViewModel$checkHarmfulApps$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ SecurityShieldViewModel b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$checkHarmfulApps$1(SecurityShieldViewModel securityShieldViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = securityShieldViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.r(this);
    }
}
