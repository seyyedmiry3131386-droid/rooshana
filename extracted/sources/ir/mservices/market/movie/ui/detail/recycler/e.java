package ir.mservices.market.movie.ui.detail.recycler;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.kh2;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.qr1;
import defpackage.sj8;
import defpackage.yp6;
import defpackage.yq6;
import defpackage.z0;
import defpackage.z15;
import defpackage.zl;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.movie.ui.detail.data.MovieTabType;
import ir.mservices.market.views.MovieTabView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends qg5 {
    public final og5 w;
    public z15 x;
    public boolean y;
    public zl z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, og5 og5Var) {
        super(view);
        js3.p(view, "itemView");
        this.w = og5Var;
        qg5.r();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MovieTabData movieTabData = (MovieTabData) myketRecyclerData;
        js3.p(movieTabData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MovieTabViewHolder$onAttach$1(movieTabData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((MovieTabData) myketRecyclerData, "data");
        x().z.removeCallbacks(this.z);
        this.z = null;
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof z15) {
            this.x = (z15) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final z15 x() {
        z15 z15Var = this.x;
        if (z15Var != null) {
            return z15Var;
        }
        js3.V("binding");
        throw null;
    }

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
    @Override // defpackage.qg5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void t(MovieTabData movieTabData) {
        Drawable drawable;
        Drawable drawable2;
        Boolean bool;
        js3.p(movieTabData, "data");
        int tabCount = x().z.getTabCount();
        View view = this.a;
        int i = 1;
        if (tabCount == 0) {
            z15 z15VarX = x();
            boolean z = movieTabData.a;
            boolean z2 = movieTabData.b;
            if (view.getResources().getBoolean(yp6.movie_detail_tablet)) {
                drawable = null;
            } else {
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                int i2 = yq6.tab_indicator;
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
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().j, PorterDuff.Mode.MULTIPLY));
            }
            MovieTabView movieTabView = z15VarX.z;
            movieTabView.setSelectedTabIndicator(drawable);
            movieTabView.setSelectedTabIndicatorColor(sj8.b().j);
            movieTabView.setTabTextColors(sj8.b().n, sj8.b().m);
            movieTabView.setTabIconTint(new ColorStateList(new int[][]{new int[]{-16842913}, new int[0]}, new int[]{sj8.b().n, sj8.b().m}));
            MovieTabType.h.getClass();
            List list = MovieTabType.r;
            ArrayList<MovieTabType> arrayList = new ArrayList();
            for (Object obj : (z0) list) {
                MovieTabType movieTabType = (MovieTabType) obj;
                if (movieTabType.b == z && ((bool = movieTabType.g) == null || bool.equals(Boolean.valueOf(z2)))) {
                    arrayList.add(obj);
                }
            }
            for (MovieTabType movieTabType2 : arrayList) {
                com.google.android.material.tabs.b bVarK = movieTabView.k();
                if (view.getResources().getBoolean(yp6.movie_detail_tablet)) {
                    Resources resources2 = view.getResources();
                    js3.o(resources2, "getResources(...)");
                    int i3 = movieTabType2.d;
                    try {
                        drawable2 = q39.a(resources2, i3, null);
                        if (drawable2 == null) {
                            ThreadLocal threadLocal3 = b77.a;
                            drawable2 = resources2.getDrawable(i3, null);
                            if (drawable2 == null) {
                                throw new Resources.NotFoundException();
                            }
                        }
                    } catch (Exception unused2) {
                        ThreadLocal threadLocal4 = b77.a;
                        drawable2 = resources2.getDrawable(i3, null);
                        if (drawable2 == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                    bVarK.a(drawable2);
                }
                SpannableString spannableString = new SpannableString(view.getResources().getString(movieTabType2.c));
                spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.a.c, 0, spannableString.length(), 33);
                spannableString.setSpan(new AbsoluteSizeSpan(view.getResources().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
                bVarK.b(spannableString);
                movieTabView.setTabTextColors(sj8.b().n, sj8.b().m);
                movieTabView.b(bVarK, movieTabView.b.isEmpty());
            }
            x().z.a(new qr1(this, movieTabData, i));
        }
        x().z.s();
        View childAt = x().z.getChildAt(0);
        js3.n(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        int i4 = 0;
        while (i4 < viewGroup.getChildCount()) {
            int i5 = i4 + 1;
            View childAt2 = viewGroup.getChildAt(i4);
            if (childAt2 == null) {
                throw new IndexOutOfBoundsException();
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt2;
            int i6 = 0;
            while (i6 < viewGroup2.getChildCount()) {
                int i7 = i6 + 1;
                View childAt3 = viewGroup2.getChildAt(i6);
                if (childAt3 == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (childAt3 instanceof TextView) {
                    TextView textView = (TextView) childAt3;
                    textView.setTypeface((Typeface) kh2.b.a.b);
                    textView.setTextSize(0, view.getResources().getDimension(pq6.font_size_large));
                }
                i6 = i7;
            }
            i4 = i5;
        }
        MovieTabView movieTabView2 = x().z;
        this.y = true;
        com.google.android.material.tabs.b bVarJ = movieTabView2.j(0);
        if (bVarJ != null) {
            TabLayout tabLayout = bVarJ.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.n(bVarJ, true);
        }
        zl zlVar = new zl(0, 6, this);
        this.z = zlVar;
        movieTabView2.post(zlVar);
    }
}
