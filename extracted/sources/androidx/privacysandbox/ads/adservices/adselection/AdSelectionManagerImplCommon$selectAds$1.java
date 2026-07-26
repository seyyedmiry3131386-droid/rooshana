package androidx.privacysandbox.ads.adservices.adselection;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", f = "AdSelectionManagerImplCommon.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER}, m = "selectAds$suspendImpl")
public final class AdSelectionManagerImplCommon$selectAds$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ AdSelectionManagerImplCommon b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerImplCommon$selectAds$1(AdSelectionManagerImplCommon adSelectionManagerImplCommon, g51 g51Var) {
        super(g51Var);
        this.b = adSelectionManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return AdSelectionManagerImplCommon.a0(this.b, null, this);
    }
}
