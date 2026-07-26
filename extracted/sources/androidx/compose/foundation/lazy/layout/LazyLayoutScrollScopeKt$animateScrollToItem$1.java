package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.f;
import defpackage.j34;
import defpackage.l34;
import defpackage.m34;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.un3;
import defpackage.wu8;
import defpackage.xk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", l = {177, 264}, m = "animateScrollToItem", v = 1)
final class LazyLayoutScrollScopeKt$animateScrollToItem$1 extends ContinuationImpl {
    public Ref$BooleanRef a;
    public Ref$ObjectRef b;
    public Ref$IntRef c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public /* synthetic */ Object j;
    public int k;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        ItemFoundInScroll itemFoundInScroll;
        int i;
        this.j = obj;
        int i2 = this.k | Integer.MIN_VALUE;
        this.k = i2;
        int i3 = m34.a;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.k = i2 - Integer.MIN_VALUE;
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = this;
        } else {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = new LazyLayoutScrollScopeKt$animateScrollToItem$1(this);
        }
        Object obj2 = lazyLayoutScrollScopeKt$animateScrollToItem$1.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.k;
        if (i4 == 0) {
            kotlin.b.b(obj2);
            if (0 < 0.0f) {
                un3.a("Index should be non-negative");
            }
            try {
                int i5 = m34.a;
                throw null;
            } catch (ItemFoundInScroll e) {
                itemFoundInScroll = e;
                i = 0;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj2);
                throw null;
            }
            i = lazyLayoutScrollScopeKt$animateScrollToItem$1.d;
            Ref$IntRef ref$IntRef = lazyLayoutScrollScopeKt$animateScrollToItem$1.c;
            Ref$BooleanRef ref$BooleanRef = lazyLayoutScrollScopeKt$animateScrollToItem$1.a;
            try {
                kotlin.b.b(obj2);
                ref$IntRef.a++;
                if (ref$BooleanRef.a) {
                    throw null;
                }
                return tx8.a;
            } catch (ItemFoundInScroll e2) {
                itemFoundInScroll = e2;
            }
        }
        xk xkVarN = wu8.n(itemFoundInScroll.b, 0.0f, 0.0f, 30);
        float f = itemFoundInScroll.a;
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        boolean z = false;
        Float f2 = new Float(f);
        if (((Number) xkVarN.a()).floatValue() == 0.0f) {
            z = true;
        }
        l34 l34Var = new l34(f, ref$FloatRef, (j34) null);
        lazyLayoutScrollScopeKt$animateScrollToItem$1.a = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.b = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.c = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.d = i;
        lazyLayoutScrollScopeKt$animateScrollToItem$1.k = 2;
        if (f.f(xkVarN, f2, null, !z, l34Var, lazyLayoutScrollScopeKt$animateScrollToItem$1, 2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        throw null;
    }
}
