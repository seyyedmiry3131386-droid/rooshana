package com.microsoft.clarity.i;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.SessionStartedCallback;
import com.microsoft.clarity.g.C0078z;
import com.microsoft.clarity.g.b0;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.g.s0;
import com.microsoft.clarity.models.AssetType;
import com.microsoft.clarity.models.ConsentSource;
import com.microsoft.clarity.models.ConsentStatus;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.PageMetadata;
import com.microsoft.clarity.models.PayloadMetadata;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.models.display.IDisplayFrame;
import com.microsoft.clarity.models.display.images.Image;
import com.microsoft.clarity.models.ingest.BaseWebViewEvent;
import com.microsoft.clarity.models.ingest.SessionEvent;
import com.microsoft.clarity.models.ingest.WebViewAnalyticsEvent;
import com.microsoft.clarity.models.ingest.WebViewMutationEvent;
import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import com.microsoft.clarity.models.ingest.analytics.BaselineEvent;
import com.microsoft.clarity.models.ingest.analytics.FragmentVisibilityEvent;
import com.microsoft.clarity.models.ingest.analytics.GAIDOptOutEvent;
import com.microsoft.clarity.models.ingest.analytics.ScriptErrorEvent;
import com.microsoft.clarity.models.ingest.analytics.VisibilityEvent;
import com.microsoft.clarity.models.observers.ErrorDisplayFrame;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.js3;
import defpackage.u03;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements v {
    public final com.microsoft.clarity.n.e A;
    public final com.microsoft.clarity.n.a B;
    public VisibilityEvent C;
    public final LinkedHashMap D;
    public final ArrayList E;
    public final LinkedBlockingDeque F;
    public final Context a;
    public final ClarityConfig b;
    public final DynamicConfig c;
    public final com.microsoft.clarity.h.a d;
    public final com.microsoft.clarity.n.c e;
    public final com.microsoft.clarity.g.L f;
    public final com.microsoft.clarity.g.I g;
    public final com.microsoft.clarity.g.A h;
    public final h0 i;
    public final long j;
    public final long k;
    public SessionStartedCallback l;
    public String m;
    public String n;
    public String o;
    public SessionMetadata p;
    public int q;
    public long r;
    public PayloadMetadata s;
    public boolean t;
    public LinkedHashSet u;
    public ScreenMetadata v;
    public Set w;
    public final LinkedHashMap x;
    public final List y;
    public final s0 z;

    public P(Context context, ClarityConfig clarityConfig, DynamicConfig dynamicConfig, com.microsoft.clarity.h.a aVar, com.microsoft.clarity.n.c cVar, com.microsoft.clarity.g.L l, com.microsoft.clarity.g.I i, com.microsoft.clarity.g.A a, h0 h0Var) {
        js3.p(context, "context");
        js3.p(clarityConfig, "config");
        js3.p(dynamicConfig, "dynamicConfig");
        js3.p(aVar, "jobScheduler");
        js3.p(cVar, "sessionRepository");
        js3.p(l, "networkUsageTracker");
        js3.p(i, "installReferrerHelper");
        js3.p(a, "gaidReader");
        js3.p(h0Var, "telemetryTracker");
        this.a = context;
        this.b = clarityConfig;
        this.c = dynamicConfig;
        this.d = aVar;
        this.e = cVar;
        this.f = l;
        this.g = i;
        this.h = a;
        this.i = h0Var;
        this.j = com.microsoft.clarity.q.d.a.availableProcessors();
        this.k = com.microsoft.clarity.q.d.a(context);
        this.m = "";
        this.t = true;
        this.u = new LinkedHashSet();
        this.x = new LinkedHashMap();
        this.y = DesugarCollections.synchronizedList(new ArrayList());
        this.z = new s0(context, clarityConfig, new O(this));
        this.A = new com.microsoft.clarity.n.e(context);
        this.B = new com.microsoft.clarity.n.a(context, dynamicConfig);
        this.D = new LinkedHashMap();
        this.E = new ArrayList();
        this.F = new LinkedBlockingDeque();
        b();
        ArrayList arrayList = com.microsoft.clarity.h.b.a;
        com.microsoft.clarity.h.b.a.add(new w(this));
    }

    public final void a(String str, Set set) {
        js3.p(str, "key");
        js3.p(set, "values");
        this.F.addFirst(new L(this, str, set));
    }

    public final boolean b(String str) {
        js3.p(str, "customSessionId");
        this.F.addFirst(new K(this, str));
        return true;
    }

    public final ConsentStatus c() {
        ConsentSource consentSource;
        com.microsoft.clarity.n.a aVar = this.B;
        try {
            consentSource = ConsentSource.values()[aVar.b.getInt("CONSENT_STATUS_SOURCE", com.microsoft.clarity.n.a.c.ordinal())];
        } catch (Exception unused) {
            consentSource = com.microsoft.clarity.n.a.c;
        }
        return new ConsentStatus(consentSource, aVar.b.getBoolean("EXPLICIT_CONSENT_ADS", aVar.a.getAdsStorage()), aVar.b.getBoolean("EXPLICIT_CONSENT_ANALYTICS", aVar.a.getAnalyticsStorage()));
    }

    public final void d() {
        this.F.add(new N(this));
    }

    public final boolean e() {
        if (this.t) {
            PayloadMetadata payloadMetadata = this.s;
            js3.m(payloadMetadata);
            boolean z = payloadMetadata.getSequence() <= 100;
            this.t = z;
            if (!z) {
                LogLevel logLevel = com.microsoft.clarity.q.l.a;
                com.microsoft.clarity.q.l.b("Stopping page tracking as tracking payload sequence limit has been exceeded. PageNum: " + this.q + " at Timestamp:" + this.r);
            }
        }
        return !this.t;
    }

    public final void a(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.F.add(new H(this, str));
    }

    public final void b(AnalyticsEvent analyticsEvent) {
        if ((analyticsEvent instanceof VisibilityEvent) && !(analyticsEvent instanceof FragmentVisibilityEvent)) {
            ScreenMetadata screenMetadata = analyticsEvent.getScreenMetadata();
            VisibilityEvent visibilityEvent = this.C;
            if (js3.i(screenMetadata, visibilityEvent != null ? visibilityEvent.getScreenMetadata() : null)) {
                String state = ((VisibilityEvent) analyticsEvent).getState();
                VisibilityEvent visibilityEvent2 = this.C;
                if (js3.i(state, visibilityEvent2 != null ? visibilityEvent2.getState() : null)) {
                    com.microsoft.clarity.q.l.b("Skipping duplicate visibility event.");
                    return;
                }
            }
            this.C = (VisibilityEvent) analyticsEvent;
        }
        a(analyticsEvent.getTimestamp(), analyticsEvent.getScreenMetadata());
        a((SessionEvent) analyticsEvent);
    }

    public final void a(ConsentStatus consentStatus, bp2 bp2Var) {
        js3.p(consentStatus, "consentStatus");
        js3.p(bp2Var, "onConsentChangeCallback");
        this.F.add(new x(this, consentStatus, (s) bp2Var));
    }

    public final void a(IDisplayFrame iDisplayFrame) {
        js3.p(iDisplayFrame, "frame");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Enqueuing display frame task for screen " + iDisplayFrame.getScreenMetadata().getName() + '#' + iDisplayFrame.getScreenMetadata().getActivityHashCode() + '.');
        this.F.add(new B(iDisplayFrame, this));
    }

    public final void a(AnalyticsEvent analyticsEvent) {
        js3.p(analyticsEvent, "event");
        if (analyticsEvent instanceof ScriptErrorEvent) {
            a((SessionEvent) analyticsEvent);
            return;
        }
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Enqueuing analytics event " + analyticsEvent.getType() + " task received for screen " + analyticsEvent.getScreenMetadata().getName() + '#' + analyticsEvent.getScreenMetadata().getActivityHashCode() + '.');
        this.F.add(new A(analyticsEvent, this));
    }

    public static final void b(P p) {
        SessionMetadata sessionMetadata;
        String sessionId;
        synchronized (p.m) {
            try {
                if (p.l != null) {
                    SessionMetadata sessionMetadata2 = p.p;
                    if (!js3.i(sessionMetadata2 != null ? sessionMetadata2.getSessionId() : null, p.m) && (sessionMetadata = p.p) != null && (sessionId = sessionMetadata.getSessionId()) != null) {
                        SessionStartedCallback sessionStartedCallback = p.l;
                        if (sessionStartedCallback != null) {
                            sessionStartedCallback.invoke((Object) sessionId);
                        }
                        p.m = sessionId;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(ErrorDisplayFrame errorDisplayFrame) {
        js3.p(errorDisplayFrame, "errorDisplayFrame");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Enqueuing error frame task for screen " + errorDisplayFrame.getScreenMetadata().getName() + '#' + errorDisplayFrame.getScreenMetadata().getActivityHashCode() + '.');
        this.F.add(new C(this, errorDisplayFrame));
    }

    public final void a(WebViewMutationEvent webViewMutationEvent) {
        js3.p(webViewMutationEvent, "event");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Enqueuing webview mutation task for screen " + webViewMutationEvent.getScreenMetadata().getName() + '#' + webViewMutationEvent.getScreenMetadata().getName() + '.');
        this.F.add(new E(webViewMutationEvent, this));
    }

    public final void a(WebViewAnalyticsEvent webViewAnalyticsEvent) {
        js3.p(webViewAnalyticsEvent, "event");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Enqueuing webview analytics task for screen " + webViewAnalyticsEvent.getScreenMetadata().getName() + '#' + webViewAnalyticsEvent.getScreenMetadata().getActivityHashCode() + '.');
        this.F.add(new D(webViewAnalyticsEvent, this));
    }

    public final void b() {
        new Thread(new u03(13, this)).start();
    }

    public final boolean c(String str) {
        js3.p(str, "customUserId");
        this.F.addFirst(new M(this, str));
        return true;
    }

    @Override // com.microsoft.clarity.i.v
    public final PageMetadata a() {
        if (this.p == null) {
            return null;
        }
        SessionMetadata sessionMetadata = this.p;
        js3.m(sessionMetadata);
        return new PageMetadata(sessionMetadata, this.q);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:8|(4:10|(1:27)(9:14|174|15|16|(1:18)(1:19)|20|(1:22)(1:23)|24|28)|26|28)|29|(31:31|(1:34)|35|(1:37)|40|(7:72|(2:74|(1:78))(1:79)|80|(2:85|(1:87)(9:89|(1:91)|92|(1:97)(1:96)|98|(2:100|(1:102))|103|(3:106|170|107)|111))(1:84)|88|92|(6:97|98|(0)|103|(0)|111)(0))(2:42|(4:44|(1:46)(1:47)|48|(4:50|(1:52)(1:53)|54|(0)(2:58|(4:61|(1:63)(1:64)|65|(0)(2:(2:68|(0))|71))(0)))(0))(0))|112|(1:115)|114|116|(1:118)|119|172|120|124|(1:126)(1:127)|128|(4:130|(1:132)(1:134)|133|135)(1:136)|137|(1:139)(1:140)|141|(3:143|(1:145)(1:146)|147)|148|(1:155)|156|(1:163)|164|(2:167|165)|176|168|169)(1:38)|39|40|(0)(0)|112|(0)|114|116|(0)|119|172|120|124|(0)(0)|128|(0)(0)|137|(0)(0)|141|(0)|148|(3:150|153|155)|156|(3:158|161|163)|164|(1:165)|176|168|169) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x041c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x041d, code lost:
    
        com.microsoft.clarity.q.l.c("Retrieving user agent failed: " + r0);
        r0 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0742 A[LOOP:0: B:165:0x073c->B:167:0x0742, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.microsoft.clarity.models.display.DisplayFrame r35) {
        /*
            Method dump skipped, instruction units count: 1967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.i.P.a(com.microsoft.clarity.models.display.DisplayFrame):void");
    }

    public final void a(long j, ScreenMetadata screenMetadata) {
        PayloadMetadata payloadMetadata = this.s;
        js3.m(payloadMetadata);
        if (payloadMetadata.canIncludeEvent(j)) {
            return;
        }
        PayloadMetadata payloadMetadata2 = this.s;
        js3.m(payloadMetadata2);
        int sequence = payloadMetadata2.getSequence() + 1;
        PayloadMetadata payloadMetadata3 = this.s;
        js3.m(payloadMetadata3);
        long start = payloadMetadata3.getStart();
        PayloadMetadata payloadMetadata4 = this.s;
        js3.m(payloadMetadata4);
        Long duration = payloadMetadata4.getDuration();
        js3.m(duration);
        a(sequence, duration.longValue() + start, j, screenMetadata);
    }

    public final void a(int i, long j, long j2, ScreenMetadata screenMetadata) {
        if (this.s != null) {
            com.microsoft.clarity.h.a aVar = this.d;
            String projectId = this.b.getProjectId();
            PayloadMetadata payloadMetadata = this.s;
            js3.m(payloadMetadata);
            aVar.b(projectId, payloadMetadata.getSessionId());
        }
        SessionMetadata sessionMetadata = this.p;
        js3.m(sessionMetadata);
        this.s = new PayloadMetadata(sessionMetadata.getSessionId(), this.q, i, j, this.r, Long.valueOf(j2));
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        StringBuilder sb = new StringBuilder("Starting new payload with sequence ");
        PayloadMetadata payloadMetadata2 = this.s;
        js3.m(payloadMetadata2);
        sb.append(payloadMetadata2.getSequence());
        sb.append(", start ");
        PayloadMetadata payloadMetadata3 = this.s;
        js3.m(payloadMetadata3);
        sb.append(payloadMetadata3.getStart());
        sb.append(", first event timestamp ");
        PayloadMetadata payloadMetadata4 = this.s;
        js3.m(payloadMetadata4);
        sb.append(payloadMetadata4.getFirstNonBaselineEventTimestamp());
        sb.append(" and max duration ");
        PayloadMetadata payloadMetadata5 = this.s;
        js3.m(payloadMetadata5);
        sb.append(payloadMetadata5.getMaxPayloadDuration());
        com.microsoft.clarity.q.l.b(sb.toString());
        com.microsoft.clarity.n.c cVar = this.e;
        SessionMetadata sessionMetadata2 = this.p;
        js3.m(sessionMetadata2);
        String sessionId = sessionMetadata2.getSessionId();
        PayloadMetadata payloadMetadata6 = this.s;
        js3.m(payloadMetadata6);
        com.microsoft.clarity.n.g gVar = (com.microsoft.clarity.n.g) cVar;
        gVar.getClass();
        js3.p(sessionId, "sessionId");
        com.microsoft.clarity.q.l.b("Create session " + sessionId + ", page " + payloadMetadata6.getPageNum() + ", sequence " + payloadMetadata6.getSequence() + ", start " + payloadMetadata6.getStart() + '.');
        String strB = com.microsoft.clarity.n.g.b(payloadMetadata6);
        com.microsoft.clarity.p.e eVar = gVar.b;
        com.microsoft.clarity.p.h hVar = com.microsoft.clarity.p.h.OVERWRITE;
        js3.p(strB, "filename");
        js3.p(hVar, "mode");
        com.microsoft.clarity.p.c cVar2 = new com.microsoft.clarity.p.c("");
        File fileA = com.microsoft.clarity.p.f.a(eVar, strB, false, true, 2);
        cVar2.invoke(new FileOutputStream(fileA, false));
        fileA.length();
        com.microsoft.clarity.p.e eVar2 = gVar.c;
        com.microsoft.clarity.p.c cVar3 = new com.microsoft.clarity.p.c("");
        File fileA2 = com.microsoft.clarity.p.f.a(eVar2, strB, false, true, 2);
        cVar3.invoke(new FileOutputStream(fileA2, false));
        fileA2.length();
        com.microsoft.clarity.n.g.h.put(sessionId, payloadMetadata6);
        long j3 = j + this.r;
        VisibilityEvent visibilityEvent = this.C;
        b(new BaselineEvent(j3, screenMetadata, js3.i(visibilityEvent != null ? visibilityEvent.getState() : null, "visible")));
        com.microsoft.clarity.h.a aVar2 = this.d;
        String projectId2 = this.b.getProjectId();
        PayloadMetadata payloadMetadata7 = this.s;
        js3.m(payloadMetadata7);
        aVar2.a(projectId2, payloadMetadata7.getSessionId());
    }

    public final void a(ScreenMetadata screenMetadata) {
        if (c().getAdsStorage()) {
            com.microsoft.clarity.g.A a = this.h;
            b0.a(a.b, new C0078z(a, new J(this, screenMetadata)), null, 6);
        } else {
            String string = this.h.c.getString("GAID", null);
            if (string == null) {
                return;
            }
            this.h.a(null);
            b(new GAIDOptOutEvent(System.currentTimeMillis(), screenMetadata, string));
        }
    }

    public static final void a(P p, BaseWebViewEvent baseWebViewEvent) throws Throwable {
        if (p.p != null && js3.i(p.v, baseWebViewEvent.getScreenMetadata())) {
            if (p.e()) {
                com.microsoft.clarity.q.l.b("Dropping WebView Event because current page payload count has been exceeded");
                return;
            }
            if (p.x.containsKey(Integer.valueOf(baseWebViewEvent.getWebViewHashCode()))) {
                Object obj = p.x.get(Integer.valueOf(baseWebViewEvent.getWebViewHashCode()));
                js3.m(obj);
                long jLongValue = ((Number) obj).longValue();
                if (baseWebViewEvent.getTimestamp() < p.r || baseWebViewEvent.getTimestamp() < jLongValue) {
                    baseWebViewEvent = baseWebViewEvent.copyWithNewTimestamp(jLongValue + 1);
                }
                LogLevel logLevel = com.microsoft.clarity.q.l.a;
                com.microsoft.clarity.q.l.b("Appending web view event " + baseWebViewEvent.getType() + '.');
                p.a(baseWebViewEvent.getTimestamp(), baseWebViewEvent.getScreenMetadata());
                p.a(baseWebViewEvent);
                return;
            }
            LogLevel logLevel2 = com.microsoft.clarity.q.l.a;
            com.microsoft.clarity.q.l.b("Enqueuing web view event " + baseWebViewEvent.getType() + '.');
            p.y.add(baseWebViewEvent);
            return;
        }
        com.microsoft.clarity.q.l.b("Skipping residual webview event from another page.");
    }

    public static final void a(P p, Image image) {
        String dataHash;
        if (image.getData() == null || (dataHash = image.getDataHash()) == null || dataHash.length() == 0 || kotlin.collections.a.h0(p.u, image.getDataHash())) {
            return;
        }
        com.microsoft.clarity.n.c cVar = p.e;
        SessionMetadata sessionMetadata = p.p;
        js3.m(sessionMetadata);
        String sessionId = sessionMetadata.getSessionId();
        String dataHash2 = image.getDataHash();
        js3.m(dataHash2);
        AssetType type = image.getType();
        byte[] data = image.getData();
        com.microsoft.clarity.n.g gVar = (com.microsoft.clarity.n.g) cVar;
        gVar.getClass();
        js3.p(sessionId, "sessionId");
        js3.p(type, "type");
        js3.p(data, "data");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Save session " + sessionId + " asset " + dataHash2);
        com.microsoft.clarity.p.g gVarA = gVar.a(type);
        String strA = com.microsoft.clarity.n.g.a(sessionId, dataHash2);
        com.microsoft.clarity.p.e eVar = (com.microsoft.clarity.p.e) gVarA;
        js3.p(strA, "filename");
        if (!com.microsoft.clarity.p.f.a(eVar, strA, false, false, 6).exists()) {
            js3.p(com.microsoft.clarity.p.h.OVERWRITE, "mode");
            com.microsoft.clarity.p.d dVar = new com.microsoft.clarity.p.d(data);
            File fileA = com.microsoft.clarity.p.f.a(eVar, strA, false, true, 2);
            dVar.invoke(new FileOutputStream(fileA, false));
            fileA.length();
        }
        LinkedHashSet linkedHashSet = p.u;
        String dataHash3 = image.getDataHash();
        js3.m(dataHash3);
        linkedHashSet.add(dataHash3);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ff  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.microsoft.clarity.models.ingest.SessionEvent r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.i.P.a(com.microsoft.clarity.models.ingest.SessionEvent):void");
    }

    public static final void a(P p) {
        js3.p(p, "this$0");
        while (true) {
            com.microsoft.clarity.q.g.a(new y(p), new z(p), (bp2) null, 10);
        }
    }
}
