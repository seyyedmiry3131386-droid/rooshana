package kotlin.annotation;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationRetention {
    public static final /* synthetic */ AnnotationRetention[] a;

    static {
        AnnotationRetention[] annotationRetentionArr = {new AnnotationRetention("SOURCE", 0), new AnnotationRetention("BINARY", 1), new AnnotationRetention("RUNTIME", 2)};
        a = annotationRetentionArr;
        a.a(annotationRetentionArr);
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) a.clone();
    }
}
