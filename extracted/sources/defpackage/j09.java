package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j09 implements ax4 {
    public static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final Object a;

    public j09(i09 i09Var) {
        this.a = i09Var;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        la1 nwVar;
        Uri uri = (Uri) obj;
        yq5 yq5Var = new yq5(uri);
        i09 i09Var = (i09) this.a;
        switch (i09Var.a) {
            case 0:
                nwVar = new nw(i09Var.b, uri, i09Var.c, 0);
                break;
            case 1:
                nwVar = new nw(i09Var.b, uri, i09Var.c, 1);
                break;
            default:
                nwVar = new o68(i09Var.b, uri, i09Var.c);
                break;
        }
        return new zw4(yq5Var, nwVar);
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
