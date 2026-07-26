package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.measurement.internal.zzic;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class t61 {
    public static void A(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static boolean B(Bundle bundle, String str, Class cls, String str2) {
        js3.p(bundle, str);
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str2);
    }

    public static void C(zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    public static boolean a(kk kkVar, long j) {
        return j >= kkVar.b();
    }

    public static int d(int i, int i2, long j) {
        return (tw8.a(j) + i) * i2;
    }

    public static int e(Resources resources, int i, int i2, int i3) {
        return i3 - (resources.getDimensionPixelSize(i) * i2);
    }

    public static ps0 f(lf7 lf7Var, String str, b26 b26Var, String str2, Class cls) {
        js3.p(lf7Var, str);
        js3.p(b26Var, str2);
        return g27.a(cls);
    }

    public static e82 g(va0 va0Var, nx4 nx4Var) {
        e82 e82Var = new e82(va0Var);
        nx4Var.a(e82Var);
        return e82Var;
    }

    public static f57 h(String str, String str2, s57 s57Var, String str3) {
        f57 f57VarQ = s57Var.q(new ne5(str, str2));
        js3.o(f57VarQ, str3);
        return f57VarQ;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String l(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static String m(byte[] bArr, String str, StringBuilder sb, String str2) {
        sb.append(ByteArrays.toHexString(bArr, str));
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap o(Class cls, xx xxVar) {
        HashMap map = new HashMap();
        map.put(cls, xxVar);
        return map;
    }

    public static Map p(HashMap map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public static KotlinNothingValueException q(Object obj) {
        b.b(obj);
        return new KotlinNothingValueException();
    }

    public static KotlinNothingValueException r(String str) {
        rn3.c(str);
        return new KotlinNothingValueException();
    }

    public static void s(int i, View view) {
        view.setBackground(new ColorDrawable(i));
    }

    public static void t(int i, String str, String str2, StringBuilder sb, byte[] bArr) {
        sb.append(ByteArrays.toHexString(bArr, str));
        sb.append(str2);
        sb.append(i);
    }

    public static void u(zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static void v(String str, String str2, Context context, String str3, List list) {
        Uri uri = Uri.parse(str);
        js3.o(uri, str2);
        js8.q(context, uri, str3, list);
    }

    public static void w(String str, String str2, FragmentActivity fragmentActivity, String str3, List list) {
        Uri uri = Uri.parse(str);
        js3.o(uri, str2);
        js8.q(fragmentActivity, uri, str3, list);
    }

    public static void x(StringBuilder sb, Boolean bool, String str, String str2, String str3) {
        sb.append(bool);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void y(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void z(StringBuilder sb, boolean z, String str, String str2, String str3) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
