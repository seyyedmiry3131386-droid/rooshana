package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.a;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class av4 extends qg5 {
    public final og5 w;
    public vu4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av4(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onItemClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int i;
        Drawable drawable;
        f57 f57VarH;
        MessageBoxData messageBoxData = (MessageBoxData) myketRecyclerData;
        js3.p(messageBoxData, "messageBoxData");
        MessageBoxDto messageBoxDto = messageBoxData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_16);
        vu4 vu4Var = this.x;
        if (vu4Var == null) {
            js3.V("binding");
            throw null;
        }
        vu4Var.l.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.space_8);
        int dimensionPixelSize4 = view.getResources().getDimensionPixelSize(pq6.border_size);
        lw.d(null, null, messageBoxDto);
        lw.c(messageBoxDto.getText(), null);
        vu4 vu4Var2 = this.x;
        if (vu4Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = vu4Var2.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize3);
        ea7Var.h = dimensionPixelSize4;
        ea7Var.i = sj8.b().v;
        frameLayout.setBackground(ea7Var.a());
        vu4 vu4Var3 = this.x;
        if (vu4Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = vu4Var3.y;
        js3.o(myketTextView, ConfirmDTO.INPUT_TYPE_TEXT);
        MyketTextView.setTextFromHtml$default(myketTextView, messageBoxDto.getText(), 2, null, null, false, 28, null);
        String lineColor = messageBoxDto.getLineColor();
        if (lineColor == null || f88.n0(lineColor)) {
            vu4 vu4Var4 = this.x;
            if (vu4Var4 == null) {
                js3.V("binding");
                throw null;
            }
            vu4Var4.y.setTextColor(sj8.b().m);
            vu4 vu4Var5 = this.x;
            if (vu4Var5 == null) {
                js3.V("binding");
                throw null;
            }
            vu4Var5.w.setVisibility(8);
        } else {
            vu4 vu4Var6 = this.x;
            if (vu4Var6 == null) {
                js3.V("binding");
                throw null;
            }
            vu4Var6.y.setTextColor(Color.parseColor(messageBoxDto.getLineColor()));
            vu4 vu4Var7 = this.x;
            if (vu4Var7 == null) {
                js3.V("binding");
                throw null;
            }
            vu4Var7.w.setVisibility(0);
        }
        vu4 vu4Var8 = this.x;
        if (vu4Var8 == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = vu4Var8.w;
        js3.o(imageView, "icon");
        String iconUrl = messageBoxDto.getIconUrl();
        if (iconUrl == null || f88.n0(iconUrl)) {
            i = 8;
        } else {
            String lineColor2 = messageBoxDto.getLineColor();
            int color = (lineColor2 == null || f88.n0(lineColor2)) ? sj8.b().n : Color.parseColor(messageBoxDto.getLineColor());
            String iconUrl2 = messageBoxDto.getIconUrl();
            if (iconUrl2 == null || f88.n0(iconUrl2)) {
                lw.g(null, "url is empty", null);
                iconUrl2 = "empty_url";
            }
            try {
                f57 f57VarQ = a.f(view).q(new ne5(iconUrl2, null));
                js3.m(f57VarQ);
                f57VarH = f57VarQ;
            } catch (Exception unused) {
                f57VarH = t61.h(iconUrl2, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            vu4 vu4Var9 = this.x;
            if (vu4Var9 == null) {
                js3.V("binding");
                throw null;
            }
            ImageView imageView2 = vu4Var9.w;
            js3.o(imageView2, "icon");
            f57VarH.Q(new av0(imageView2, Integer.valueOf(color)), f57VarH);
            i = 0;
        }
        imageView.setVisibility(i);
        String actionText = messageBoxDto.getActionText();
        if (actionText == null || f88.n0(actionText)) {
            vu4 vu4Var10 = this.x;
            if (vu4Var10 == null) {
                js3.V("binding");
                throw null;
            }
            vu4Var10.x.setVisibility(8);
        } else {
            Resources resources = view.getResources();
            js3.o(resources, "getResources(...)");
            int i2 = yq6.ic_arrow_end;
            try {
                drawable = q39.a(resources, i2, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resources.getDrawable(i2, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused2) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
            vu4 vu4Var11 = this.x;
            if (vu4Var11 == null) {
                js3.V("binding");
                throw null;
            }
            vu4Var11.x.setSmallIcon(drawableMutate);
            vu4 vu4Var12 = this.x;
            if (vu4Var12 == null) {
                js3.V("binding");
                throw null;
            }
            SmallBoldTextButton smallBoldTextButton = vu4Var12.x;
            smallBoldTextButton.setText(messageBoxDto.getActionText());
            smallBoldTextButton.setTextColor(messageBoxData.b);
            smallBoldTextButton.setVisibility(0);
        }
        String action = messageBoxDto.getAction();
        if (action == null || f88.n0(action)) {
            return;
        }
        vu4 vu4Var13 = this.x;
        if (vu4Var13 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout2 = vu4Var13.v;
        frameLayout2.setClickable(true);
        frameLayout2.setFocusable(true);
        vu4 vu4Var14 = this.x;
        if (vu4Var14 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout3 = vu4Var14.v;
        js3.o(frameLayout3, "content");
        qg5.v(frameLayout3, this.w, this, messageBoxData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof vu4) {
            this.x = (vu4) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
