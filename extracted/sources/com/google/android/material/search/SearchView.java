package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import defpackage.bk4;
import defpackage.bl4;
import defpackage.ew1;
import defpackage.f40;
import defpackage.h69;
import defpackage.is6;
import defpackage.jx1;
import defpackage.l82;
import defpackage.lf9;
import defpackage.lj4;
import defpackage.lk1;
import defpackage.m91;
import defpackage.mb0;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.oq6;
import defpackage.pa2;
import defpackage.pn8;
import defpackage.pz1;
import defpackage.q69;
import defpackage.qr6;
import defpackage.rf0;
import defpackage.tt3;
import defpackage.ub1;
import defpackage.vj7;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.wj7;
import defpackage.xq6;
import defpackage.yc1;
import defpackage.yh0;
import defpackage.yj7;
import defpackage.yt6;
import defpackage.zj7;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends FrameLayout implements androidx.coordinatorlayout.widget.a, lj4 {
    public static final int E = mt6.Widget_Material3_SearchView;
    public boolean A;
    public boolean B;
    public TransitionState C;
    public HashMap D;
    public final View a;
    public final ClippableRoundedCornerLayout b;
    public final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final LinearLayout j;
    public final EditText k;
    public final ImageButton l;
    public final View m;
    public final TouchObserverFrameLayout n;
    public final boolean o;
    public final g p;
    public final pa2 q;
    public final boolean r;
    public final pz1 s;
    public final LinkedHashSet t;
    public SearchBar u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final int z;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.u != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior() {
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();
        public String c;
        public int d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readString();
            this.d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        public static final TransitionState a;
        public static final TransitionState b;
        public static final TransitionState c;
        public static final TransitionState d;
        public static final /* synthetic */ TransitionState[] e;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            a = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            b = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            c = transitionState3;
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            d = transitionState4;
            e = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) e.clone();
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static void e(SearchView searchView, lf9 lf9Var) {
        int i = lf9Var.a.g(647).b;
        searchView.setUpStatusBarSpacer(i);
        if (searchView.B) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(i > 0);
    }

    private Window getActivityWindow() {
        Activity activity2;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity2 = null;
                break;
            }
            if (context instanceof Activity) {
                activity2 = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity2 == null) {
            return null;
        }
        return activity2.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.u;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(oq6.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        View view;
        pz1 pz1Var = this.s;
        if (pz1Var == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(pz1Var.a(this.z, f));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.e;
            frameLayout.addView(layoutInflaterFrom.inflate(i, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i) {
        View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    @Override // defpackage.lj4
    public final void a() {
        if (i()) {
            return;
        }
        g gVar = this.p;
        bk4 bk4Var = gVar.n;
        f40 f40Var = bk4Var.f;
        bk4Var.f = null;
        if (Build.VERSION.SDK_INT < 34 || this.u == null || f40Var == null) {
            g();
        } else {
            gVar.d();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.o) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // defpackage.lj4
    public final void b(f40 f40Var) {
        if (i() || this.u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.p.o(f40Var);
    }

    @Override // defpackage.lj4
    public final void c(f40 f40Var) {
        SearchBar searchBar;
        if (i() || (searchBar = this.u) == null) {
            return;
        }
        searchBar.setPlaceholderText(this.k.getText().toString());
        g gVar = this.p;
        bk4 bk4Var = gVar.n;
        SearchBar searchBar2 = gVar.p;
        bk4Var.f = f40Var;
        float f = f40Var.b;
        View view = bk4Var.b;
        bk4Var.j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar2 != null) {
            bk4Var.k = o37.b(view, searchBar2);
        }
        bk4Var.i = f;
    }

    @Override // defpackage.lj4
    public final void d() {
        if (i() || this.u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.p.c();
    }

    public final void f() {
        this.k.post(new wj7(this, 2));
    }

    public final void g() {
        if (this.C.equals(TransitionState.b) || this.C.equals(TransitionState.a)) {
            return;
        }
        SearchBar searchBar = this.u;
        g gVar = this.p;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            gVar.n();
            return;
        }
        this.u.setPlaceholderText(this.k.getText().toString());
        SearchBar searchBar2 = this.u;
        Objects.requireNonNull(gVar);
        searchBar2.post(new zj7(gVar, 0));
    }

    public bk4 getBackHelper() {
        return this.p.n;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.C;
    }

    public int getDefaultNavigationIconResource() {
        return xq6.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.k;
    }

    public CharSequence getHint() {
        return this.k.getHint();
    }

    public TextView getSearchPrefix() {
        return this.i;
    }

    public CharSequence getSearchPrefixText() {
        return this.i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.v;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.k.getText();
    }

    public Toolbar getToolbar() {
        return this.g;
    }

    public final boolean h() {
        return this.v == 48;
    }

    public final boolean i() {
        return this.C.equals(TransitionState.b) || this.C.equals(TransitionState.a);
    }

    public final void j() {
        if (this.y) {
            this.k.postDelayed(new wj7(this, 0), 100L);
        }
    }

    public final void k(TransitionState transitionState, boolean z) {
        if (this.C.equals(transitionState)) {
            return;
        }
        TransitionState transitionState2 = TransitionState.b;
        if (z) {
            if (transitionState == TransitionState.d) {
                setModalForAccessibility(true);
            } else if (transitionState == transitionState2) {
                setModalForAccessibility(false);
            }
        }
        this.C = transitionState;
        Iterator it = new LinkedHashSet(this.t).iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        n(transitionState);
        SearchBar searchBar = this.u;
        if (searchBar == null || transitionState != transitionState2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public final void l() {
        if (this.C.equals(TransitionState.d)) {
            return;
        }
        TransitionState transitionState = this.C;
        TransitionState transitionState2 = TransitionState.c;
        if (transitionState.equals(transitionState2)) {
            return;
        }
        g gVar = this.p;
        SearchView searchView = gVar.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = gVar.c;
        if (gVar.p == null) {
            if (searchView.h()) {
                searchView.postDelayed(new wj7(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new zj7(gVar, 2));
            return;
        }
        EditText editText = gVar.j;
        if (searchView.h()) {
            searchView.j();
        }
        searchView.setTransitionState(transitionState2);
        Toolbar toolbar = gVar.g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (gVar.p.getMenuResId() == -1 || !searchView.x) {
            toolbar.setVisibility(8);
        } else {
            toolbar.p(gVar.p.getMenuResId());
            ActionMenuView actionMenuViewX = tt3.x(toolbar);
            if (actionMenuViewX != null) {
                for (int i = 0; i < actionMenuViewX.getChildCount(); i++) {
                    View childAt = actionMenuViewX.getChildAt(i);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(gVar.p.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new zj7(gVar, 1));
    }

    public final void m(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    m((ViewGroup) childAt, z);
                } else if (z) {
                    this.D.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap map = this.D;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.D.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void n(TransitionState transitionState) {
        if (this.u == null || !this.r) {
            return;
        }
        boolean zEquals = transitionState.equals(TransitionState.d);
        pa2 pa2Var = this.q;
        if (zEquals) {
            pa2Var.E(false);
        } else if (transitionState.equals(TransitionState.b)) {
            pa2Var.H();
        }
    }

    public final void o() {
        ImageButton imageButtonY = tt3.y(this.g);
        if (imageButtonY == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableP = yh0.P(imageButtonY.getDrawable());
        if (drawableP instanceof ew1) {
            ((ew1) drawableP).setProgress(i);
        }
        if (drawableP instanceof l82) {
            ((l82) drawableP).a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ub1.L(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        if (currentTransitionState == TransitionState.d) {
            setModalForAccessibility(true);
        } else if (currentTransitionState == TransitionState.b) {
            setModalForAccessibility(false);
        }
        n(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.q.H();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.v = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setText(savedState.c);
        setVisible(savedState.d == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.c = text == null ? null : text.toString();
        savedState.d = this.b.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.w = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.y = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.k.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.x = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.D = new HashMap(viewGroup.getChildCount());
        }
        m(viewGroup, z);
        if (z) {
            return;
        }
        this.D = null;
    }

    public void setOnMenuItemClickListener(pn8 pn8Var) {
        this.g.setOnMenuItemClickListener(pn8Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.i;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.B = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.g.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(TransitionState transitionState) {
        k(transitionState, true);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.A = z;
    }

    public void setVisible(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z ? 0 : 8);
        o();
        k(z ? TransitionState.d : TransitionState.b, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.u = searchBar;
        this.p.p = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new vj7(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new wj7(this, 1));
                    this.k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(yh0.P(materialToolbar.getNavigationIcon()) instanceof ew1)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.u == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableMutate = rf0.v(getContext(), defaultNavigationIconResource).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableMutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.setNavigationIcon(new l82(this.u.getNavigationIcon(), drawableMutate));
                o();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        n(getCurrentTransitionState());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialSearchViewStyle);
    }

    public void setHint(int i) {
        this.k.setHint(i);
    }

    public void setText(int i) {
        this.k.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        int i2 = E;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.q = new pa2(this, this);
        this.t = new LinkedHashSet();
        this.v = 16;
        this.C = TransitionState.b;
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.SearchView, i, i2, new int[0]);
        this.z = typedArrayD.getColor(yt6.SearchView_backgroundTint, 0);
        int resourceId = typedArrayD.getResourceId(yt6.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayD.getResourceId(yt6.SearchView_android_textAppearance, -1);
        String string = typedArrayD.getString(yt6.SearchView_android_text);
        String string2 = typedArrayD.getString(yt6.SearchView_android_hint);
        String string3 = typedArrayD.getString(yt6.SearchView_searchPrefixText);
        boolean z = typedArrayD.getBoolean(yt6.SearchView_useDrawerArrowDrawable, false);
        this.w = typedArrayD.getBoolean(yt6.SearchView_animateNavigationIcon, true);
        this.x = typedArrayD.getBoolean(yt6.SearchView_animateMenuItems, true);
        boolean z2 = typedArrayD.getBoolean(yt6.SearchView_hideNavigationIcon, false);
        this.y = typedArrayD.getBoolean(yt6.SearchView_autoShowKeyboard, true);
        this.r = typedArrayD.getBoolean(yt6.SearchView_backHandlingEnabled, true);
        typedArrayD.recycle();
        LayoutInflater.from(context2).inflate(is6.mtrl_search_view, this);
        this.o = true;
        this.a = findViewById(qr6.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(qr6.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(qr6.open_search_view_background);
        View viewFindViewById = findViewById(qr6.open_search_view_status_bar_spacer);
        this.d = viewFindViewById;
        this.e = (FrameLayout) findViewById(qr6.open_search_view_header_container);
        this.f = (FrameLayout) findViewById(qr6.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(qr6.open_search_view_toolbar);
        this.g = materialToolbar;
        this.h = (Toolbar) findViewById(qr6.open_search_view_dummy_toolbar);
        this.i = (TextView) findViewById(qr6.open_search_view_search_prefix);
        this.j = (LinearLayout) findViewById(qr6.open_search_view_text_container);
        EditText editText = (EditText) findViewById(qr6.open_search_view_edit_text);
        this.k = editText;
        ImageButton imageButton = (ImageButton) findViewById(qr6.open_search_view_clear_button);
        this.l = imageButton;
        View viewFindViewById2 = findViewById(qr6.open_search_view_divider);
        this.m = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(qr6.open_search_view_content_container);
        this.n = touchObserverFrameLayout;
        this.p = new g(this);
        this.s = new pz1(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new lk1(2));
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new vj7(this, 2));
            if (z) {
                ew1 ew1Var = new ew1(getContext());
                int iP = m91.p(vp6.colorOnSurface, this);
                Paint paint = ew1Var.a;
                if (iP != paint.getColor()) {
                    paint.setColor(iP);
                    ew1Var.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(ew1Var);
            }
        }
        imageButton.setOnClickListener(new vj7(this, 0));
        editText.addTextChangedListener(new mb0(11, this));
        touchObserverFrameLayout.setOnTouchListener(new jx1(6, this));
        o37.h(materialToolbar, new yj7(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        yc1 yc1Var = new yc1(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin, marginLayoutParams);
        WeakHashMap weakHashMap = q69.a;
        h69.m(viewFindViewById2, yc1Var);
        setUpStatusBarSpacer(getStatusBarHeight());
        h69.m(viewFindViewById, new yj7(this));
    }
}
