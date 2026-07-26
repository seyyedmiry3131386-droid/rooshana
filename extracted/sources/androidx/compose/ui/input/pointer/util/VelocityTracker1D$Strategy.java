package androidx.compose.ui.input.pointer.util;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class VelocityTracker1D$Strategy {
    public static final VelocityTracker1D$Strategy a;
    public static final VelocityTracker1D$Strategy b;
    public static final /* synthetic */ VelocityTracker1D$Strategy[] c;

    static {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = new VelocityTracker1D$Strategy("Lsq2", 0);
        a = velocityTracker1D$Strategy;
        VelocityTracker1D$Strategy velocityTracker1D$Strategy2 = new VelocityTracker1D$Strategy("Impulse", 1);
        b = velocityTracker1D$Strategy2;
        VelocityTracker1D$Strategy[] velocityTracker1D$StrategyArr = {velocityTracker1D$Strategy, velocityTracker1D$Strategy2};
        c = velocityTracker1D$StrategyArr;
        a.a(velocityTracker1D$StrategyArr);
    }

    public static VelocityTracker1D$Strategy valueOf(String str) {
        return (VelocityTracker1D$Strategy) Enum.valueOf(VelocityTracker1D$Strategy.class, str);
    }

    public static VelocityTracker1D$Strategy[] values() {
        return (VelocityTracker1D$Strategy[]) c.clone();
    }
}
