package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class j3 extends w {
    public static final Charset i = Charset.forName("UTF-8");
    public final c1 e;
    public final r0 f;
    public final i1 g;
    public final u0 h;

    public j3(c1 c1Var, r0 r0Var, i1 i1Var, u0 u0Var, long j, int i2) {
        super(c1Var, u0Var, j, i2);
        io.sentry.config.a.W(c1Var, "Scopes are required.");
        this.e = c1Var;
        io.sentry.config.a.W(r0Var, "Envelope reader is required.");
        this.f = r0Var;
        io.sentry.config.a.W(i1Var, "Serializer is required.");
        this.g = i1Var;
        io.sentry.config.a.W(u0Var, "Logger is required.");
        this.h = u0Var;
    }

    public static /* synthetic */ void c(j3 j3Var, File file, io.sentry.hints.g gVar) {
        u0 u0Var = j3Var.h;
        if (gVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            u0Var.i(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            u0Var.e(SentryLevel.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.w
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.w
    public final void b(File file, h0 h0Var) {
        boolean zA = a(file.getName());
        u0 u0Var = this.h;
        try {
            if (!zA) {
                u0Var.i(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    io.sentry.internal.debugmeta.c cVarA = this.f.a(bufferedInputStream);
                    if (cVarA == null) {
                        u0Var.i(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(cVarA, h0Var);
                        u0Var.i(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objB = h0Var.b("sentry:typeCheckHint");
                    if (!io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint")) || objB == null) {
                        io.sentry.config.a.P(io.sentry.hints.g.class, objB, u0Var);
                    } else {
                        c(this, file, (io.sentry.hints.g) objB);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                u0Var.f(SentryLevel.ERROR, "Error processing envelope.", e);
                Object objB2 = h0Var.b("sentry:typeCheckHint");
                if (!io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint")) || objB2 == null) {
                    io.sentry.config.a.P(io.sentry.hints.g.class, objB2, u0Var);
                } else {
                    c(this, file, (io.sentry.hints.g) objB2);
                }
            }
        } catch (Throwable th3) {
            Object objB3 = h0Var.b("sentry:typeCheckHint");
            if (!io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint")) || objB3 == null) {
                io.sentry.config.a.P(io.sentry.hints.g.class, objB3, u0Var);
            } else {
                c(this, file, (io.sentry.hints.g) objB3);
            }
            throw th3;
        }
    }

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
    public final p6 d(n6 n6Var) {
        String str;
        u0 u0Var = this.h;
        if (n6Var != null && (str = n6Var.g) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (io.sentry.config.a.O(dValueOf, false)) {
                    String str2 = n6Var.h;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (io.sentry.config.a.O(dValueOf2, false)) {
                            return new p6(Boolean.TRUE, dValueOf, dValueOf2, Boolean.FALSE, null);
                        }
                    }
                    return io.sentry.config.a.b(new p6(Boolean.TRUE, dValueOf));
                }
                u0Var.i(SentryLevel.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                u0Var.i(SentryLevel.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new p6(Boolean.TRUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v20 */
    public final void e(io.sentry.internal.debugmeta.c cVar, h0 h0Var) {
        int size;
        Iterator it;
        int i2;
        String str;
        BufferedReader bufferedReader;
        w4 w4Var;
        ?? r4;
        int i3;
        String str2;
        BufferedReader bufferedReader2;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Iterable iterable = (Iterable) cVar.c;
        p4 p4Var = (p4) cVar.b;
        ?? r6 = 0;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it2 = iterable.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                it2.next();
                i4++;
            }
            size = i4;
        }
        int i5 = 1;
        Object[] objArr = {Integer.valueOf(size)};
        u0 u0Var = this.h;
        u0Var.i(sentryLevel, "Processing Envelope with %d item(s)", objArr);
        Iterator it3 = iterable.iterator();
        int i6 = 0;
        while (it3.hasNext()) {
            u4 u4Var = (u4) it3.next();
            int i7 = i6 + 1;
            v4 v4Var = u4Var.a;
            v4 v4Var2 = u4Var.a;
            if (v4Var == null) {
                SentryLevel sentryLevel2 = SentryLevel.ERROR;
                Object[] objArr2 = new Object[i5];
                objArr2[r6] = Integer.valueOf(i7);
                u0Var.i(sentryLevel2, "Item %d has no header", objArr2);
                it = it3;
                r4 = r6;
                i3 = i5;
                i2 = i7;
            } else {
                boolean zEquals = SentryItemType.Event.equals(v4Var.e);
                ?? r23 = r6;
                int i8 = i5;
                i1 i1Var = this.g;
                it = it3;
                Charset charset = i;
                i2 = i7;
                c1 c1Var = this.e;
                if (zEquals) {
                    try {
                        str = "Item failed to process.";
                    } catch (Throwable th) {
                        th = th;
                        str = "Item failed to process.";
                    }
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u4Var.f()), charset));
                        try {
                            w4Var = (w4) i1Var.c(bufferedReader, w4.class);
                        } finally {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        u0Var.f(SentryLevel.ERROR, str, th);
                    }
                    if (w4Var == null) {
                        SentryLevel sentryLevel3 = SentryLevel.ERROR;
                        Integer numValueOf = Integer.valueOf(i2);
                        SentryItemType sentryItemType = v4Var2.e;
                        Object[] objArr3 = new Object[2];
                        objArr3[r23 == true ? 1 : 0] = numValueOf;
                        objArr3[i8] = sentryItemType;
                        u0Var.i(sentryLevel3, "Item %d of type %s returned null by the parser.", objArr3);
                    } else {
                        io.sentry.protocol.t tVar = w4Var.c;
                        if (tVar != null) {
                            String str3 = tVar.a;
                            if (str3.startsWith("sentry.javascript") || str3.startsWith("sentry.dart") || str3.startsWith("sentry.dotnet")) {
                                h0Var.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                            }
                        }
                        io.sentry.protocol.v vVar = p4Var.a;
                        if (vVar == null || vVar.equals(w4Var.a)) {
                            c1Var.C(w4Var, h0Var);
                            SentryLevel sentryLevel4 = SentryLevel.DEBUG;
                            Object[] objArr4 = new Object[i8];
                            objArr4[r23 == true ? 1 : 0] = Integer.valueOf(i2);
                            u0Var.i(sentryLevel4, "Item %d is being captured.", objArr4);
                            if (!f(h0Var)) {
                                io.sentry.protocol.v vVar2 = w4Var.a;
                                SentryLevel sentryLevel5 = SentryLevel.WARNING;
                                Object[] objArr5 = new Object[1];
                                objArr5[r23 == true ? 1 : 0] = vVar2;
                                u0Var.i(sentryLevel5, "Timed out waiting for event id submission: %s", objArr5);
                                bufferedReader.close();
                                return;
                            }
                        } else {
                            io.sentry.protocol.v vVar3 = w4Var.a;
                            SentryLevel sentryLevel6 = SentryLevel.ERROR;
                            Integer numValueOf2 = Integer.valueOf(i2);
                            io.sentry.protocol.v vVar4 = p4Var.a;
                            Object[] objArr6 = new Object[3];
                            objArr6[r23 == true ? 1 : 0] = numValueOf2;
                            objArr6[i8] = vVar4;
                            objArr6[2] = vVar3;
                            u0Var.i(sentryLevel6, "Item %d of has a different event id (%s) to the envelope header (%s)", objArr6);
                            bufferedReader.close();
                            r4 = r23 == true ? 1 : 0;
                            i3 = i8;
                        }
                        th = th2;
                        u0Var.f(SentryLevel.ERROR, str, th);
                    }
                    bufferedReader.close();
                } else {
                    SentryItemType sentryItemType2 = SentryItemType.Transaction;
                    SentryItemType sentryItemType3 = v4Var.e;
                    SentryItemType sentryItemType4 = v4Var.e;
                    if (sentryItemType2.equals(sentryItemType3)) {
                        try {
                            str2 = "Item failed to process.";
                            try {
                                bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u4Var.f()), charset));
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str2 = "Item failed to process.";
                        }
                        try {
                            io.sentry.protocol.d0 d0Var = (io.sentry.protocol.d0) i1Var.c(bufferedReader2, io.sentry.protocol.d0.class);
                            if (d0Var == null) {
                                SentryLevel sentryLevel7 = SentryLevel.ERROR;
                                Integer numValueOf3 = Integer.valueOf(i2);
                                SentryItemType sentryItemType5 = v4Var2.e;
                                Object[] objArr7 = new Object[2];
                                objArr7[r23 == true ? 1 : 0] = numValueOf3;
                                objArr7[1] = sentryItemType5;
                                u0Var.i(sentryLevel7, "Item %d of type %s returned null by the parser.", objArr7);
                            } else {
                                io.sentry.protocol.v vVar5 = p4Var.a;
                                if (vVar5 == null || vVar5.equals(d0Var.a)) {
                                    n6 n6Var = p4Var.c;
                                    if (d0Var.b.i() != null) {
                                        d0Var.b.i().a(d(n6Var));
                                    }
                                    c1Var.r(d0Var, n6Var, h0Var);
                                    SentryLevel sentryLevel8 = SentryLevel.DEBUG;
                                    Object[] objArr8 = new Object[1];
                                    objArr8[r23 == true ? 1 : 0] = Integer.valueOf(i2);
                                    u0Var.i(sentryLevel8, "Item %d is being captured.", objArr8);
                                    if (!f(h0Var)) {
                                        io.sentry.protocol.v vVar6 = d0Var.a;
                                        SentryLevel sentryLevel9 = SentryLevel.WARNING;
                                        Object[] objArr9 = new Object[1];
                                        objArr9[r23 == true ? 1 : 0] = vVar6;
                                        u0Var.i(sentryLevel9, "Timed out waiting for event id submission: %s", objArr9);
                                        bufferedReader2.close();
                                        return;
                                    }
                                } else {
                                    io.sentry.protocol.v vVar7 = d0Var.a;
                                    SentryLevel sentryLevel10 = SentryLevel.ERROR;
                                    Integer numValueOf4 = Integer.valueOf(i2);
                                    io.sentry.protocol.v vVar8 = p4Var.a;
                                    Object[] objArr10 = new Object[3];
                                    objArr10[r23 == true ? 1 : 0] = numValueOf4;
                                    objArr10[1] = vVar8;
                                    objArr10[2] = vVar7;
                                    u0Var.i(sentryLevel10, "Item %d of has a different event id (%s) to the envelope header (%s)", objArr10);
                                    bufferedReader2.close();
                                    r4 = r23 == true ? 1 : 0;
                                    i3 = 1;
                                }
                                th = th3;
                                u0Var.f(SentryLevel.ERROR, str2, th);
                            }
                            bufferedReader2.close();
                        } finally {
                            try {
                                bufferedReader2.close();
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                            }
                        }
                    } else {
                        c1Var.i(new io.sentry.internal.debugmeta.c(p4Var.a, p4Var.b, u4Var), h0Var);
                        SentryLevel sentryLevel11 = SentryLevel.DEBUG;
                        String itemType = sentryItemType4.getItemType();
                        Integer numValueOf5 = Integer.valueOf(i2);
                        Object[] objArr11 = new Object[2];
                        objArr11[r23 == true ? 1 : 0] = itemType;
                        objArr11[1] = numValueOf5;
                        u0Var.i(sentryLevel11, "%s item %d is being captured.", objArr11);
                        if (!f(h0Var)) {
                            SentryLevel sentryLevel12 = SentryLevel.WARNING;
                            Object[] objArr12 = new Object[1];
                            objArr12[r23 == true ? 1 : 0] = sentryItemType4.getItemType();
                            u0Var.i(sentryLevel12, "Timed out waiting for item type submission: %s", objArr12);
                            return;
                        }
                    }
                }
                Object objB = h0Var.b("sentry:typeCheckHint");
                if ((objB instanceof io.sentry.hints.j) && !((io.sentry.hints.j) objB).e()) {
                    SentryLevel sentryLevel13 = SentryLevel.WARNING;
                    Object[] objArr13 = new Object[1];
                    objArr13[r23 == true ? 1 : 0] = Integer.valueOf(i2);
                    u0Var.i(sentryLevel13, "Envelope had a failed capture at item %d. No more items will be sent.", objArr13);
                    return;
                }
                Object objB2 = h0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.o0.class.isInstance(h0Var.b("sentry:typeCheckHint")) || objB2 == null) {
                    r4 = r23 == true ? 1 : 0;
                    i3 = 1;
                } else {
                    io.sentry.android.core.o0 o0Var = (io.sentry.android.core.o0) objB2;
                    i3 = 1;
                    o0Var.c = new CountDownLatch(1);
                    r4 = r23 == true ? 1 : 0;
                    o0Var.a = r4;
                    o0Var.b = r4;
                }
            }
            i5 = i3;
            it3 = it;
            i6 = i2;
            r6 = r4;
        }
    }

    public final boolean f(h0 h0Var) {
        Object objB = h0Var.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.e) {
            return ((io.sentry.hints.e) objB).d();
        }
        io.sentry.config.a.P(io.sentry.hints.e.class, objB, this.h);
        return true;
    }
}
