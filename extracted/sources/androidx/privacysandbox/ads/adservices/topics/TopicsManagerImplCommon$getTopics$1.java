package androidx.privacysandbox.ads.adservices.topics;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {40}, m = "getTopics$suspendImpl")
public final class TopicsManagerImplCommon$getTopics$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ TopicsManagerImplCommon b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, g51 g51Var) {
        super(g51Var);
        this.b = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.j(this.b, null, this);
    }
}
