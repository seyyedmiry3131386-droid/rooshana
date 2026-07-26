package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Handle {
    public static final Handle a;
    public static final Handle b;
    public static final Handle c;
    public static final /* synthetic */ Handle[] d;

    static {
        Handle handle = new Handle("Cursor", 0);
        a = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        b = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        c = handle3;
        Handle[] handleArr = {handle, handle2, handle3};
        d = handleArr;
        kotlin.enums.a.a(handleArr);
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) d.clone();
    }
}
