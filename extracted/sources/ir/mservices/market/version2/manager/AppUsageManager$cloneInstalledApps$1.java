package ir.mservices.market.version2.manager;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.tb1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.AppUsageManager", f = "AppUsageManager.kt", l = {MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER}, m = "cloneInstalledApps", v = 1)
final class AppUsageManager$cloneInstalledApps$1 extends ContinuationImpl {
    public Map a;
    public Collection b;
    public Iterator c;
    public Collection d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ b h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageManager$cloneInstalledApps$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
