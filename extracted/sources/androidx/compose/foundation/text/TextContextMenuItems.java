package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import defpackage.at2;
import defpackage.xs6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextContextMenuItems {
    public static final TextContextMenuItems d;
    public static final /* synthetic */ TextContextMenuItems[] e;
    public final Object a;
    public final int b;
    public final int c;

    static {
        TextContextMenuItems textContextMenuItems = new TextContextMenuItems("Cut", 0, at2.u, R.string.cut, R.attr.actionModeCutDrawable);
        TextContextMenuItems textContextMenuItems2 = new TextContextMenuItems("Copy", 1, at2.v, R.string.copy, R.attr.actionModeCopyDrawable);
        TextContextMenuItems textContextMenuItems3 = new TextContextMenuItems("Paste", 2, at2.w, R.string.paste, R.attr.actionModePasteDrawable);
        TextContextMenuItems textContextMenuItems4 = new TextContextMenuItems("SelectAll", 3, at2.x, R.string.selectAll, R.attr.actionModeSelectAllDrawable);
        TextContextMenuItems textContextMenuItems5 = new TextContextMenuItems("Autofill", 4, at2.y, Build.VERSION.SDK_INT <= 26 ? xs6.androidx_compose_foundation_autofill : R.string.autofill, 0);
        d = textContextMenuItems5;
        TextContextMenuItems[] textContextMenuItemsArr = {textContextMenuItems, textContextMenuItems2, textContextMenuItems3, textContextMenuItems4, textContextMenuItems5};
        e = textContextMenuItemsArr;
        kotlin.enums.a.a(textContextMenuItemsArr);
    }

    public TextContextMenuItems(String str, int i, Object obj, int i2, int i3) {
        this.a = obj;
        this.b = i2;
        this.c = i3;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) e.clone();
    }
}
