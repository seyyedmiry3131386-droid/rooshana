package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class IndexTransformationType {
    public static final /* synthetic */ IndexTransformationType[] a;

    static {
        IndexTransformationType[] indexTransformationTypeArr = {new IndexTransformationType("Untransformed", 0), new IndexTransformationType("Insertion", 1), new IndexTransformationType("Replacement", 2), new IndexTransformationType("Deletion", 3)};
        a = indexTransformationTypeArr;
        kotlin.enums.a.a(indexTransformationTypeArr);
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) a.clone();
    }
}
