package androidx.datastore.preferences;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$Value$ValueCase {
    public static final PreferencesProto$Value$ValueCase a;
    public static final PreferencesProto$Value$ValueCase b;
    public static final PreferencesProto$Value$ValueCase c;
    public static final PreferencesProto$Value$ValueCase d;
    public static final PreferencesProto$Value$ValueCase e;
    public static final PreferencesProto$Value$ValueCase f;
    public static final PreferencesProto$Value$ValueCase g;
    public static final PreferencesProto$Value$ValueCase h;
    public static final PreferencesProto$Value$ValueCase i;
    public static final /* synthetic */ PreferencesProto$Value$ValueCase[] j;

    static {
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase = new PreferencesProto$Value$ValueCase("BOOLEAN", 0);
        a = preferencesProto$Value$ValueCase;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase2 = new PreferencesProto$Value$ValueCase("FLOAT", 1);
        b = preferencesProto$Value$ValueCase2;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase3 = new PreferencesProto$Value$ValueCase("INTEGER", 2);
        c = preferencesProto$Value$ValueCase3;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase4 = new PreferencesProto$Value$ValueCase("LONG", 3);
        d = preferencesProto$Value$ValueCase4;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase5 = new PreferencesProto$Value$ValueCase("STRING", 4);
        e = preferencesProto$Value$ValueCase5;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase6 = new PreferencesProto$Value$ValueCase("STRING_SET", 5);
        f = preferencesProto$Value$ValueCase6;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase7 = new PreferencesProto$Value$ValueCase("DOUBLE", 6);
        g = preferencesProto$Value$ValueCase7;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase8 = new PreferencesProto$Value$ValueCase("BYTES", 7);
        h = preferencesProto$Value$ValueCase8;
        PreferencesProto$Value$ValueCase preferencesProto$Value$ValueCase9 = new PreferencesProto$Value$ValueCase("VALUE_NOT_SET", 8);
        i = preferencesProto$Value$ValueCase9;
        j = new PreferencesProto$Value$ValueCase[]{preferencesProto$Value$ValueCase, preferencesProto$Value$ValueCase2, preferencesProto$Value$ValueCase3, preferencesProto$Value$ValueCase4, preferencesProto$Value$ValueCase5, preferencesProto$Value$ValueCase6, preferencesProto$Value$ValueCase7, preferencesProto$Value$ValueCase8, preferencesProto$Value$ValueCase9};
    }

    public static PreferencesProto$Value$ValueCase valueOf(String str) {
        return (PreferencesProto$Value$ValueCase) Enum.valueOf(PreferencesProto$Value$ValueCase.class, str);
    }

    public static PreferencesProto$Value$ValueCase[] values() {
        return (PreferencesProto$Value$ValueCase[]) j.clone();
    }
}
