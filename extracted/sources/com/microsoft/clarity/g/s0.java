package com.microsoft.clarity.g;

import android.content.Context;
import android.net.Uri;
import com.microsoft.clarity.ClarityConfig;
import defpackage.cc2;
import defpackage.dw;
import defpackage.f88;
import defpackage.fj4;
import defpackage.gj4;
import defpackage.ho7;
import defpackage.ij4;
import defpackage.js3;
import defpackage.m88;
import defpackage.oc2;
import defpackage.ok4;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tv8;
import defpackage.uq3;
import defpackage.v27;
import defpackage.vd7;
import defpackage.wu0;
import defpackage.xd2;
import defpackage.yu0;
import defpackage.zp0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {
    public final Context a;
    public final ClarityConfig b;
    public final FunctionReferenceImpl c;
    public final Regex d;
    public final Regex e;
    public final Regex f;
    public final Regex g;
    public final Regex h;
    public final LinkedHashMap i;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(Context context, ClarityConfig clarityConfig, qp2 qp2Var) {
        js3.p(context, "context");
        js3.p(clarityConfig, "config");
        js3.p(qp2Var, "webAssetCallback");
        this.a = context;
        this.b = clarityConfig;
        this.c = (FunctionReferenceImpl) qp2Var;
        this.d = new Regex("\\[ClarityStyleContent]|\\[/ClarityStyleContent]|\\[ClarityLocalURL]|\\[/ClarityLocalURL]");
        this.e = new Regex("\\[ClarityLocalURL](.*?)\\[/ClarityLocalURL]");
        this.f = new Regex("\\[ClarityStyleContent](.*?)\\[/ClarityStyleContent]");
        this.g = new Regex("url\\((?:'|\\\\\"|\")?(.*?)(?:'|\\\\\"|\")?\\)");
        this.h = new Regex("@import\\s(?:'|\\\\\"|\")(.*?)(?:'|\\\\\"|\");");
        this.i = new LinkedHashMap();
    }

    public final ArrayList a(String str, String str2, boolean z, int i, int i2) throws IOException {
        Object objInvoke;
        xd2 xd2Var = new xd2(new dw(0, new ho7[]{Regex.b(this.g, str), Regex.b(this.h, str)}), new v27(4), new vd7(22));
        ArrayList arrayList = new ArrayList();
        oc2 oc2Var = new oc2(xd2Var);
        while (oc2Var.hasNext()) {
            ij4 ij4Var = (ij4) oc2Var.next();
            String str3 = (String) ((gj4) ij4Var.a()).get(1);
            if (f88.l0(str3, "://", 0, false, 6) > 0 || f88.l0(str3, "//", 0, false, 6) == 0 || m88.Z(str3, "data:", false)) {
                try {
                    objInvoke = new r0(this, str3).invoke();
                } catch (Exception unused) {
                    objInvoke = null;
                }
                Boolean bool = (Boolean) objInvoke;
                if (!(bool != null ? bool.booleanValue() : false)) {
                }
            }
            String path = Uri.parse(str3).getPath();
            if (path != null) {
                fj4 fj4VarC = ij4Var.c.c(1);
                js3.m(fj4VarC);
                m0 m0VarA = a(path, str2, z, fj4VarC.b.a + i, (path.length() + r4) - 1, i2 + 1);
                if (m0VarA != null) {
                    arrayList.add(m0VarA);
                }
            }
        }
        return arrayList;
    }

    public final boolean b(String str) {
        Long l;
        o0 o0Var = (o0) this.i.get(str);
        if (js3.i(o0Var != null ? Boolean.valueOf(o0Var.b) : null, Boolean.TRUE)) {
            return false;
        }
        o0 o0Var2 = (o0) this.i.get(str);
        return new File(str).lastModified() > ((o0Var2 == null || (l = o0Var2.e) == null) ? 0L : l.longValue());
    }

    public final String c(String str) {
        String string = Uri.parse("https://clarity.microsoft.com/").buildUpon().appendPath("app").appendPath("webasset").appendPath("v1").appendPath(this.b.getProjectId()).appendPath("*clarity-playback-token-placeholder*").appendPath("all").appendEncodedPath(str).build().toString();
        js3.o(string, "parse(BuildConfig.WEB_AS…)\n            .toString()");
        return string;
    }

    public final boolean b(URL url) {
        if (js3.i(url.getProtocol(), "file")) {
            String path = url.getPath();
            js3.o(path, "url.path");
            if (m88.Z(path, "/android_asset", false)) {
                return true;
            }
        }
        if (js3.i(url.getHost(), "appassets.androidplatform.net")) {
            return true;
        }
        return (this.b.isIonic$sdk_prodRelease() || this.b.isCordova$sdk_prodRelease()) && js3.i(url.getHost(), "localhost");
    }

    public final boolean a(String str) {
        List<String> list;
        o0 o0Var = (o0) this.i.get(str);
        if (o0Var == null || (list = o0Var.f) == null) {
            list = EmptyList.a;
        }
        for (String str2 : list) {
            if (b(str2) || a(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String a(URL url, boolean z) {
        String path = url.getPath();
        if (js3.i(url.getProtocol(), "file")) {
            js3.o(path, "path");
            path = f88.t0(path, "/android_asset");
        } else if (js3.i(url.getHost(), "appassets.androidplatform.net")) {
            js3.o(path, "path");
            path = f88.t0(path, "assets");
        } else if (this.b.isIonic$sdk_prodRelease() && js3.i(url.getHost(), "localhost") && z) {
            path = "/";
        }
        js3.o(path, "path");
        return path;
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [kotlin.jvm.internal.FunctionReferenceImpl, qp2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final m0 a(String str, String str2, boolean z, int i, int i2, int i3) throws IOException {
        Exception exc;
        Object objInvoke;
        boolean zBooleanValue;
        boolean z2;
        String strA;
        File file;
        InputStream fileInputStream;
        if (i3 > 6) {
            return null;
        }
        try {
            try {
                objInvoke = new r0(this, str).invoke();
            } catch (Exception unused) {
                objInvoke = null;
            }
            Boolean bool = (Boolean) objInvoke;
            if (bool != null) {
                try {
                    zBooleanValue = bool.booleanValue();
                } catch (Exception e) {
                    exc = e;
                    StringBuilder sbN = t61.n("Failed to process local URL ", str, ", ");
                    sbN.append(exc.getMessage());
                    sbN.append('!');
                    com.microsoft.clarity.q.l.c(sbN.toString());
                    return null;
                }
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                z = b(new URL(str));
            }
            z2 = z;
            strA = a(str2, str, zBooleanValue);
            if (this.i.containsKey(strA) && !b(strA) && !a(strA)) {
                Object obj = this.i.get(strA);
                js3.m(obj);
                return new m0(i, i2, strA, ((o0) obj).d);
            }
            if (z2) {
                fileInputStream = this.a.getAssets().open(strA);
                file = null;
            } else {
                file = new File(strA);
                fileInputStream = new FileInputStream(file);
            }
            js3.o(fileInputStream, "if (isContextAsset) {\n  …e.inputStream()\n        }");
        } catch (Exception e2) {
            e = e2;
        }
        try {
            n0 n0VarA = a(fileInputStream, strA, file != null ? Long.valueOf(file.lastModified()) : null, z2, EmptyList.a);
            if (m88.S(n0VarA.a.a, ".css", false)) {
                n0VarA = a(n0VarA, z2, i3 + 1);
            }
            LinkedHashMap linkedHashMap = this.i;
            o0 o0Var = n0VarA.a;
            linkedHashMap.put(o0Var.a, o0Var);
            this.c.invoke(n0VarA.a.c, n0VarA.b);
            return new m0(i, i2, strA, n0VarA.a.d);
        } catch (Exception e3) {
            e = e3;
            exc = e;
            StringBuilder sbN2 = t61.n("Failed to process local URL ", str, ", ");
            sbN2.append(exc.getMessage());
            sbN2.append('!');
            com.microsoft.clarity.q.l.c(sbN2.toString());
            return null;
        }
    }

    public final boolean a(URL url) {
        if (js3.i(url.getProtocol(), "file") || js3.i(url.getHost(), "appassets.androidplatform.net")) {
            return true;
        }
        return (this.b.isIonic$sdk_prodRelease() || this.b.isCordova$sdk_prodRelease()) && js3.i(url.getHost(), "localhost");
    }

    public final String a(String str, String str2, boolean z) throws IOException {
        String str3;
        if (z) {
            return f88.K0(a(new URL(str2), false), '/');
        }
        String canonicalPath = cc2.p0(new File(str), f88.K0(str2, '/')).getCanonicalPath();
        js3.o(canonicalPath, "File(pageFolderPath)\n   …           .canonicalPath");
        String strK0 = f88.K0(canonicalPath, '/');
        if (this.b.isCordova$sdk_prodRelease()) {
            str3 = "www";
        } else {
            str3 = this.b.isIonic$sdk_prodRelease() ? "public" : null;
        }
        if (str3 == null || m88.Z(strK0, str3, false)) {
            return strK0;
        }
        return str3 + '/' + strK0;
    }

    public final n0 a(InputStream inputStream, String str, Long l, boolean z, List list) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArrR = ok4.R(new DigestInputStream(inputStream, messageDigest));
            MessageDigest messageDigest2 = com.microsoft.clarity.q.c.a;
            byte[] bArrDigest = messageDigest.digest();
            js3.o(bArrDigest, "md5.digest()");
            String strA = com.microsoft.clarity.q.c.a(bArrDigest, true);
            js3.p(str, "path");
            int iP0 = f88.p0(6, str, "/") + 1;
            int iP02 = f88.p0(6, str, ".") - 1;
            if (iP02 < iP0) {
                iP02 = str.length() - 1;
            }
            uq3 uq3Var = new uq3(iP0, iP02, 1);
            js3.p(strA, "replacement");
            String string = f88.v0(str, iP0, uq3Var.b + 1, strA).toString();
            n0 n0Var = new n0(new o0(str, z, strA, string, c(string), l, list), bArrR);
            tv8.h(inputStream, null);
            return n0Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tv8.h(inputStream, th);
                throw th2;
            }
        }
    }

    public final n0 a(n0 n0Var, boolean z, int i) throws IOException {
        byte[] bArr = n0Var.b;
        Charset charset = zp0.a;
        String str = new String(bArr, charset);
        ArrayList<m0> arrayListA = a(str, f88.H0('/', n0Var.a.a, ""), z, 0, i);
        if (arrayListA.isEmpty()) {
            return n0Var;
        }
        StringBuilder sb = new StringBuilder(str);
        if (arrayListA.size() > 1) {
            yu0.Y(arrayListA, new p0());
        }
        for (m0 m0Var : arrayListA) {
            sb.replace(m0Var.a, m0Var.b + 1, m0Var.d);
        }
        String string = sb.toString();
        js3.o(string, "newDataBuilder.toString()");
        byte[] bytes = string.getBytes(charset);
        js3.o(bytes, "this as java.lang.String).getBytes(charset)");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        o0 o0Var = n0Var.a;
        String str2 = o0Var.a;
        Long l = o0Var.e;
        boolean z2 = o0Var.b;
        ArrayList arrayList = new ArrayList(wu0.V(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).c);
        }
        return a(byteArrayInputStream, str2, l, z2, arrayList);
    }
}
