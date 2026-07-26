package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class v6 {
    public static final v6 DISTINCT;
    public static final v6 ORDERED;
    public static final v6 SHORT_CIRCUIT;
    public static final v6 SIZED;
    public static final v6 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ v6[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public static v6 valueOf(String str) {
        return (v6) Enum.valueOf(v6.class, str);
    }

    public static v6[] values() {
        return (v6[]) v.clone();
    }

    static {
        u6 u6Var = u6.SPLITERATOR;
        j$.time.format.r rVarO = o(u6Var);
        u6 u6Var2 = u6.STREAM;
        rVarO.b(u6Var2);
        u6 u6Var3 = u6.OP;
        ((EnumMap) rVarO.a).put(u6Var3, 3);
        v6 v6Var = new v6("DISTINCT", 0, 0, rVarO);
        DISTINCT = v6Var;
        j$.time.format.r rVarO2 = o(u6Var);
        rVarO2.b(u6Var2);
        ((EnumMap) rVarO2.a).put(u6Var3, 3);
        v6 v6Var2 = new v6("SORTED", 1, 1, rVarO2);
        SORTED = v6Var2;
        j$.time.format.r rVarO3 = o(u6Var);
        rVarO3.b(u6Var2);
        ((EnumMap) rVarO3.a).put(u6Var3, 3);
        u6 u6Var4 = u6.TERMINAL_OP;
        ((EnumMap) rVarO3.a).put(u6Var4, 2);
        u6 u6Var5 = u6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) rVarO3.a).put(u6Var5, 2);
        v6 v6Var3 = new v6("ORDERED", 2, 2, rVarO3);
        ORDERED = v6Var3;
        j$.time.format.r rVarO4 = o(u6Var);
        rVarO4.b(u6Var2);
        ((EnumMap) rVarO4.a).put(u6Var3, 2);
        v6 v6Var4 = new v6("SIZED", 3, 3, rVarO4);
        SIZED = v6Var4;
        j$.time.format.r rVarO5 = o(u6Var3);
        rVarO5.b(u6Var4);
        int i2 = 0;
        v6 v6Var5 = new v6("SHORT_CIRCUIT", 4, 12, rVarO5);
        SHORT_CIRCUIT = v6Var5;
        v = new v6[]{v6Var, v6Var2, v6Var3, v6Var4, v6Var5};
        f = j(u6Var);
        g = j(u6Var2);
        h = j(u6Var3);
        j(u6Var4);
        j(u6Var5);
        for (v6 v6Var6 : values()) {
            i2 |= v6Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        v6 v6Var7 = DISTINCT;
        m = v6Var7.c;
        n = v6Var7.d;
        v6 v6Var8 = SORTED;
        o = v6Var8.c;
        p = v6Var8.d;
        v6 v6Var9 = ORDERED;
        q = v6Var9.c;
        r = v6Var9.d;
        v6 v6Var10 = SIZED;
        s = v6Var10.c;
        t = v6Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public static j$.time.format.r o(u6 u6Var) {
        j$.time.format.r rVar = new j$.time.format.r(1, new EnumMap(u6.class));
        rVar.b(u6Var);
        return rVar;
    }

    public v6(String str, int i2, int i3, j$.time.format.r rVar) {
        for (u6 u6Var : u6.values()) {
            Map map = rVar.a;
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).putIfAbsent(u6Var, 0);
            } else {
                Map.CC.$default$putIfAbsent(map, u6Var, 0);
            }
        }
        this.a = rVar.a;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public final boolean l(int i2) {
        return (i2 & this.e) == this.c;
    }

    public static int j(u6 u6Var) {
        int iIntValue = 0;
        for (v6 v6Var : values()) {
            iIntValue |= ((Integer) v6Var.a.get(u6Var)).intValue() << v6Var.b;
        }
        return iIntValue;
    }

    public static int i(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    public static int k(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }
}
