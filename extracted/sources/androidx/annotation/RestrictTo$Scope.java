package androidx.annotation;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RestrictTo$Scope {
    public static final /* synthetic */ RestrictTo$Scope[] a;

    static {
        RestrictTo$Scope[] restrictTo$ScopeArr = {new RestrictTo$Scope("LIBRARY", 0), new RestrictTo$Scope("LIBRARY_GROUP", 1), new RestrictTo$Scope("LIBRARY_GROUP_PREFIX", 2), new RestrictTo$Scope("GROUP_ID", 3), new RestrictTo$Scope("TESTS", 4), new RestrictTo$Scope("SUBCLASSES", 5)};
        a = restrictTo$ScopeArr;
        a.a(restrictTo$ScopeArr);
    }

    public static RestrictTo$Scope valueOf(String str) {
        return (RestrictTo$Scope) Enum.valueOf(RestrictTo$Scope.class, str);
    }

    public static RestrictTo$Scope[] values() {
        return (RestrictTo$Scope[]) a.clone();
    }
}
