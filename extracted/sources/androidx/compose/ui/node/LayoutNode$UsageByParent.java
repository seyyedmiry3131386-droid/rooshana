package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode$UsageByParent {
    public static final LayoutNode$UsageByParent a;
    public static final LayoutNode$UsageByParent b;
    public static final LayoutNode$UsageByParent c;
    public static final /* synthetic */ LayoutNode$UsageByParent[] d;

    static {
        LayoutNode$UsageByParent layoutNode$UsageByParent = new LayoutNode$UsageByParent("InMeasureBlock", 0);
        a = layoutNode$UsageByParent;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = new LayoutNode$UsageByParent("InLayoutBlock", 1);
        b = layoutNode$UsageByParent2;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = new LayoutNode$UsageByParent("NotUsed", 2);
        c = layoutNode$UsageByParent3;
        LayoutNode$UsageByParent[] layoutNode$UsageByParentArr = {layoutNode$UsageByParent, layoutNode$UsageByParent2, layoutNode$UsageByParent3};
        d = layoutNode$UsageByParentArr;
        kotlin.enums.a.a(layoutNode$UsageByParentArr);
    }

    public static LayoutNode$UsageByParent valueOf(String str) {
        return (LayoutNode$UsageByParent) Enum.valueOf(LayoutNode$UsageByParent.class, str);
    }

    public static LayoutNode$UsageByParent[] values() {
        return (LayoutNode$UsageByParent[]) d.clone();
    }
}
