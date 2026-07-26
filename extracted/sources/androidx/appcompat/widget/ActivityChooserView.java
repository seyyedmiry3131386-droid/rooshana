package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import defpackage.c6;
import defpackage.l6;
import defpackage.ls6;
import defpackage.lu6;
import defpackage.pr6;
import defpackage.q69;
import defpackage.rq6;
import defpackage.sk6;
import defpackage.t6;
import defpackage.u6;
import defpackage.v6;
import defpackage.w6;
import defpackage.x6;
import defpackage.y6;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {
    public final x6 a;
    public final y6 b;
    public final View c;
    public final FrameLayout d;
    public final ImageView e;
    public final FrameLayout f;
    public l6 g;
    public final v6 h;
    public ListPopupWindow i;
    public PopupWindow.OnDismissListener j;
    public boolean k;

    public static class InnerLayout extends LinearLayout {
        public static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            sk6 sk6VarC = sk6.C(context, attributeSet, a);
            setBackgroundDrawable(sk6VarC.v(0));
            sk6VarC.G();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.h);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().z.isShowing();
    }

    public t6 getDataModel() {
        this.a.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.i == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.i = listPopupWindow;
            listPopupWindow.p(this.a);
            ListPopupWindow listPopupWindow2 = this.i;
            listPopupWindow2.o = this;
            listPopupWindow2.y = true;
            listPopupWindow2.z.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.i;
            y6 y6Var = this.b;
            listPopupWindow3.p = y6Var;
            listPopupWindow3.z.setOnDismissListener(y6Var);
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.getClass();
        this.k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.h);
        }
        if (b()) {
            a();
        }
        this.k = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.c;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(t6 t6Var) {
        x6 x6Var = this.a;
        x6Var.a.a.getClass();
        x6Var.notifyDataSetChanged();
        if (b()) {
            a();
            if (b() || !this.k) {
                return;
            }
            x6Var.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.e.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.j = onDismissListener;
    }

    public void setProvider(l6 l6Var) {
        this.g = l6Var;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        new u6(this, i2);
        this.h = new v6(i2, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lu6.ActivityChooserView, i, 0);
        q69.p(this, context, lu6.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, i);
        typedArrayObtainStyledAttributes.getInt(lu6.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(lu6.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(ls6.abc_activity_chooser_view, (ViewGroup) this, true);
        y6 y6Var = new y6(this);
        this.b = y6Var;
        View viewFindViewById = findViewById(pr6.activity_chooser_view_content);
        this.c = viewFindViewById;
        viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(pr6.default_activity_button);
        this.f = frameLayout;
        frameLayout.setOnClickListener(y6Var);
        frameLayout.setOnLongClickListener(y6Var);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(pr6.expand_activities_button);
        frameLayout2.setOnClickListener(y6Var);
        frameLayout2.setAccessibilityDelegate(new w6());
        frameLayout2.setOnTouchListener(new c6(this, frameLayout2, 2));
        this.d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(pr6.image);
        this.e = imageView;
        imageView.setImageDrawable(drawable);
        x6 x6Var = new x6(this);
        this.a = x6Var;
        x6Var.registerDataSetObserver(new u6(this, 1));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(rq6.abc_config_prefDialogWidth));
    }
}
