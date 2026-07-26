package defpackage;

import android.net.Uri;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 implements js4 {
    public final gg1 a;
    public final wa1 b;
    public av c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public ig1(wa1 wa1Var) {
        this(wa1Var, new pe1());
    }

    public static js4 e(Class cls, wa1 wa1Var) {
        try {
            return (js4) cls.getConstructor(wa1.class).newInstance(wa1Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.js4
    public final js4 a(av avVar) {
        this.c = avVar;
        gg1 gg1Var = this.a;
        gg1Var.f = avVar;
        pe1 pe1Var = (pe1) gg1Var.b;
        synchronized (pe1Var) {
            pe1Var.c = avVar;
        }
        Iterator it = ((HashMap) gg1Var.d).values().iterator();
        while (it.hasNext()) {
            ((js4) it.next()).a(avVar);
        }
        return this;
    }

    @Override // defpackage.js4
    public final js4 b(boolean z) {
        this.i = z;
        gg1 gg1Var = this.a;
        gg1Var.a = z;
        pe1 pe1Var = (pe1) gg1Var.b;
        synchronized (pe1Var) {
            pe1Var.b = z;
        }
        Iterator it = ((HashMap) gg1Var.d).values().iterator();
        while (it.hasNext()) {
            ((js4) it.next()).b(z);
        }
        return this;
    }

    @Override // defpackage.js4
    public final js4 c() {
        gg1 gg1Var = this.a;
        gg1Var.getClass();
        synchronized (((pe1) gg1Var.b)) {
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.js4
    public final x70 d(jp4 jp4Var) {
        Uri uri;
        fp4 fp4Var;
        jp4 jp4VarA = jp4Var;
        jp4VarA.b.getClass();
        String scheme = jp4VarA.b.a.getScheme();
        Uri uri2 = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(jp4VarA.b.b, "application/x-image-uri")) {
            long j = jp4VarA.b.h;
            String str = j29.a;
            throw null;
        }
        fp4 fp4Var2 = jp4VarA.b;
        int iO = j29.O(fp4Var2.a, fp4Var2.b);
        if (jp4VarA.b.h != -9223372036854775807L) {
            pe1 pe1Var = (pe1) this.a.b;
            synchronized (pe1Var) {
                pe1Var.d = 1;
            }
        }
        try {
            gg1 gg1Var = this.a;
            HashMap map = (HashMap) gg1Var.d;
            js4 js4Var = (js4) map.get(Integer.valueOf(iO));
            if (js4Var == null) {
                js4Var = (js4) gg1Var.u(iO).get();
                js4Var.a((av) gg1Var.f);
                js4Var.b(gg1Var.a);
                js4Var.c();
                map.put(Integer.valueOf(iO), js4Var);
            }
            dp4 dp4VarA = jp4VarA.c.a();
            ep4 ep4Var = jp4VarA.c;
            if (ep4Var.a == -9223372036854775807L) {
                dp4VarA.a = this.d;
            }
            if (ep4Var.d == -3.4028235E38f) {
                dp4VarA.d = this.g;
            }
            if (ep4Var.e == -3.4028235E38f) {
                dp4VarA.e = this.h;
            }
            if (ep4Var.b == -9223372036854775807L) {
                dp4VarA.b = this.e;
            }
            if (ep4Var.c == -9223372036854775807L) {
                dp4VarA.c = this.f;
            }
            ep4 ep4Var2 = new ep4(dp4VarA);
            if (!ep4Var2.equals(jp4VarA.c)) {
                xo4 xo4VarA = jp4VarA.a();
                xo4VarA.l = ep4Var2.a();
                jp4VarA = xo4VarA.a();
            }
            x70 x70VarD = js4Var.d(jp4VarA);
            ImmutableList immutableList = jp4VarA.b.g;
            if (!immutableList.isEmpty()) {
                x70[] x70VarArr = new x70[immutableList.size() + 1];
                x70VarArr[0] = x70VarD;
                int i = 0;
                while (i < immutableList.size()) {
                    if (this.i) {
                        rj2 rj2Var = new rj2();
                        rj2Var.m = tv4.m(((ip4) immutableList.get(i)).b);
                        rj2Var.d = ((ip4) immutableList.get(i)).c;
                        rj2Var.e = ((ip4) immutableList.get(i)).d;
                        rj2Var.f = ((ip4) immutableList.get(i)).e;
                        rj2Var.b = ((ip4) immutableList.get(i)).f;
                        rj2Var.a = ((ip4) immutableList.get(i)).g;
                        b bVar = new b(rj2Var);
                        j2 j2Var = new j2(this, bVar, 15);
                        wa1 wa1Var = this.b;
                        ts5 ts5Var = new ts5(9, j2Var);
                        wv8 wv8Var = new wv8(20);
                        fv fvVar = new fv(12);
                        if (this.c.r(bVar)) {
                            rj2 rj2VarA = bVar.a();
                            rj2VarA.m = tv4.m("application/x-media3-cues");
                            rj2VarA.j = bVar.n;
                            rj2VarA.K = this.c.h(bVar);
                            bVar = new b(rj2VarA);
                        }
                        b bVar2 = bVar;
                        int i2 = i + 1;
                        String string = ((ip4) immutableList.get(i)).a.toString();
                        yo4 yo4Var = new yo4();
                        bp4 bp4Var = new bp4();
                        List list = Collections.EMPTY_LIST;
                        ImmutableList immutableListQ = ImmutableList.q();
                        uri = uri2;
                        dp4 dp4Var = new dp4();
                        gp4 gp4Var = gp4.d;
                        Uri uri3 = string == null ? uri : Uri.parse(string);
                        vy2.s(((Uri) bp4Var.e) == null || ((UUID) bp4Var.d) != null);
                        if (uri3 != null) {
                            fp4Var = new fp4(uri3, null, ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : uri, null, list, null, immutableListQ, -9223372036854775807L);
                        } else {
                            fp4Var = uri;
                        }
                        jp4 jp4Var2 = new jp4("", new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4.K, gp4Var);
                        fp4Var.getClass();
                        x70VarArr[i2] = new um6(jp4Var2, wa1Var, ts5Var, wv8Var.u(jp4Var2), fvVar, 1048576, bVar2);
                    } else {
                        uri = uri2;
                        wa1 wa1Var2 = this.b;
                        wa1Var2.getClass();
                        x70VarArr[i + 1] = new jx7((ip4) immutableList.get(i), wa1Var2, new fv(12));
                    }
                    i++;
                    uri2 = uri;
                }
                x70VarD = new su4(x70VarArr);
            }
            ap4 ap4Var = jp4VarA.e;
            if (ap4Var.b != 0 || ap4Var.d != Long.MIN_VALUE || ap4Var.f) {
                tt0 tt0Var = new tt0(x70VarD);
                long j2 = ap4Var.b;
                vy2.j(j2 >= 0);
                vy2.s(!tt0Var.h);
                tt0Var.b = j2;
                long j3 = ap4Var.d;
                vy2.s(!tt0Var.h);
                tt0Var.c = j3;
                boolean z = !ap4Var.g;
                vy2.s(!tt0Var.h);
                tt0Var.d = z;
                boolean z2 = ap4Var.e;
                vy2.s(!tt0Var.h);
                tt0Var.e = z2;
                boolean z3 = ap4Var.f;
                vy2.s(!tt0Var.h);
                tt0Var.f = z3;
                boolean z4 = ap4Var.h;
                vy2.s(!tt0Var.h);
                tt0Var.g = z4;
                tt0Var.h = true;
                x70VarD = new vt0(tt0Var);
            }
            jp4VarA.b.getClass();
            if (jp4VarA.b.d == null) {
                return x70VarD;
            }
            wn5.k0("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return x70VarD;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public ig1(wa1 wa1Var, pe1 pe1Var) {
        this.b = wa1Var;
        av avVar = new av(13);
        this.c = avVar;
        gg1 gg1Var = new gg1(pe1Var, avVar);
        this.a = gg1Var;
        if (wa1Var != ((wa1) gg1Var.e)) {
            gg1Var.e = wa1Var;
            ((HashMap) gg1Var.c).clear();
            ((HashMap) gg1Var.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }
}
