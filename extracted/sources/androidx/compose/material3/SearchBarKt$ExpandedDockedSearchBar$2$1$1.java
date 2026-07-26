package androidx.compose.material3;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$2$1$1", f = "SearchBar.kt", l = {455}, m = "invokeSuspend")
final class SearchBarKt$ExpandedDockedSearchBar$2$1$1 extends SuspendLambda implements qp2 {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SearchBarKt$ExpandedDockedSearchBar$2$1$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        SearchBarKt$ExpandedDockedSearchBar$2$1$1 searchBarKt$ExpandedDockedSearchBar$2$1$1 = (SearchBarKt$ExpandedDockedSearchBar$2$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        searchBarKt$ExpandedDockedSearchBar$2$1$1.invokeSuspend(tx8Var);
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
