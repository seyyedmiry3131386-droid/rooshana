package androidx.compose.foundation.text.selection;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", l = {822}, m = "updateClipboardEntry$foundation", v = 1)
final class TextFieldSelectionManager$updateClipboardEntry$1 extends ContinuationImpl {
    public f a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$updateClipboardEntry$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.v(this);
    }
}
