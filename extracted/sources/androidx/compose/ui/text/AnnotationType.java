package androidx.compose.ui.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class AnnotationType {
    public static final AnnotationType a;
    public static final AnnotationType b;
    public static final AnnotationType c;
    public static final AnnotationType d;
    public static final AnnotationType e;
    public static final AnnotationType f;
    public static final AnnotationType g;
    public static final /* synthetic */ AnnotationType[] h;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        a = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        b = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        c = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("Url", 3);
        d = annotationType4;
        AnnotationType annotationType5 = new AnnotationType("Link", 4);
        e = annotationType5;
        AnnotationType annotationType6 = new AnnotationType("Clickable", 5);
        f = annotationType6;
        AnnotationType annotationType7 = new AnnotationType("String", 6);
        g = annotationType7;
        AnnotationType[] annotationTypeArr = {annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
        h = annotationTypeArr;
        kotlin.enums.a.a(annotationTypeArr);
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) h.clone();
    }
}
