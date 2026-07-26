package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ul;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.a = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        a aVar = this.a;
        TextClassifier textClassifierJ = ul.j(aVar.b, aVar.c);
        aVar.f = textClassifierJ;
        return textClassifierJ;
    }
}
