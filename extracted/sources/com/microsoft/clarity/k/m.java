package com.microsoft.clarity.k;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.ingest.analytics.ClickEvent;
import com.microsoft.clarity.models.ingest.analytics.DoubleClickEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends GestureDetector.SimpleOnGestureListener {
    public final ScreenMetadata a;
    public final long b;
    public final /* synthetic */ s c;

    public m(s sVar, ScreenMetadata screenMetadata, long j) {
        js3.p(screenMetadata, "screenMetadata");
        this.c = sVar;
        this.a = screenMetadata;
        this.b = j;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        long jCurrentTimeMillis = System.currentTimeMillis();
        DoubleClickEvent doubleClickEvent = new DoubleClickEvent(jCurrentTimeMillis, this.a, motionEvent.getPointerId(motionEvent.getActionIndex()), motionEvent.getRawX(), motionEvent.getRawY());
        ClickEvent clickEvent = new ClickEvent(jCurrentTimeMillis, this.a, motionEvent.getRawX(), motionEvent.getRawY(), this.b);
        this.c.a(doubleClickEvent);
        this.c.a(clickEvent);
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.d("Double click event watched (" + doubleClickEvent + ") (" + clickEvent + ").");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        js3.p(motionEvent, ByteArrayResult.AppInfo.IMG_SERIALISED_NAME);
        ClickEvent clickEvent = new ClickEvent(System.currentTimeMillis(), this.a, motionEvent.getRawX(), motionEvent.getRawY(), this.b);
        this.c.a(clickEvent);
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.d("Click event watched (" + clickEvent + ").");
        return false;
    }
}
