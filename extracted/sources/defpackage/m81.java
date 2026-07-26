package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.p1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m81 {
    public static final p1 c = p1.c().g(new l31(8));
    public static final m81 d = new m81(0, ImmutableList.q());
    public static final String e;
    public static final String f;
    public final ImmutableList a;
    public final long b;

    static {
        String str = j29.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public m81(long j, List list) {
        this.a = ImmutableList.x(c, list);
        this.b = j;
    }
}
