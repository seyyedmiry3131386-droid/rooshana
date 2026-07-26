package androidx.compose.material3.tokens;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MotionSchemeKeyTokens {
    public static final MotionSchemeKeyTokens a;
    public static final MotionSchemeKeyTokens b;
    public static final MotionSchemeKeyTokens c;
    public static final MotionSchemeKeyTokens d;
    public static final MotionSchemeKeyTokens e;
    public static final /* synthetic */ MotionSchemeKeyTokens[] f;

    static {
        MotionSchemeKeyTokens motionSchemeKeyTokens = new MotionSchemeKeyTokens("DefaultSpatial", 0);
        a = motionSchemeKeyTokens;
        MotionSchemeKeyTokens motionSchemeKeyTokens2 = new MotionSchemeKeyTokens("FastSpatial", 1);
        b = motionSchemeKeyTokens2;
        MotionSchemeKeyTokens motionSchemeKeyTokens3 = new MotionSchemeKeyTokens("SlowSpatial", 2);
        MotionSchemeKeyTokens motionSchemeKeyTokens4 = new MotionSchemeKeyTokens("DefaultEffects", 3);
        c = motionSchemeKeyTokens4;
        MotionSchemeKeyTokens motionSchemeKeyTokens5 = new MotionSchemeKeyTokens("FastEffects", 4);
        d = motionSchemeKeyTokens5;
        MotionSchemeKeyTokens motionSchemeKeyTokens6 = new MotionSchemeKeyTokens("SlowEffects", 5);
        e = motionSchemeKeyTokens6;
        MotionSchemeKeyTokens[] motionSchemeKeyTokensArr = {motionSchemeKeyTokens, motionSchemeKeyTokens2, motionSchemeKeyTokens3, motionSchemeKeyTokens4, motionSchemeKeyTokens5, motionSchemeKeyTokens6};
        f = motionSchemeKeyTokensArr;
        a.a(motionSchemeKeyTokensArr);
    }

    public static MotionSchemeKeyTokens valueOf(String str) {
        return (MotionSchemeKeyTokens) Enum.valueOf(MotionSchemeKeyTokens.class, str);
    }

    public static MotionSchemeKeyTokens[] values() {
        return (MotionSchemeKeyTokens[]) f.clone();
    }
}
