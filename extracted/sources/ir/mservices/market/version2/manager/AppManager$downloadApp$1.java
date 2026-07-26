package ir.mservices.market.version2.manager;

import androidx.fragment.app.FragmentActivity;
import defpackage.tb1;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.AppManager", f = "AppManager.kt", l = {172}, m = "downloadApp", v = 1)
final class AppManager$downloadApp$1 extends ContinuationImpl {
    public FragmentActivity a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ a e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppManager$downloadApp$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
