package androidx.paging;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", l = {616}, m = "invokeSuspend", v = 1)
final class SeparatorsKt$insertEventSeparators$separatorState$1 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rp2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorsKt$insertEventSeparators$separatorState$1(rp2 rp2Var, g51 g51Var) {
        super(3, g51Var);
        this.d = rp2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new SeparatorsKt$insertEventSeparators$separatorState$1(this.d, (g51) obj3);
        separatorsKt$insertEventSeparators$separatorState$1.b = obj;
        separatorsKt$insertEventSeparators$separatorState$1.c = obj2;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(tx8.a);
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
        Object obj2 = this.b;
        Object obj3 = this.c;
        this.b = null;
        this.a = 1;
        Object objA = this.d.a(obj2, obj3, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
