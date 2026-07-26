package defpackage;

import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.DataCategory;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.a;
import io.sentry.a1;
import io.sentry.android.core.e0;
import io.sentry.b0;
import io.sentry.b6;
import io.sentry.c6;
import io.sentry.clientreport.DiscardReason;
import io.sentry.e5;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.f0;
import io.sentry.f1;
import io.sentry.f3;
import io.sentry.g5;
import io.sentry.h0;
import io.sentry.h5;
import io.sentry.i1;
import io.sentry.i6;
import io.sentry.internal.debugmeta.c;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.k5;
import io.sentry.k6;
import io.sentry.l4;
import io.sentry.logger.b;
import io.sentry.m1;
import io.sentry.metrics.d;
import io.sentry.n3;
import io.sentry.n6;
import io.sentry.o1;
import io.sentry.o2;
import io.sentry.p3;
import io.sentry.p4;
import io.sentry.protocol.d0;
import io.sentry.protocol.e;
import io.sentry.protocol.f;
import io.sentry.protocol.j;
import io.sentry.protocol.q;
import io.sentry.protocol.t;
import io.sentry.protocol.v;
import io.sentry.q4;
import io.sentry.q6;
import io.sentry.r4;
import io.sentry.transport.g;
import io.sentry.transport.p;
import io.sentry.u0;
import io.sentry.u3;
import io.sentry.u4;
import io.sentry.util.l;
import io.sentry.v4;
import io.sentry.w4;
import io.sentry.y;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.GenericDeclaration;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gg1 implements f1, b70 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public gg1(ku2 ku2Var, sl slVar, cm cmVar) {
        Objects.requireNonNull(ku2Var);
        this.f = ku2Var;
        this.d = null;
        this.e = null;
        this.a = false;
        this.b = slVar;
        this.c = cmVar;
    }

    public static ArrayList s(h0 h0Var) {
        ArrayList arrayList = new ArrayList(h0Var.b);
        a aVar = h0Var.d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        a aVar2 = h0Var.e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        a aVar3 = h0Var.f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        a aVar4 = h0Var.g;
        if (aVar4 != null) {
            arrayList.add(aVar4);
        }
        return arrayList;
    }

    public boolean A(k4 k4Var, h0 h0Var) {
        if (io.sentry.config.a.Y(h0Var)) {
            return true;
        }
        ((b6) this.b).getLogger().i(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", k4Var.a);
        return false;
    }

    public void B(ConnectionResult connectionResult) {
        wh9 wh9Var = (wh9) ((ku2) this.f).j.get((cm) this.c);
        if (wh9Var != null) {
            wh9Var.k(connectionResult);
        }
    }

    @Override // io.sentry.f1
    public void a(boolean z) {
        long shutdownTimeoutMillis;
        b6 b6Var = (b6) this.b;
        b6Var.getLogger().i(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = b6Var.getShutdownTimeoutMillis();
            } catch (IOException e) {
                b6Var.getLogger().f(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        c(shutdownTimeoutMillis);
        ((b) this.e).a(z);
        ((io.sentry.metrics.a) this.f).a(z);
        ((g) this.c).a(z);
        for (b0 b0Var : b6Var.getEventProcessors()) {
            if (b0Var instanceof Closeable) {
                try {
                    ((Closeable) b0Var).close();
                } catch (IOException e2) {
                    b6Var.getLogger().i(SentryLevel.WARNING, "Failed to close the event processor {}.", b0Var, e2);
                }
            }
        }
        this.a = false;
    }

    @Override // io.sentry.f1
    public void b(i6 i6Var, h0 h0Var) {
        b6 b6Var = (b6) this.b;
        io.sentry.config.a.W(i6Var, "Session is required.");
        String str = i6Var.m;
        if (str == null || str.isEmpty()) {
            b6Var.getLogger().i(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            i1 serializer = b6Var.getSerializer();
            t sdkVersion = b6Var.getSdkVersion();
            io.sentry.config.a.W(serializer, "Serializer is required.");
            i(new c((v) null, sdkVersion, u4.d(serializer, i6Var)), h0Var);
        } catch (IOException e) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.f1
    public void c(long j) {
        ((b) this.e).c(j);
        ((io.sentry.metrics.a) this.f).c(j);
        ((g) this.c).c(j);
    }

    @Override // defpackage.b70
    public void d(ConnectionResult connectionResult) {
        ((ku2) this.f).m.post(new g6(this, connectionResult, 29));
    }

    @Override // io.sentry.f1
    public p e() {
        return ((g) this.c).e();
    }

    @Override // io.sentry.f1
    public boolean f() {
        return ((g) this.c).f();
    }

    @Override // io.sentry.f1
    public v g(c6 c6Var, a1 a1Var, h0 h0Var) {
        b6 b6Var = (b6) this.b;
        if (A(c6Var, h0Var)) {
            q qVar = c6Var.d;
            e eVar = c6Var.b;
            if (qVar == null) {
                c6Var.d = a1Var.a();
            }
            if (c6Var.i == null) {
                c6Var.i = a1Var.L();
            }
            if (c6Var.e == null) {
                c6Var.c(new HashMap(a1Var.A()));
            } else {
                for (Map.Entry entry : a1Var.A().entrySet()) {
                    if (!c6Var.e.containsKey(entry.getKey())) {
                        c6Var.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new e(a1Var.E()).a.entrySet()) {
                if (!eVar.a(entry2.getKey())) {
                    eVar.k(entry2.getValue(), (String) entry2.getKey());
                }
            }
            k1 k1VarD = a1Var.d();
            if (eVar.i() == null) {
                if (k1VarD == null) {
                    eVar.v(q6.b(a1Var.w()));
                } else {
                    eVar.v(k1VarD.x());
                }
            }
        }
        b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing session replay: %s", c6Var.a);
        v vVar = v.b;
        v vVar2 = c6Var.a;
        if (vVar2 != null) {
            vVar = vVar2;
        }
        Iterator<b0> it = b6Var.getEventProcessors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b0 next = it.next();
            try {
                c6Var = next.b(c6Var, h0Var);
            } catch (Throwable th) {
                b6Var.getLogger().e(SentryLevel.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (c6Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                b6Var.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Replay);
                break;
            }
        }
        if (c6Var != null) {
            b6Var.getBeforeSendReplay();
        }
        if (c6Var == null) {
            return v.b;
        }
        try {
            c cVarR = r(c6Var, h0Var.h, t(a1Var, h0Var, c6Var, null), io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint")));
            h0Var.a();
            ((g) this.c).I0(cVarR, h0Var);
            return vVar;
        } catch (IOException e) {
            b6Var.getLogger().e(SentryLevel.WARNING, e, "Capturing event %s failed.", vVar);
            return v.b;
        }
    }

    @Override // io.sentry.f1
    public void h(g5 g5Var, a1 a1Var) {
        g5 g5VarX;
        b6 b6Var = (b6) this.b;
        g5 g5VarX2 = x(g5Var, a1Var.M());
        if (g5VarX2 == null || (g5VarX = x(g5VarX2, b6Var.getEventProcessors())) == null) {
            return;
        }
        b6Var.getLogs().getClass();
        ((b) this.e).d(g5VarX);
    }

    @Override // io.sentry.f1
    public v i(c cVar, h0 h0Var) {
        try {
            h0Var.a();
            return z(cVar, h0Var);
        } catch (IOException e) {
            ((b6) this.b).getLogger().f(SentryLevel.ERROR, "Failed to capture envelope.", e);
            return v.b;
        }
    }

    @Override // io.sentry.f1
    public boolean isEnabled() {
        return this.a;
    }

    @Override // io.sentry.f1
    public v j(d0 d0Var, n6 n6Var, a1 a1Var, h0 h0Var, p3 p3Var) {
        k6 k6VarI;
        Pattern pattern;
        b6 b6Var = (b6) this.b;
        h0 h0Var2 = h0Var == null ? new h0() : h0Var;
        if (A(d0Var, h0Var2)) {
            h0Var2.b.addAll(a1Var.C());
        }
        b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing transaction: %s", d0Var.a);
        List<f0> ignoredTransactions = b6Var.getIgnoredTransactions();
        String str = d0Var.p;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<f0> it = ignoredTransactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<f0> it2 = ignoredTransactions.iterator();
                    while (it2.hasNext()) {
                        try {
                            pattern = it2.next().b;
                        } catch (Throwable unused) {
                        }
                        if (pattern == null ? false : pattern.matcher(str).matches()) {
                        }
                    }
                } else if (it.next().a.equalsIgnoreCase(str)) {
                    break;
                }
            }
            b6Var.getLogger().i(SentryLevel.DEBUG, "Transaction was dropped as transaction name %s is ignored", d0Var.p);
            io.sentry.clientreport.e clientReportRecorder = b6Var.getClientReportRecorder();
            DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
            clientReportRecorder.a(discardReason, DataCategory.Transaction);
            b6Var.getClientReportRecorder().h(discardReason, DataCategory.Span, d0Var.s.size() + 1);
            return v.b;
        }
        v vVar = v.b;
        v vVarZ = d0Var.a;
        if (vVarZ == null) {
            vVarZ = vVar;
        }
        if (A(d0Var, h0Var2)) {
            n(d0Var, a1Var);
            d0Var = y(d0Var, h0Var2, a1Var.M());
            if (d0Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (d0Var != null) {
            d0Var = y(d0Var, h0Var2, b6Var.getEventProcessors());
        }
        d0 d0Var2 = d0Var;
        if (d0Var2 == null) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return vVar;
        }
        ArrayList arrayList = d0Var2.s;
        int size = arrayList.size();
        b6Var.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            b6Var.getLogger().i(SentryLevel.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            b6Var.getClientReportRecorder().h(DiscardReason.BEFORE_SEND, DataCategory.Span, i);
        }
        try {
            ArrayList arrayListS = s(h0Var2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListS.iterator();
            while (it3.hasNext()) {
                ((a) it3.next()).getClass();
            }
            c cVarO = o(d0Var2, arrayList2, null, n6Var, p3Var);
            h0Var2.a();
            if (cVarO != null) {
                vVarZ = z(cVarO, h0Var2);
            }
        } catch (SentryEnvelopeException | IOException e) {
            b6Var.getLogger().e(SentryLevel.WARNING, e, "Capturing transaction %s failed.", vVarZ);
            vVarZ = v.b;
        }
        if (!vVarZ.equals(v.b) && (k6VarI = d0Var2.b.i()) != null) {
            b6Var.getReplayController().y(k6VarI.a);
        }
        return vVarZ;
    }

    @Override // io.sentry.f1
    public v k(j jVar, a1 a1Var) {
        b6 b6Var = (b6) this.b;
        w4 w4Var = new w4();
        e eVar = w4Var.b;
        eVar.k(jVar, "feedback");
        h0 h0Var = new h0();
        if (jVar.f == null) {
            jVar.f = a1Var.G();
        }
        b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing feedback: %s", w4Var.a);
        if (A(w4Var, h0Var)) {
            if (w4Var.i == null) {
                w4Var.i = a1Var.L();
            }
            if (w4Var.e == null) {
                w4Var.c(new HashMap(a1Var.A()));
            } else {
                for (Map.Entry entry : a1Var.A().entrySet()) {
                    if (!w4Var.e.containsKey(entry.getKey())) {
                        w4Var.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new e(a1Var.E()).a.entrySet()) {
                if (!eVar.a(entry2.getKey())) {
                    eVar.k(entry2.getValue(), (String) entry2.getKey());
                }
            }
            k1 k1VarD = a1Var.d();
            if (eVar.i() == null) {
                if (k1VarD == null) {
                    eVar.v(q6.b(a1Var.w()));
                } else {
                    eVar.v(k1VarD.x());
                }
            }
            w4Var = w(w4Var, h0Var, a1Var.M());
            if (w4Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
                return v.b;
            }
        }
        w4 w4VarW = w(w4Var, h0Var, b6Var.getEventProcessors());
        if (w4VarW != null) {
            b6Var.getBeforeSendFeedback();
        }
        if (w4VarW == null) {
            return v.b;
        }
        v vVar = v.b;
        v vVar2 = w4VarW.a;
        v vVar3 = vVar2 != null ? vVar2 : vVar;
        if (jVar.e == null) {
            b6Var.getReplayController().d(Boolean.FALSE);
            v vVarK = a1Var.k();
            if (!vVarK.equals(vVar)) {
                jVar.e = vVarK;
            }
        }
        try {
            c cVarO = o(w4VarW, s(h0Var), null, t(a1Var, h0Var, w4VarW, w4VarW.v), null);
            h0Var.a();
            return cVarO != null ? z(cVarO, h0Var) : vVar3;
        } catch (SentryEnvelopeException | IOException e) {
            b6Var.getLogger().e(SentryLevel.WARNING, e, "Capturing feedback %s failed.", vVar3);
            return v.b;
        }
    }

    @Override // io.sentry.f1
    public v l(n3 n3Var) {
        io.sentry.config.a.W(n3Var, "profileChunk is required.");
        b6 b6Var = (b6) this.b;
        b6Var.getLogger().i(SentryLevel.DEBUG, "Capturing profile chunk: %s", n3Var.c);
        v vVar = n3Var.c;
        f fVarA = f.a(n3Var.a, b6Var);
        if (fVarA != null) {
            n3Var.a = fVarA;
        }
        try {
            return z(new c(new p4(vVar, b6Var.getSdkVersion(), null), Collections.singletonList(u4.c(n3Var, b6Var.getSerializer(), b6Var.getProfilerConverter()))), null);
        } catch (SentryEnvelopeException | IOException e) {
            b6Var.getLogger().e(SentryLevel.WARNING, e, "Capturing profile chunk %s failed.", vVar);
            return v.b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        r9.getLogger().i(io.sentry.SentryLevel.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", r0.q);
        r9.getClientReportRecorder().a(io.sentry.clientreport.DiscardReason.EVENT_PROCESSOR, io.sentry.DataCategory.Error);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        return io.sentry.protocol.v.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030a  */
    @Override // io.sentry.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.v m(io.sentry.w4 r16, io.sentry.a1 r17, io.sentry.h0 r18) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg1.m(io.sentry.w4, io.sentry.a1, io.sentry.h0):io.sentry.protocol.v");
    }

    public void n(k4 k4Var, a1 a1Var) {
        if (a1Var != null) {
            if (k4Var.d == null) {
                k4Var.d = a1Var.a();
            }
            if (k4Var.i == null) {
                k4Var.i = a1Var.L();
            }
            if (k4Var.e == null) {
                k4Var.c(new HashMap(a1Var.A()));
            } else {
                for (Map.Entry entry : a1Var.A().entrySet()) {
                    if (!k4Var.e.containsKey(entry.getKey())) {
                        k4Var.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (k4Var.m == null) {
                k4Var.m = new ArrayList(new ArrayList(a1Var.u()));
            } else {
                Queue queueU = a1Var.u();
                List list = k4Var.m;
                if (list != null && !queueU.isEmpty()) {
                    list.addAll(queueU);
                    Collections.sort(list, (l4) this.d);
                }
            }
            if (k4Var.o == null) {
                k4Var.o = new HashMap(new HashMap(a1Var.getExtras()));
            } else {
                for (Map.Entry entry2 : a1Var.getExtras().entrySet()) {
                    if (!k4Var.o.containsKey(entry2.getKey())) {
                        k4Var.o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            e eVar = k4Var.b;
            for (Map.Entry entry3 : new e(a1Var.E()).a.entrySet()) {
                if (!eVar.a(entry3.getKey())) {
                    eVar.k(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public c o(k4 k4Var, ArrayList arrayList, i6 i6Var, n6 n6Var, p3 p3Var) {
        v vVar;
        b6 b6Var = (b6) this.b;
        ArrayList arrayList2 = new ArrayList();
        if (k4Var != null) {
            i1 serializer = b6Var.getSerializer();
            Charset charset = u4.d;
            io.sentry.config.a.W(serializer, "ISerializer is required.");
            c cVar = new c(new za1(serializer, k4Var, 7));
            arrayList2.add(new u4(new v4(SentryItemType.resolve(k4Var), new q4(cVar, 6), "application/json", null, null), new q4(cVar, 8)));
            vVar = k4Var.a;
        } else {
            vVar = null;
        }
        if (i6Var != null) {
            arrayList2.add(u4.d(b6Var.getSerializer(), i6Var));
        }
        if (p3Var != null) {
            long maxTraceFileSize = b6Var.getMaxTraceFileSize();
            i1 serializer2 = b6Var.getSerializer();
            Charset charset2 = u4.d;
            File file = p3Var.a;
            c cVar2 = new c(new r4(file, maxTraceFileSize, p3Var, serializer2));
            arrayList2.add(new u4(new v4(SentryItemType.Profile, new q4(cVar2, 4), "application-json", file.getName(), null), new q4(cVar2, 5)));
            if (vVar == null) {
                vVar = new v(p3Var.w);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                i1 serializer3 = b6Var.getSerializer();
                u0 logger = b6Var.getLogger();
                long maxAttachmentSize = b6Var.getMaxAttachmentSize();
                Charset charset3 = u4.d;
                c cVar3 = new c(new r4(aVar, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new u4(new v4(SentryItemType.Attachment, new q4(cVar3, 2), aVar.e, aVar.d, aVar.f), new q4(cVar3, 3)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new c(new p4(vVar, b6Var.getSdkVersion(), n6Var), arrayList2);
    }

    public c p(h5 h5Var) {
        ArrayList arrayList = new ArrayList();
        b6 b6Var = (b6) this.b;
        i1 serializer = b6Var.getSerializer();
        Charset charset = u4.d;
        io.sentry.config.a.W(serializer, "ISerializer is required.");
        c cVar = new c(new za1(serializer, h5Var, 10));
        arrayList.add(new u4(new v4(SentryItemType.Log, new q4(cVar, 0), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(h5Var.a.size())), new q4(cVar, 1)));
        return new c(new p4(null, b6Var.getSdkVersion(), null), arrayList);
    }

    public c q(k5 k5Var) {
        ArrayList arrayList = new ArrayList();
        b6 b6Var = (b6) this.b;
        i1 serializer = b6Var.getSerializer();
        Charset charset = u4.d;
        io.sentry.config.a.W(serializer, "ISerializer is required.");
        c cVar = new c(new za1(serializer, k5Var, 6));
        arrayList.add(new u4(new v4(SentryItemType.TraceMetric, new q4(cVar, 7), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(k5Var.a.size())), new q4(cVar, 13)));
        return new c(new p4(null, b6Var.getSdkVersion(), null), arrayList);
    }

    public c r(final c6 c6Var, final u3 u3Var, n6 n6Var, final boolean z) {
        ArrayList arrayList = new ArrayList();
        b6 b6Var = (b6) this.b;
        final i1 serializer = b6Var.getSerializer();
        final u0 logger = b6Var.getLogger();
        Charset charset = u4.d;
        final File file = c6Var.p;
        c cVar = new c(new Callable() { // from class: io.sentry.s4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i1 i1Var = serializer;
                c6 c6Var2 = c6Var;
                File file2 = file;
                u0 u0Var = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, u4.d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            i1Var.a(c6Var2, bufferedWriter);
                            linkedHashMap.put(SentryItemType.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            u3 u3Var2 = u3Var;
                            if (u3Var2 != null) {
                                i1Var.a(u3Var2, bufferedWriter);
                                linkedHashMap.put(SentryItemType.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrU = io.sentry.config.a.U(10485760L, file2.getPath());
                                if (bArrU.length > 0) {
                                    linkedHashMap.put(SentryItemType.ReplayVideo.getItemType(), bArrU);
                                }
                            }
                            byte[] bArrJ = u4.j(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    return bArrJ;
                                }
                            }
                            return bArrJ;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        u0Var.f(SentryLevel.ERROR, "Could not serialize replay recording", th);
                        if (file2 == null) {
                            return null;
                        }
                        if (z2) {
                            io.sentry.config.a.p(file2.getParentFile());
                            return null;
                        }
                        file2.delete();
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.config.a.p(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new u4(new v4(SentryItemType.ReplayVideo, new q4(cVar, 11), null, null, null), new q4(cVar, 12)));
        return new c(new p4(c6Var.a, b6Var.getSessionReplay().l, n6Var), arrayList);
    }

    public n6 t(a1 a1Var, h0 h0Var, k4 k4Var, String str) {
        b6 b6Var = (b6) this.b;
        if (io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            if (k4Var != null) {
                io.sentry.c cVar = new io.sentry.c(b6Var.getLogger());
                e eVar = k4Var.b;
                k6 k6VarI = eVar.i();
                cVar.d("sentry-trace_id", k6VarI != null ? k6VarI.a.toString() : null);
                cVar.d("sentry-public_key", b6Var.retrieveParsedDsn().b);
                cVar.d("sentry-release", k4Var.f);
                cVar.d("sentry-environment", k4Var.g);
                cVar.d("sentry-org_id", b6Var.getEffectiveOrgId());
                cVar.d("sentry-transaction", str);
                if (cVar.f) {
                    cVar.c = null;
                }
                cVar.d("sentry-sampled", null);
                if (cVar.f) {
                    cVar.d = null;
                }
                Object objC = eVar.c("replay_id");
                if (objC != null && !objC.toString().equals(v.b.toString())) {
                    cVar.d("sentry-replay_id", objC.toString());
                    eVar.a.remove("replay_id");
                }
                cVar.f = false;
                return cVar.f();
            }
        } else if (a1Var != null) {
            m1 m1VarO = a1Var.o();
            return m1VarO != null ? m1VarO.b() : ((io.sentry.c) a1Var.F(new l(a1Var, b6Var)).d).f();
        }
        return null;
    }

    public vb8 u(int i) {
        vb8 vb8Var;
        vb8 fg1Var;
        HashMap map = (HashMap) this.c;
        vb8 vb8Var2 = (vb8) map.get(Integer.valueOf(i));
        if (vb8Var2 != null) {
            return vb8Var2;
        }
        final wa1 wa1Var = (wa1) this.e;
        wa1Var.getClass();
        final int i2 = 0;
        if (i != 0) {
            final int i3 = 1;
            if (i != 1) {
                final int i4 = 2;
                if (i != 2) {
                    final int i5 = 3;
                    if (i == 3) {
                        fg1Var = new fg1(i2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(js4.class));
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(rm7.n(i, "Unrecognized contentType: "));
                        }
                        vb8Var = new vb8() { // from class: eg1
                            @Override // defpackage.vb8
                            public final Object get() {
                                switch (i5) {
                                    case 0:
                                        return ig1.e((Class) this, wa1Var);
                                    case 1:
                                        return ig1.e((Class) this, wa1Var);
                                    case 2:
                                        return ig1.e((Class) this, wa1Var);
                                    default:
                                        return new tm6(wa1Var, (pe1) ((gg1) this).b);
                                }
                            }
                        };
                    }
                } else {
                    final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(js4.class);
                    fg1Var = new vb8() { // from class: eg1
                        @Override // defpackage.vb8
                        public final Object get() {
                            switch (i4) {
                                case 0:
                                    return ig1.e((Class) clsAsSubclass, wa1Var);
                                case 1:
                                    return ig1.e((Class) clsAsSubclass, wa1Var);
                                case 2:
                                    return ig1.e((Class) clsAsSubclass, wa1Var);
                                default:
                                    return new tm6(wa1Var, (pe1) ((gg1) clsAsSubclass).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(js4.class);
                fg1Var = new vb8() { // from class: eg1
                    @Override // defpackage.vb8
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return ig1.e((Class) genericDeclarationAsSubclass, wa1Var);
                            case 1:
                                return ig1.e((Class) genericDeclarationAsSubclass, wa1Var);
                            case 2:
                                return ig1.e((Class) genericDeclarationAsSubclass, wa1Var);
                            default:
                                return new tm6(wa1Var, (pe1) ((gg1) genericDeclarationAsSubclass).b);
                        }
                    }
                };
            }
            vb8Var = fg1Var;
        } else {
            final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(js4.class);
            vb8Var = new vb8() { // from class: eg1
                @Override // defpackage.vb8
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return ig1.e((Class) genericDeclarationAsSubclass2, wa1Var);
                        case 1:
                            return ig1.e((Class) genericDeclarationAsSubclass2, wa1Var);
                        case 2:
                            return ig1.e((Class) genericDeclarationAsSubclass2, wa1Var);
                        default:
                            return new tm6(wa1Var, (pe1) ((gg1) genericDeclarationAsSubclass2).b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i), vb8Var);
        return vb8Var;
    }

    public w4 v(w4 w4Var, h0 h0Var, List list) {
        b6 b6Var = (b6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b0 b0Var = (b0) it.next();
            try {
                boolean z = b0Var instanceof e0;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(h0Var.b("sentry:typeCheckHint"));
                if (zIsInstance && z) {
                    ((e0) b0Var).d(w4Var, h0Var);
                } else if (!zIsInstance && !z) {
                    w4Var = b0Var.d(w4Var, h0Var);
                }
            } catch (Throwable th) {
                b6Var.getLogger().e(SentryLevel.ERROR, th, "An exception occurred while processing event by processor: %s", b0Var.getClass().getName());
            }
            if (w4Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Event was dropped by a processor: %s", b0Var.getClass().getName());
                b6Var.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
                break;
            }
        }
        return w4Var;
    }

    public w4 w(w4 w4Var, h0 h0Var, List list) {
        b6 b6Var = (b6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b0 b0Var = (b0) it.next();
            try {
                w4Var = b0Var.d(w4Var, h0Var);
            } catch (Throwable th) {
                b6Var.getLogger().e(SentryLevel.ERROR, th, "An exception occurred while processing feedback event by processor: %s", b0Var.getClass().getName());
            }
            if (w4Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Feedback event was dropped by a processor: %s", b0Var.getClass().getName());
                b6Var.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Feedback);
                break;
            }
        }
        return w4Var;
    }

    public g5 x(g5 g5Var, List list) {
        b6 b6Var = (b6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b0 b0Var = (b0) it.next();
            try {
                g5Var = b0Var.k(g5Var);
            } catch (Throwable th) {
                b6Var.getLogger().e(SentryLevel.ERROR, th, "An exception occurred while processing log event by processor: %s", b0Var.getClass().getName());
            }
            if (g5Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Log event was dropped by a processor: %s", b0Var.getClass().getName());
                b6Var.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.LogItem);
                break;
            }
        }
        return g5Var;
    }

    public d0 y(d0 d0Var, h0 h0Var, List list) {
        b6 b6Var = (b6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b0 b0Var = (b0) it.next();
            int size = d0Var.s.size();
            try {
                d0Var = b0Var.g(d0Var, h0Var);
            } catch (Throwable th) {
                b6Var.getLogger().e(SentryLevel.ERROR, th, "An exception occurred while processing transaction by processor: %s", b0Var.getClass().getName());
            }
            int size2 = d0Var == null ? 0 : d0Var.s.size();
            if (d0Var == null) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", b0Var.getClass().getName());
                io.sentry.clientreport.e clientReportRecorder = b6Var.getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.EVENT_PROCESSOR;
                clientReportRecorder.a(discardReason, DataCategory.Transaction);
                b6Var.getClientReportRecorder().h(discardReason, DataCategory.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                b6Var.getLogger().i(SentryLevel.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), b0Var.getClass().getName());
                b6Var.getClientReportRecorder().h(DiscardReason.EVENT_PROCESSOR, DataCategory.Span, i);
            }
        }
        return d0Var;
    }

    public v z(c cVar, h0 h0Var) {
        g gVar = (g) this.c;
        b6 b6Var = (b6) this.b;
        b6Var.getBeforeEnvelopeCallback();
        e5.d().c(b6Var.getLogger());
        if (h0Var == null) {
            gVar.q(cVar);
        } else {
            gVar.I0(cVar, h0Var);
        }
        v vVar = ((p4) cVar.b).a;
        return vVar != null ? vVar : v.b;
    }

    public gg1(b6 b6Var) {
        this.d = new l4();
        this.b = b6Var;
        this.a = true;
        o1 transportFactory = b6Var.getTransportFactory();
        if (transportFactory instanceof f3) {
            transportFactory = new o2();
            b6Var.setTransportFactory(transportFactory);
        }
        y yVarRetrieveParsedDsn = b6Var.retrieveParsedDsn();
        String sentryClientName = b6Var.getSentryClientName();
        URI uri = yVarRetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = yVarRetrieveParsedDsn.b;
        String str2 = yVarRetrieveParsedDsn.a;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        sb.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.c = transportFactory.j(b6Var, new c(string, map));
        if (b6Var.getLogs().a) {
            this.e = b6Var.getLogs().b.b(b6Var, this);
        } else {
            this.e = io.sentry.logger.e.b;
        }
        if (b6Var.getMetrics().a) {
            this.f = b6Var.getMetrics().b.mo27b(b6Var, this);
        } else {
            this.f = d.a;
        }
    }

    public gg1(pe1 pe1Var, av avVar) {
        this.b = pe1Var;
        this.f = avVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = true;
    }
}
