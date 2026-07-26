package androidx.compose.foundation.text.input.internal.selection;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1", f = "TextFieldSelectionState.android.kt", l = {78}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 extends SuspendLambda implements dp2 {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(1, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 = (TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1) create((g51) obj);
        tx8 tx8Var = tx8.a;
        textFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.a = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        return tx8.a;
    }
}
