package ir.mservices.market.version2.manager;

import android.app.usage.UsageStats;
import android.graphics.drawable.Drawable;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.AppUsageManager", f = "AppUsageManager.kt", l = {63}, m = "getAppInfo", v = 1)
final class AppUsageManager$getAppInfo$1 extends ContinuationImpl {
    public UsageStats a;
    public Drawable b;
    public String c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUsageManager$getAppInfo$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
