package com.microsoft.clarity.i;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.g.C0055b;
import com.microsoft.clarity.g.C0059f;
import com.microsoft.clarity.g.C0068o;
import com.microsoft.clarity.g.C0069p;
import com.microsoft.clarity.g.C0076x;
import com.microsoft.clarity.g.C0077y;
import com.microsoft.clarity.g.S;
import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.g.k0;
import com.microsoft.clarity.k.C0096b;
import com.microsoft.clarity.k.C0097c;
import com.microsoft.clarity.k.InterfaceC0098d;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.ingest.analytics.AnalyticsEvent;
import com.microsoft.clarity.models.ingest.analytics.ClickEvent;
import com.microsoft.clarity.models.ingest.analytics.VisibilityEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.models.observers.UserInteraction;
import com.microsoft.clarity.models.telemetry.ErrorType;
import com.microsoft.clarity.models.viewhierarchy.ViewHierarchy;
import com.microsoft.clarity.models.viewhierarchy.ViewNode;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;
import defpackage.kb8;
import defpackage.r59;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements com.microsoft.clarity.l.b {
    public final ClarityConfig a;
    public final DynamicConfig b;
    public final com.microsoft.clarity.k.s c;
    public final C0097c d;
    public final com.microsoft.clarity.k.G e;
    public final C0096b f;
    public final h0 g;
    public final C0077y h;
    public final LinkedBlockingQueue i;
    public Integer j;
    public final ArrayList k;
    public final C0076x l;
    public final S m;
    public final C0059f n;
    public ViewHierarchy o;
    public final Handler p;
    public final LinkedHashMap q;
    public boolean r;
    public boolean s;
    public boolean t;
    public ScreenMetadata u;
    public String v;
    public final Object w;
    public boolean x;
    public boolean y;
    public dp2 z;

    public q(Context context, ClarityConfig clarityConfig, DynamicConfig dynamicConfig, com.microsoft.clarity.m.s sVar, InterfaceC0098d interfaceC0098d, com.microsoft.clarity.k.s sVar2, C0097c c0097c, com.microsoft.clarity.k.G g, C0096b c0096b, h0 h0Var, k0 k0Var, com.microsoft.clarity.g.E e, C0077y c0077y) {
        js3.p(context, "context");
        js3.p(clarityConfig, "config");
        js3.p(dynamicConfig, "dynamicConfig");
        js3.p(sVar, "skiaParserFactory");
        js3.p(interfaceC0098d, "lifecycleObserver");
        js3.p(sVar2, "userInteractionObserver");
        js3.p(c0097c, "crashObserver");
        js3.p(c0096b, "connectivityChangeObserver");
        js3.p(h0Var, "telemetryTracker");
        js3.p(k0Var, "typefaceCollection");
        js3.p(e, "hardwareBitmapCache");
        js3.p(c0077y, "e2ETestHelper");
        this.a = clarityConfig;
        this.b = dynamicConfig;
        this.c = sVar2;
        this.d = c0097c;
        this.e = g;
        this.f = c0096b;
        this.g = h0Var;
        this.h = c0077y;
        this.i = new LinkedBlockingQueue();
        com.microsoft.clarity.q.l.d("Register callback.");
        ((com.microsoft.clarity.k.l) interfaceC0098d).b.add(this);
        C0079a c0079a = new C0079a(this);
        com.microsoft.clarity.q.l.d("Register callback.");
        sVar2.a.add(c0079a);
        if (g != null) {
            g.b.add(new C0080b(this));
        }
        C0081c c0081c = new C0081c(this);
        com.microsoft.clarity.q.l.d("Register callback.");
        List list = c0096b.a;
        js3.o(list, "callbacks");
        list.add(c0081c);
        c0096b.a(c0096b.c, c0081c);
        C0082d c0082d = new C0082d(this);
        com.microsoft.clarity.q.l.d("Register callback.");
        c0097c.a.add(c0082d);
        this.k = new ArrayList();
        this.l = new C0076x(context, clarityConfig, e, dynamicConfig, new C0088j(this));
        this.m = new S(context, dynamicConfig.getMaskingMode(), sVar, k0Var, new C0089k(this));
        this.n = new C0059f(new C0083e(this));
        a();
        this.p = new Handler(Looper.getMainLooper());
        this.q = new LinkedHashMap();
        this.w = new Object();
        this.x = true;
    }

    @Override // com.microsoft.clarity.l.a
    public final void a(Exception exc, ErrorType errorType) {
        js3.p(exc, "exception");
        js3.p(errorType, "errorType");
    }

    public final void b() {
        if (this.s) {
            return;
        }
        this.c.d = true;
        com.microsoft.clarity.k.G g = this.e;
        if (g != null) {
            g.o = true;
            g.a(g.d);
        }
        this.d.c = true;
        this.f.b = true;
        this.s = true;
        com.microsoft.clarity.q.l.e("Capturing events is paused!");
    }

    public final void c() {
        if (this.r || this.t || !this.s) {
            return;
        }
        this.c.d = false;
        com.microsoft.clarity.k.G g = this.e;
        if (g != null) {
            g.o = false;
        }
        this.d.c = false;
        this.f.b = false;
        this.s = false;
        com.microsoft.clarity.q.l.d("Capturing events is resumed!");
    }

    @Override // com.microsoft.clarity.l.b
    public final void onActivityDestroyed(Activity activity2) {
        js3.p(activity2, "activity");
        C0076x c0076x = this.l;
        kotlin.collections.a.C0(c0076x.g, C0068o.a);
        kotlin.collections.a.C0(c0076x.h, C0069p.a);
    }

    @Override // com.microsoft.clarity.l.b
    public final void onActivityPaused(Activity activity2) {
        js3.p(activity2, "activity");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Unregister frame capture task for " + activity2 + '.');
        int iHashCode = activity2.hashCode();
        if (this.q.containsKey(Integer.valueOf(iHashCode))) {
            Handler handler = this.p;
            Object obj = this.q.get(Integer.valueOf(iHashCode));
            js3.m(obj);
            handler.removeCallbacks((Runnable) obj);
            this.q.remove(Integer.valueOf(iHashCode));
        }
        ScreenMetadata screenMetadata = this.u;
        if (screenMetadata == null) {
            return;
        }
        this.i.add(new UserInteraction(new VisibilityEvent(System.currentTimeMillis(), ScreenMetadata.Companion.create(activity2, screenMetadata.getName()), "hidden")));
    }

    @Override // com.microsoft.clarity.l.b
    public final void onActivityResumed(Activity activity2) {
        js3.p(activity2, "activity");
        this.j = Integer.valueOf(activity2.hashCode());
        a(true);
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Register frame capture task for " + activity2 + '.');
        int iHashCode = activity2.hashCode();
        LinkedHashMap linkedHashMap = this.q;
        Integer numValueOf = Integer.valueOf(iHashCode);
        RunnableC0094p runnableC0094p = new RunnableC0094p(this, iHashCode, activity2);
        runnableC0094p.run();
        linkedHashMap.put(numValueOf, runnableC0094p);
        this.p.post(new r59(this, activity2, 25));
    }

    public static final void a(q qVar, AnalyticsEvent analyticsEvent) {
        qVar.getClass();
        if (analyticsEvent instanceof ClickEvent) {
            C0059f c0059f = qVar.n;
            ClickEvent clickEvent = (ClickEvent) analyticsEvent;
            ViewHierarchy viewHierarchy = qVar.o;
            c0059f.getClass();
            try {
                if (viewHierarchy == null) {
                    com.microsoft.clarity.q.l.e("Null view hierarchy for click correlation (" + clickEvent + ").");
                } else {
                    ViewNode root = viewHierarchy.getRoot();
                    if (root.getRenderNodeId() != clickEvent.getRootViewUniqueDrawingId()) {
                        root = null;
                    }
                    if (root == null) {
                        List<ViewNode> children = viewHierarchy.getRoot().getChildren();
                        ListIterator<ViewNode> listIterator = children.listIterator(children.size());
                        while (listIterator.hasPrevious()) {
                            ViewNode viewNodePrevious = listIterator.previous();
                            ViewNode viewNode = viewNodePrevious;
                            if (viewNode.isRoot() && viewNode.getRenderNodeId() == clickEvent.getRootViewUniqueDrawingId()) {
                                root = viewNodePrevious;
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                    C0055b c0055bA = C0059f.a(root, clickEvent, 0);
                    if (!js3.i(root, viewHierarchy.getRoot())) {
                        c0055bA.a(viewHierarchy.getRoot().getType(), viewHierarchy.getRoot().getId(), 0);
                    }
                    if (c0055bA.a.getIgnoreClicks()) {
                        LogLevel logLevel = com.microsoft.clarity.q.l.a;
                        com.microsoft.clarity.q.l.b("Click event has been ignored (" + clickEvent + ").");
                        return;
                    }
                    clickEvent.setViewId(c0055bA.a.getId());
                    clickEvent.setNodeSelector(kotlin.collections.a.t0(c0055bA.c, "", null, null, null, 62));
                    String text = c0055bA.a.getText();
                    if (text.length() == 0) {
                        text = C0059f.a(c0055bA.a);
                    }
                    if (text.length() == 0) {
                        text = c0055bA.a.getContentDescription();
                    }
                    clickEvent.setText(text);
                    clickEvent.setReaction(!c0055bA.b);
                    float absX = clickEvent.getAbsX() - c0055bA.a.getX();
                    float f = 32767;
                    clickEvent.setRelativeX((int) Math.max((float) Math.floor((absX / c0055bA.a.getWidth()) * f), 0.0f));
                    clickEvent.setRelativeY((int) Math.max((float) Math.floor(((clickEvent.getAbsY() - c0055bA.a.getY()) / c0055bA.a.getHeight()) * f), 0.0f));
                    LogLevel logLevel2 = com.microsoft.clarity.q.l.a;
                    com.microsoft.clarity.q.l.b("Click event has been correlated (" + clickEvent + ").");
                }
            } catch (Exception e) {
                c0059f.a.invoke(e, ErrorType.ViewHierarchyClickCorrelation);
            }
        }
        for (r rVar : qVar.k) {
            rVar.getClass();
            js3.p(analyticsEvent, "event");
            rVar.a.b.a(analyticsEvent);
        }
    }

    public static final void b(q qVar) {
        js3.p(qVar, "this$0");
        while (true) {
            C0077y c0077y = qVar.h;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.a = ErrorType.EventProcessing;
            com.microsoft.clarity.q.g.a(new C0086h(qVar, ref$ObjectRef2, ref$ObjectRef, c0077y), new C0087i(qVar, ref$ObjectRef2, ref$ObjectRef), (bp2) null, 10);
        }
    }

    public final void a(boolean z) {
        synchronized (this.w) {
            this.x = z;
        }
    }

    public static final boolean a(q qVar) {
        boolean z;
        synchronized (qVar.w) {
            z = qVar.x;
        }
        return z;
    }

    public final void a(dp2 dp2Var) {
        this.p.post(new r59(this, dp2Var, 26));
    }

    public static final void a(q qVar, dp2 dp2Var) {
        js3.p(qVar, "this$0");
        qVar.y = true;
        qVar.z = dp2Var;
    }

    public static final void a(q qVar, Exception exc, ErrorType errorType) {
        Iterator it = qVar.k.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(exc, errorType);
        }
    }

    public final void a() {
        new Thread(new kb8(23, this)).start();
    }

    public static final void a(q qVar, Activity activity2) {
        js3.p(qVar, "this$0");
        js3.p(activity2, "$activity");
        qVar.i.add(new UserInteraction(new VisibilityEvent(System.currentTimeMillis(), ScreenMetadata.Companion.create(activity2, qVar.v), "visible")));
    }
}
