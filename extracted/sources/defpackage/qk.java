package defpackage;

import androidx.compose.animation.core.AnimationEndReason;

/* JADX INFO: loaded from: classes.dex */
public final class qk {
    public final xk a;
    public final AnimationEndReason b;

    public qk(xk xkVar, AnimationEndReason animationEndReason) {
        this.a = xkVar;
        this.b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
