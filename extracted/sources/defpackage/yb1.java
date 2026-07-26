package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.a;
import defpackage.bl4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yb1 {
    public final Class a;
    public final List b;
    public final w67 c;
    public final bi6 d;
    public final String e;

    public yb1(Class cls, Class cls2, Class cls3, List list, w67 w67Var, wv8 wv8Var) {
        this.a = cls;
        this.b = list;
        this.c = w67Var;
        this.d = wv8Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final g67 a(int i, int i2, ta1 ta1Var, do3 do3Var, sv5 sv5Var) {
        g67 g67VarA;
        nq8 nq8Var;
        EncodeStrategy encodeStrategyQ;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object ha1Var;
        bi6 bi6Var = this.d;
        List list = (List) bi6Var.e();
        ok4.p(list, "Argument must not be null");
        try {
            g67 g67VarB = b(ta1Var, i, i2, sv5Var, list);
            bi6Var.d(list);
            a aVar = (a) do3Var.b;
            DataSource dataSource = (DataSource) do3Var.a;
            xb1 xb1Var = aVar.a;
            Class<?> cls = g67VarB.get().getClass();
            m67 m67VarB = null;
            if (dataSource != DataSource.d) {
                nq8 nq8VarE = xb1Var.e(cls);
                nq8Var = nq8VarE;
                g67VarA = nq8VarE.a(aVar.h, g67VarB, aVar.l, aVar.m);
            } else {
                g67VarA = g67VarB;
                nq8Var = null;
            }
            if (!g67VarB.equals(g67VarA)) {
                g67VarB.a();
            }
            if (xb1Var.c.b().d.b(g67VarA.d()) != null) {
                m67VarB = xb1Var.c.b().d.b(g67VarA.d());
                if (m67VarB == null) {
                    final Class clsD = g67VarA.d();
                    throw new Registry$MissingComponentException(clsD) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super(bl4.t(clsD, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
                        }
                    };
                }
                encodeStrategyQ = m67VarB.q(aVar.o);
            } else {
                encodeStrategyQ = EncodeStrategy.c;
            }
            m67 m67Var = m67VarB;
            sx3 sx3Var = aVar.x;
            ArrayList arrayListB = xb1Var.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((zw4) arrayListB.get(i3)).a.equals(sx3Var)) {
                    z = true;
                    break;
                }
                i3++;
            }
            switch (aVar.n.a) {
                default:
                    if (((!z && dataSource == DataSource.c) || dataSource == DataSource.a) && encodeStrategyQ == EncodeStrategy.b) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (m67Var == null) {
                    final Class<?> cls2 = g67VarA.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super(bl4.t(cls2, "Failed to find result encoder for resource class: ", ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
                        }
                    };
                }
                int iOrdinal = encodeStrategyQ.ordinal();
                if (iOrdinal == 0) {
                    z3 = false;
                    z4 = true;
                    ha1Var = new ha1(aVar.x, aVar.i);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyQ);
                    }
                    z3 = false;
                    z4 = true;
                    ha1Var = new i67(xb1Var.c.a, aVar.x, aVar.i, aVar.l, aVar.m, nq8Var, cls, aVar.o);
                }
                hd4 hd4Var = (hd4) hd4.e.e();
                hd4Var.d = z3;
                hd4Var.c = z4;
                hd4Var.b = g67VarA;
                wv8 wv8Var = aVar.f;
                wv8Var.b = ha1Var;
                wv8Var.c = m67Var;
                wv8Var.d = hd4Var;
                g67VarA = hd4Var;
            }
            return this.c.f(g67VarA, sv5Var);
        } catch (Throwable th) {
            bi6Var.d(list);
            throw th;
        }
    }

    public final g67 b(ta1 ta1Var, int i, int i2, sv5 sv5Var, List list) throws GlideException {
        List list2 = this.b;
        int size = list2.size();
        g67 g67VarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            j67 j67Var = (j67) list2.get(i3);
            try {
                if (j67Var.b(ta1Var.i(), sv5Var)) {
                    g67VarA = j67Var.a(ta1Var.i(), i, i2, sv5Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(j67Var);
                }
                list.add(e);
            }
            if (g67VarA != null) {
                break;
            }
        }
        if (g67VarA != null) {
            return g67VarA;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
