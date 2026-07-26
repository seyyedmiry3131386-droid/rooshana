package kotlinx.serialization.json.internal;

import defpackage.r22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class WriteMode {
    public static final WriteMode c;
    public static final WriteMode d;
    public static final WriteMode e;
    public static final WriteMode f;
    public static final /* synthetic */ WriteMode[] g;
    public static final /* synthetic */ r22 h;
    public final char a;
    public final char b;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        c = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        d = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        e = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        f = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        g = writeModeArr;
        h = kotlin.enums.a.a(writeModeArr);
    }

    public WriteMode(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) g.clone();
    }
}
