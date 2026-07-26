package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Size;
import android.util.SizeF;
import android.view.InputEvent;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.myket.movie.common.domain.models.EpisodeBannerType;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class is3 {
    public static final Object a = new Object();
    public static final yg2 b = new yg2(14);
    public static final byte[] c = {48, 49, 53, 0};
    public static final byte[] d = {48, 49, 48, 0};
    public static final byte[] e = {48, 48, 57, 0};
    public static final byte[] f = {48, 48, 53, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 50, 0};
    public static final mu3 j = new mu3("NO_THREAD_ELEMENTS", 1);
    public static final yd7 k = new yd7(4);
    public static final yd7 l = new yd7(5);
    public static final yd7 m = new yd7(6);
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static long p;
    public static volatile qm5 q;
    public static volatile nm5 r;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;

    public static void A(String str, String str2) {
        String strConcat = "push_notif_".concat(str);
        Bundle bundle = new Bundle();
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        bundle.putString("push_message_id", str2);
        ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
        eeVar.getClass();
        eeVar.a(bundle, strConcat);
    }

    public static nm5 B(Context context) {
        nm5 nm5Var;
        Context applicationContext = context.getApplicationContext();
        nm5 nm5Var2 = r;
        if (nm5Var2 != null) {
            return nm5Var2;
        }
        synchronized (nm5.class) {
            try {
                nm5Var = r;
                if (nm5Var == null) {
                    nm5Var = new nm5(0, new qs3(1, applicationContext));
                    r = nm5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nm5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.is3.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            io.sentry.android.core.t0.n(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            io.sentry.android.core.t0.m(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is3.C(android.content.Context, java.lang.String):void");
    }

    public static final long D(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String E(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.is3.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            io.sentry.android.core.t0.m(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is3.E(android.content.Context):java.lang.String");
    }

    public static final void H(w61 w61Var, Object obj) {
        if (obj == j) {
            return;
        }
        if (!(obj instanceof xk8)) {
            Object objJ = w61Var.J(l, null);
            js3.n(objJ, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((sk8) objJ).a(obj);
            return;
        }
        xk8 xk8Var = (xk8) obj;
        sk8[] sk8VarArr = xk8Var.c;
        int length = sk8VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            sk8 sk8Var = sk8VarArr[length];
            js3.m(sk8Var);
            sk8Var.a(xk8Var.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static final long I(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final Object M(w61 w61Var) {
        Object objJ = w61Var.J(k, 0);
        js3.m(objJ);
        return objJ;
    }

    public static final b55 N(f55 f55Var) {
        int i2 = f55Var.a;
        String str = f55Var.b;
        String str2 = f55Var.c;
        boolean z = f55Var.d;
        String str3 = f55Var.e;
        String str4 = f55Var.f;
        Integer num = f55Var.g;
        int iAbs = Math.abs(num != null ? num.intValue() : 0);
        Integer num2 = f55Var.h;
        return new b55(i2, str, str2, z, str3, str4, iAbs, Math.abs(num2 != null ? num2.intValue() : 0), f55Var.i);
    }

    public static final pk7 O(tk7 tk7Var, String str, boolean z) {
        Object next;
        js3.p(tk7Var, "<this>");
        String str2 = str;
        js3.p(str2, "defaultBannerUrl");
        String str3 = tk7Var.a;
        String str4 = tk7Var.b;
        List list = tk7Var.c;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                br9.P();
                throw null;
            }
            f32 f32Var = (f32) obj;
            boolean z2 = z && i2 == br9.y(list);
            String str5 = f32Var.a;
            String str6 = f32Var.b;
            String str7 = f32Var.c;
            Object obj2 = null;
            String str8 = f32Var.d;
            String str9 = f32Var.e;
            String str10 = f32Var.f;
            Enum r19 = EpisodeBannerType.b;
            Iterator it = ((z0) EpisodeBannerType.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = obj2;
                    break;
                }
                next = it.next();
                Object obj3 = obj2;
                if (m88.T(((Enum) next).name(), str10, true)) {
                    break;
                }
                obj2 = obj3;
            }
            Enum r21 = (Enum) next;
            if (r21 != null) {
                r19 = r21;
            }
            arrayList.add(new b32(str5, str6, str7, str8, str9, str2, (EpisodeBannerType) r19, f32Var.g, f32Var.h, z2));
            str2 = str;
            i2 = i3;
        }
        return new pk7(str3, str4, ml9.z(arrayList), tk7Var.d);
    }

    public static final Object P(w61 w61Var, Object obj) {
        if (obj == null) {
            obj = M(w61Var);
        }
        if (obj == 0) {
            return j;
        }
        if (!(obj instanceof Integer)) {
            return ((sk8) obj).c(w61Var);
        }
        return w61Var.J(m, new xk8(((Number) obj).intValue(), w61Var));
    }

    public static final long a(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final boolean b(gj8 gj8Var) {
        w96 w96Var;
        da6 da6Var = gj8Var.c;
        n02 n02Var = (da6Var == null || (w96Var = da6Var.b) == null) ? null : new n02(w96Var.b);
        boolean z = false;
        if (n02Var != null && n02Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final void c(xb5 xb5Var, String str, boolean z) {
        l lVar;
        Object value;
        do {
            lVar = (l) xb5Var;
            value = lVar.getValue();
        } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(str, Boolean.valueOf(z))))));
    }

    public static final void d(l lVar, String str, u25 u25Var) {
        Object value;
        do {
            value = lVar.getValue();
        } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(str, u25Var)))));
    }

    public static final void e(px3 px3Var, px3 px3Var2, String str) {
        if (px3Var instanceof ih7) {
            no7 descriptor = px3Var2.getDescriptor();
            js3.p(descriptor, "<this>");
            if (yq2.M(descriptor).contains(str)) {
                StringBuilder sbT = rm7.t("Sealed class '", px3Var2.getDescriptor().a(), "' cannot be serialized as base class '", ((ih7) px3Var).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
                sbT.append(str);
                sbT.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbT.toString().toString());
            }
        }
    }

    public static void f(int i2, int i3) throws GlUtil$GlException {
        GLES20.glBindTexture(i2, i3);
        i();
        GLES20.glTexParameteri(i2, 10240, 9729);
        i();
        GLES20.glTexParameteri(i2, 10241, 9729);
        i();
        GLES20.glTexParameteri(i2, 10242, 33071);
        i();
        GLES20.glTexParameteri(i2, 10243, 33071);
        i();
    }

    public static final Bundle g(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.a;
            Object obj = pair.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                js3.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void h(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbB = bl4.B(i2, i3, "startIndex: ", ", endIndex: ", ", size: ");
            sbB.append(i4);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(dw1.j(i2, i3, "startIndex: ", " > endIndex: "));
        }
    }

    public static void i() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString());
        }
    }

    public static void j(String str, boolean z) throws GlUtil$GlException {
        if (!z) {
            throw new GlUtil$GlException(str);
        }
    }

    public static final void k(o37 o37Var) {
        js3.p(o37Var, "kind");
        if (o37Var instanceof ro7) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (o37Var instanceof yj6) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (o37Var instanceof ph6) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static void l(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder sbB = bl4.B(i2, i3, "fromIndex: ", ", toIndex: ", ", size: ");
            sbB.append(i4);
            throw new IndexOutOfBoundsException(sbB.toString());
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(dw1.j(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final String m(pu3 pu3Var, no7 no7Var) {
        js3.p(no7Var, "<this>");
        js3.p(pu3Var, "json");
        for (Annotation annotation : no7Var.getAnnotations()) {
            if (annotation instanceof av3) {
                return ((av3) annotation).discriminator();
            }
        }
        return pu3Var.a.f;
    }

    public static FloatBuffer n(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final float o(Context context) {
        Object objA;
        js3.p(context, "context");
        try {
            objA = Float.valueOf(context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = Float.valueOf(1.0f);
        }
        return ((Number) objA).floatValue();
    }

    public static GradientDrawable q(Context context, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(pq6.multi_select_drawable_stroke_width), i3);
        gradientDrawable.setSize(context.getResources().getDimensionPixelSize(pq6.multi_select_drawable_size), context.getResources().getDimensionPixelSize(pq6.multi_select_drawable_size));
        return gradientDrawable;
    }

    public static final Object r(yk4 yk4Var) {
        Object objV = yk4Var.v();
        b14 b14Var = objV instanceof b14 ? (b14) objV : null;
        if (b14Var != null) {
            return b14Var.o;
        }
        return null;
    }

    public static final String t(Object obj) {
        if (obj instanceof ip0) {
            obj = "";
        }
        return (String) obj;
    }

    public static final int u(Context context) {
        Object objA;
        js3.p(context, "context");
        try {
            int i2 = context.getResources().getConfiguration().screenLayout & 15;
            objA = Integer.valueOf(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 500 : ErrorDTO.CODE_ACCESS_DENIED : 300 : ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = 0;
        }
        return ((Number) objA).intValue();
    }

    public static final void w(w61 w61Var, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).a;
        }
        try {
            z61 z61Var = (z61) w61Var.r0(fz1.f);
            if (z61Var != null) {
                z61Var.y(w61Var, th);
            } else {
                dt2.t(w61Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                wu8.f(runtimeException, th);
                th = runtimeException;
            }
            dt2.t(w61Var, th);
        }
    }

    public static boolean y(String str) throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        j("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        j("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        i();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static final hx4 z(hx4 hx4Var, String str) {
        return hx4Var.d(new a14(str));
    }

    public abstract Object F(Uri uri, InputEvent inputEvent, g51 g51Var);

    public abstract Object G(Uri uri, g51 g51Var);

    public abstract void J(boolean z);

    public abstract void K(boolean z);

    public abstract void L(Object obj, float f2);

    public abstract TransformationMethod Q(TransformationMethod transformationMethod);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);

    public abstract Object s(g51 g51Var);

    public abstract float v(Object obj);

    public abstract boolean x();
}
