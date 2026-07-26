package androidx.paging;

import defpackage.g51;
import defpackage.js3;
import defpackage.kr2;
import defpackage.ml9;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend", v = 1)
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements rp2 {
    public /* synthetic */ kr2 a;
    public /* synthetic */ kr2 b;
    public final /* synthetic */ LoadType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, g51 g51Var) {
        super(3, g51Var);
        this.c = loadType;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.c, (g51) obj3);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.a = (kr2) obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.b = (kr2) obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        kr2 kr2Var = this.a;
        kr2 kr2Var2 = this.b;
        js3.p(kr2Var2, "<this>");
        js3.p(kr2Var, "previous");
        int i = kr2Var2.a;
        int i2 = kr2Var.a;
        return i > i2 ? true : i < i2 ? false : ml9.x(kr2Var2.b, kr2Var.b, this.c) ? kr2Var2 : kr2Var;
    }
}
