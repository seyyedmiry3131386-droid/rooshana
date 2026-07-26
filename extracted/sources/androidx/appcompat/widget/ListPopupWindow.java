package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import defpackage.bx1;
import defpackage.e94;
import defpackage.f94;
import defpackage.g94;
import defpackage.h94;
import defpackage.i94;
import defpackage.j94;
import defpackage.lu6;
import defpackage.mv7;
import defpackage.r81;
import defpackage.xp6;
import io.sentry.android.core.t0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements mv7 {
    public static final Method A;
    public static final Method B;
    public static final Method C;
    public final Context a;
    public ListAdapter b;
    public bx1 c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public final int m;
    public r81 n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final h94 r;
    public final j94 s;
    public final i94 t;
    public final h94 u;
    public final Handler v;
    public final Rect w;
    public Rect x;
    public boolean y;
    public final PopupWindow z;

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, xp6.listPopupWindowStyle);
    }

    @Override // defpackage.mv7
    public final void a() {
        int i;
        int iA;
        int paddingBottom;
        bx1 bx1Var;
        bx1 bx1Var2 = this.c;
        Context context = this.a;
        PopupWindow popupWindow = this.z;
        if (bx1Var2 == null) {
            bx1 bx1VarQ = q(context, !this.y);
            this.c = bx1VarQ;
            bx1VarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new e94(0, this));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        View view = this.o;
        int i3 = this.g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(popupWindow, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    iA = popupWindow.getMaxAvailableHeight(view, i3);
                }
            } else {
                iA = popupWindow.getMaxAvailableHeight(view, i3);
            }
        } else {
            iA = f94.a(popupWindow, view, i3, z);
        }
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = iA + i;
        } else {
            int i5 = this.e;
            int iA2 = this.c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z2 = popupWindow.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.h);
        if (popupWindow.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.e == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.e == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view2 = this.o;
                int i6 = width;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i4 < 0) {
                    i4 = -1;
                }
                popupWindow.update(view2, i7, i8, i9, i4);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            g94.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.s);
        if (this.k) {
            popupWindow.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(popupWindow, this.x);
                } catch (Exception e) {
                    t0.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            g94.a(popupWindow, this.x);
        }
        popupWindow.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (bx1Var = this.c) != null) {
            bx1Var.setListSelectionHidden(true);
            bx1Var.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    @Override // defpackage.mv7
    public final boolean b() {
        return this.z.isShowing();
    }

    public final int c() {
        return this.f;
    }

    @Override // defpackage.mv7
    public final void dismiss() {
        PopupWindow popupWindow = this.z;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final void e(int i) {
        this.f = i;
    }

    public final Drawable g() {
        return this.z.getBackground();
    }

    public final void i(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.g = i;
        this.i = true;
    }

    @Override // defpackage.mv7
    public final bx1 k() {
        return this.c;
    }

    public final int o() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        r81 r81Var = this.n;
        if (r81Var == null) {
            this.n = new r81(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(r81Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        bx1 bx1Var = this.c;
        if (bx1Var != null) {
            bx1Var.setAdapter(this.b);
        }
    }

    public bx1 q(Context context, boolean z) {
        return new bx1(context, z);
    }

    public final void r(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = Integer.MAX_VALUE;
        this.r = new h94(this, 1);
        this.s = new j94(0, this);
        this.t = new i94(this);
        this.u = new h94(this, 0);
        this.w = new Rect();
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lu6.ListPopupWindow, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lu6.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lu6.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, 0);
        appCompatPopupWindow.a(context, attributeSet, i);
        this.z = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
