package androidx.annotation;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RequiresOptIn$Level {
    public static final /* synthetic */ RequiresOptIn$Level[] a;

    static {
        RequiresOptIn$Level[] requiresOptIn$LevelArr = {new RequiresOptIn$Level("WARNING", 0), new RequiresOptIn$Level("ERROR", 1)};
        a = requiresOptIn$LevelArr;
        a.a(requiresOptIn$LevelArr);
    }

    public static RequiresOptIn$Level valueOf(String str) {
        return (RequiresOptIn$Level) Enum.valueOf(RequiresOptIn$Level.class, str);
    }

    public static RequiresOptIn$Level[] values() {
        return (RequiresOptIn$Level[]) a.clone();
    }
}
