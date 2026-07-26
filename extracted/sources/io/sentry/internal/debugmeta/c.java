package io.sentry.internal.debugmeta;

import android.content.Context;
import defpackage.dw1;
import defpackage.js3;
import io.sentry.DataCategory;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.d;
import io.sentry.clientreport.e;
import io.sentry.f;
import io.sentry.f2;
import io.sentry.h0;
import io.sentry.i3;
import io.sentry.n5;
import io.sentry.p4;
import io.sentry.protocol.d0;
import io.sentry.protocol.t;
import io.sentry.protocol.v;
import io.sentry.q6;
import io.sentry.u0;
import io.sentry.u4;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a, u0, i3, n5, e {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static DataCategory m(SentryItemType sentryItemType) {
        return SentryItemType.Event.equals(sentryItemType) ? DataCategory.Error : SentryItemType.Session.equals(sentryItemType) ? DataCategory.Session : SentryItemType.Transaction.equals(sentryItemType) ? DataCategory.Transaction : SentryItemType.UserFeedback.equals(sentryItemType) ? DataCategory.UserReport : SentryItemType.Feedback.equals(sentryItemType) ? DataCategory.Feedback : SentryItemType.Profile.equals(sentryItemType) ? DataCategory.Profile : SentryItemType.ProfileChunk.equals(sentryItemType) ? DataCategory.ProfileChunkUi : SentryItemType.Attachment.equals(sentryItemType) ? DataCategory.Attachment : SentryItemType.CheckIn.equals(sentryItemType) ? DataCategory.Monitor : SentryItemType.ReplayVideo.equals(sentryItemType) ? DataCategory.Replay : SentryItemType.Log.equals(sentryItemType) ? DataCategory.LogItem : SentryItemType.Span.equals(sentryItemType) ? DataCategory.Span : SentryItemType.TraceMetric.equals(sentryItemType) ? DataCategory.TraceMetric : DataCategory.Default;
    }

    public c A(boolean z) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        bVar.D();
        bVar.b();
        bVar.a.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.e
    public void a(DiscardReason discardReason, DataCategory dataCategory) {
        h(discardReason, dataCategory, 1L);
    }

    @Override // io.sentry.n5
    public f b(f fVar, h0 h0Var) {
        js3.p(fVar, "breadcrumb");
        n5 n5Var = (n5) this.b;
        if (n5Var != null) {
            fVar = n5Var.b(fVar, h0Var);
        }
        if (fVar != null) {
            io.sentry.android.replay.a aVar = (io.sentry.android.replay.a) this.c;
            io.sentry.util.network.c cVar = null;
            if (js3.i(fVar.e, "http") || js3.i(fVar.g, "http")) {
                Object objB = h0Var.b("sentry:replayNetworkDetails");
                if (objB instanceof io.sentry.util.network.c) {
                    cVar = (io.sentry.util.network.c) objB;
                }
            }
            if (cVar != null) {
                Map map = aVar.b;
                js3.o(map, "access$getHttpNetworkDetails$p(...)");
                map.put(fVar, cVar);
            }
        }
        return fVar;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List c() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                u0 u0Var = (u0) this.b;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) obj).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = urlNextElement.openStream();
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                u0Var.i(SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (RuntimeException e) {
                            u0Var.e(SentryLevel.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                    }
                } catch (IOException e2) {
                    u0Var.e(SentryLevel.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                u0Var.i(SentryLevel.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                u0 u0Var2 = (u0) this.b;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) obj).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    u0Var2.i(SentryLevel.INFO, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e3) {
                    u0Var2.f(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e3);
                    return null;
                } catch (RuntimeException e4) {
                    u0Var2.e(SentryLevel.ERROR, e4, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    public c d() throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        bVar.D();
        bVar.b();
        int i = bVar.c;
        int[] iArr = bVar.b;
        if (i == iArr.length) {
            bVar.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = bVar.b;
        int i2 = bVar.c;
        bVar.c = i2 + 1;
        iArr2[i2] = 3;
        bVar.a.write(123);
        return this;
    }

    @Override // io.sentry.u0
    public void e(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        u0 u0Var = (u0) this.b;
        if (u0Var == null || !l(sentryLevel)) {
            return;
        }
        u0Var.e(sentryLevel, th, str, objArr);
    }

    @Override // io.sentry.u0
    public void f(SentryLevel sentryLevel, String str, Throwable th) {
        u0 u0Var = (u0) this.b;
        if (u0Var == null || !l(sentryLevel)) {
            return;
        }
        u0Var.f(sentryLevel, str, th);
    }

    @Override // io.sentry.clientreport.e
    public void g(DiscardReason discardReason, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) cVar.c).iterator();
            while (it.hasNext()) {
                j(discardReason, (u4) it.next());
            }
        } catch (Throwable th) {
            ((b6) this.c).getLogger().e(SentryLevel.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.e
    public void h(DiscardReason discardReason, DataCategory dataCategory, long j) {
        try {
            r(discardReason.getReason(), dataCategory.getCategory(), Long.valueOf(j));
            o();
        } catch (Throwable th) {
            ((b6) this.c).getLogger().e(SentryLevel.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.u0
    public void i(SentryLevel sentryLevel, String str, Object... objArr) {
        u0 u0Var = (u0) this.b;
        if (u0Var == null || !l(sentryLevel)) {
            return;
        }
        u0Var.i(sentryLevel, str, objArr);
    }

    @Override // io.sentry.clientreport.e
    public void j(DiscardReason discardReason, u4 u4Var) {
        b6 b6Var = (b6) this.c;
        if (u4Var == null) {
            return;
        }
        try {
            SentryItemType sentryItemType = u4Var.a.e;
            if (SentryItemType.ClientReport.equals(sentryItemType)) {
                try {
                    s(u4Var.e(b6Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    b6Var.getLogger().i(SentryLevel.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            DataCategory dataCategoryM = m(sentryItemType);
            if (dataCategoryM.equals(DataCategory.Transaction)) {
                d0 d0VarI = u4Var.i(b6Var.getSerializer());
                if (d0VarI != null) {
                    ArrayList arrayList = d0VarI.s;
                    r(discardReason.getReason(), DataCategory.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    o();
                }
                r(discardReason.getReason(), dataCategoryM.getCategory(), 1L);
                o();
                return;
            }
            if (dataCategoryM.equals(DataCategory.LogItem)) {
                if (u4Var.g(b6Var.getSerializer()) == null) {
                    b6Var.getLogger().i(SentryLevel.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                r(discardReason.getReason(), dataCategoryM.getCategory(), Long.valueOf(r0.a.size()));
                r(discardReason.getReason(), DataCategory.LogByte.getCategory(), Long.valueOf(u4Var.f().length));
                o();
                return;
            }
            if (!dataCategoryM.equals(DataCategory.TraceMetric)) {
                r(discardReason.getReason(), dataCategoryM.getCategory(), 1L);
                o();
                return;
            }
            if (u4Var.h(b6Var.getSerializer()) == null) {
                b6Var.getLogger().i(SentryLevel.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            r(discardReason.getReason(), dataCategoryM.getCategory(), Long.valueOf(r12.a.size()));
            o();
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.e
    public c k(c cVar) {
        b6 b6Var = (b6) this.c;
        Date dateZ = io.sentry.config.a.z();
        f2 f2Var = (f2) this.b;
        f2Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.e) f2Var.b).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new d(((io.sentry.clientreport.c) entry.getKey()).a, ((io.sentry.clientreport.c) entry.getKey()).b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(dateZ, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) cVar.c).iterator();
            while (it.hasNext()) {
                arrayList2.add((u4) it.next());
            }
            arrayList2.add(u4.b(b6Var.getSerializer(), bVar));
            return new c((p4) cVar.b, arrayList2);
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    @Override // io.sentry.u0
    public boolean l(SentryLevel sentryLevel) {
        b6 b6Var = (b6) this.c;
        return sentryLevel != null && b6Var.isDebug() && sentryLevel.ordinal() >= b6Var.getDiagnosticLevel().ordinal();
    }

    public c n() throws IOException {
        ((io.sentry.vendor.gson.stream.b) this.b).d('}', 3, 5);
        return this;
    }

    public void o() {
        ((b6) this.c).getOnDiscard();
    }

    public byte[] p() {
        Callable callable;
        if (((byte[]) this.b) == null && (callable = (Callable) this.c) != null) {
            this.b = (byte[]) callable.call();
        }
        byte[] bArr = (byte[]) this.b;
        return bArr != null ? bArr : new byte[0];
    }

    public c q(String str) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        if (str == null) {
            bVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (bVar.g != null) {
            throw new IllegalStateException();
        }
        if (bVar.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        bVar.g = str;
        return this;
    }

    public void r(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.e) ((f2) this.b).b).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void s(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (d dVar : bVar.b) {
            r(dVar.a, dVar.b, dVar.c);
        }
    }

    public void t(String str) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        if (str != null) {
            bVar.getClass();
            if (str.length() != 0) {
                bVar.d = str;
                bVar.e = ": ";
                return;
            }
        }
        bVar.d = null;
        bVar.e = ":";
    }

    public String toString() {
        switch (this.a) {
            case 12:
                StringBuilder sb = new StringBuilder("NetworkBody{body=");
                sb.append(this.b);
                sb.append(", warnings=");
                return dw1.t(sb, (List) this.c, '}');
            default:
                return super.toString();
        }
    }

    public c u(double d) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        bVar.D();
        if (bVar.f || !(Double.isNaN(d) || Double.isInfinite(d))) {
            bVar.b();
            bVar.a.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public c v(long j) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        bVar.D();
        bVar.b();
        bVar.a.write(Long.toString(j));
        return this;
    }

    public c w(u0 u0Var, Object obj) {
        ((f2) this.c).h(this, u0Var, obj);
        return this;
    }

    public c x(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        if (bool == null) {
            bVar.k();
            return this;
        }
        bVar.D();
        bVar.b();
        bVar.a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c y(Number number) throws IOException {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        if (number == null) {
            bVar.k();
            return this;
        }
        bVar.D();
        String string = number.toString();
        if (bVar.f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            bVar.b();
            bVar.a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c z(String str) {
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) this.b;
        if (str == null) {
            bVar.k();
            return this;
        }
        bVar.D();
        bVar.b();
        bVar.y(str);
        return this;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public c(Writer writer, int i) {
        this.a = 2;
        this.b = new io.sentry.vendor.gson.stream.b(writer);
        this.c = new f2(i);
    }

    public c(String str, HashMap map) {
        this.a = 3;
        io.sentry.config.a.W(str, "url is required");
        try {
            this.b = URI.create(str).toURL();
            this.c = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public c(u0 u0Var) {
        this.a = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.b = u0Var;
        this.c = io.sentry.config.a.e(classLoader);
    }

    public c(Context context, u0 u0Var) {
        this.a = 8;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.b = u0Var;
    }

    public c(b6 b6Var) {
        this.a = 11;
        this.c = b6Var;
        this.b = new f2(7, (byte) 0);
    }

    public c(p4 p4Var, List list) {
        this.a = 6;
        io.sentry.config.a.W(p4Var, "SentryEnvelopeHeader is required.");
        this.b = p4Var;
        io.sentry.config.a.W(list, "SentryEnvelope items are required.");
        this.c = list;
    }

    public c(q6 q6Var, Double d) {
        this.a = 4;
        this.b = q6Var;
        this.c = d;
        Map map = Collections.EMPTY_MAP;
    }

    public c(v vVar, t tVar, u4 u4Var) {
        this.a = 6;
        this.b = new p4(vVar, tVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(u4Var);
        this.c = arrayList;
    }

    public c(Callable callable) {
        this.a = 7;
        this.c = callable;
    }
}
