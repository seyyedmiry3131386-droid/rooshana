package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import defpackage.f09;
import defpackage.o40;
import defpackage.ur4;
import io.sentry.SentryLevel;
import io.sentry.SpanStatus;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c1;
import io.sentry.c4;
import io.sentry.h0;
import io.sentry.internal.gestures.UiElement$Type;
import io.sentry.m1;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.q6;
import io.sentry.r6;
import io.sentry.u0;
import io.sentry.u1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements GestureDetector.OnGestureListener {
    public final WeakReference a;
    public final c1 b;
    public final SentryAndroidOptions c;
    public io.sentry.internal.gestures.b d = null;
    public m1 e = null;
    public SentryGestureListener$GestureType f;
    public final e g;

    public f(Activity activity2, c4 c4Var, SentryAndroidOptions sentryAndroidOptions) {
        SentryGestureListener$GestureType sentryGestureListener$GestureType = SentryGestureListener$GestureType.Unknown;
        this.f = sentryGestureListener$GestureType;
        e eVar = new e();
        eVar.a = sentryGestureListener$GestureType;
        eVar.c = 0.0f;
        eVar.d = 0.0f;
        this.g = eVar;
        this.a = new WeakReference(activity2);
        this.b = c4Var;
        this.c = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.b bVar, SentryGestureListener$GestureType sentryGestureListener$GestureType, Map map, MotionEvent motionEvent) {
        if (this.c.isEnableUserInteractionBreadcrumbs()) {
            int i = d.a[sentryGestureListener$GestureType.ordinal()];
            String str = i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click";
            h0 h0Var = new h0();
            h0Var.d(motionEvent, "android:motionEvent");
            h0Var.d(bVar.a.get(), "android:view");
            String str2 = bVar.c;
            String str3 = bVar.b;
            String str4 = bVar.d;
            io.sentry.f fVar = new io.sentry.f();
            fVar.e = "user";
            fVar.g = "ui.".concat(str);
            if (str2 != null) {
                fVar.c(str2, "view.id");
            }
            if (str3 != null) {
                fVar.c(str3, "view.class");
            }
            if (str4 != null) {
                fVar.c(str4, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                fVar.f.put((String) entry.getKey(), entry.getValue());
            }
            fVar.i = SentryLevel.INFO;
            this.b.h(fVar, h0Var);
        }
    }

    public final View b(String str) {
        Activity activity2 = (Activity) this.a.get();
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (activity2 == null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, o40.y("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity2.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, o40.y("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, o40.y("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.b bVar, SentryGestureListener$GestureType sentryGestureListener$GestureType) {
        boolean z = sentryGestureListener$GestureType == SentryGestureListener$GestureType.Click || !(sentryGestureListener$GestureType == this.f && bVar.equals(this.d));
        SentryAndroidOptions sentryAndroidOptions = this.c;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        c1 c1Var = this.b;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    c1Var.x(new u1(29));
                }
                this.d = bVar;
                this.f = sentryGestureListener$GestureType;
                return;
            }
            return;
        }
        Activity activity2 = (Activity) this.a.get();
        if (activity2 == null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = bVar.c;
        if (str == null) {
            str = bVar.d;
            io.sentry.config.a.W(str, "UiElement.tag can't be null");
        }
        m1 m1Var = this.e;
        if (m1Var != null) {
            if (!z && !m1Var.f()) {
                sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, o40.y("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.e.v();
                    return;
                }
                return;
            }
            d(SpanStatus.OK);
        }
        String str2 = activity2.getClass().getSimpleName() + "." + str;
        int i = d.a[sentryGestureListener$GestureType.ordinal()];
        String strConcat = "ui.action.".concat(i != 1 ? i != 2 ? i != 3 ? "unknown" : "swipe" : "scroll" : "click");
        r6 r6Var = new r6();
        r6Var.h = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        r6Var.j = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        r6Var.i = sentryAndroidOptions.getIdleTimeout();
        r6Var.d = true;
        r6Var.b = "auto.ui.gesture_listener." + bVar.e;
        m1 m1VarN = c1Var.n(new q6(str2, TransactionNameSource.COMPONENT, strConcat, null), r6Var);
        c1Var.x(new ur4(this, m1VarN, 25));
        this.e = m1VarN;
        this.d = bVar;
        this.f = sentryGestureListener$GestureType;
    }

    public final void d(SpanStatus spanStatus) {
        m1 m1Var = this.e;
        if (m1Var != null) {
            if (m1Var.d() == null) {
                this.e.k(spanStatus);
            } else {
                this.e.n();
            }
        }
        this.b.x(new f09(17, this));
        this.e = null;
        if (this.d != null) {
            this.d = null;
        }
        this.f = SentryGestureListener$GestureType.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        e eVar = this.g;
        eVar.b = null;
        eVar.a = SentryGestureListener$GestureType.Unknown;
        eVar.c = 0.0f;
        eVar.d = 0.0f;
        eVar.c = motionEvent.getX();
        eVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.g.a = SentryGestureListener$GestureType.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            e eVar = this.g;
            if (eVar.a == SentryGestureListener$GestureType.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                UiElement$Type uiElement$Type = UiElement$Type.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.c;
                io.sentry.internal.gestures.b bVarA = h.a(sentryAndroidOptions, viewB, x, y, uiElement$Type);
                if (bVarA == null) {
                    sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    eVar.a = SentryGestureListener$GestureType.Scroll;
                    return false;
                }
                u0 logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                String str = bVarA.c;
                if (str == null) {
                    str = bVarA.d;
                    io.sentry.config.a.W(str, "UiElement.tag can't be null");
                }
                logger.i(sentryLevel, "Scroll target found: ".concat(str), new Object[0]);
                eVar.b = bVarA;
                eVar.a = SentryGestureListener$GestureType.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            UiElement$Type uiElement$Type = UiElement$Type.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.c;
            io.sentry.internal.gestures.b bVarA = h.a(sentryAndroidOptions, viewB, x, y, uiElement$Type);
            if (bVarA == null) {
                sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            SentryGestureListener$GestureType sentryGestureListener$GestureType = SentryGestureListener$GestureType.Click;
            a(bVarA, sentryGestureListener$GestureType, Collections.EMPTY_MAP, motionEvent);
            c(bVarA, sentryGestureListener$GestureType);
        }
        return false;
    }
}
