package ir.mservices.market.social.profile.list.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.gl6;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.tf5;
import defpackage.w91;
import defpackage.x13;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.list.data.LikeSocialListDto;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public static final /* synthetic */ int C = 0;
    public x13 A;
    public final lw8 B;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, gl6 gl6Var, gl6 gl6Var2, gl6 gl6Var3, gl6 gl6Var4) {
        super(view);
        js3.p(gl6Var, "onChatClickListener");
        js3.p(gl6Var2, "onAddListToOwnClickListener");
        js3.p(gl6Var3, "onLikeClickListener");
        js3.p(gl6Var4, "onRemoveLikeClickListener");
        this.w = gl6Var;
        this.x = gl6Var2;
        this.y = gl6Var3;
        this.z = gl6Var4;
        this.B = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) myketRecyclerData;
        js3.p(profileListButtonsData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ProfileListButtonsViewHolder$onAttach$1(null, profileListButtonsData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) myketRecyclerData;
        js3.p(profileListButtonsData, "data");
        x13 x13Var = this.A;
        if (x13Var == null) {
            js3.V("binding");
            throw null;
        }
        ImageView imageView = x13Var.v;
        ImageView imageView2 = x13Var.w;
        js3.m(imageView2);
        boolean z = false;
        imageView2.setVisibility(profileListButtonsData.d != null ? 0 : 8);
        int i = sj8.b().n;
        Drawable drawableMutate = imageView2.getDrawable().mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        js3.m(imageView);
        imageView.setVisibility(profileListButtonsData.e ? 8 : 0);
        imageView.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, mode));
        x13Var.x.setOnClickListener(new tf5(this, profileListButtonsData, x13Var, 3));
        LikeSocialListDto likeSocialListDto = profileListButtonsData.g;
        if (likeSocialListDto != null && likeSocialListDto.isLiked()) {
            z = true;
        }
        x(z);
        qg5.v(imageView2, this.w, this, profileListButtonsData);
        qg5.v(imageView, this.x, this, profileListButtonsData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof x13) {
            this.A = (x13) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(boolean z) {
        x13 x13Var = this.A;
        if (x13Var == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = x13Var.x;
        lottieAnimationView.setImageResource(z ? yq6.ic_heart_red : yq6.ic_heart_outline);
        if (z) {
            return;
        }
        lottieAnimationView.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
    }

    public final void y(String str) {
        x13 x13Var = this.A;
        if (x13Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = x13Var.y;
        lw8 lw8Var = this.B;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        if (str == null) {
            str = "0";
        }
        myketTextView.setText(lw8.e(lw8Var, str));
    }
}
