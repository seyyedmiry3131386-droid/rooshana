package kotlin.internal;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RequireKotlinVersionKind {
    public static final /* synthetic */ RequireKotlinVersionKind[] a;

    static {
        RequireKotlinVersionKind[] requireKotlinVersionKindArr = {new RequireKotlinVersionKind("LANGUAGE_VERSION", 0), new RequireKotlinVersionKind("COMPILER_VERSION", 1), new RequireKotlinVersionKind("API_VERSION", 2)};
        a = requireKotlinVersionKindArr;
        a.a(requireKotlinVersionKindArr);
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) a.clone();
    }
}
