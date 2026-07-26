package androidx.annotation;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class InspectableProperty$ValueType {
    public static final /* synthetic */ InspectableProperty$ValueType[] a;

    static {
        InspectableProperty$ValueType[] inspectableProperty$ValueTypeArr = {new InspectableProperty$ValueType("NONE", 0), new InspectableProperty$ValueType("INFERRED", 1), new InspectableProperty$ValueType("INT_ENUM", 2), new InspectableProperty$ValueType("INT_FLAG", 3), new InspectableProperty$ValueType("COLOR", 4), new InspectableProperty$ValueType("GRAVITY", 5), new InspectableProperty$ValueType("RESOURCE_ID", 6)};
        a = inspectableProperty$ValueTypeArr;
        a.a(inspectableProperty$ValueTypeArr);
    }

    public static InspectableProperty$ValueType valueOf(String str) {
        return (InspectableProperty$ValueType) Enum.valueOf(InspectableProperty$ValueType.class, str);
    }

    public static InspectableProperty$ValueType[] values() {
        return (InspectableProperty$ValueType[]) a.clone();
    }
}
