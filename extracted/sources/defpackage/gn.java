package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gn implements Window.Callback {
    public final Window.Callback a;
    public hl5 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ln f;

    public gn(ln lnVar, Window.Callback callback) {
        this.f = lnVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        ce9.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            ln lnVar = this.f;
            lnVar.B();
            zk8 zk8Var = lnVar.o;
            if (zk8Var == null || !zk8Var.T(keyCode, keyEvent)) {
                kn knVar = lnVar.N;
                if (knVar == null || !lnVar.G(knVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (lnVar.N == null) {
                        kn knVarA = lnVar.A(0);
                        lnVar.H(knVarA, keyEvent);
                        boolean zG = lnVar.G(knVarA, keyEvent.getKeyCode(), keyEvent);
                        knVarA.k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                kn knVar2 = lnVar.N;
                if (knVar2 != null) {
                    knVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ot4)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        hl5 hl5Var = this.b;
        if (hl5Var != null) {
            View view = i == 0 ? new View(((qn8) hl5Var.b).q.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        ln lnVar = this.f;
        if (i == 108) {
            lnVar.B();
            zk8 zk8Var = lnVar.o;
            if (zk8Var != null) {
                zk8Var.y(true);
            }
        } else {
            lnVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        ln lnVar = this.f;
        if (i == 108) {
            lnVar.B();
            zk8 zk8Var = lnVar.o;
            if (zk8Var != null) {
                zk8Var.y(false);
                return;
            }
            return;
        }
        if (i == 0) {
            kn knVarA = lnVar.A(i);
            if (knVarA.m) {
                lnVar.s(knVarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        de9.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ot4 ot4Var = menu instanceof ot4 ? (ot4) menu : null;
        if (i == 0 && ot4Var == null) {
            return false;
        }
        if (ot4Var != null) {
            ot4Var.x = true;
        }
        hl5 hl5Var = this.b;
        if (hl5Var != null && i == 0) {
            qn8 qn8Var = (qn8) hl5Var.b;
            if (!qn8Var.t) {
                qn8Var.q.l = true;
                qn8Var.t = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (ot4Var != null) {
            ot4Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ot4 ot4Var = this.f.A(0).h;
        if (ot4Var != null) {
            d(list, ot4Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return be9.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        ln lnVar = this.f;
        if (!lnVar.z || i != 0) {
            return be9.b(this.a, callback, i);
        }
        Context context = lnVar.k;
        o77 o77Var = new o77();
        o77Var.b = context;
        o77Var.a = callback;
        o77Var.c = new ArrayList();
        o77Var.d = new fw7(0);
        k6 k6Var = lnVar.u;
        if (k6Var != null) {
            k6Var.a();
        }
        do3 do3Var = new do3(lnVar, o77Var);
        lnVar.B();
        zk8 zk8Var = lnVar.o;
        if (zk8Var != null) {
            lnVar.u = zk8Var.n0(do3Var);
        }
        if (lnVar.u == null) {
            x89 x89Var = lnVar.y;
            if (x89Var != null) {
                x89Var.b();
            }
            k6 k6Var2 = lnVar.u;
            if (k6Var2 != null) {
                k6Var2.a();
            }
            int i2 = 1;
            if (lnVar.v == null) {
                if (lnVar.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(xp6.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        f51 f51Var = new f51(context, 0);
                        f51Var.getTheme().setTo(themeNewTheme);
                        context = f51Var;
                    }
                    lnVar.v = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, xp6.actionModePopupWindowStyle);
                    lnVar.w = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    lnVar.w.setContentView(lnVar.v);
                    lnVar.w.setWidth(-1);
                    context.getTheme().resolveAttribute(xp6.actionBarSize, typedValue, true);
                    lnVar.v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    lnVar.w.setHeight(-2);
                    lnVar.x = new an(lnVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) lnVar.B.findViewById(pr6.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        lnVar.B();
                        zk8 zk8Var2 = lnVar.o;
                        Context contextG = zk8Var2 != null ? zk8Var2.G() : null;
                        if (contextG != null) {
                            context = contextG;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        lnVar.v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (lnVar.v != null) {
                x89 x89Var2 = lnVar.y;
                if (x89Var2 != null) {
                    x89Var2.b();
                }
                lnVar.v.e();
                Context context2 = lnVar.v.getContext();
                ActionBarContextView actionBarContextView = lnVar.v;
                g48 g48Var = new g48();
                g48Var.c = context2;
                g48Var.d = actionBarContextView;
                g48Var.e = do3Var;
                ot4 ot4Var = new ot4(actionBarContextView.getContext());
                ot4Var.l = 1;
                g48Var.h = ot4Var;
                ot4Var.e = g48Var;
                if (o77Var.y(g48Var, ot4Var)) {
                    g48Var.j();
                    lnVar.v.c(g48Var);
                    lnVar.u = g48Var;
                    if (lnVar.A && (viewGroup = lnVar.B) != null && viewGroup.isLaidOut()) {
                        lnVar.v.setAlpha(0.0f);
                        x89 x89VarB = q69.b(lnVar.v);
                        x89VarB.a(1.0f);
                        lnVar.y = x89VarB;
                        x89VarB.e(new bn(i2, lnVar));
                    } else {
                        lnVar.v.setAlpha(1.0f);
                        lnVar.v.setVisibility(0);
                        if (lnVar.v.getParent() instanceof View) {
                            View view = (View) lnVar.v.getParent();
                            WeakHashMap weakHashMap = q69.a;
                            f69.c(view);
                        }
                    }
                    if (lnVar.w != null) {
                        lnVar.l.getDecorView().post(lnVar.x);
                    }
                } else {
                    lnVar.u = null;
                }
            }
            lnVar.J();
            lnVar.u = lnVar.u;
        }
        lnVar.J();
        k6 k6Var3 = lnVar.u;
        if (k6Var3 != null) {
            return o77Var.n(k6Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
