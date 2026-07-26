package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.a;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class rc extends qg5 {
    public final og5 w;
    public final /* synthetic */ int x;
    public a79 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(int i, og5 og5Var, View view) {
        super(view);
        this.x = i;
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int i;
        String str;
        String str2;
        f57 f57VarH;
        Drawable drawable;
        String str3;
        String str4;
        f57 f57VarH2;
        String str5;
        String str6;
        f57 f57VarH3;
        int i2 = this.x;
        og5 og5Var = this.w;
        View view = this.a;
        switch (i2) {
            case 0:
                AddaxBoxData addaxBoxData = (AddaxBoxData) myketRecyclerData;
                js3.p(addaxBoxData, "data");
                boolean z = addaxBoxData.b;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_m);
                x().l.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                MyketTextView myketTextView = x().A;
                myketTextView.setTextColor(sj8.b().m);
                AddaxBoxDto addaxBoxDto = addaxBoxData.a;
                myketTextView.setText(addaxBoxDto.getTitle());
                MyketTextView myketTextView2 = x().z;
                myketTextView2.setTextColor(sj8.b().n);
                myketTextView2.setText(addaxBoxDto.getMessage());
                int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.space_8);
                ConstraintLayout constraintLayout = x().x;
                Context context = view.getContext();
                js3.o(context, "getContext(...)");
                ea7 ea7Var = new ea7(context);
                ea7Var.b = sj8.b().q;
                ea7Var.c(dimensionPixelSize3);
                ea7Var.h = 0;
                constraintLayout.setBackground(ea7Var.a());
                String iconUrl = addaxBoxDto.getIconUrl();
                if (iconUrl != null && !f88.n0(iconUrl)) {
                    String iconUrl2 = addaxBoxDto.getIconUrl();
                    if (iconUrl2 == null || f88.n0(iconUrl2)) {
                        str = null;
                        lw.g(null, "url is empty", null);
                        str2 = "empty_url";
                    } else {
                        str2 = iconUrl2;
                        str = null;
                    }
                    try {
                        f57VarH = a.f(view).q(new ne5(str2, str));
                        js3.m(f57VarH);
                    } catch (Exception unused) {
                        f57VarH = t61.h(str2, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
                    }
                    f57VarH.W(uv1.b()).L(new qc(0, this)).P(x().y);
                    i = 8;
                    break;
                } else {
                    ImageView imageView = x().y;
                    js3.o(imageView, "icon");
                    i = 8;
                    imageView.setVisibility(8);
                }
                String actionText = addaxBoxDto.getActionText();
                boolean z2 = actionText != null && (f88.n0(actionText) ^ true);
                SmallFillOvalButton smallFillOvalButton = x().v;
                js3.o(smallFillOvalButton, PackageListMetaDataDTO.KEY_ACTION);
                smallFillOvalButton.setVisibility(z2 ? 0 : i);
                View view2 = x().w;
                js3.o(view2, "clickView");
                if (z2) {
                    i = 0;
                }
                view2.setVisibility(i);
                x().w.setClickable(z2);
                x().w.setFocusable(z2);
                View view3 = x().w;
                js3.o(view3, "clickView");
                qg5.v(view3, og5Var, this, addaxBoxData);
                SmallFillOvalButton smallFillOvalButton2 = x().v;
                ThemeData themeDataB = sj8.b();
                smallFillOvalButton2.setBgColor(z ? themeDataB.j : themeDataB.c);
                x().v.setButtonTextColor(z ? sj8.b().k : sj8.b().d);
                x().v.setText(addaxBoxDto.getActionText());
                x().w.setBackground(y97.B(dimensionPixelSize3, 0, 2));
                return;
            case 1:
                AddaxBoxData addaxBoxData2 = (AddaxBoxData) myketRecyclerData;
                js3.p(addaxBoxData2, "data");
                int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
                int dimensionPixelSize5 = view.getResources().getDimensionPixelSize(pq6.space_m);
                y().l.setPadding(dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize5);
                ImageView imageView2 = y().y;
                js3.o(imageView2, "image");
                imageView2.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().H, PorterDuff.Mode.MULTIPLY));
                MyketTextView myketTextView3 = y().z;
                myketTextView3.setTextColor(sj8.b().n);
                AddaxBoxDto addaxBoxDto2 = addaxBoxData2.a;
                myketTextView3.setText(addaxBoxDto2.getMessage());
                int dimensionPixelSize6 = view.getResources().getDimensionPixelSize(pq6.space_8);
                ConstraintLayout constraintLayout2 = y().x;
                Context context2 = view.getContext();
                js3.o(context2, "getContext(...)");
                ea7 ea7Var2 = new ea7(context2);
                ea7Var2.b = sj8.b().q;
                ea7Var2.c(dimensionPixelSize6);
                ea7Var2.h = 0;
                constraintLayout2.setBackground(ea7Var2.a());
                String iconUrl3 = addaxBoxDto2.getIconUrl();
                if (iconUrl3 != null && !f88.n0(iconUrl3)) {
                    String iconUrl4 = addaxBoxDto2.getIconUrl();
                    if (iconUrl4 == null || f88.n0(iconUrl4)) {
                        str3 = null;
                        lw.g(null, "url is empty", null);
                        str4 = "empty_url";
                    } else {
                        str4 = iconUrl4;
                        str3 = null;
                    }
                    try {
                        f57VarH2 = a.f(view).q(new ne5(str4, str3));
                        js3.m(f57VarH2);
                    } catch (Exception unused2) {
                        f57VarH2 = t61.h(str4, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
                    }
                    ((f57) f57VarH2.W(uv1.b()).G(new gd2())).L(new qc(1, this)).P(y().y);
                    break;
                } else {
                    ImageView imageView3 = y().y;
                    js3.o(imageView3, "image");
                    imageView3.setVisibility(8);
                }
                String actionText2 = addaxBoxDto2.getActionText();
                boolean z3 = actionText2 != null && (f88.n0(actionText2) ^ true);
                BigTextButton bigTextButton = y().v;
                js3.o(bigTextButton, PackageListMetaDataDTO.KEY_ACTION);
                bigTextButton.setVisibility(z3 ? 0 : 8);
                View view4 = y().w;
                js3.o(view4, "clickView");
                view4.setVisibility(z3 ? 0 : 8);
                y().w.setClickable(z3);
                y().w.setFocusable(z3);
                View view5 = y().w;
                js3.o(view5, "clickView");
                qg5.v(view5, og5Var, this, addaxBoxData2);
                BigTextButton bigTextButton2 = y().v;
                int i3 = addaxBoxData2.b ? sj8.b().j : sj8.b().c;
                bigTextButton2.setTextColor(i3);
                bigTextButton2.setText(addaxBoxDto2.getActionText());
                Resources resources = view.getResources();
                js3.o(resources, "getResources(...)");
                int i4 = yq6.ic_arrow_end;
                try {
                    drawable = q39.a(resources, i4, null);
                    if (drawable == null) {
                        ThreadLocal threadLocal = b77.a;
                        drawable = resources.getDrawable(i4, null);
                        if (drawable == null) {
                            throw new Resources.NotFoundException();
                        }
                    }
                } catch (Exception unused3) {
                    ThreadLocal threadLocal2 = b77.a;
                    drawable = resources.getDrawable(i4, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
                Drawable drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
                bigTextButton2.setSmallIcon(drawableMutate);
                y().w.setBackground(y97.B(dimensionPixelSize6, 0, 2));
                return;
            default:
                AddaxBoxData addaxBoxData3 = (AddaxBoxData) myketRecyclerData;
                js3.p(addaxBoxData3, "data");
                boolean z4 = addaxBoxData3.b;
                int dimensionPixelSize7 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
                int dimensionPixelSize8 = view.getResources().getDimensionPixelSize(pq6.space_m);
                z().l.setPadding(dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize7, dimensionPixelSize8);
                z().y.setColorFilter(new PorterDuffColorFilter(sj8.b().H, PorterDuff.Mode.SRC_ATOP));
                MyketTextView myketTextView4 = z().A;
                myketTextView4.setTextColor(sj8.b().m);
                AddaxBoxDto addaxBoxDto3 = addaxBoxData3.a;
                myketTextView4.setText(addaxBoxDto3.getTitle());
                MyketTextView myketTextView5 = z().z;
                myketTextView5.setTextColor(sj8.b().n);
                myketTextView5.setText(addaxBoxDto3.getMessage());
                int dimensionPixelSize9 = view.getResources().getDimensionPixelSize(pq6.space_8);
                ConstraintLayout constraintLayout3 = z().x;
                Context context3 = view.getContext();
                js3.o(context3, "getContext(...)");
                ea7 ea7Var3 = new ea7(context3);
                ea7Var3.b = sj8.b().q;
                ea7Var3.c(dimensionPixelSize9);
                ea7Var3.h = 0;
                constraintLayout3.setBackground(ea7Var3.a());
                String iconUrl5 = addaxBoxDto3.getIconUrl();
                if (iconUrl5 != null && !f88.n0(iconUrl5)) {
                    String iconUrl6 = addaxBoxDto3.getIconUrl();
                    if (iconUrl6 == null || f88.n0(iconUrl6)) {
                        str5 = null;
                        lw.g(null, "url is empty", null);
                        str6 = "empty_url";
                    } else {
                        str6 = iconUrl6;
                        str5 = null;
                    }
                    try {
                        f57VarH3 = a.f(view).q(new ne5(str6, str5));
                        js3.m(f57VarH3);
                    } catch (Exception unused4) {
                        f57VarH3 = t61.h(str6, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
                    }
                    ((f57) f57VarH3.W(uv1.b()).G(new gd2())).L(new qc(2, this)).P(z().y);
                    break;
                } else {
                    ImageView imageView4 = z().y;
                    js3.o(imageView4, "image");
                    imageView4.setVisibility(8);
                }
                String actionText3 = addaxBoxDto3.getActionText();
                boolean z5 = actionText3 != null && (f88.n0(actionText3) ^ true);
                SmallFillOvalButton smallFillOvalButton3 = z().v;
                js3.o(smallFillOvalButton3, PackageListMetaDataDTO.KEY_ACTION);
                smallFillOvalButton3.setVisibility(z5 ? 0 : 8);
                View view6 = z().w;
                js3.o(view6, "clickView");
                view6.setVisibility(z5 ? 0 : 8);
                z().w.setClickable(z5);
                z().w.setFocusable(z5);
                View view7 = z().w;
                js3.o(view7, "clickView");
                qg5.v(view7, og5Var, this, addaxBoxData3);
                SmallFillOvalButton smallFillOvalButton4 = z().v;
                ThemeData themeDataB2 = sj8.b();
                smallFillOvalButton4.setBgColor(z4 ? themeDataB2.j : themeDataB2.c);
                SmallFillOvalButton smallFillOvalButton5 = z().v;
                ThemeData themeDataB3 = sj8.b();
                smallFillOvalButton5.setButtonTextColor(z4 ? themeDataB3.k : themeDataB3.d);
                z().v.setText(addaxBoxDto3.getActionText());
                z().w.setBackground(y97.B(dimensionPixelSize9, 0, 2));
                return;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.x) {
            case 0:
                if (!(a79Var instanceof kc)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (kc) a79Var;
                }
                break;
            case 1:
                if (!(a79Var instanceof mc)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (mc) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof oc)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.y = (oc) a79Var;
                }
                break;
        }
    }

    public kc x() {
        kc kcVar = (kc) this.y;
        if (kcVar != null) {
            return kcVar;
        }
        js3.V("binding");
        throw null;
    }

    public mc y() {
        mc mcVar = (mc) this.y;
        if (mcVar != null) {
            return mcVar;
        }
        js3.V("binding");
        throw null;
    }

    public oc z() {
        oc ocVar = (oc) this.y;
        if (ocVar != null) {
            return ocVar;
        }
        js3.V("binding");
        throw null;
    }
}
