package defpackage;

import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzot;
import com.google.android.gms.internal.measurement.zzou;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gs9 {
    public static final /* synthetic */ int c = 0;
    public final nt9 a = new nt9();
    public boolean b;

    static {
        new gs9(0);
    }

    public gs9() {
    }

    public static void b(p0 p0Var, zzot zzotVar, int i, Object obj) {
        if (zzotVar == zzot.d) {
            Charset charset = qs9.a;
            p0Var.h(i, 3);
            ((q0) ((o0) obj)).d(p0Var);
            p0Var.h(i, 4);
            return;
        }
        p0Var.h(i, zzotVar.b);
        zzou zzouVar = zzou.a;
        switch (zzotVar.ordinal()) {
            case 0:
                p0Var.s(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                p0Var.q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                p0Var.r(((Long) obj).longValue());
                break;
            case 3:
                p0Var.r(((Long) obj).longValue());
                break;
            case 4:
                p0Var.o(((Integer) obj).intValue());
                break;
            case 5:
                p0Var.s(((Long) obj).longValue());
                break;
            case 6:
                p0Var.q(((Integer) obj).intValue());
                break;
            case 7:
                p0Var.n(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzlh)) {
                    p0Var.u((String) obj);
                } else {
                    zzlh zzlhVar = (zzlh) obj;
                    p0Var.p(zzlhVar.e());
                    zzlhVar.h(p0Var);
                }
                break;
            case 9:
                ((q0) ((o0) obj)).d(p0Var);
                break;
            case 10:
                q0 q0Var = (q0) ((o0) obj);
                p0Var.p(q0Var.k());
                q0Var.d(p0Var);
                break;
            case 11:
                if (!(obj instanceof zzlh)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    p0Var.p(length);
                    p0Var.t(length, bArr);
                } else {
                    zzlh zzlhVar2 = (zzlh) obj;
                    p0Var.p(zzlhVar2.e());
                    zzlhVar2.h(p0Var);
                }
                break;
            case 12:
                p0Var.p(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ls9)) {
                    p0Var.o(((Integer) obj).intValue());
                } else {
                    p0Var.o(((ls9) obj).zza());
                }
                break;
            case 14:
                p0Var.q(((Integer) obj).intValue());
                break;
            case 15:
                p0Var.s(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                p0Var.p((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                p0Var.r((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        nt9 nt9Var = this.a;
        int i = nt9Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = nt9Var.a(i2).b;
            if (obj instanceof q0) {
                ((q0) obj).g();
            }
        }
        Iterator it = nt9Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof q0) {
                ((q0) value).g();
            }
        }
        if (!nt9Var.d) {
            if (nt9Var.b > 0) {
                nt9Var.a(0).a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = nt9Var.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!nt9Var.d) {
            nt9Var.c = nt9Var.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(nt9Var.c);
            nt9Var.f = nt9Var.f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(nt9Var.f);
            nt9Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        gs9 gs9Var = new gs9();
        nt9 nt9Var = this.a;
        if (nt9Var.b > 0) {
            nt9Var.a(0).a.getClass();
            throw new ClassCastException();
        }
        Iterator it = nt9Var.b().iterator();
        if (!it.hasNext()) {
            return gs9Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gs9) {
            return this.a.equals(((gs9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public gs9(int i) {
        a();
        a();
    }
}
