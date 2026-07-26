package androidx.compose.animation;

import defpackage.dp2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class VeilModifierNode$draw$veilColor$2 extends Lambda implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int iOrdinal = ((EnterExitState) obj).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            throw null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
