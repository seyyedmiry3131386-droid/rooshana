package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uy6;
import defpackage.wf8;
import defpackage.y45;
import defpackage.zi8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements qp2 {
    public kotlinx.coroutines.sync.a a;
    public a b;
    public CharSequence c;
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CharSequence g;
    public final /* synthetic */ long h;
    public final /* synthetic */ a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(long j, g51 g51Var, a aVar, CharSequence charSequence) {
        super(2, g51Var);
        this.g = charSequence;
        this.h = j;
        this.i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.h, g51Var, this.i, this.g);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.f = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(y45.f(obj), (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        a aVar;
        CharSequence charSequence;
        TextSelection textSelection;
        kotlinx.coroutines.sync.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.e;
        if (i == 0) {
            kotlin.b.b(obj);
            TextClassifier textClassifierF = y45.f(this.f);
            long j2 = this.h;
            int iG = zi8.g(j2);
            int iF = zi8.f(j2);
            CharSequence charSequence2 = this.g;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iG, iF);
            a aVar3 = this.i;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(aVar3.c());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierF.suggestSelection(defaultLocales.build());
            long jB = uy6.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.d = jB;
                this.e = 2;
                if (a.a(aVar3, this.g, jB, textClassifierF, this) != coroutineSingletons) {
                    j = jB;
                }
            } else {
                kotlinx.coroutines.sync.a aVar4 = aVar3.e;
                this.f = textSelectionSuggestSelection;
                this.a = aVar4;
                this.b = aVar3;
                this.c = charSequence2;
                this.d = jB;
                this.e = 1;
                if (aVar4.b(this) != coroutineSingletons) {
                    aVar = aVar3;
                    charSequence = charSequence2;
                    textSelection = textSelectionSuggestSelection;
                    aVar2 = aVar4;
                    j = jB;
                    TextClassification textClassification = textSelection.getTextClassification();
                    js3.m(textClassification);
                    ((s08) aVar.g).setValue(new wf8(charSequence, j, textClassification));
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.d;
            charSequence = this.c;
            aVar = this.b;
            aVar2 = this.a;
            textSelection = (TextSelection) this.f;
            kotlin.b.b(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                js3.m(textClassification2);
                ((s08) aVar.g).setValue(new wf8(charSequence, j, textClassification2));
            } finally {
                aVar2.d(null);
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.d;
            kotlin.b.b(obj);
        }
        return new zi8(j);
    }
}
