package io.sentry.transport;

import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.clientreport.DiscardReason;
import io.sentry.h0;
import io.sentry.n4;
import io.sentry.p4;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {
    public final io.sentry.internal.debugmeta.c a;
    public final h0 b;
    public final io.sentry.cache.d c;
    public final r d = new r(-1);
    public final /* synthetic */ c e;

    public b(c cVar, io.sentry.internal.debugmeta.c cVar2, h0 h0Var, io.sentry.cache.d dVar) {
        this.e = cVar;
        io.sentry.config.a.W(cVar2, "Envelope is required.");
        this.a = cVar2;
        this.b = h0Var;
        io.sentry.config.a.W(dVar, "EnvelopeCache is required.");
        this.c = dVar;
    }

    public static /* synthetic */ void a(b bVar, io.sentry.config.a aVar, io.sentry.hints.j jVar) {
        bVar.e.c.getLogger().i(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.M()));
        jVar.b(aVar.M());
    }

    public final io.sentry.config.a b() {
        Class cls;
        n4 n4VarA;
        io.sentry.internal.debugmeta.c cVar = this.a;
        ((p4) cVar.b).d = null;
        io.sentry.cache.d dVar = this.c;
        h0 h0Var = this.b;
        boolean zR = dVar.R(cVar, h0Var);
        Object objB = h0Var.b("sentry:typeCheckHint");
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(h0Var.b("sentry:typeCheckHint"));
        c cVar2 = this.e;
        if (zIsInstance && objB != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objB;
            b6 b6Var = cVar2.c;
            if (cVar3.f(((p4) cVar.b).a)) {
                cVar3.a.countDown();
                b6Var.getLogger().i(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        b6 b6Var2 = cVar2.c;
        if (!cVar2.e.E()) {
            Object objB2 = h0Var.b("sentry:typeCheckHint");
            boolean zIsInstance2 = io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint"));
            r rVar = this.d;
            if (zIsInstance2 && objB2 != null) {
                ((io.sentry.hints.g) objB2).c(true);
                return rVar;
            }
            if (!zR) {
                io.sentry.config.a.P(io.sentry.hints.g.class, objB2, b6Var2.getLogger());
                b6Var2.getClientReportRecorder().g(DiscardReason.NETWORK_ERROR, cVar);
            }
            return rVar;
        }
        io.sentry.internal.debugmeta.c cVarK = b6Var2.getClientReportRecorder().k(cVar);
        try {
            n4VarA = b6Var2.getDateProvider().a();
            cls = io.sentry.hints.g.class;
        } catch (IOException e) {
            e = e;
            cls = io.sentry.hints.g.class;
        }
        try {
            ((p4) cVarK.b).d = io.sentry.config.a.A(Double.valueOf(n4VarA.d() / 1000000.0d).longValue());
            io.sentry.config.a aVarD = cVar2.f.d(cVarK);
            if (aVarD.M()) {
                dVar.l1(cVar);
                return aVarD;
            }
            String str = "The transport failed to send the envelope with response code " + aVarD.G();
            b6Var2.getLogger().i(SentryLevel.ERROR, str, new Object[0]);
            if (aVarD.G() >= 400) {
                dVar.l1(cVar);
                if (aVarD.G() != 429) {
                    b6Var2.getClientReportRecorder().g(DiscardReason.SEND_ERROR, cVarK);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e2) {
            e = e2;
            Object objB3 = h0Var.b("sentry:typeCheckHint");
            Class cls2 = cls;
            if (cls2.isInstance(h0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                ((io.sentry.hints.g) objB3).c(true);
            } else if (!zR) {
                io.sentry.config.a.P(cls2, objB3, b6Var2.getLogger());
                b6Var2.getClientReportRecorder().g(DiscardReason.NETWORK_ERROR, cVarK);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.g = this;
        io.sentry.config.a aVarB = this.d;
        try {
            aVarB = b();
            this.e.c.getLogger().i(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th) {
            try {
                this.e.c.getLogger().e(SentryLevel.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } finally {
                h0 h0Var = this.b;
                Object objB = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.j.class.isInstance(h0Var.b("sentry:typeCheckHint")) && objB != null) {
                    a(this, aVarB, (io.sentry.hints.j) objB);
                }
                this.e.g = null;
            }
        }
    }
}
