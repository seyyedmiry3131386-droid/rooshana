package androidx.compose.ui.text.font;

import defpackage.dp2;
import defpackage.g51;
import defpackage.p67;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend", v = 1)
final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ p67 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(b bVar, p67 p67Var, g51 g51Var) {
        super(1, g51Var);
        this.b = bVar;
        this.c = p67Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AsyncFontListLoader$load$2$typeface$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AsyncFontListLoader$load$2$typeface$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        this.a = 1;
        Object objC = this.b.c(this.c, this);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }
}
