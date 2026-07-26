package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.inputmethodservice.InputMethodService;
import android.media.Image;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.foundation.text.input.internal.a;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.o;
import androidx.lifecycle.Lifecycle$State;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.MapBuilder;
import okio.ByteString;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class rq4 {
    public static final tj1 a = new tj1(1.0f, 1.0f);
    public static final sl3 b = new sl3(21);
    public static final ol3 c = new ol3(22);
    public static final ql3 d = new ql3();
    public static final Type[] e = new Type[0];
    public static boolean f = true;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;
    public static final /* synthetic */ int m = 0;
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;

    public static Type A(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbR = rm7.r(i2, "Index ", " not in range [0,");
        sbR.append(actualTypeArguments.length);
        sbR.append(") for ");
        sbR.append(parameterizedType);
        throw new IllegalArgumentException(sbR.toString());
    }

    public static Class B(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) B(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return B(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static final nd7 C(x79 x79Var) {
        r79 r79VarC = vs8.c(x79Var, new xl2(2));
        return (nd7) ((o77) r79VarC.b).u(g27.a(nd7.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static Type D(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return N(type, cls, z(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean E(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (E(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return E(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? Ssh2PublicKeyAlgorithmName.NULL : type.getClass().getName()));
    }

    public static final px3 F(Object obj, px3... px3VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (px3VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = px3VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = px3.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(px3VarArr, px3VarArr.length));
            if (objInvoke instanceof px3) {
                return (px3) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static boolean G(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static String H(se3 se3Var) {
        js3.p(se3Var, "url");
        ByteString byteString = ByteString.d;
        return fv.w(se3Var.i).c("MD5").f();
    }

    public static final hx4 I(hx4 hx4Var, a aVar, x44 x44Var, f fVar) {
        return hx4Var.d(new p44(aVar, x44Var, fVar));
    }

    public static IllegalArgumentException J(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbE = bl4.E(String.format(str, objArr), "\n    for method ");
        sbE.append(method.getDeclaringClass().getSimpleName());
        sbE.append(".");
        sbE.append(method.getName());
        return new IllegalArgumentException(sbE.toString(), exc);
    }

    public static IllegalArgumentException K(Method method, int i2, String str, Object... objArr) {
        return J(method, null, rm7.q(str, " (", l96.b.v(i2, method), ")"), objArr);
    }

    public static IllegalArgumentException L(Method method, Exception exc, int i2, String str, Object... objArr) {
        return J(method, exc, rm7.q(str, " (", l96.b.v(i2, method), ")"), objArr);
    }

    public static int M(tv6 tv6Var) throws IOException {
        byte bY;
        try {
            gh0 gh0Var = tv6Var.b;
            tv6Var.g1(1L);
            long j2 = 0;
            while (true) {
                long j3 = j2 + 1;
                if (!tv6Var.request(j3)) {
                    break;
                }
                bY = gh0Var.y(j2);
                if ((bY < 48 || bY > 57) && (j2 != 0 || bY != 45)) {
                    break;
                }
                j2 = j3;
            }
            if (j2 == 0) {
                js3.q(16);
                String string = Integer.toString(bY, 16);
                js3.o(string, "toString(...)");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jR = gh0Var.R();
            String strY = tv6Var.Y(Long.MAX_VALUE);
            if (jR >= 0 && jR <= 2147483647L && strY.length() <= 0) {
                return (int) jR;
            }
            throw new IOException("expected an int but was \"" + jR + strY + '\"');
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type N(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq4.N(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static final void O(MenuItem menuItem, boolean z, ot4 ot4Var, MenuItem menuItem2) {
        js3.p(menuItem, "<this>");
        menuItem.setVisible(z);
        if (menuItem2 != null) {
            boolean z2 = false;
            if (ot4Var != null) {
                int i2 = 0;
                while (true) {
                    if (!(i2 < ot4Var.size())) {
                        break;
                    }
                    int i3 = i2 + 1;
                    MenuItem item = ot4Var.getItem(i2);
                    if (item == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (item.isVisible()) {
                        z2 = true;
                        break;
                    }
                    i2 = i3;
                }
            }
            menuItem2.setVisible(z2);
        }
    }

    public static void P(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String Q(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Bundle R(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        v(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            t0.d("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static Set S(by2 by2Var) {
        int size = by2Var.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(by2Var.c(i2))) {
                String strF = by2Var.f(i2);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    js3.o(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = f88.z0(strF, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(f88.J0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? EmptySet.a : treeSet;
    }

    public static final h81 a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return new h81(new float[]{f2, f3, f4, f5, f6, f7, f8, f9});
    }

    public static final void b(hx4 hx4Var, qz0 qz0Var, int i2) {
        int i3;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(-1358737938);
        int i4 = i2 | (qz0Var2.f(hx4Var) ? 4 : 2);
        if (qz0Var2.R(i4 & 1, (i4 & 3) != 2)) {
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            hx4 hx4VarA = yh0.A(f(hx4Var, ((tj8) objJ).i, la7.a), ml9.q(hq6.space_16, qz0Var2), ml9.q(hq6.space_8, qz0Var2));
            bb0 bb0Var = eq.m;
            fv fvVar = jv.a;
            cb7 cb7VarA = bb7.a(jv.g(ml9.q(hq6.space_8, qz0Var2)), bb0Var, qz0Var2, 48);
            long j2 = qz0Var2.T;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = b.c(qz0Var2, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cb7VarA);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i5), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC);
            float fQ = ml9.q(hq6.size_24, qz0Var2);
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            km6.a(androidx.compose.foundation.layout.b.i(ex4.b, fQ), ((tj8) objJ2).g, ml9.q(hq6.loading_indicator_thickness, qz0Var2), 0L, 0, 0, qz0Var2, 196608);
            String strF = ln2.f(vs6.player_loading_indicator_text, qz0Var2);
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).h;
            Object objJ3 = qz0Var2.j(u58Var);
            js3.m(objJ3);
            i3 = 1;
            mi8.b(strF, null, ((tj8) objJ3).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var, 0, 0, 131066);
            qz0Var2 = qz0Var;
            qz0Var2.q(true);
        } else {
            i3 = 1;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new ag0(hx4Var, i2, i3);
        }
    }

    public static final Bitmap c(Image image) {
        Image.Plane[] planes = image.getPlanes();
        js3.m(planes);
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = gu9.E(gu9.e(i3 & 255, (i3 >> 8) & 255, (i3 >> 16) & 255, (i3 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static final g16 d(wh3 wh3Var, Context context, int i2) {
        if (!(wh3Var instanceof mc0)) {
            return wh3Var instanceof qv1 ? new DrawablePainter(zk8.n(wh3Var, context.getResources()).mutate()) : new ImagePainter(wh3Var);
        }
        Bitmap bitmap = ((mc0) wh3Var).a;
        BitmapPainter bitmapPainter = new BitmapPainter(new og(bitmap), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        bitmapPainter.h = i2;
        return bitmapPainter;
    }

    public static hx4 e(hx4 hx4Var, g74 g74Var) {
        return hx4Var.d(new x40(0L, g74Var, tt3.d, o.a, 1));
    }

    public static final hx4 f(hx4 hx4Var, long j2, xr7 xr7Var) {
        return hx4Var.d(new x40(j2, null, xr7Var, o.a, 2));
    }

    public static final zj1 g(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            uj1 uj1VarF = xq2.f(context);
            long jF = br9.f(configuration.screenWidthDp, configuration.screenHeightDp);
            long jD = o40.d(jF, uj1VarF);
            return new zj1((4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jD & 4294967295L))))) | (((long) ((int) Float.intBitsToFloat((int) (jD >> 32)))) << 32), jF);
        }
        ag9.a.getClass();
        zf9 zf9Var = zf9.a;
        bg9 bg9Var = zf9.b;
        js3.p(bg9Var, "it");
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i2 = Build.VERSION.SDK_INT;
        uf0 uf0Var = (i2 >= 34 ? sj1.b : i2 >= 30 ? xf0.b : th0.x).d(contextWrapper2, bg9Var.b).a;
        long jHeight = (4294967295L & ((long) uf0Var.c().height())) | (((long) uf0Var.c().width()) << 32);
        return new zj1(jHeight, o40.b(tt3.M(jHeight), xq2.f(baseContext)));
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            o40.I("Must be called on ", name2, " thread, but got ", name, sb);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void k(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void m(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void p(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static void q(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.px3 r(java.lang.Class r17, defpackage.px3... r18) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq4.r(java.lang.Class, px3[]):px3");
    }

    public static Handler s(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ul.g(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            t0.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            t0.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            t0.n("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final jd7 t(l71 l71Var) {
        jd7 jd7Var;
        js3.p(l71Var, "<this>");
        qd7 qd7Var = (qd7) l71Var.a(b);
        if (qd7Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        x79 x79Var = (x79) l71Var.a(c);
        if (x79Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) l71Var.a(d);
        String str = (String) l71Var.a(r79.c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        pd7 pd7VarR = qd7Var.o().r();
        Bundle bundle2 = null;
        md7 md7Var = pd7VarR instanceof md7 ? (md7) pd7VarR : null;
        if (md7Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = C(x79Var).b;
        jd7 jd7Var2 = (jd7) linkedHashMap.get(str);
        if (jd7Var2 != null) {
            return jd7Var2;
        }
        md7Var.b();
        Bundle bundle3 = md7Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                kotlin.collections.b.I();
                bundle4 = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                md7Var.c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            jd7Var = new jd7();
        } else {
            ClassLoader classLoader = jd7.class.getClassLoader();
            js3.m(classLoader);
            bundle.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str2 : bundle.keySet()) {
                js3.m(str2);
                mapBuilder.put(str2, bundle.get(str2));
            }
            jd7Var = new jd7(mapBuilder.b());
        }
        linkedHashMap.put(str, jd7Var);
        return jd7Var;
    }

    public static final void u(qd7 qd7Var) {
        Lifecycle$State lifecycle$State = qd7Var.D().d;
        if (lifecycle$State != Lifecycle$State.b && lifecycle$State != Lifecycle$State.c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qd7Var.o().r() == null) {
            md7 md7Var = new md7(qd7Var.o(), (x79) qd7Var);
            qd7Var.o().u("androidx.lifecycle.internal.SavedStateHandlesProvider", md7Var);
            qd7Var.D().a(new ry6(6, md7Var));
        }
    }

    public static void v(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(rq4.class.getClassLoader());
        }
    }

    public static boolean w(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return w(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Object x(Class cls, Object obj) {
        if (obj instanceof ar2) {
            return cls.cast(obj);
        }
        if (obj instanceof br2) {
            return x(cls, ((br2) obj).e());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + ar2.class + " or " + br2.class);
    }

    public static Type z(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return z(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return z(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public abstract sy6 y();
}
