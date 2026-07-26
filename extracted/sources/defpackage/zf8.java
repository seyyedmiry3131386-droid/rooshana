package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class zf8 {
    public static final zf8 b = new zf8(EmptyList.a);
    public final List a;

    public zf8(List list) {
        this.a = list;
    }

    public final String toString() {
        return rm7.m(')', "TextContextMenuData(components=", k94.a(this.a, "\n\t", null, 56));
    }
}
