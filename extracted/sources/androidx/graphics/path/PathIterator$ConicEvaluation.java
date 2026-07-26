package androidx.graphics.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PathIterator$ConicEvaluation {
    public static final /* synthetic */ PathIterator$ConicEvaluation[] a = {new PathIterator$ConicEvaluation("AsConic", 0), new PathIterator$ConicEvaluation("AsQuadratics", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    PathIterator$ConicEvaluation EF5;

    public static PathIterator$ConicEvaluation valueOf(String str) {
        return (PathIterator$ConicEvaluation) Enum.valueOf(PathIterator$ConicEvaluation.class, str);
    }

    public static PathIterator$ConicEvaluation[] values() {
        return (PathIterator$ConicEvaluation[]) a.clone();
    }
}
