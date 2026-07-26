package androidx.compose.ui.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PathSegment$Type {
    public static final /* synthetic */ PathSegment$Type[] a;

    static {
        PathSegment$Type[] pathSegment$TypeArr = {new PathSegment$Type("Move", 0), new PathSegment$Type("Line", 1), new PathSegment$Type("Quadratic", 2), new PathSegment$Type("Conic", 3), new PathSegment$Type("Cubic", 4), new PathSegment$Type("Close", 5), new PathSegment$Type("Done", 6)};
        a = pathSegment$TypeArr;
        kotlin.enums.a.a(pathSegment$TypeArr);
    }

    public static PathSegment$Type valueOf(String str) {
        return (PathSegment$Type) Enum.valueOf(PathSegment$Type.class, str);
    }

    public static PathSegment$Type[] values() {
        return (PathSegment$Type[]) a.clone();
    }
}
