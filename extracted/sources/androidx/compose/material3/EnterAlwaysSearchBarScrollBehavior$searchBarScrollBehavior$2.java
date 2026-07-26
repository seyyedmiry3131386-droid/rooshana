package androidx.compose.material3;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2", f = "SearchBar.kt", l = {904}, m = "invokeSuspend")
final class EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 extends SuspendLambda implements rp2 {
    public int a;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2 = new EnterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2(3, (g51) obj3);
        tx8 tx8Var = tx8.a;
        enterAlwaysSearchBarScrollBehavior$searchBarScrollBehavior$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return tx8.a;
    }
}
