package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class LottieDrawable$OnVisibleAction {
    public static final LottieDrawable$OnVisibleAction a;
    public static final LottieDrawable$OnVisibleAction b;
    public static final LottieDrawable$OnVisibleAction c;
    public static final /* synthetic */ LottieDrawable$OnVisibleAction[] d;

    static {
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = new LottieDrawable$OnVisibleAction("NONE", 0);
        a = lottieDrawable$OnVisibleAction;
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction2 = new LottieDrawable$OnVisibleAction("PLAY", 1);
        b = lottieDrawable$OnVisibleAction2;
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction3 = new LottieDrawable$OnVisibleAction("RESUME", 2);
        c = lottieDrawable$OnVisibleAction3;
        d = new LottieDrawable$OnVisibleAction[]{lottieDrawable$OnVisibleAction, lottieDrawable$OnVisibleAction2, lottieDrawable$OnVisibleAction3};
    }

    public static LottieDrawable$OnVisibleAction valueOf(String str) {
        return (LottieDrawable$OnVisibleAction) Enum.valueOf(LottieDrawable$OnVisibleAction.class, str);
    }

    public static LottieDrawable$OnVisibleAction[] values() {
        return (LottieDrawable$OnVisibleAction[]) d.clone();
    }
}
