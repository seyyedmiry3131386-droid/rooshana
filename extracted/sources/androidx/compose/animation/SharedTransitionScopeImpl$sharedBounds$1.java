package androidx.compose.animation;

import defpackage.dp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class SharedTransitionScopeImpl$sharedBounds$1 extends Lambda implements dp2 {
    static {
        new SharedTransitionScopeImpl$sharedBounds$1();
    }

    public SharedTransitionScopeImpl$sharedBounds$1() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((EnterExitState) obj) == EnterExitState.b);
    }
}
