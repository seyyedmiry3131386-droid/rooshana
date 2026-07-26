package kotlin.io.path;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PathWalkOption {
    public static final /* synthetic */ PathWalkOption[] a;

    static {
        PathWalkOption[] pathWalkOptionArr = {new PathWalkOption("INCLUDE_DIRECTORIES", 0), new PathWalkOption("BREADTH_FIRST", 1), new PathWalkOption("FOLLOW_LINKS", 2)};
        a = pathWalkOptionArr;
        a.a(pathWalkOptionArr);
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) a.clone();
    }
}
