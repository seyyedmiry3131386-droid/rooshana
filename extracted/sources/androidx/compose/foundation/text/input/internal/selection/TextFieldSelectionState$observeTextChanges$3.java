package androidx.compose.foundation.text.input.internal.selection;

import defpackage.ch8;
import defpackage.qp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements qp2 {
    static {
        new TextFieldSelectionState$observeTextChanges$3();
    }

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, ch8.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj2;
        ((ch8) obj).getClass();
        return Boolean.valueOf(charSequence == null);
    }
}
