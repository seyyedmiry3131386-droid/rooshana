package org.koin.core.logger;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Level {
    public static final Level a;
    public static final Level b;
    public static final Level c;
    public static final Level d;
    public static final Level e;
    public static final /* synthetic */ Level[] f;

    static {
        Level level = new Level("DEBUG", 0);
        a = level;
        Level level2 = new Level("INFO", 1);
        b = level2;
        Level level3 = new Level("WARNING", 2);
        c = level3;
        Level level4 = new Level("ERROR", 3);
        d = level4;
        Level level5 = new Level("NONE", 4);
        e = level5;
        Level[] levelArr = {level, level2, level3, level4, level5};
        f = levelArr;
        a.a(levelArr);
    }

    public static Level valueOf(String str) {
        return (Level) Enum.valueOf(Level.class, str);
    }

    public static Level[] values() {
        return (Level[]) f.clone();
    }
}
