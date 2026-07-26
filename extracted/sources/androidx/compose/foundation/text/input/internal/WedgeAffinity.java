package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class WedgeAffinity {
    public static final /* synthetic */ WedgeAffinity[] a;

    static {
        WedgeAffinity[] wedgeAffinityArr = {new WedgeAffinity("Start", 0), new WedgeAffinity("End", 1)};
        a = wedgeAffinityArr;
        kotlin.enums.a.a(wedgeAffinityArr);
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) a.clone();
    }
}
