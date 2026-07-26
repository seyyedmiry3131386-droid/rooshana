package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MergePaths$MergePathsMode {
    public static final MergePaths$MergePathsMode a;
    public static final MergePaths$MergePathsMode b;
    public static final MergePaths$MergePathsMode c;
    public static final MergePaths$MergePathsMode d;
    public static final MergePaths$MergePathsMode e;
    public static final /* synthetic */ MergePaths$MergePathsMode[] f;

    static {
        MergePaths$MergePathsMode mergePaths$MergePathsMode = new MergePaths$MergePathsMode("MERGE", 0);
        a = mergePaths$MergePathsMode;
        MergePaths$MergePathsMode mergePaths$MergePathsMode2 = new MergePaths$MergePathsMode("ADD", 1);
        b = mergePaths$MergePathsMode2;
        MergePaths$MergePathsMode mergePaths$MergePathsMode3 = new MergePaths$MergePathsMode("SUBTRACT", 2);
        c = mergePaths$MergePathsMode3;
        MergePaths$MergePathsMode mergePaths$MergePathsMode4 = new MergePaths$MergePathsMode("INTERSECT", 3);
        d = mergePaths$MergePathsMode4;
        MergePaths$MergePathsMode mergePaths$MergePathsMode5 = new MergePaths$MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
        e = mergePaths$MergePathsMode5;
        f = new MergePaths$MergePathsMode[]{mergePaths$MergePathsMode, mergePaths$MergePathsMode2, mergePaths$MergePathsMode3, mergePaths$MergePathsMode4, mergePaths$MergePathsMode5};
    }

    public static MergePaths$MergePathsMode valueOf(String str) {
        return (MergePaths$MergePathsMode) Enum.valueOf(MergePaths$MergePathsMode.class, str);
    }

    public static MergePaths$MergePathsMode[] values() {
        return (MergePaths$MergePathsMode[]) f.clone();
    }
}
