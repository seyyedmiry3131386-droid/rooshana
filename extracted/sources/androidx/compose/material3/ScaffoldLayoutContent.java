package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class ScaffoldLayoutContent {
    public static final /* synthetic */ ScaffoldLayoutContent[] a;

    static {
        ScaffoldLayoutContent[] scaffoldLayoutContentArr = {new ScaffoldLayoutContent("TopBar", 0), new ScaffoldLayoutContent("MainContent", 1), new ScaffoldLayoutContent("Snackbar", 2), new ScaffoldLayoutContent("Fab", 3), new ScaffoldLayoutContent("BottomBar", 4)};
        a = scaffoldLayoutContentArr;
        kotlin.enums.a.a(scaffoldLayoutContentArr);
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) a.clone();
    }
}
