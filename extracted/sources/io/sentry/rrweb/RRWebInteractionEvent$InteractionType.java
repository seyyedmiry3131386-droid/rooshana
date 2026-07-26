package io.sentry.rrweb;

import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum RRWebInteractionEvent$InteractionType implements g2 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        ((io.sentry.internal.debugmeta.c) i3Var).v(ordinal());
    }
}
