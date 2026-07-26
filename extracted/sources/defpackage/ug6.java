package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public class ug6 implements no7, yk0 {
    public final String a;
    public final jr2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public ug6(String str, jr2 jr2Var, int i) {
        this.a = str;
        this.b = jr2Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = b.I();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        final int i4 = 0;
        this.i = a.b(lazyThreadSafetyMode, new bp2(this) { // from class: tg6
            public final /* synthetic */ ug6 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                px3[] px3VarArrChildSerializers;
                ArrayList arrayList;
                px3[] px3VarArrTypeParametersSerializers;
                switch (i4) {
                    case 0:
                        jr2 jr2Var2 = this.b.b;
                        return (jr2Var2 == null || (px3VarArrChildSerializers = jr2Var2.childSerializers()) == null) ? at2.t : px3VarArrChildSerializers;
                    case 1:
                        jr2 jr2Var3 = this.b.b;
                        if (jr2Var3 == null || (px3VarArrTypeParametersSerializers = jr2Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(px3VarArrTypeParametersSerializers.length);
                            for (px3 px3Var : px3VarArrTypeParametersSerializers) {
                                arrayList.add(px3Var.getDescriptor());
                            }
                        }
                        return yq2.P(arrayList);
                    default:
                        ug6 ug6Var = this.b;
                        return Integer.valueOf(xq2.w(ug6Var, (no7[]) ug6Var.j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.j = a.b(lazyThreadSafetyMode, new bp2(this) { // from class: tg6
            public final /* synthetic */ ug6 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                px3[] px3VarArrChildSerializers;
                ArrayList arrayList;
                px3[] px3VarArrTypeParametersSerializers;
                switch (i5) {
                    case 0:
                        jr2 jr2Var2 = this.b.b;
                        return (jr2Var2 == null || (px3VarArrChildSerializers = jr2Var2.childSerializers()) == null) ? at2.t : px3VarArrChildSerializers;
                    case 1:
                        jr2 jr2Var3 = this.b.b;
                        if (jr2Var3 == null || (px3VarArrTypeParametersSerializers = jr2Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(px3VarArrTypeParametersSerializers.length);
                            for (px3 px3Var : px3VarArrTypeParametersSerializers) {
                                arrayList.add(px3Var.getDescriptor());
                            }
                        }
                        return yq2.P(arrayList);
                    default:
                        ug6 ug6Var = this.b;
                        return Integer.valueOf(xq2.w(ug6Var, (no7[]) ug6Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = a.b(lazyThreadSafetyMode, new bp2(this) { // from class: tg6
            public final /* synthetic */ ug6 b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                px3[] px3VarArrChildSerializers;
                ArrayList arrayList;
                px3[] px3VarArrTypeParametersSerializers;
                switch (i6) {
                    case 0:
                        jr2 jr2Var2 = this.b.b;
                        return (jr2Var2 == null || (px3VarArrChildSerializers = jr2Var2.childSerializers()) == null) ? at2.t : px3VarArrChildSerializers;
                    case 1:
                        jr2 jr2Var3 = this.b.b;
                        if (jr2Var3 == null || (px3VarArrTypeParametersSerializers = jr2Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(px3VarArrTypeParametersSerializers.length);
                            for (px3 px3Var : px3VarArrTypeParametersSerializers) {
                                arrayList.add(px3Var.getDescriptor());
                            }
                        }
                        return yq2.P(arrayList);
                    default:
                        ug6 ug6Var = this.b;
                        return Integer.valueOf(xq2.w(ug6Var, (no7[]) ug6Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.no7
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.yk0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.no7
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.no7
    public final int d(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.no7
    public final int e() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [c24, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ug6) {
            no7 no7Var = (no7) obj;
            if (this.a.equals(no7Var.a()) && Arrays.equals((no7[]) this.j.getValue(), (no7[]) ((ug6) obj).j.getValue())) {
                int iE = no7Var.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (js3.i(h(i2).a(), no7Var.h(i2).a()) && js3.i(h(i2).getKind(), no7Var.h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.no7
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.no7
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? EmptyList.a : list;
    }

    @Override // defpackage.no7
    public final List getAnnotations() {
        return EmptyList.a;
    }

    @Override // defpackage.no7
    public o37 getKind() {
        return g98.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // defpackage.no7
    public no7 h(int i) {
        return ((px3[]) this.i.getValue())[i].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.no7
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override // defpackage.no7
    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return xq2.M(this);
    }
}
