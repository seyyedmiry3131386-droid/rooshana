package androidx.compose.foundation.text.selection;

import defpackage.ah6;
import defpackage.at2;
import defpackage.g51;
import defpackage.kg7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Ref$LongRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, Ref$LongRef ref$LongRef, g51 g51Var) {
        super(2, g51Var);
        this.d = j;
        this.e = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.d, this.e, g51Var);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.c = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        Ref$LongRef ref$LongRef = this.e;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.e eVar2 = (androidx.compose.ui.input.pointer.e) this.c;
            kg7 kg7Var = new kg7(ref$LongRef);
            this.c = eVar2;
            this.b = 1;
            Object objD = androidx.compose.foundation.gestures.d.d(eVar2, this.d, kg7Var, this);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = eVar2;
            obj = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (androidx.compose.ui.input.pointer.e) this.c;
            kotlin.b.b(obj);
        }
        if (((ah6) obj) != null && (ref$LongRef.a & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.b;
        }
        ah6 ah6Var = (ah6) kotlin.collections.a.o0(eVar.f.s.a);
        if (!at2.Q(ah6Var)) {
            return DownResolution.d;
        }
        ah6Var.a();
        return DownResolution.a;
    }
}
