package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o03 {
    public final String a;
    public final List b;
    public final boolean c;

    public o03(List list, String str, boolean z) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z;
    }

    public abstract Object a(List list);
}
