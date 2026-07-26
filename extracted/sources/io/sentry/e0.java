package io.sentry;

import defpackage.bl4;
import defpackage.rm7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements s0, io.sentry.logger.a {
    public final b4 a;

    public /* synthetic */ e0(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // io.sentry.s0
    public void a() {
        this.a.m().getFeedbackOptions().i.d();
    }

    public HashMap b(d dVar, String str, Object... objArr) {
        HashMap map = new HashMap();
        b4 b4Var = this.a;
        Iterator it = ((ConcurrentHashMap) b4Var.e.getAttributes()).values().iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        String str2 = dVar.a;
        if (!"manual".equalsIgnoreCase(str2)) {
            map.put("sentry.origin", new io.sentry.protocol.m(SentryAttributeType.STRING, str2));
        }
        int i = 0;
        for (Object obj : objArr) {
            map.put(rm7.n(i, "sentry.message.parameter."), new io.sentry.protocol.m(SentryAttributeType.inferFrom(obj), obj));
            i++;
        }
        if (i > 0 && map.get("sentry.message.template") == null) {
            map.put("sentry.message.template", new io.sentry.protocol.m(SentryAttributeType.STRING, str));
        }
        io.sentry.protocol.t sdkVersion = b4Var.m().getSdkVersion();
        if (sdkVersion != null) {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            map.put("sentry.sdk.name", new io.sentry.protocol.m(sentryAttributeType, sdkVersion.a));
            map.put("sentry.sdk.version", new io.sentry.protocol.m(sentryAttributeType.apiName(), sdkVersion.b));
        }
        String environment = b4Var.m().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new io.sentry.protocol.m(SentryAttributeType.STRING, environment));
        }
        io.sentry.protocol.v vVarK = b4Var.e.k();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (vVar.equals(vVarK)) {
            io.sentry.protocol.v vVarK2 = b4Var.m().getReplayController().k();
            if (!vVar.equals(vVarK2)) {
                map.put("sentry.replay_id", new io.sentry.protocol.m(SentryAttributeType.STRING, vVarK2.toString()));
                map.put("sentry._internal.replay_is_buffering", new io.sentry.protocol.m(SentryAttributeType.BOOLEAN, Boolean.TRUE));
            }
        } else {
            map.put("sentry.replay_id", new io.sentry.protocol.m(SentryAttributeType.STRING, vVarK.toString()));
        }
        String release = b4Var.m().getRelease();
        if (release != null) {
            map.put("sentry.release", new io.sentry.protocol.m(SentryAttributeType.STRING, release));
        }
        if (!io.sentry.util.h.a) {
            b6 b6VarM = b4Var.m();
            String serverName = b6VarM.getServerName();
            if (serverName != null) {
                map.put("server.address", new io.sentry.protocol.m(SentryAttributeType.STRING, serverName));
            } else if (b6VarM.isAttachServerName()) {
                k0 k0VarA = k0.a();
                if (k0VarA.c < System.currentTimeMillis() && k0VarA.d.compareAndSet(false, true)) {
                    k0VarA.b();
                }
                String str3 = k0VarA.b;
                if (str3 != null) {
                    map.put("server.address", new io.sentry.protocol.m(SentryAttributeType.STRING, str3));
                }
            }
        }
        io.sentry.protocol.g0 g0VarL = b4Var.e.L();
        if (g0VarL == null) {
            String distinctId = b4Var.m().getDistinctId();
            if (distinctId != null) {
                map.put("user.id", new io.sentry.protocol.m(SentryAttributeType.STRING, distinctId));
                return map;
            }
        } else {
            String str4 = g0VarL.b;
            if (str4 != null) {
                map.put("user.id", new io.sentry.protocol.m(SentryAttributeType.STRING, str4));
            }
            String str5 = g0VarL.c;
            if (str5 != null) {
                map.put("user.name", new io.sentry.protocol.m(SentryAttributeType.STRING, str5));
            }
            String str6 = g0VarL.a;
            if (str6 != null) {
                map.put("user.email", new io.sentry.protocol.m(SentryAttributeType.STRING, str6));
            }
        }
        return map;
    }

    @Override // io.sentry.s0
    public io.sentry.protocol.v c(io.sentry.protocol.j jVar) {
        b4 b4Var = this.a;
        a1 a1Var = b4Var.e;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (!b4Var.isEnabled()) {
            b4Var.m().getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
            return vVar;
        }
        if (jVar.a.isEmpty()) {
            b4Var.m().getLogger().i(SentryLevel.WARNING, "captureFeedback called with empty message.", new Object[0]);
            return vVar;
        }
        try {
            return a1Var.z().k(jVar, a1Var);
        } catch (Throwable th) {
            b4Var.m().getLogger().f(SentryLevel.ERROR, "Error while capturing feedback: " + jVar.a, th);
            return vVar;
        }
    }

    @Override // io.sentry.logger.a
    public void e(SentryLogLevel sentryLogLevel, d dVar, String str, Object... objArr) {
        String str2;
        b4 b4Var = this.a;
        b6 b6VarM = b4Var.m();
        a1 a1Var = b4Var.e;
        try {
            if (!b4Var.isEnabled()) {
                b6VarM.getLogger().i(SentryLevel.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!b6VarM.getLogs().a) {
                b6VarM.getLogger().i(SentryLevel.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            n4 n4VarA = b6VarM.getDateProvider().a();
            if (objArr.length == 0) {
                str2 = str;
            } else {
                try {
                    str2 = String.format(str, objArr);
                } catch (Throwable th) {
                    b4Var.m().getLogger().f(SentryLevel.ERROR, "Error while running log through String.format", th);
                    str2 = str;
                }
            }
            k kVarW = a1Var.w();
            k1 k1VarD = a1Var.d();
            if (k1VarD == null) {
                a1Var.F(new io.sentry.util.l(a1Var, b6VarM));
            }
            io.sentry.protocol.v vVar = k1VarD == null ? (io.sentry.protocol.v) kVarW.b : k1VarD.x().a;
            m6 m6Var = k1VarD == null ? (m6) kVarW.c : k1VarD.x().b;
            g5 g5Var = new g5(vVar, Double.valueOf(n4VarA.d() / 1.0E9d), str2, sentryLogLevel);
            g5Var.b = m6Var;
            g5Var.g = b(dVar, str, objArr);
            g5Var.f = Integer.valueOf(sentryLogLevel.getSeverityNumber());
            a1Var.z().h(g5Var, a1Var);
        } catch (Throwable th2) {
            b6VarM.getLogger().f(SentryLevel.ERROR, "Error while capturing log event", th2);
        }
    }
}
