package androidx.constraintlayout.core.widgets.analyzer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class DependencyNode$Type {
    public static final DependencyNode$Type a;
    public static final DependencyNode$Type b;
    public static final DependencyNode$Type c;
    public static final DependencyNode$Type d;
    public static final DependencyNode$Type e;
    public static final DependencyNode$Type f;
    public static final DependencyNode$Type g;
    public static final DependencyNode$Type h;
    public static final /* synthetic */ DependencyNode$Type[] i;

    static {
        DependencyNode$Type dependencyNode$Type = new DependencyNode$Type("UNKNOWN", 0);
        a = dependencyNode$Type;
        DependencyNode$Type dependencyNode$Type2 = new DependencyNode$Type("HORIZONTAL_DIMENSION", 1);
        b = dependencyNode$Type2;
        DependencyNode$Type dependencyNode$Type3 = new DependencyNode$Type("VERTICAL_DIMENSION", 2);
        c = dependencyNode$Type3;
        DependencyNode$Type dependencyNode$Type4 = new DependencyNode$Type("LEFT", 3);
        d = dependencyNode$Type4;
        DependencyNode$Type dependencyNode$Type5 = new DependencyNode$Type("RIGHT", 4);
        e = dependencyNode$Type5;
        DependencyNode$Type dependencyNode$Type6 = new DependencyNode$Type("TOP", 5);
        f = dependencyNode$Type6;
        DependencyNode$Type dependencyNode$Type7 = new DependencyNode$Type("BOTTOM", 6);
        g = dependencyNode$Type7;
        DependencyNode$Type dependencyNode$Type8 = new DependencyNode$Type("BASELINE", 7);
        h = dependencyNode$Type8;
        i = new DependencyNode$Type[]{dependencyNode$Type, dependencyNode$Type2, dependencyNode$Type3, dependencyNode$Type4, dependencyNode$Type5, dependencyNode$Type6, dependencyNode$Type7, dependencyNode$Type8};
    }

    public static DependencyNode$Type valueOf(String str) {
        return (DependencyNode$Type) Enum.valueOf(DependencyNode$Type.class, str);
    }

    public static DependencyNode$Type[] values() {
        return (DependencyNode$Type[]) i.clone();
    }
}
