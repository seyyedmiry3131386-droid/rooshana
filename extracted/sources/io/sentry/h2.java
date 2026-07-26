package io.sentry;

import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Device$DeviceOrientation;
import io.sentry.protocol.SentryStackTrace$InstructionAddressAdjustment;
import io.sentry.rrweb.RRWebEventType;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements i1 {
    public static final Charset c = Charset.forName("UTF-8");
    public final b6 a;
    public final HashMap b;

    public h2(b6 b6Var) {
        this.a = b6Var;
        HashMap map = new HashMap();
        this.b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a(4));
        map.put(f.class, new e(0));
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a(5));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a(6));
        map.put(DebugImage.class, new io.sentry.clientreport.a(7));
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a(8));
        map.put(io.sentry.protocol.g.class, new io.sentry.clientreport.a(9));
        map.put(Device$DeviceOrientation.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.j.class, new io.sentry.clientreport.a(12));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(14));
        map.put(SentryStackTrace$InstructionAddressAdjustment.class, new io.sentry.clientreport.a(29));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(16));
        map.put(io.sentry.protocol.o.class, new io.sentry.clientreport.a(17));
        map.put(io.sentry.protocol.p.class, new io.sentry.clientreport.a(18));
        map.put(n3.class, new e(1));
        map.put(o3.class, new e(2));
        map.put(p3.class, new e(3));
        map.put(q3.class, new e(4));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(3));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(19));
        map.put(u3.class, new e(5));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.b0(9));
        map.put(RRWebEventType.class, new io.sentry.protocol.b0(10));
        map.put(io.sentry.rrweb.d.class, new io.sentry.protocol.b0(12));
        map.put(io.sentry.rrweb.f.class, new io.sentry.protocol.b0(14));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.b0(16));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.b0(17));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.b0(18));
        map.put(io.sentry.protocol.s.class, new io.sentry.clientreport.a(20));
        map.put(io.sentry.protocol.t.class, new io.sentry.clientreport.a(21));
        map.put(p4.class, new e(7));
        map.put(v4.class, new e(8));
        map.put(w4.class, new e(9));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(22));
        map.put(SentryItemType.class, new e(10));
        map.put(SentryLevel.class, new e(11));
        map.put(f5.class, new e(12));
        map.put(h5.class, new e(15));
        map.put(k5.class, new e(18));
        map.put(io.sentry.protocol.w.class, new io.sentry.clientreport.a(24));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(25));
        map.put(c6.class, new e(19));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(26));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(27));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a(28));
        map.put(i4.class, new e(6));
        map.put(io.sentry.protocol.c0.class, new io.sentry.protocol.b0(0));
        map.put(io.sentry.protocol.d0.class, new io.sentry.protocol.b0(1));
        map.put(i6.class, new e(21));
        map.put(k6.class, new e(22));
        map.put(m6.class, new e(23));
        map.put(SpanStatus.class, new e(24));
        map.put(io.sentry.protocol.g0.class, new io.sentry.protocol.b0(2));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(13));
        map.put(t6.class, new e(26));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.b0(4));
        map.put(io.sentry.protocol.h0.class, new io.sentry.protocol.b0(3));
    }

    @Override // io.sentry.i1
    public final void a(Object obj, Writer writer) throws IOException {
        io.sentry.config.a.W(obj, "The entity is required.");
        b6 b6Var = this.a;
        u0 logger = b6Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (logger.l(sentryLevel)) {
            b6Var.getLogger().i(sentryLevel, "Serializing object: %s", f(obj, b6Var.isEnablePrettySerializationOutput()));
        }
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(writer, b6Var.getMaxDepth());
        ((f2) cVar.c).h(cVar, b6Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.i1
    public final String b(ConcurrentHashMap concurrentHashMap) {
        return f(concurrentHashMap, false);
    }

    @Override // io.sentry.i1
    public final Object c(Reader reader, Class cls) {
        Object objO0;
        b6 b6Var = this.a;
        try {
            e2 e2Var = new e2(reader);
            try {
                s1 s1Var = (s1) this.b.get(cls);
                if (s1Var != null) {
                    objO0 = cls.cast(s1Var.a(e2Var, b6Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        e2Var.close();
                        return null;
                    }
                    objO0 = e2Var.O0();
                }
                e2Var.close();
                return objO0;
            } finally {
            }
        } catch (Exception e) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.i1
    public final io.sentry.internal.debugmeta.c d(BufferedInputStream bufferedInputStream) {
        b6 b6Var = this.a;
        try {
            return b6Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.i1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) throws IOException {
        b6 b6Var = this.a;
        io.sentry.config.a.W(cVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c));
        try {
            ((p4) cVar.b).serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, b6Var.getMaxDepth()), b6Var.getLogger());
            bufferedWriter.write("\n");
            for (u4 u4Var : (Iterable) cVar.c) {
                try {
                    byte[] bArrF = u4Var.f();
                    u4Var.a.serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, b6Var.getMaxDepth()), b6Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrF);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    b6Var.getLogger().f(SentryLevel.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    public final String f(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        b6 b6Var = this.a;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(stringWriter, b6Var.getMaxDepth());
        if (z) {
            cVar.t("\t");
        }
        ((f2) cVar.c).h(cVar, b6Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
