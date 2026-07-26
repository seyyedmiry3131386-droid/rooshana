package ir.mservices.market.views;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import defpackage.b77;
import defpackage.ba7;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dk7;
import defpackage.dv2;
import defpackage.e71;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g51;
import defpackage.hh2;
import defpackage.hk7;
import defpackage.ja1;
import defpackage.jk7;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx1;
import defpackage.kk7;
import defpackage.lk2;
import defpackage.mk7;
import defpackage.nm2;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qp2;
import defpackage.rj;
import defpackage.rp2;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tj7;
import defpackage.tx8;
import defpackage.u03;
import defpackage.u91;
import defpackage.ud4;
import defpackage.uh7;
import defpackage.w91;
import defpackage.xb5;
import defpackage.xk6;
import defpackage.y97;
import defpackage.yq6;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.common.search.BaseSearchFragment;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.common.search.SearchState;
import ir.mservices.market.common.search.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.search.SearchFragment;
import ir.mservices.market.search.history.ui.SearchAction;
import ir.mservices.market.search.history.ui.SearchHistoryRecyclerListFragment;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.SearchView;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class SearchView extends Hilt_SearchView {
    public static boolean r;
    public d04 c;
    public dv2 d;
    public final uh7 e;
    public boolean f;
    public String g;
    public GraphicUtils$Dimension h;
    public hk7 i;
    public xb5 j;
    public boolean k;
    public boolean l;
    public final boolean m;
    public boolean n;
    public final dk7 o;
    public String p;
    public ValueAnimator q;

    /* JADX INFO: renamed from: ir.mservices.market.views.SearchView$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.views.SearchView$3", f = "SearchView.kt", l = {109}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.views.SearchView$3$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.views.SearchView$3$1", f = "SearchView.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements rp2 {
            public /* synthetic */ boolean a;
            public /* synthetic */ boolean b;

            @Override // defpackage.rp2
            public final Object a(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (g51) obj3);
                anonymousClass1.a = zBooleanValue;
                anonymousClass1.b = zBooleanValue2;
                return anonymousClass1.invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.a;
                boolean z2 = this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                kotlin.b.b(obj);
                return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
            }
        }

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SearchView.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                SearchView searchView = SearchView.this;
                h hVar = new h(searchView.j, searchView.getBinding().F.getOnStateChangedFlow(), new AnonymousClass1(3, null));
                xk6 xk6Var = new xk6(10, searchView);
                this.a = 1;
                if (hVar.a(xk6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public SearchView(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(context, attributeSet);
        js3.p(context, "context");
        char c = 1;
        char c2 = 1;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            w91 w91Var = ((u91) ((mk7) e())).a;
            this.c = (d04) w91Var.p.get();
            this.d = (dv2) w91Var.q.get();
        }
        this.f = true;
        this.j = ja1.b(Boolean.TRUE);
        this.k = true;
        this.n = true;
        this.p = "";
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = uh7.J;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        uh7 uh7Var = (uh7) fa1.c(layoutInflaterFrom, js6.search_collapse_view, this, true);
        js3.o(uh7Var, "inflate(...)");
        ImageView imageView = uh7Var.C;
        View view = uh7Var.D;
        MyketEditText myketEditText = uh7Var.G;
        this.e = uh7Var;
        uh7Var.l.setLayoutDirection(getLanguageHelper().c());
        myketEditText.setTextDirection(getLanguageHelper().c());
        myketEditText.q = true;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).setMarginStart(getResources().getDimensionPixelSize(pq6.space_m) + getResources().getDimensionPixelSize(pq6.default_icon_size));
        final int i2 = 0;
        if (r) {
            imageView.setVisibility(8);
            view.setVisibility(8);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setStartOffset(3000L);
            animationSet.setDuration(500L);
            animationSet.setAnimationListener(new kk7(this, c2 == true ? 1 : 0));
            imageView.startAnimation(animationSet);
        }
        uh7Var.E.setOnClickListener(new View.OnClickListener(this) { // from class: xj7
            public final /* synthetic */ SearchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hk7 hk7Var;
                hk7 hk7Var2;
                int i3 = i2;
                SearchView searchView = this.b;
                switch (i3) {
                    case 0:
                        if (searchView.k && (hk7Var = searchView.i) != null) {
                            NavIntentDirections.MyMarket myMarket = new NavIntentDirections.MyMarket();
                            BaseSearchFragment baseSearchFragment = ((a) hk7Var).a;
                            int i4 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment.J0, myMarket, -1);
                            break;
                        }
                        break;
                    case 1:
                        if (searchView.k && (hk7Var2 = searchView.i) != null) {
                            BaseSearchFragment baseSearchFragment2 = ((a) hk7Var2).a;
                            int i5 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment2.J0, new NavIntentDirections.RecentDownload(new zw6(new DialogDataModel(t61.j(baseSearchFragment2.getClass().getSimpleName(), "_", baseSearchFragment2.H0), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
                            break;
                        }
                        break;
                    case 2:
                        SearchView.b(searchView);
                        break;
                    default:
                        SearchView.a(searchView);
                        break;
                }
            }
        });
        final int i3 = 3;
        bt2.G(cc7.q(this), null, null, new AnonymousClass3(null), 3);
        MyketRecentDownloadView myketRecentDownloadView = uh7Var.F;
        final char c3 = c == true ? 1 : 0;
        myketRecentDownloadView.setOnClickListener(new View.OnClickListener(this) { // from class: xj7
            public final /* synthetic */ SearchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hk7 hk7Var;
                hk7 hk7Var2;
                int i32 = c3;
                SearchView searchView = this.b;
                switch (i32) {
                    case 0:
                        if (searchView.k && (hk7Var = searchView.i) != null) {
                            NavIntentDirections.MyMarket myMarket = new NavIntentDirections.MyMarket();
                            BaseSearchFragment baseSearchFragment = ((a) hk7Var).a;
                            int i4 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment.J0, myMarket, -1);
                            break;
                        }
                        break;
                    case 1:
                        if (searchView.k && (hk7Var2 = searchView.i) != null) {
                            BaseSearchFragment baseSearchFragment2 = ((a) hk7Var2).a;
                            int i5 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment2.J0, new NavIntentDirections.RecentDownload(new zw6(new DialogDataModel(t61.j(baseSearchFragment2.getClass().getSimpleName(), "_", baseSearchFragment2.H0), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
                            break;
                        }
                        break;
                    case 2:
                        SearchView.b(searchView);
                        break;
                    default:
                        SearchView.a(searchView);
                        break;
                }
            }
        });
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0);
        js3.o(listQueryIntentActivities, "queryIntentActivities(...)");
        this.m = listQueryIntentActivities.size() > 0;
        Resources resources = getResources();
        js3.o(resources, "getResources(...)");
        int i4 = yq6.ic_action_search;
        try {
            drawable = q39.a(resources, i4, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i4, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i4, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        myketEditText.setEditTextDrawable(drawableMutate);
        myketEditText.setCompoundDrawablePadding(getResources().getDimensionPixelSize(pq6.margin_default_v2));
        final int i5 = 2;
        uh7Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: xj7
            public final /* synthetic */ SearchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hk7 hk7Var;
                hk7 hk7Var2;
                int i32 = i5;
                SearchView searchView = this.b;
                switch (i32) {
                    case 0:
                        if (searchView.k && (hk7Var = searchView.i) != null) {
                            NavIntentDirections.MyMarket myMarket = new NavIntentDirections.MyMarket();
                            BaseSearchFragment baseSearchFragment = ((a) hk7Var).a;
                            int i42 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment.J0, myMarket, -1);
                            break;
                        }
                        break;
                    case 1:
                        if (searchView.k && (hk7Var2 = searchView.i) != null) {
                            BaseSearchFragment baseSearchFragment2 = ((a) hk7Var2).a;
                            int i52 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment2.J0, new NavIntentDirections.RecentDownload(new zw6(new DialogDataModel(t61.j(baseSearchFragment2.getClass().getSimpleName(), "_", baseSearchFragment2.H0), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
                            break;
                        }
                        break;
                    case 2:
                        SearchView.b(searchView);
                        break;
                    default:
                        SearchView.a(searchView);
                        break;
                }
            }
        });
        uh7Var.w.setOnClickListener(new View.OnClickListener(this) { // from class: xj7
            public final /* synthetic */ SearchView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hk7 hk7Var;
                hk7 hk7Var2;
                int i32 = i3;
                SearchView searchView = this.b;
                switch (i32) {
                    case 0:
                        if (searchView.k && (hk7Var = searchView.i) != null) {
                            NavIntentDirections.MyMarket myMarket = new NavIntentDirections.MyMarket();
                            BaseSearchFragment baseSearchFragment = ((a) hk7Var).a;
                            int i42 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment.J0, myMarket, -1);
                            break;
                        }
                        break;
                    case 1:
                        if (searchView.k && (hk7Var2 = searchView.i) != null) {
                            BaseSearchFragment baseSearchFragment2 = ((a) hk7Var2).a;
                            int i52 = BaseSearchFragment.q1;
                            pk5.g(baseSearchFragment2.J0, new NavIntentDirections.RecentDownload(new zw6(new DialogDataModel(t61.j(baseSearchFragment2.getClass().getSimpleName(), "_", baseSearchFragment2.H0), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
                            break;
                        }
                        break;
                    case 2:
                        SearchView.b(searchView);
                        break;
                    default:
                        SearchView.a(searchView);
                        break;
                }
            }
        });
        myketEditText.setOnTouchListener(new jx1(5, this));
        myketEditText.setLongClickable(false);
        myketEditText.setBackgroundColor(sj8.b().N);
        if (this.o == null) {
            dk7 dk7Var = new dk7(this);
            this.o = dk7Var;
            myketEditText.addTextChangedListener(dk7Var);
        }
        myketEditText.setSaveEnabled(false);
        CharSequence string = this.g;
        if (string == null) {
            string = getResources().getString(rs6.search_input_text);
            js3.o(string, "getString(...)");
        }
        myketEditText.setHint(string);
        myketEditText.setOnEditorActionListener(new ud4(i3, this));
        j();
        g();
        h();
    }

    public static void a(SearchView searchView) {
        hk7 hk7Var;
        if (searchView.l) {
            searchView.setSearchText("");
            searchView.d("");
            searchView.e.G.requestFocus();
            searchView.f();
            hk7 hk7Var2 = searchView.i;
            if (hk7Var2 != null) {
                sb7.p("SearchView", "search cleared", null);
                ((ir.mservices.market.common.search.a) hk7Var2).a.S1().r(new SearchAction.OpenSearchBoxAction(true), new SearchAction.UpdateSearchStateAction(new SearchState.Home(0)));
                return;
            }
            return;
        }
        if (!searchView.m || (hk7Var = searchView.i) == null) {
            return;
        }
        BaseSearchFragment baseSearchFragment = ((ir.mservices.market.common.search.a) hk7Var).a;
        baseSearchFragment.b2();
        try {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.LANGUAGE", baseSearchFragment.F0.f() ? "fa-IR" : "en-US");
            intent.putExtra("android.speech.extra.PROMPT", baseSearchFragment.L(rs6.speech_to_text_greeting));
            lk2 lk2Var = baseSearchFragment.m1;
            if (lk2Var != null) {
                lk2Var.a(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Context contextH = baseSearchFragment.H();
            hh2.H(new hh2(contextH, contextH != null ? contextH.getString(rs6.speech_to_text_device_not_support) : null));
        } catch (Exception unused2) {
        }
    }

    public static void b(SearchView searchView) {
        hk7 hk7Var = searchView.i;
        if (hk7Var != null) {
            ((ir.mservices.market.common.search.a) hk7Var).a();
        }
        searchView.setSearchText("");
        searchView.d("");
        if (searchView.f) {
            searchView.c(true);
        }
        hk7 hk7Var2 = searchView.i;
        if (hk7Var2 != null) {
            boolean z = searchView.f;
            sb7.p("SearchView", "search back", null);
            BaseSearchFragment baseSearchFragment = ((ir.mservices.market.common.search.a) hk7Var2).a;
            baseSearchFragment.S1().r(new SearchAction.OpenSearchBoxAction(false), new SearchAction.UpdateSearchStateAction(new SearchState.Normal(0)));
            if (z) {
                return;
            }
            pk5.a(baseSearchFragment.J0);
        }
    }

    private final ValueAnimator getBackgroundAnimator() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(sj8.b().l), Integer.valueOf(sj8.b().p));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new tj7(this, 0));
        return valueAnimatorOfObject;
    }

    private final ValueAnimator getBottomMarginAnimator() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getResources().getDimensionPixelSize(pq6.margin_default_v2_oneHalf), getResources().getDimensionPixelSize(pq6.margin_default_v2_half));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new tj7(this, 1));
        return valueAnimatorOfInt;
    }

    private final ValueAnimator getCloseMarginAnimator() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getResources().getDimensionPixelSize(pq6.space_m), getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new tj7(this, 2));
        return valueAnimatorOfInt;
    }

    private final int getCornerRadius() {
        return getResources().getDimensionPixelSize(pq6.search_corner_radius);
    }

    private final int getEndMargin() {
        int dimensionPixelSize;
        uh7 uh7Var = this.e;
        FrameLayout frameLayout = uh7Var.A;
        js3.o(frameLayout, "dynamicLayout");
        if (frameLayout.getVisibility() == 0) {
            dimensionPixelSize = getResources().getDimensionPixelSize(pq6.space_s) + getResources().getDimensionPixelSize(pq6.space_l) + getResources().getDimensionPixelSize(pq6.dynamic_icon_size);
        } else {
            MyketRecentDownloadView myketRecentDownloadView = uh7Var.F;
            js3.o(myketRecentDownloadView, "recentDownloadView");
            dimensionPixelSize = myketRecentDownloadView.getVisibility() == 0 ? getResources().getDimensionPixelSize(pq6.recent_download_layout_size) + getResources().getDimensionPixelSize(pq6.space_s) : 0;
        }
        return getResources().getDimensionPixelSize(pq6.space_8) + getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + getResources().getDimensionPixelSize(pq6.root_icon_size) + dimensionPixelSize;
    }

    private final ValueAnimator getRadiusAnimator() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, getCornerRadius());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new tj7(this, 3));
        return valueAnimatorOfInt;
    }

    private final ValueAnimator getSearchAnimator() {
        final int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        final int endMargin = getEndMargin();
        final int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.search_view_padding_vertical);
        final int dimensionPixelSize3 = getResources().getDimensionPixelSize(pq6.search_view_padding_vertical);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uj7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                boolean z = SearchView.r;
                float fFloatValue = ((Float) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                SearchView searchView = this.a;
                uh7 uh7Var = searchView.e;
                ViewGroup.LayoutParams layoutParams = uh7Var.I.getLayoutParams();
                js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (dimensionPixelSize2 * fFloatValue);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) (dimensionPixelSize3 * fFloatValue);
                boolean zF = searchView.getLanguageHelper().f();
                int i = dimensionPixelSize;
                int i2 = endMargin;
                if (zF) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) (i * fFloatValue);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) (i2 * fFloatValue);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) (i2 * fFloatValue);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) (i * fFloatValue);
                }
                uh7Var.I.requestLayout();
            }
        });
        return valueAnimatorOfFloat;
    }

    private final void setSearchText(String str) {
        this.n = false;
        MyketEditText myketEditText = this.e.G;
        if (str == null) {
            str = "";
        }
        myketEditText.setText(str);
        this.n = true;
    }

    public final void c(boolean z) {
        Drawable drawable;
        if (this.k == z) {
            return;
        }
        this.k = z;
        hk7 hk7Var = this.i;
        final int i = 0;
        if (hk7Var != null) {
            BaseSearchFragment baseSearchFragment = ((ir.mservices.market.common.search.a) hk7Var).a;
            boolean z2 = !z;
            final int i2 = 1;
            baseSearchFragment.S1().r(new SearchAction.OpenSearchBoxAction(z2));
            FragmentActivity fragmentActivityF = baseSearchFragment.F();
            LaunchContentActivity launchContentActivity = fragmentActivityF instanceof LaunchContentActivity ? (LaunchContentActivity) fragmentActivityF : null;
            if (launchContentActivity != null) {
                launchContentActivity.l0(sj8.b().F, z && (baseSearchFragment instanceof ba7));
            }
            if (z) {
                sb7.p("SearchView", "search closed", null);
            } else {
                sb7.p("SearchView", "search opened", null);
                baseSearchFragment.a2();
            }
            final SearchFragment searchFragmentV1 = baseSearchFragment.V1(true);
            if (searchFragmentV1 != null) {
                searchFragmentV1.G0().r(new SearchAction.OpenAction(z2));
                searchFragmentV1.E0();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, p3.g(searchFragmentV1.F()).b);
                valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ai7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i3 = i2;
                        SearchFragment searchFragment = searchFragmentV1;
                        switch (i3) {
                            case 0:
                                int i4 = SearchFragment.b1;
                                int iIntValue = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var = searchFragment.P0;
                                js3.m(nm2Var);
                                ViewGroup.LayoutParams layoutParams = nm2Var.w.getLayoutParams();
                                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (searchFragment.F0.f()) {
                                    marginLayoutParams.rightMargin = iIntValue;
                                } else {
                                    marginLayoutParams.leftMargin = iIntValue;
                                }
                                nm2 nm2Var2 = searchFragment.P0;
                                js3.m(nm2Var2);
                                nm2Var2.w.requestLayout();
                                break;
                            case 1:
                                int i5 = SearchFragment.b1;
                                int iIntValue2 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var3 = searchFragment.P0;
                                js3.m(nm2Var3);
                                nm2Var3.w.getLayoutParams().height = iIntValue2;
                                nm2 nm2Var4 = searchFragment.P0;
                                js3.m(nm2Var4);
                                nm2Var4.w.requestLayout();
                                break;
                            default:
                                int i6 = SearchFragment.b1;
                                int iIntValue3 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var5 = searchFragment.P0;
                                js3.m(nm2Var5);
                                ViewGroup.LayoutParams layoutParams2 = nm2Var5.w.getLayoutParams();
                                js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                if (searchFragment.F0.f()) {
                                    marginLayoutParams2.leftMargin = iIntValue3;
                                } else {
                                    marginLayoutParams2.rightMargin = iIntValue3;
                                }
                                nm2 nm2Var6 = searchFragment.P0;
                                js3.m(nm2Var6);
                                nm2Var6.w.requestLayout();
                                break;
                        }
                    }
                });
                valueAnimatorOfInt.addListener(new rj(6, searchFragmentV1));
                searchFragmentV1.U0 = valueAnimatorOfInt;
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(searchFragmentV1.K().getDimensionPixelSize(pq6.recycler_view_horizontal_padding), 0);
                valueAnimatorOfInt2.setDuration(300L);
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ai7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i3 = i;
                        SearchFragment searchFragment = searchFragmentV1;
                        switch (i3) {
                            case 0:
                                int i4 = SearchFragment.b1;
                                int iIntValue = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var = searchFragment.P0;
                                js3.m(nm2Var);
                                ViewGroup.LayoutParams layoutParams = nm2Var.w.getLayoutParams();
                                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (searchFragment.F0.f()) {
                                    marginLayoutParams.rightMargin = iIntValue;
                                } else {
                                    marginLayoutParams.leftMargin = iIntValue;
                                }
                                nm2 nm2Var2 = searchFragment.P0;
                                js3.m(nm2Var2);
                                nm2Var2.w.requestLayout();
                                break;
                            case 1:
                                int i5 = SearchFragment.b1;
                                int iIntValue2 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var3 = searchFragment.P0;
                                js3.m(nm2Var3);
                                nm2Var3.w.getLayoutParams().height = iIntValue2;
                                nm2 nm2Var4 = searchFragment.P0;
                                js3.m(nm2Var4);
                                nm2Var4.w.requestLayout();
                                break;
                            default:
                                int i6 = SearchFragment.b1;
                                int iIntValue3 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var5 = searchFragment.P0;
                                js3.m(nm2Var5);
                                ViewGroup.LayoutParams layoutParams2 = nm2Var5.w.getLayoutParams();
                                js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                if (searchFragment.F0.f()) {
                                    marginLayoutParams2.leftMargin = iIntValue3;
                                } else {
                                    marginLayoutParams2.rightMargin = iIntValue3;
                                }
                                nm2 nm2Var6 = searchFragment.P0;
                                js3.m(nm2Var6);
                                nm2Var6.w.requestLayout();
                                break;
                        }
                    }
                });
                searchFragmentV1.V0 = valueAnimatorOfInt2;
                ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(searchFragmentV1.T0, 0);
                valueAnimatorOfInt3.setDuration(300L);
                final int i3 = 2;
                valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ai7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i32 = i3;
                        SearchFragment searchFragment = searchFragmentV1;
                        switch (i32) {
                            case 0:
                                int i4 = SearchFragment.b1;
                                int iIntValue = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var = searchFragment.P0;
                                js3.m(nm2Var);
                                ViewGroup.LayoutParams layoutParams = nm2Var.w.getLayoutParams();
                                js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (searchFragment.F0.f()) {
                                    marginLayoutParams.rightMargin = iIntValue;
                                } else {
                                    marginLayoutParams.leftMargin = iIntValue;
                                }
                                nm2 nm2Var2 = searchFragment.P0;
                                js3.m(nm2Var2);
                                nm2Var2.w.requestLayout();
                                break;
                            case 1:
                                int i5 = SearchFragment.b1;
                                int iIntValue2 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var3 = searchFragment.P0;
                                js3.m(nm2Var3);
                                nm2Var3.w.getLayoutParams().height = iIntValue2;
                                nm2 nm2Var4 = searchFragment.P0;
                                js3.m(nm2Var4);
                                nm2Var4.w.requestLayout();
                                break;
                            default:
                                int i6 = SearchFragment.b1;
                                int iIntValue3 = ((Integer) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
                                nm2 nm2Var5 = searchFragment.P0;
                                js3.m(nm2Var5);
                                ViewGroup.LayoutParams layoutParams2 = nm2Var5.w.getLayoutParams();
                                js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                if (searchFragment.F0.f()) {
                                    marginLayoutParams2.leftMargin = iIntValue3;
                                } else {
                                    marginLayoutParams2.rightMargin = iIntValue3;
                                }
                                nm2 nm2Var6 = searchFragment.P0;
                                js3.m(nm2Var6);
                                nm2Var6.w.requestLayout();
                                break;
                        }
                    }
                });
                searchFragmentV1.W0 = valueAnimatorOfInt3;
                if (z) {
                    nm2 nm2Var = searchFragmentV1.P0;
                    js3.m(nm2Var);
                    searchFragmentV1.X0 = nm2Var.x.animate().alpha(0.0f).setDuration(300L).withStartAction(new Runnable() { // from class: zh7
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    SearchFragment searchFragment = searchFragmentV1;
                                    nm2 nm2Var2 = searchFragment.P0;
                                    js3.m(nm2Var2);
                                    nm2Var2.w.setVisibility(0);
                                    nm2 nm2Var3 = searchFragment.P0;
                                    js3.m(nm2Var3);
                                    nm2Var3.v.setVisibility(8);
                                    break;
                                case 1:
                                    SearchFragment searchFragment2 = searchFragmentV1;
                                    nm2 nm2Var4 = searchFragment2.P0;
                                    js3.m(nm2Var4);
                                    nm2Var4.w.setVisibility(8);
                                    d dVarS = searchFragment2.s();
                                    SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = dVarS instanceof SearchHistoryRecyclerListFragment ? (SearchHistoryRecyclerListFragment) dVarS : null;
                                    if (searchHistoryRecyclerListFragment != null) {
                                        SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                                        searchViewModelU0.D.o(searchViewModelU0.v.b("sourceType"));
                                    }
                                    break;
                                case 2:
                                    SearchFragment searchFragment3 = searchFragmentV1;
                                    nm2 nm2Var5 = searchFragment3.P0;
                                    js3.m(nm2Var5);
                                    nm2Var5.w.setVisibility(0);
                                    nm2 nm2Var6 = searchFragment3.P0;
                                    js3.m(nm2Var6);
                                    nm2Var6.x.setVisibility(0);
                                    nm2 nm2Var7 = searchFragment3.P0;
                                    js3.m(nm2Var7);
                                    nm2Var7.x.setAlpha(0.0f);
                                    break;
                                default:
                                    nm2 nm2Var8 = searchFragmentV1.P0;
                                    js3.m(nm2Var8);
                                    nm2Var8.v.setVisibility(0);
                                    break;
                            }
                        }
                    }).withEndAction(new Runnable() { // from class: zh7
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    SearchFragment searchFragment = searchFragmentV1;
                                    nm2 nm2Var2 = searchFragment.P0;
                                    js3.m(nm2Var2);
                                    nm2Var2.w.setVisibility(0);
                                    nm2 nm2Var3 = searchFragment.P0;
                                    js3.m(nm2Var3);
                                    nm2Var3.v.setVisibility(8);
                                    break;
                                case 1:
                                    SearchFragment searchFragment2 = searchFragmentV1;
                                    nm2 nm2Var4 = searchFragment2.P0;
                                    js3.m(nm2Var4);
                                    nm2Var4.w.setVisibility(8);
                                    d dVarS = searchFragment2.s();
                                    SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = dVarS instanceof SearchHistoryRecyclerListFragment ? (SearchHistoryRecyclerListFragment) dVarS : null;
                                    if (searchHistoryRecyclerListFragment != null) {
                                        SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                                        searchViewModelU0.D.o(searchViewModelU0.v.b("sourceType"));
                                    }
                                    break;
                                case 2:
                                    SearchFragment searchFragment3 = searchFragmentV1;
                                    nm2 nm2Var5 = searchFragment3.P0;
                                    js3.m(nm2Var5);
                                    nm2Var5.w.setVisibility(0);
                                    nm2 nm2Var6 = searchFragment3.P0;
                                    js3.m(nm2Var6);
                                    nm2Var6.x.setVisibility(0);
                                    nm2 nm2Var7 = searchFragment3.P0;
                                    js3.m(nm2Var7);
                                    nm2Var7.x.setAlpha(0.0f);
                                    break;
                                default:
                                    nm2 nm2Var8 = searchFragmentV1.P0;
                                    js3.m(nm2Var8);
                                    nm2Var8.v.setVisibility(0);
                                    break;
                            }
                        }
                    });
                    ValueAnimator valueAnimator = searchFragmentV1.U0;
                    if (valueAnimator != null) {
                        valueAnimator.reverse();
                    }
                    ValueAnimator valueAnimator2 = searchFragmentV1.V0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.reverse();
                    }
                    ValueAnimator valueAnimator3 = searchFragmentV1.W0;
                    if (valueAnimator3 != null) {
                        valueAnimator3.reverse();
                    }
                } else {
                    nm2 nm2Var2 = searchFragmentV1.P0;
                    js3.m(nm2Var2);
                    ViewPropertyAnimator viewPropertyAnimatorWithStartAction = nm2Var2.x.animate().alpha(1.0f).setDuration(150L).withStartAction(new Runnable() { // from class: zh7
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    SearchFragment searchFragment = searchFragmentV1;
                                    nm2 nm2Var22 = searchFragment.P0;
                                    js3.m(nm2Var22);
                                    nm2Var22.w.setVisibility(0);
                                    nm2 nm2Var3 = searchFragment.P0;
                                    js3.m(nm2Var3);
                                    nm2Var3.v.setVisibility(8);
                                    break;
                                case 1:
                                    SearchFragment searchFragment2 = searchFragmentV1;
                                    nm2 nm2Var4 = searchFragment2.P0;
                                    js3.m(nm2Var4);
                                    nm2Var4.w.setVisibility(8);
                                    d dVarS = searchFragment2.s();
                                    SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = dVarS instanceof SearchHistoryRecyclerListFragment ? (SearchHistoryRecyclerListFragment) dVarS : null;
                                    if (searchHistoryRecyclerListFragment != null) {
                                        SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                                        searchViewModelU0.D.o(searchViewModelU0.v.b("sourceType"));
                                    }
                                    break;
                                case 2:
                                    SearchFragment searchFragment3 = searchFragmentV1;
                                    nm2 nm2Var5 = searchFragment3.P0;
                                    js3.m(nm2Var5);
                                    nm2Var5.w.setVisibility(0);
                                    nm2 nm2Var6 = searchFragment3.P0;
                                    js3.m(nm2Var6);
                                    nm2Var6.x.setVisibility(0);
                                    nm2 nm2Var7 = searchFragment3.P0;
                                    js3.m(nm2Var7);
                                    nm2Var7.x.setAlpha(0.0f);
                                    break;
                                default:
                                    nm2 nm2Var8 = searchFragmentV1.P0;
                                    js3.m(nm2Var8);
                                    nm2Var8.v.setVisibility(0);
                                    break;
                            }
                        }
                    });
                    final int i4 = 3;
                    searchFragmentV1.X0 = viewPropertyAnimatorWithStartAction.withEndAction(new Runnable() { // from class: zh7
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    SearchFragment searchFragment = searchFragmentV1;
                                    nm2 nm2Var22 = searchFragment.P0;
                                    js3.m(nm2Var22);
                                    nm2Var22.w.setVisibility(0);
                                    nm2 nm2Var3 = searchFragment.P0;
                                    js3.m(nm2Var3);
                                    nm2Var3.v.setVisibility(8);
                                    break;
                                case 1:
                                    SearchFragment searchFragment2 = searchFragmentV1;
                                    nm2 nm2Var4 = searchFragment2.P0;
                                    js3.m(nm2Var4);
                                    nm2Var4.w.setVisibility(8);
                                    d dVarS = searchFragment2.s();
                                    SearchHistoryRecyclerListFragment searchHistoryRecyclerListFragment = dVarS instanceof SearchHistoryRecyclerListFragment ? (SearchHistoryRecyclerListFragment) dVarS : null;
                                    if (searchHistoryRecyclerListFragment != null) {
                                        SearchViewModel searchViewModelU0 = searchHistoryRecyclerListFragment.U0();
                                        searchViewModelU0.D.o(searchViewModelU0.v.b("sourceType"));
                                    }
                                    break;
                                case 2:
                                    SearchFragment searchFragment3 = searchFragmentV1;
                                    nm2 nm2Var5 = searchFragment3.P0;
                                    js3.m(nm2Var5);
                                    nm2Var5.w.setVisibility(0);
                                    nm2 nm2Var6 = searchFragment3.P0;
                                    js3.m(nm2Var6);
                                    nm2Var6.x.setVisibility(0);
                                    nm2 nm2Var7 = searchFragment3.P0;
                                    js3.m(nm2Var7);
                                    nm2Var7.x.setAlpha(0.0f);
                                    break;
                                default:
                                    nm2 nm2Var8 = searchFragmentV1.P0;
                                    js3.m(nm2Var8);
                                    nm2Var8.v.setVisibility(0);
                                    break;
                            }
                        }
                    });
                    ValueAnimator valueAnimator4 = searchFragmentV1.U0;
                    if (valueAnimator4 != null) {
                        valueAnimator4.start();
                    }
                    ValueAnimator valueAnimator5 = searchFragmentV1.V0;
                    if (valueAnimator5 != null) {
                        valueAnimator5.start();
                    }
                    ValueAnimator valueAnimator6 = searchFragmentV1.W0;
                    if (valueAnimator6 != null) {
                        valueAnimator6.start();
                    }
                }
                ViewPropertyAnimator viewPropertyAnimator = searchFragmentV1.X0;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.start();
                }
                if (z) {
                    searchFragmentV1.r(null);
                }
            }
        }
        ValueAnimator radiusAnimator = getRadiusAnimator();
        this.q = getBackgroundAnimator();
        ValueAnimator bottomMarginAnimator = getBottomMarginAnimator();
        ValueAnimator closeMarginAnimator = getCloseMarginAnimator();
        ValueAnimator searchAnimator = getSearchAnimator();
        ValueAnimator valueAnimator7 = this.q;
        if (valueAnimator7 != null) {
            valueAnimator7.addListener(new jk7(this, z));
        }
        uh7 uh7Var = this.e;
        ImageView imageView = uh7Var.v;
        ConstraintLayout constraintLayout = uh7Var.I;
        View view = uh7Var.H;
        MyketEditText myketEditText = uh7Var.G;
        imageView.setVisibility(z ? 8 : 0);
        if (!z) {
            myketEditText.setEditTextDrawable(null);
            myketEditText.setPaddingRelative(0, 0, 0, 0);
            view.animate().alpha(1.0f).setDuration(150L).withStartAction(new u03(24, this)).start();
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).width = -1;
            bottomMarginAnimator.start();
            radiusAnimator.reverse();
            ValueAnimator valueAnimator8 = this.q;
            if (valueAnimator8 != null) {
                valueAnimator8.reverse();
            }
            closeMarginAnimator.start();
            searchAnimator.start();
            return;
        }
        Resources resources = getResources();
        js3.o(resources, "getResources(...)");
        int i5 = yq6.ic_action_search;
        try {
            drawable = q39.a(resources, i5, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i5, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i5, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        myketEditText.setEditTextDrawable(drawableMutate);
        myketEditText.setPaddingRelative(getResources().getDimensionPixelSize(pq6.space_m), 0, 0, 0);
        view.animate().alpha(0.0f).setDuration(300L).start();
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        js3.n(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams2)).width = getResources().getDimensionPixelSize(pq6.search_box_width);
        bottomMarginAnimator.reverse();
        radiusAnimator.start();
        ValueAnimator valueAnimator9 = this.q;
        if (valueAnimator9 != null) {
            valueAnimator9.start();
        }
        closeMarginAnimator.reverse();
        searchAnimator.reverse();
    }

    public final void d(String str) {
        this.l = !(str == null || f88.n0(str));
        g();
    }

    public final void f() {
        this.e.G.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
    }

    public final void g() {
        Drawable drawable;
        Drawable drawableA;
        uh7 uh7Var = this.e;
        ImageView imageView = uh7Var.w;
        boolean z = this.l;
        boolean z2 = this.m;
        imageView.setVisibility((z || z2) ? 0 : 8);
        ImageView imageView2 = uh7Var.w;
        Drawable drawable2 = null;
        if (this.l) {
            Resources resources = getResources();
            js3.o(resources, "getResources(...)");
            int i = yq6.ic_action_close;
            try {
                drawableA = q39.a(resources, i, null);
                if (drawableA == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawableA = resources.getDrawable(i, null);
                    if (drawableA == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                drawable2 = drawableA;
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
                drawable2 = drawable;
            }
        } else if (z2) {
            Resources resources2 = getResources();
            js3.o(resources2, "getResources(...)");
            int i2 = yq6.ic_voice;
            try {
                drawableA = q39.a(resources2, i2, null);
                if (drawableA == null) {
                    ThreadLocal threadLocal3 = b77.a;
                    drawableA = resources2.getDrawable(i2, null);
                    if (drawableA == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                drawable2 = drawableA;
            } catch (Exception unused2) {
                ThreadLocal threadLocal4 = b77.a;
                drawable = resources2.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
                drawable2 = drawable;
            }
        }
        imageView2.setImageDrawable(drawable2);
    }

    public final boolean getAnimationEnabled() {
        return this.f;
    }

    public final uh7 getBinding() {
        return this.e;
    }

    public final GraphicUtils$Dimension getDimension() {
        return this.h;
    }

    public final dv2 getGraphicUtils() {
        dv2 dv2Var = this.d;
        if (dv2Var != null) {
            return dv2Var;
        }
        js3.V("graphicUtils");
        throw null;
    }

    public final String getHint() {
        return this.g;
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.c;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final hk7 getSearchCallback() {
        return this.i;
    }

    public final void h() {
        Drawable drawable;
        uh7 uh7Var = this.e;
        uh7Var.v.setVisibility(this.k ? 8 : 0);
        float cornerRadius = this.k ? getCornerRadius() : 0.0f;
        int dimensionPixelSize = getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        ViewGroup.LayoutParams layoutParams = uh7Var.A.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(pq6.space_l);
        if (getLanguageHelper().f()) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = dimensionPixelSize2;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = dimensionPixelSize2;
        }
        ViewGroup.LayoutParams layoutParams3 = uh7Var.E.getLayoutParams();
        js3.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        if (getLanguageHelper().f()) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = dimensionPixelSize;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams5 = uh7Var.I.getLayoutParams();
        js3.n(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        ((ViewGroup.MarginLayoutParams) layoutParams6).width = this.k ? getResources().getDimensionPixelSize(pq6.search_box_width) : -1;
        int endMargin = this.k ? getEndMargin() : 0;
        int dimensionPixelSize3 = this.k ? getResources().getDimensionPixelSize(pq6.search_view_padding_vertical) : 0;
        int dimensionPixelSize4 = this.k ? getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer) : 0;
        if (getLanguageHelper().f()) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = dimensionPixelSize4;
            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = endMargin;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = endMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = dimensionPixelSize4;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = dimensionPixelSize3;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = dimensionPixelSize3;
        Drawable drawableMutate = uh7Var.I.getBackground().mutate();
        int i = this.k ? sj8.b().p : sj8.b().l;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable background = uh7Var.I.getBackground();
        js3.n(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setCornerRadius(cornerRadius);
        uh7Var.H.setAlpha(this.k ? 0.0f : 1.0f);
        ViewGroup.LayoutParams layoutParams7 = uh7Var.w.getLayoutParams();
        js3.n(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin = getLanguageHelper().f() ? 0 : this.k ? getResources().getDimensionPixelSize(pq6.space_m) : getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = getLanguageHelper().e() ? 0 : this.k ? getResources().getDimensionPixelSize(pq6.space_m) : getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        if (!this.k) {
            uh7Var.G.requestFocus();
            uh7Var.G.setEditTextDrawable(null);
            return;
        }
        Resources resources = getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_action_search;
        try {
            drawable = q39.a(resources, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        uh7Var.G.setEditTextDrawable(drawable);
        uh7Var.G.clearFocus();
    }

    public final boolean i(boolean z, boolean z2) {
        if (z != this.k) {
            return false;
        }
        if (z2) {
            c(!z);
            return true;
        }
        this.k = !z;
        h();
        uh7 uh7Var = this.e;
        uh7Var.C.setVisibility(8);
        uh7Var.D.setVisibility(8);
        return true;
    }

    public final void j() {
        uh7 uh7Var = this.e;
        ConstraintLayout constraintLayout = uh7Var.I;
        ImageView imageView = uh7Var.v;
        Drawable drawableMutate = constraintLayout.getBackground().mutate();
        int i = this.k ? sj8.b().p : sj8.b().l;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        uh7Var.w.setColorFilter(sj8.b().n, mode);
        imageView.setColorFilter(sj8.b().n, mode);
        imageView.setBackground(y97.x());
        Drawable editTextDrawable = uh7Var.G.getEditTextDrawable();
        if (editTextDrawable != null) {
            editTextDrawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        }
    }

    public final void k(String str) {
        d(str);
        setSearchText(str);
        this.e.G.setSelection(str != null ? str.length() : 0);
    }

    public final void setAnimationEnabled(boolean z) {
        this.f = z;
    }

    public final void setDimension(GraphicUtils$Dimension graphicUtils$Dimension) {
        this.h = graphicUtils$Dimension;
    }

    public final void setDynamicViewVisibility(boolean z) {
        uh7 uh7Var = this.e;
        FrameLayout frameLayout = uh7Var.A;
        MyketRecentDownloadView myketRecentDownloadView = uh7Var.F;
        js3.o(frameLayout, "dynamicLayout");
        frameLayout.setVisibility(z ? 0 : 8);
        if (z) {
            js3.o(myketRecentDownloadView, "recentDownloadView");
            myketRecentDownloadView.setVisibility(8);
        }
        h();
        hk7 hk7Var = this.i;
        if (hk7Var != null) {
            FrameLayout frameLayout2 = uh7Var.A;
            js3.o(frameLayout2, "dynamicLayout");
            boolean z2 = frameLayout2.getVisibility() == 0;
            js3.o(myketRecentDownloadView, "recentDownloadView");
            boolean z3 = myketRecentDownloadView.getVisibility() == 0;
            BaseSearchFragment baseSearchFragment = ((ir.mservices.market.common.search.a) hk7Var).a;
            SearchFragment searchFragmentV1 = baseSearchFragment.V1(((Boolean) baseSearchFragment.S1().B.a.getValue()).booleanValue());
            if (searchFragmentV1 != null) {
                searchFragmentV1.H0(z2, z3);
            }
        }
    }

    public final void setGraphicUtils(dv2 dv2Var) {
        js3.p(dv2Var, "<set-?>");
        this.d = dv2Var;
    }

    public final void setHint(String str) {
        this.g = str;
        MyketEditText myketEditText = this.e.G;
        if (str == null) {
            str = getResources().getString(rs6.search_input_text);
            js3.o(str, "getString(...)");
        }
        myketEditText.setHint(str);
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.c = d04Var;
    }

    public final void setRecentDownloadViewEnable(xb5 xb5Var) {
        js3.p(xb5Var, "<set-?>");
        this.j = xb5Var;
    }

    public final void setSearchCallback(hk7 hk7Var) {
        this.i = hk7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
