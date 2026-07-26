package ir.mservices.market.social.profile.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.tabs.TabLayout;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.e71;
import defpackage.fa1;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.js6;
import defpackage.kh2;
import defpackage.nd0;
import defpackage.o4;
import defpackage.p3;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.t89;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import defpackage.yq6;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileTabView extends ConstraintLayout {
    public final t89 q;
    public final l r;
    public final rv6 s;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.common.ProfileTabView$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.common.ProfileTabView$2", f = "ProfileTabView.kt", l = {77}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.social.profile.common.ProfileTabView$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.social.profile.common.ProfileTabView$2$1", f = "ProfileTabView.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ int a;
            public final /* synthetic */ ProfileTabView b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ProfileTabView profileTabView, g51 g51Var) {
                super(2, g51Var);
                this.b = profileTabView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = ((Number) obj).intValue();
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                TabLayout tabLayout = this.b.q.w;
                tabLayout.n(tabLayout.j(i), true);
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileTabView.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                ProfileTabView profileTabView = ProfileTabView.this;
                o4 o4Var = new o4(profileTabView.getSelectedTabFlow(), 9);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(profileTabView, null);
                this.a = 1;
                if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = t89.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        t89 t89Var = (t89) fa1.c(layoutInflaterFrom, js6.view_profile_tabs, this, true);
        js3.o(t89Var, "inflate(...)");
        this.q = t89Var;
        l lVarB = ja1.b(null);
        this.r = lVarB;
        this.s = new rv6(lVarB);
        TabLayout tabLayout = t89Var.w;
        tabLayout.setSelectedTabIndicatorColor(sj8.b().c);
        tabLayout.setTabTextColors(sj8.b().n, sj8.b().m);
        int[] iArr = {sj8.b().n, sj8.b().m};
        tabLayout.setTabRippleColor(ColorStateList.valueOf(p3.a(sj8.b().O.c, 12)));
        tabLayout.setTabIconTint(new ColorStateList(new int[][]{new int[]{-16842913}, new int[0]}, iArr));
        com.google.android.material.tabs.b bVarK = tabLayout.k();
        bVarK.b(t(rs6.profile_recom_apps_tab));
        Resources resources = tabLayout.getResources();
        js3.o(resources, "getResources(...)");
        bVarK.a(p3.k(resources, yq6.ic_social_profile_recom_apps).mutate());
        ArrayList arrayList = tabLayout.b;
        tabLayout.b(bVarK, arrayList.isEmpty());
        com.google.android.material.tabs.b bVarK2 = tabLayout.k();
        bVarK2.b(t(rs6.profile_recom_film_tab));
        Resources resources2 = tabLayout.getResources();
        js3.o(resources2, "getResources(...)");
        bVarK2.a(p3.k(resources2, yq6.ic_social_profile_recom_film).mutate());
        tabLayout.b(bVarK2, arrayList.isEmpty());
        tabLayout.a(new nd0(3, this));
        View childAt = tabLayout.getChildAt(0);
        js3.n(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            int i3 = i2 + 1;
            View childAt2 = viewGroup.getChildAt(i2);
            if (childAt2 == null) {
                throw new IndexOutOfBoundsException();
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt2;
            int i4 = 0;
            while (i4 < viewGroup2.getChildCount()) {
                int i5 = i4 + 1;
                View childAt3 = viewGroup2.getChildAt(i4);
                if (childAt3 == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (childAt3 instanceof TextView) {
                    TextView textView = (TextView) childAt3;
                    textView.setTypeface((Typeface) kh2.b.a.b);
                    textView.setTextSize(0, getResources().getDimension(pq6.font_size_large));
                }
                i4 = i5;
            }
            i2 = i3;
        }
        bt2.G(cc7.q(this), null, null, new AnonymousClass2(null), 3);
    }

    public final v48 getSelectedTabFlow() {
        return this.s;
    }

    public final void setSelectedTab(int i) {
        l lVar;
        Object value;
        do {
            lVar = this.r;
            value = lVar.getValue();
        } while (!lVar.n(value, Integer.valueOf(i)));
    }

    public final void setTabBackgroundColor(int i) {
        this.q.x.setBackgroundColor(i);
    }

    public final SpannableString t(int i) {
        SpannableString spannableString = new SpannableString(getResources().getString(i));
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.a.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(pq6.font_size_medium)), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileTabView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }
}
