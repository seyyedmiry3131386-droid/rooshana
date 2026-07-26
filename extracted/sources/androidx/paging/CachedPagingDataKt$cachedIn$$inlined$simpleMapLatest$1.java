package androidx.paging;

import defpackage.a06;
import defpackage.ea5;
import defpackage.fu0;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {91}, m = "invokeSuspend", v = 1)
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fu0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(g51 g51Var, fu0 fu0Var) {
        super(3, g51Var);
        this.d = fu0Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1((g51) obj3, this.d);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.b = (ze2) obj;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.c = obj2;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ze2 ze2Var = this.b;
            ea5 ea5Var = new ea5(this.d, (a06) this.c);
            this.a = 1;
            if (ze2Var.emit(ea5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
