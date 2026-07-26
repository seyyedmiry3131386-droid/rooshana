package androidx.compose.material3.tokens;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeKeyTokens {
    public static final ShapeKeyTokens a;
    public static final ShapeKeyTokens b;
    public static final ShapeKeyTokens c;
    public static final ShapeKeyTokens d;
    public static final /* synthetic */ ShapeKeyTokens[] e;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraExtraLarge", 0);
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLarge", 1);
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraLargeIncreased", 2);
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraLargeTop", 3);
        a = shapeKeyTokens4;
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerExtraSmall", 4);
        b = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerExtraSmallTop", 5);
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerFull", 6);
        c = shapeKeyTokens7;
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLarge", 7);
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerLargeEnd", 8);
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerLargeIncreased", 9);
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerLargeStart", 10);
        ShapeKeyTokens shapeKeyTokens12 = new ShapeKeyTokens("CornerLargeTop", 11);
        ShapeKeyTokens shapeKeyTokens13 = new ShapeKeyTokens("CornerMedium", 12);
        d = shapeKeyTokens13;
        ShapeKeyTokens[] shapeKeyTokensArr = {shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11, shapeKeyTokens12, shapeKeyTokens13, new ShapeKeyTokens("CornerNone", 13), new ShapeKeyTokens("CornerSmall", 14)};
        e = shapeKeyTokensArr;
        a.a(shapeKeyTokensArr);
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) e.clone();
    }
}
