package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final /* synthetic */ int a = 0;

    static {
        g gVar = g.CONCURRENT;
        g gVar2 = g.UNORDERED;
        g gVar3 = g.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(gVar, gVar2, gVar3));
        Collections.unmodifiableSet(EnumSet.of(gVar, gVar2));
        Collections.unmodifiableSet(EnumSet.of(gVar3));
        Collections.unmodifiableSet(EnumSet.of(gVar2, gVar3));
        Set set = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(gVar2));
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
