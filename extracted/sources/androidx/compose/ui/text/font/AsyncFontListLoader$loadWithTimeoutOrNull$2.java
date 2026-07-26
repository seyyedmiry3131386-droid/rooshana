package androidx.compose.ui.text.font;

import defpackage.e71;
import defpackage.g51;
import defpackage.p67;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {315}, m = "invokeSuspend", v = 1)
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ p67 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(b bVar, p67 p67Var, g51 g51Var) {
        super(2, g51Var);
        this.b = bVar;
        this.c = p67Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        a aVar = this.b.d;
        this.a = 1;
        Object objA = aVar.a(this.c, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
