package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class vv2 {
    public static final sj2 h = sj2.d;
    public static final ab2 i = FieldNamingPolicy.a;
    public static final om8 j = ToNumberPolicy.a;
    public static final om8 k = ToNumberPolicy.b;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final gv c;
    public final su3 d;
    public final List e;
    public final boolean f;
    public final sj2 g;

    public vv2() {
        r42 r42Var = r42.c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        gv gvVar = new gv(8);
        this.c = gvVar;
        this.f = true;
        this.g = h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vu8.A);
        ToNumberPolicy toNumberPolicy = ToNumberPolicy.a;
        om8 om8Var = j;
        arrayList.add(om8Var == toNumberPolicy ? cr5.c : new fq5(1, om8Var));
        arrayList.add(r42Var);
        arrayList.addAll(list);
        arrayList.add(vu8.p);
        arrayList.add(vu8.g);
        arrayList.add(vu8.d);
        arrayList.add(vu8.e);
        arrayList.add(vu8.f);
        tt8 tt8Var = vu8.k;
        arrayList.add(new nu8(Long.TYPE, Long.class, tt8Var));
        arrayList.add(new nu8(Double.TYPE, Double.class, new sv2(0)));
        arrayList.add(new nu8(Float.TYPE, Float.class, new sv2(1)));
        ToNumberPolicy toNumberPolicy2 = ToNumberPolicy.b;
        om8 om8Var2 = k;
        arrayList.add(om8Var2 == toNumberPolicy2 ? tv2.c : new fq5(0, new tv2(2, om8Var2)));
        arrayList.add(vu8.h);
        arrayList.add(vu8.i);
        arrayList.add(new lu8(AtomicLong.class, new tv2(0, tt8Var).a(), 0));
        int i2 = 0;
        arrayList.add(new lu8(AtomicLongArray.class, new tv2(1, tt8Var).a(), i2));
        arrayList.add(vu8.j);
        arrayList.add(vu8.l);
        arrayList.add(vu8.q);
        arrayList.add(vu8.r);
        arrayList.add(new lu8(BigDecimal.class, vu8.m, i2));
        arrayList.add(new lu8(BigInteger.class, vu8.n, i2));
        arrayList.add(new lu8(LazilyParsedNumber.class, vu8.o, i2));
        arrayList.add(vu8.s);
        arrayList.add(vu8.t);
        arrayList.add(vu8.v);
        arrayList.add(vu8.w);
        arrayList.add(vu8.y);
        arrayList.add(vu8.u);
        arrayList.add(vu8.b);
        arrayList.add(ce1.c);
        arrayList.add(vu8.x);
        if (u38.a) {
            arrayList.add(u38.c);
            arrayList.add(u38.b);
            arrayList.add(u38.d);
        }
        arrayList.add(bw.c);
        arrayList.add(vu8.a);
        arrayList.add(new vu0(gvVar, 0));
        arrayList.add(new vu0(gvVar, 1));
        su3 su3Var = new su3(gvVar);
        this.d = su3Var;
        arrayList.add(su3Var);
        arrayList.add(vu8.B);
        arrayList.add(new u27(gvVar, i, r42Var, su3Var));
        this.e = DesugarCollections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String str, TypeToken typeToken) {
        boolean z;
        Object obj = null;
        if (str == null) {
            return null;
        }
        mw3 mw3Var = new mw3(new StringReader(str));
        Strictness strictness = Strictness.b;
        mw3Var.l0(strictness);
        Strictness strictness2 = mw3Var.b;
        if (strictness2 == strictness) {
            mw3Var.b = Strictness.a;
        }
        try {
            try {
                try {
                    mw3Var.R();
                    z = false;
                    try {
                        qt8 qt8VarD = d(typeToken);
                        Object objB = qt8VarD.b(mw3Var);
                        Class clsS = br9.S(typeToken.getRawType());
                        if (objB != null && !clsS.isInstance(objB)) {
                            throw new ClassCastException("Type adapter '" + qt8VarD + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        mw3Var.l0(strictness2);
                        obj = objB;
                    } catch (EOFException e) {
                        e = e;
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
                if (obj != null) {
                    try {
                        if (mw3Var.R() != JsonToken.j) {
                            throw new JsonSyntaxException("JSON document was not fully consumed.");
                        }
                    } catch (MalformedJsonException e3) {
                        throw new JsonSyntaxException(e3);
                    } catch (IOException e4) {
                        throw new JsonIOException(e4);
                    }
                }
                return obj;
            } finally {
                mw3Var.l0(strictness2);
            }
        } catch (IOException e5) {
            throw new JsonSyntaxException(e5);
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e6.getMessage(), e6);
        } catch (IllegalStateException e7) {
            throw new JsonSyntaxException(e7);
        }
    }

    public final Object c(String str, Class cls) {
        return b(str, TypeToken.get(cls));
    }

    public final qt8 d(TypeToken typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        qt8 qt8Var = (qt8) concurrentHashMap.get(typeToken);
        if (qt8Var != null) {
            return qt8Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            qt8 qt8Var2 = (qt8) map.get(typeToken);
            if (qt8Var2 != null) {
                return qt8Var2;
            }
            z = false;
        }
        try {
            uv2 uv2Var = new uv2();
            map.put(typeToken, uv2Var);
            Iterator it = this.e.iterator();
            qt8 qt8VarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                qt8VarA = ((rt8) it.next()).a(this, typeToken);
                if (qt8VarA != null) {
                    if (uv2Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    uv2Var.a = qt8VarA;
                    map.put(typeToken, qt8VarA);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (qt8VarA != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return qt8VarA;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + typeToken);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final uw3 e(Writer writer) {
        uw3 uw3Var = new uw3(writer);
        uw3Var.D(this.g);
        uw3Var.i = this.f;
        uw3Var.I(Strictness.b);
        uw3Var.k = false;
        return uw3Var;
    }

    public final String f(Object obj) {
        if (obj != null) {
            return g(obj, obj.getClass());
        }
        StringBuilder sb = new StringBuilder();
        try {
            h(e(new q78(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final String g(Object obj, Type type) {
        StringBuilder sb = new StringBuilder();
        try {
            i(obj, type, e(new q78(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final void h(uw3 uw3Var) {
        zv3 zv3Var = zv3.a;
        Strictness strictness = uw3Var.h;
        boolean z = uw3Var.i;
        boolean z2 = uw3Var.k;
        uw3Var.i = this.f;
        uw3Var.k = false;
        if (strictness == Strictness.b) {
            uw3Var.h = Strictness.a;
        }
        try {
            try {
                try {
                    vu8.z.getClass();
                    pv3.e(uw3Var, zv3Var);
                    uw3Var.I(strictness);
                    uw3Var.i = z;
                    uw3Var.k = z2;
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } catch (Throwable th) {
            uw3Var.I(strictness);
            uw3Var.i = z;
            uw3Var.k = z2;
            throw th;
        }
    }

    public final void i(Object obj, Type type, uw3 uw3Var) {
        qt8 qt8VarD = d(TypeToken.get(type));
        Strictness strictness = uw3Var.h;
        if (strictness == Strictness.b) {
            uw3Var.h = Strictness.a;
        }
        boolean z = uw3Var.i;
        boolean z2 = uw3Var.k;
        uw3Var.i = this.f;
        uw3Var.k = false;
        try {
            try {
                qt8VarD.c(uw3Var, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } finally {
            uw3Var.I(strictness);
            uw3Var.i = z;
            uw3Var.k = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
