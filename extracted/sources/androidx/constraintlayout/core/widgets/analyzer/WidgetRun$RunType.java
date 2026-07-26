package androidx.constraintlayout.core.widgets.analyzer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class WidgetRun$RunType {
    public static final WidgetRun$RunType a;
    public static final WidgetRun$RunType b;
    public static final /* synthetic */ WidgetRun$RunType[] c;

    static {
        WidgetRun$RunType widgetRun$RunType = new WidgetRun$RunType("NONE", 0);
        a = widgetRun$RunType;
        WidgetRun$RunType widgetRun$RunType2 = new WidgetRun$RunType("START", 1);
        WidgetRun$RunType widgetRun$RunType3 = new WidgetRun$RunType("END", 2);
        WidgetRun$RunType widgetRun$RunType4 = new WidgetRun$RunType("CENTER", 3);
        b = widgetRun$RunType4;
        c = new WidgetRun$RunType[]{widgetRun$RunType, widgetRun$RunType2, widgetRun$RunType3, widgetRun$RunType4};
    }

    public static WidgetRun$RunType valueOf(String str) {
        return (WidgetRun$RunType) Enum.valueOf(WidgetRun$RunType.class, str);
    }

    public static WidgetRun$RunType[] values() {
        return (WidgetRun$RunType[]) c.clone();
    }
}
