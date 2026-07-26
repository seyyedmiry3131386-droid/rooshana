package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationEndReason {
    public static final AnimationEndReason a;
    public static final AnimationEndReason b;
    public static final /* synthetic */ AnimationEndReason[] c;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        a = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        b = animationEndReason2;
        AnimationEndReason[] animationEndReasonArr = {animationEndReason, animationEndReason2};
        c = animationEndReasonArr;
        kotlin.enums.a.a(animationEndReasonArr);
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) c.clone();
    }
}
