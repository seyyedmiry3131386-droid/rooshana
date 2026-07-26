package coil3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Logger$Level {
    public static final /* synthetic */ Logger$Level[] a;

    static {
        Logger$Level[] logger$LevelArr = {new Logger$Level("Verbose", 0), new Logger$Level("Debug", 1), new Logger$Level("Info", 2), new Logger$Level("Warn", 3), new Logger$Level("Error", 4)};
        a = logger$LevelArr;
        kotlin.enums.a.a(logger$LevelArr);
    }

    public static Logger$Level valueOf(String str) {
        return (Logger$Level) Enum.valueOf(Logger$Level.class, str);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[]) a.clone();
    }
}
