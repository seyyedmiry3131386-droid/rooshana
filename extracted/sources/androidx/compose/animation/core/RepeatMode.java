package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RepeatMode {
    public static final RepeatMode a;
    public static final /* synthetic */ RepeatMode[] b;

    static {
        RepeatMode repeatMode = new RepeatMode("Restart", 0);
        a = repeatMode;
        RepeatMode[] repeatModeArr = {repeatMode, new RepeatMode("Reverse", 1)};
        b = repeatModeArr;
        kotlin.enums.a.a(repeatModeArr);
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) b.clone();
    }
}
