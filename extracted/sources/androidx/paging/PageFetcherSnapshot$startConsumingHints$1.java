package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.paging.PageFetcher$flow$1;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", f = "PageFetcherSnapshot.kt", l = {231}, m = "invokeSuspend", v = 1)
final class PageFetcherSnapshot$startConsumingHints$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PageFetcherSnapshot$startConsumingHints$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        l lVar = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.internal.e eVarX = kotlinx.coroutines.flow.d.x(lVar.f.g(LoadType.c), lVar.f.g(LoadType.b));
            PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(lVar, null);
            this.a = 1;
            obj = kotlinx.coroutines.flow.d.s(eVarX, pageFetcherSnapshot$startConsumingHints$1$jumpHint$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        ja9 ja9Var = (ja9) obj;
        if (ja9Var != null) {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                js3.p("Jump triggered on PagingSource " + lVar.b + " by " + ja9Var, "message");
            }
            ((PageFetcher$flow$1.AnonymousClass2.AnonymousClass1) lVar.e).invoke();
        }
        return tx8.a;
    }
}
