package com.google.firebase.logger;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Logger$Level {
    public static final /* synthetic */ Logger$Level[] a;

    static {
        Logger$Level[] logger$LevelArr = {new Logger$Level("VERBOSE", 0), new Logger$Level("DEBUG", 1), new Logger$Level("INFO", 2), new Logger$Level("WARN", 3), new Logger$Level("ERROR", 4)};
        a = logger$LevelArr;
        a.a(logger$LevelArr);
    }

    public static Logger$Level valueOf(String str) {
        return (Logger$Level) Enum.valueOf(Logger$Level.class, str);
    }

    public static Logger$Level[] values() {
        return (Logger$Level[]) a.clone();
    }
}
