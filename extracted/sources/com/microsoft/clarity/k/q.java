package com.microsoft.clarity.k;

import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.microsoft.clarity.i.C0093o;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Window.Callback {
    public final ScreenMetadata a;
    public final Window.Callback b;
    public final GestureDetector c;
    public boolean d;
    public int e;
    public Integer f;
    public final /* synthetic */ s g;

    public q(s sVar, ScreenMetadata screenMetadata, Window window) {
        js3.p(screenMetadata, "screenMetadata");
        js3.p(window, "window");
        this.g = sVar;
        this.a = screenMetadata;
        Window.Callback callback = window.getCallback();
        js3.o(callback, "window.callback");
        this.b = callback;
        this.c = new GestureDetector(window.getContext(), new m(sVar, screenMetadata, window.getDecorView().getRootView().getUniqueDrawingId()));
        this.d = true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = this.b.dispatchKeyEvent(keyEvent);
        com.microsoft.clarity.q.g.a((bp2) new n(keyEvent, this.g, this), (dp2) null, (C0093o) null, 30);
        return zDispatchKeyEvent;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, "event");
        boolean zDispatchTouchEvent = this.b.dispatchTouchEvent(motionEvent);
        if (this.d) {
            com.microsoft.clarity.q.g.a((bp2) new o(motionEvent, this, this.g), (dp2) new p(this.g), (C0093o) null, 26);
        }
        return zDispatchTouchEvent;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        js3.p(menu, "menu");
        return this.b.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.b.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        js3.p(menuItem, "item");
        return this.b.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        js3.p(menu, "menu");
        return this.b.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        js3.p(menu, "menu");
        this.b.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        js3.p(menu, "menu");
        return this.b.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.b.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.b.onWindowStartingActionMode(callback, i);
    }
}
