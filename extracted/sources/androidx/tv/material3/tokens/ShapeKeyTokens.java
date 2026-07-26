package androidx.tv.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeKeyTokens {
    public static final /* synthetic */ ShapeKeyTokens[] a = {new ShapeKeyTokens("CornerExtraLarge", 0), new ShapeKeyTokens("CornerExtraLargeTop", 1), new ShapeKeyTokens("CornerExtraSmall", 2), new ShapeKeyTokens("CornerExtraSmallTop", 3), new ShapeKeyTokens("CornerFull", 4), new ShapeKeyTokens("CornerLarge", 5), new ShapeKeyTokens("CornerLargeEnd", 6), new ShapeKeyTokens("CornerLargeTop", 7), new ShapeKeyTokens("CornerMedium", 8), new ShapeKeyTokens("CornerNone", 9), new ShapeKeyTokens("CornerSmall", 10)};

    /* JADX INFO: Fake field, exist only in values array */
    ShapeKeyTokens EF5;

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) a.clone();
    }
}
