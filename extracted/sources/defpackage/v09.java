package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v09 implements ax4 {
    public static final Set b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final ax4 a;

    public v09(ax4 ax4Var) {
        this.a = ax4Var;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        return this.a.a(new ot2(((Uri) obj).toString(), dy2.a), i, i2, sv5Var);
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
