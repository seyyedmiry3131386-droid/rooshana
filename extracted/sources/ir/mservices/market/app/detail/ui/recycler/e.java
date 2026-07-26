package ir.mservices.market.app.detail.ui.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.ds6;
import defpackage.dv2;
import defpackage.g13;
import defpackage.gp;
import defpackage.js3;
import defpackage.lm;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.qw7;
import defpackage.sj8;
import defpackage.uz6;
import defpackage.w91;
import defpackage.yp6;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends qg5 {
    public g13 A;
    public qw7 B;
    public uz6 C;
    public boolean D;
    public final int E;
    public og5 w;
    public og5 x;
    public final dv2 y;
    public final d04 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, GraphicUtils$Dimension graphicUtils$Dimension, og5 og5Var, og5 og5Var2) {
        super(view);
        js3.p(graphicUtils$Dimension, "dimension");
        this.w = og5Var;
        this.x = og5Var2;
        this.E = view.getResources().getInteger(ds6.movie_screen_shots_span);
        w91 w91Var = (w91) qg5.r();
        this.y = (dv2) w91Var.q.get();
        this.z = (d04) w91Var.p.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppScreenshotListData appScreenshotListData = (AppScreenshotListData) myketRecyclerData;
        js3.p(appScreenshotListData, "data");
        g13 g13Var = this.A;
        if (g13Var == null) {
            js3.V("binding");
            throw null;
        }
        RecyclerView recyclerView = g13Var.w;
        lm lmVar = new lm(this.E, 1);
        lmVar.m = this.w;
        lmVar.n = this.x;
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppScreenshotListViewHolder$onAttach$1$1(lmVar, appScreenshotListData, null), 3);
        recyclerView.setAdapter(lmVar);
        uz6 gpVar = this.C;
        if (gpVar == null) {
            gpVar = new gp(1, this);
            g13 g13Var2 = this.A;
            if (g13Var2 == null) {
                js3.V("binding");
                throw null;
            }
            g13Var2.w.j(gpVar);
        }
        this.C = gpVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        AppScreenshotListData appScreenshotListData = (AppScreenshotListData) myketRecyclerData;
        js3.p(appScreenshotListData, "appScreenshotModuleData");
        View view = this.a;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        x();
        g13 g13Var = this.A;
        if (g13Var == null) {
            js3.V("binding");
            throw null;
        }
        RecyclerView recyclerView = g13Var.w;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        g13 g13Var2 = this.A;
        if (g13Var2 == null) {
            js3.V("binding");
            throw null;
        }
        k layoutManager = g13Var2.w.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.g0(appScreenshotListData.c);
        }
        d04 d04Var = this.z;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        this.D = d04Var.f();
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_4);
        qw7 qw7Var = this.B;
        if (qw7Var != null) {
            g13 g13Var3 = this.A;
            if (g13Var3 == null) {
                js3.V("binding");
                throw null;
            }
            g13Var3.w.f0(qw7Var);
        }
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int i = dimensionPixelSize / 2;
        qw7 qw7Var2 = new qw7(this.D, dimensionPixelSize2, dimensionPixelSize2, i, i);
        g13 g13Var4 = this.A;
        if (g13Var4 == null) {
            js3.V("binding");
            throw null;
        }
        g13Var4.w.i(qw7Var2);
        this.B = qw7Var2;
        x();
        if (appScreenshotListData.b && view.getResources().getBoolean(yp6.app_detail_tablet_land)) {
            dv2 dv2Var = this.y;
            if (dv2Var == null) {
                js3.V("graphicUtils");
                throw null;
            }
            if (dv2Var.c() == 2) {
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                int i2 = yq6.screenshot_shadow;
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
                drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
                g13 g13Var5 = this.A;
                if (g13Var5 == null) {
                    js3.V("binding");
                    throw null;
                }
                ImageView imageView = g13Var5.x;
                imageView.setImageDrawable(drawable);
                if (d04Var == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                imageView.setRotationY(d04Var.f() ? 180.0f : 0.0f);
                ImageView imageView2 = g13Var5.v;
                imageView2.setImageDrawable(drawable);
                if (d04Var == null) {
                    js3.V("languageHelper");
                    throw null;
                }
                imageView2.setRotationY(d04Var.f() ? 0.0f : 180.0f);
                uz6 uz6Var = this.C;
                if (uz6Var != null) {
                    g13 g13Var6 = this.A;
                    if (g13Var6 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    g13Var6.w.g0(uz6Var);
                }
                uz6 gpVar = this.C;
                if (gpVar == null) {
                    gpVar = new gp(1, this);
                    g13 g13Var7 = this.A;
                    if (g13Var7 == null) {
                        js3.V("binding");
                        throw null;
                    }
                    g13Var7.w.j(gpVar);
                }
                this.C = gpVar;
            }
        }
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        AppScreenshotListData appScreenshotListData = (AppScreenshotListData) myketRecyclerData;
        js3.p(appScreenshotListData, "data");
        g13 g13Var = this.A;
        if (g13Var == null) {
            js3.V("binding");
            throw null;
        }
        k layoutManager = g13Var.w.getLayoutManager();
        appScreenshotListData.c = layoutManager != null ? layoutManager.h0() : null;
        uz6 uz6Var = this.C;
        if (uz6Var != null) {
            g13 g13Var2 = this.A;
            if (g13Var2 == null) {
                js3.V("binding");
                throw null;
            }
            g13Var2.w.g0(uz6Var);
            this.C = null;
        }
        g13 g13Var3 = this.A;
        if (g13Var3 == null) {
            js3.V("binding");
            throw null;
        }
        View childAt = g13Var3.w.getChildAt(0);
        if (childAt != null) {
            g13 g13Var4 = this.A;
            if (g13Var4 == null) {
                js3.V("binding");
                throw null;
            }
            o oVarN = g13Var4.w.N(childAt);
            h hVar = oVarN instanceof h ? (h) oVarN : null;
            if (hVar != null) {
                hVar.x();
            }
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g13) {
            this.A = (g13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x() {
        g13 g13Var = this.A;
        if (g13Var == null) {
            js3.V("binding");
            throw null;
        }
        RecyclerView recyclerView = g13Var.w;
        recyclerView.getLayoutParams().height = this.a.getResources().getDimensionPixelSize(pq6.screenshot_height);
        recyclerView.setVerticalScrollBarEnabled(false);
        recyclerView.setHorizontalScrollBarEnabled(false);
    }
}
