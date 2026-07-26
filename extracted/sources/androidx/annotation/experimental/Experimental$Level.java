package androidx.annotation.experimental;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Experimental$Level {
    public static final /* synthetic */ Experimental$Level[] a;

    static {
        Experimental$Level[] experimental$LevelArr = {new Experimental$Level("WARNING", 0), new Experimental$Level("ERROR", 1)};
        a = experimental$LevelArr;
        a.a(experimental$LevelArr);
    }

    public static Experimental$Level valueOf(String str) {
        return (Experimental$Level) Enum.valueOf(Experimental$Level.class, str);
    }

    public static Experimental$Level[] values() {
        return (Experimental$Level[]) a.clone();
    }
}
