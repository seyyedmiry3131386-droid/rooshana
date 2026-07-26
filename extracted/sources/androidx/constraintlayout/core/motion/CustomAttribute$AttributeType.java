package androidx.constraintlayout.core.motion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CustomAttribute$AttributeType {
    public static final /* synthetic */ CustomAttribute$AttributeType[] a = {new CustomAttribute$AttributeType("INT_TYPE", 0), new CustomAttribute$AttributeType("FLOAT_TYPE", 1), new CustomAttribute$AttributeType("COLOR_TYPE", 2), new CustomAttribute$AttributeType("COLOR_DRAWABLE_TYPE", 3), new CustomAttribute$AttributeType("STRING_TYPE", 4), new CustomAttribute$AttributeType("BOOLEAN_TYPE", 5), new CustomAttribute$AttributeType("DIMENSION_TYPE", 6), new CustomAttribute$AttributeType("REFERENCE_TYPE", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    CustomAttribute$AttributeType EF5;

    public static CustomAttribute$AttributeType valueOf(String str) {
        return (CustomAttribute$AttributeType) Enum.valueOf(CustomAttribute$AttributeType.class, str);
    }

    public static CustomAttribute$AttributeType[] values() {
        return (CustomAttribute$AttributeType[]) a.clone();
    }
}
