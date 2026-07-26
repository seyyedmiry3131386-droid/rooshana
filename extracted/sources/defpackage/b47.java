package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import com.google.common.collect.w;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b47 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public static final void a(rb5 rb5Var, Object obj, Object obj2) {
        int iF = rb5Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : rb5Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof sb5) {
                ((sb5) obj3).d(obj2);
            } else if (obj3 != obj2) {
                sb5 sb5Var = new sb5();
                sb5Var.d(obj3);
                sb5Var.d(obj2);
                obj2 = sb5Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            rb5Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        rb5Var.b[i] = obj;
        rb5Var.c[i] = obj2;
    }

    public static rb5 b() {
        long[] jArr = ce7.a;
        return new rb5();
    }

    public static vo4 f(String str, Class cls) {
        try {
            return new vo4(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static int g(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 || (i2 & 2) == 0) {
                    }
                } else if ((i2 & 1) == 0) {
                }
            }
            return i4;
        }
        return i;
    }

    public static void j(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static void k(fa5 fa5Var, ObjectInputStream objectInputStream, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = fa5Var.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void l(w wVar, ObjectInputStream objectInputStream, int i) throws ClassNotFoundException, IOException {
        for (int i2 = 0; i2 < i; i2++) {
            wVar.add(objectInputStream.readInt(), objectInputStream.readObject());
        }
    }

    public static final boolean m(rb5 rb5Var, Object obj, Object obj2) {
        Object objG = rb5Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof sb5)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            rb5Var.k(obj);
            return true;
        }
        sb5 sb5Var = (sb5) objG;
        boolean zL = sb5Var.l(obj2);
        if (zL && sb5Var.b()) {
            rb5Var.k(obj);
        }
        return zL;
    }

    public static final void n(rb5 rb5Var, Object obj) {
        boolean zB;
        long[] jArr = rb5Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = rb5Var.b[i4];
                        Object obj3 = rb5Var.c[i4];
                        if (obj3 instanceof sb5) {
                            sb5 sb5Var = (sb5) obj3;
                            sb5Var.l(obj);
                            zB = sb5Var.b();
                        } else {
                            zB = obj3 == obj;
                        }
                        if (zB) {
                            rb5Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final float o(long j, float f, qj1 qj1Var) {
        float fC;
        long jB = jj8.b(j);
        if (kj8.a(jB, 4294967296L)) {
            if (qj1Var.O() <= 1.05d) {
                return qj1Var.j0(j);
            }
            fC = jj8.c(j) / jj8.c(qj1Var.F(f));
        } else {
            if (!kj8.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = jj8.c(j);
        }
        return fC * f;
    }

    public static final void p(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(gu9.E(j)), i, i2, 33);
        }
    }

    public static final void q(Spannable spannable, long j, qj1 qj1Var, int i, int i2) {
        long jB = jj8.b(j);
        if (kj8.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ok4.V(qj1Var.j0(j)), false), i, i2, 33);
        } else if (kj8.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(jj8.c(j)), i, i2, 33);
        }
    }

    public static final void r(Spannable spannable, wc4 wc4Var, int i, int i2) {
        LocaleSpan localeSpan;
        if (wc4Var != null) {
            List list = wc4Var.a;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(wu0.V(wc4Var, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vc4) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = d1.e(d1.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? q96.a.b().a() : wc4Var.a()).a);
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final Object u(mf7 mf7Var, boolean z, mf7 mf7Var2, qp2 qp2Var) {
        Object rx0Var;
        Object objW;
        try {
            if (qp2Var instanceof BaseContinuationImpl) {
                wu8.i(2, qp2Var);
                rx0Var = qp2Var.invoke(mf7Var2, mf7Var);
            } else {
                rx0Var = ok4.a0(qp2Var, mf7Var2, mf7Var);
            }
        } catch (DispatchException e) {
            Throwable th = e.a;
            mf7Var.V(new rx0(th, false));
            throw th;
        } catch (Throwable th2) {
            rx0Var = new rx0(th2, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (rx0Var == coroutineSingletons || (objW = mf7Var.W(rx0Var)) == at2.n) {
            return coroutineSingletons;
        }
        mf7Var.n0();
        if (!(objW instanceof rx0)) {
            return at2.n0(objW);
        }
        if (!z) {
            Throwable th3 = ((rx0) objW).a;
            if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).a == mf7Var) {
                if (rx0Var instanceof rx0) {
                    throw ((rx0) rx0Var).a;
                }
                return rx0Var;
            }
        }
        throw ((rx0) objW).a;
    }

    public static final int v(long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(j);
    }

    public static void w(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static void x(n1 n1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(n1Var.h().size());
        for (Map.Entry entry : n1Var.h().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static void y(w wVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(wVar.entrySet().size());
        for (pa5 pa5Var : wVar.entrySet()) {
            objectOutputStream.writeObject(pa5Var.b());
            objectOutputStream.writeInt(pa5Var.a());
        }
    }

    public static int z(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public abstract String c(byte[] bArr, int i, int i2);

    public abstract int d(byte[] bArr, String str, int i, int i2);

    public abstract Object e(ps0 ps0Var);

    public float h(View view) {
        if (a) {
            try {
                return te.A(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract b47 i(ps0 ps0Var, Object obj);

    public void s(View view, float f) {
        if (a) {
            try {
                te.R(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public void t(int i, View view) {
        if (!c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
