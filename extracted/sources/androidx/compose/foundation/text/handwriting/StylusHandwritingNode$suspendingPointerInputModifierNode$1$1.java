package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.e;
import defpackage.ah6;
import defpackage.g51;
import defpackage.k98;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend", v = 1)
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 extends RestrictedSuspendLambda implements qp2 {
    public ah6 b;
    public PointerEventPass c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ k98 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(k98 k98Var, g51 g51Var) {
        super(2, g51Var);
        this.f = k98Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.f, g51Var);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1$1.e = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1$1) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r9 == r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x023e, code lost:
    
        if (r4 != r1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0240, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01b0, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r11 == r1) goto L142;
     */
    /* JADX WARN: Path cross not found for [B:29:0x00a8, B:24:0x0087], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:32:0x00ad, B:35:0x00b3], limit reached: 190 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x023e -> B:143:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c6 -> B:40:0x00ca). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
