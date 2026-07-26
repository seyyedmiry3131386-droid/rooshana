package com.microsoft.clarity.g;

import android.graphics.Point;
import android.view.View;
import android.view.Window;
import defpackage.js3;

/* JADX INFO: renamed from: com.microsoft.clarity.g.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0066m {
    public final Window a;
    public final Point b;
    public final int c;
    public final int d;

    public C0066m(C0076x c0076x, Window window) {
        js3.p(window, "window");
        this.a = window;
        View rootView = window.getDecorView().getRootView();
        js3.o(rootView, "window.decorView.rootView");
        c0076x.getClass();
        int[] iArr = new int[2];
        rootView.getLocationOnScreen(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        this.b = point;
        this.c = window.getDecorView().getRootView().getWidth() + point.x;
        this.d = window.getDecorView().getRootView().getHeight() + point.y;
    }
}
