package defpackage;

import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;

/* JADX INFO: loaded from: classes.dex */
public final class w10 implements uq5 {
    public static final w10 a = new w10();
    public static final xa2 b = new xa2(t61.p(t61.o(fn6.class, new xx(1))), "projectNumber");
    public static final xa2 c = new xa2(t61.p(t61.o(fn6.class, new xx(2))), "messageId");
    public static final xa2 d = new xa2(t61.p(t61.o(fn6.class, new xx(3))), "instanceId");
    public static final xa2 e = new xa2(t61.p(t61.o(fn6.class, new xx(4))), "messageType");
    public static final xa2 f = new xa2(t61.p(t61.o(fn6.class, new xx(5))), "sdkPlatform");
    public static final xa2 g = new xa2(t61.p(t61.o(fn6.class, new xx(6))), "packageName");
    public static final xa2 h = new xa2(t61.p(t61.o(fn6.class, new xx(7))), "collapseKey");
    public static final xa2 i = new xa2(t61.p(t61.o(fn6.class, new xx(8))), "priority");
    public static final xa2 j = new xa2(t61.p(t61.o(fn6.class, new xx(9))), "ttl");
    public static final xa2 k = new xa2(t61.p(t61.o(fn6.class, new xx(10))), "topic");
    public static final xa2 l = new xa2(t61.p(t61.o(fn6.class, new xx(11))), "bulkId");
    public static final xa2 m = new xa2(t61.p(t61.o(fn6.class, new xx(12))), "event");
    public static final xa2 n = new xa2(t61.p(t61.o(fn6.class, new xx(13))), "analyticsLabel");
    public static final xa2 o = new xa2(t61.p(t61.o(fn6.class, new xx(14))), "campaignId");
    public static final xa2 p = new xa2(t61.p(t61.o(fn6.class, new xx(15))), "composerLabel");

    @Override // defpackage.p12
    public final void a(Object obj, Object obj2) {
        gv4 gv4Var = (gv4) obj;
        vq5 vq5Var = (vq5) obj2;
        vq5Var.e(b, gv4Var.a);
        vq5Var.a(c, gv4Var.b);
        vq5Var.a(d, gv4Var.c);
        vq5Var.a(e, gv4Var.d);
        vq5Var.a(f, MessagingClientEvent$SDKPlatform.ANDROID);
        vq5Var.a(g, gv4Var.e);
        vq5Var.a(h, gv4Var.f);
        vq5Var.d(i, gv4Var.g);
        vq5Var.d(j, gv4Var.h);
        vq5Var.a(k, gv4Var.i);
        vq5Var.e(l, 0L);
        vq5Var.a(m, MessagingClientEvent$Event.MESSAGE_DELIVERED);
        vq5Var.a(n, gv4Var.j);
        vq5Var.e(o, 0L);
        vq5Var.a(p, gv4Var.k);
    }
}
