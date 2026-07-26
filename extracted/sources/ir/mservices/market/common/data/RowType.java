package ir.mservices.market.common.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RowType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ RowType[] $VALUES;
    private final int bottomLeft;
    private final int bottomRight;
    private final int topLeft;
    private final int topRight;
    public static final RowType TOP = new RowType("TOP", 0, RowTypeKt.largeCurve, RowTypeKt.largeCurve, RowTypeKt.smallCurve, RowTypeKt.smallCurve);
    public static final RowType CENTER = new RowType("CENTER", 1, RowTypeKt.smallCurve, RowTypeKt.smallCurve, RowTypeKt.smallCurve, RowTypeKt.smallCurve);
    public static final RowType BOTTOM = new RowType("BOTTOM", 2, RowTypeKt.smallCurve, RowTypeKt.smallCurve, RowTypeKt.largeCurve, RowTypeKt.largeCurve);
    public static final RowType SINGLE = new RowType("SINGLE", 3, RowTypeKt.largeCurve, RowTypeKt.largeCurve, RowTypeKt.largeCurve, RowTypeKt.largeCurve);
    public static final RowType LEFT = new RowType("LEFT", 4, RowTypeKt.largeCurve, RowTypeKt.smallCurve, RowTypeKt.largeCurve, RowTypeKt.smallCurve);
    public static final RowType RIGHT = new RowType("RIGHT", 5, RowTypeKt.smallCurve, RowTypeKt.largeCurve, RowTypeKt.smallCurve, RowTypeKt.largeCurve);

    private static final /* synthetic */ RowType[] $values() {
        return new RowType[]{TOP, CENTER, BOTTOM, SINGLE, LEFT, RIGHT};
    }

    static {
        RowType[] rowTypeArr$values = $values();
        $VALUES = rowTypeArr$values;
        $ENTRIES = a.a(rowTypeArr$values);
    }

    private RowType(String str, int i, int i2, int i3, int i4, int i5) {
        this.topLeft = i2;
        this.topRight = i3;
        this.bottomLeft = i4;
        this.bottomRight = i5;
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static RowType valueOf(String str) {
        return (RowType) Enum.valueOf(RowType.class, str);
    }

    public static RowType[] values() {
        return (RowType[]) $VALUES.clone();
    }

    public final int getBottomLeft() {
        return this.bottomLeft;
    }

    public final int getBottomRight() {
        return this.bottomRight;
    }

    public final int getTopLeft() {
        return this.topLeft;
    }

    public final int getTopRight() {
        return this.topRight;
    }
}
