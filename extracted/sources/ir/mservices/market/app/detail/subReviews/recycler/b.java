package ir.mservices.market.app.detail.subReviews.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cy5;
import defpackage.ft;
import defpackage.js3;
import defpackage.lt5;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.pi0;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q98;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.w50;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public static final /* synthetic */ int D = 0;
    public final lw8 A;
    public final pi0 B;
    public q98 C;
    public final lt5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, lt5 lt5Var, ft ftVar, ft ftVar2, ft ftVar3) {
        super(view);
        js3.p(ftVar, "onLikeClickListener");
        js3.p(ftVar2, "onDislikeClickListener");
        js3.p(ftVar3, "onProfileClickListener");
        this.w = lt5Var;
        this.x = ftVar;
        this.y = ftVar2;
        this.z = ftVar3;
        w91 w91Var = (w91) qg5.r();
        this.A = (lw8) w91Var.E.get();
        this.B = (pi0) w91Var.F0.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        SubReviewData subReviewData = (SubReviewData) myketRecyclerData;
        js3.p(subReviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new SubReviewViewHolder$onAttach$1(subReviewData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        SubReviewData subReviewData = (SubReviewData) myketRecyclerData;
        js3.p(subReviewData, "data");
        ReviewDto reviewDto = subReviewData.a;
        x().B.setBackgroundColor(sj8.b().N);
        BuzzProgressImageView buzzProgressImageView = x().C;
        js3.m(buzzProgressImageView);
        BuzzProgressImageView.setImage$default(buzzProgressImageView, yq6.ic_like, false, 2, (Object) null);
        buzzProgressImageView.setOnLongClickListener(new cy5(6));
        BuzzProgressImageView buzzProgressImageView2 = x().z;
        js3.m(buzzProgressImageView2);
        BuzzProgressImageView.setImage$default(buzzProgressImageView2, yq6.ic_dislike, false, 2, (Object) null);
        buzzProgressImageView2.setOnLongClickListener(new cy5(7));
        x().w.setText(reviewDto.getComment());
        x().F.setText(reviewDto.getNickname());
        MyketImageButton myketImageButton = x().E;
        myketImageButton.setVisibility(0);
        Drawable drawableMutate = myketImageButton.getDrawable().mutate();
        int i = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        myketImageButton.setOnClickListener(new w50(this, subReviewData, 14));
        MyketTextView myketTextView = x().x;
        js3.o(myketTextView, "commentOldVersion");
        myketTextView.setVisibility(!reviewDto.isOnLastVersion() ? 0 : 8);
        String creationDate = reviewDto.getCreationDate();
        if (creationDate != null && creationDate.length() != 0) {
            x().y.setText(reviewDto.getCreationDate());
        }
        y(subReviewData);
        AvatarImageView avatarImageView = x().v;
        View view = this.a;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.review_avatar_size));
        AvatarImageView.setImage$default(avatarImageView, reviewDto.getAvatar(), reviewDto.getNickname(), null, null, 12, null);
        AvatarImageView avatarImageView2 = x().v;
        js3.o(avatarImageView2, "avatar");
        qg5.v(avatarImageView2, this.z, this, subReviewData);
        qg5.v(view, null, this, subReviewData);
        ImageView imageView = x().G;
        js3.o(imageView, "verifyIcon");
        imageView.setVisibility(reviewDto.isVerified() ? 0 : 8);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_badge_verify;
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
        Drawable drawableMutate2 = drawable.mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(sj8.b().M, mode));
        x().G.setImageDrawable(drawableMutate2);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof q98) {
            this.C = (q98) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final q98 x() {
        q98 q98Var = this.C;
        if (q98Var != null) {
            return q98Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void y(SubReviewData subReviewData) {
        q98 q98VarX = x();
        BuzzProgressImageView buzzProgressImageView = q98VarX.z;
        BuzzProgressImageView buzzProgressImageView2 = q98VarX.C;
        ReviewDto reviewDto = subReviewData.a;
        int positiveLikes = reviewDto.getPositiveLikes();
        pi0 pi0Var = this.B;
        if (pi0Var == null) {
            js3.V("buzzManager");
            throw null;
        }
        Boolean boolC = pi0Var.c(subReviewData.b, reviewDto.getId(), reviewDto.getParentId());
        String strValueOf = positiveLikes != 0 ? String.valueOf((Boolean.TRUE.equals(boolC) ? 1 : 0) + positiveLikes) : String.valueOf(Boolean.TRUE.equals(boolC) ? 1 : 0);
        MyketTextView myketTextView = q98VarX.D;
        lw8 lw8Var = this.A;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8.e(lw8Var, strValueOf));
        int negativeLikes = reviewDto.getNegativeLikes();
        String strValueOf2 = negativeLikes != 0 ? String.valueOf((Boolean.FALSE.equals(boolC) ? 1 : 0) + negativeLikes) : String.valueOf(Boolean.FALSE.equals(boolC) ? 1 : 0);
        MyketTextView myketTextView2 = q98VarX.A;
        lw8 lw8Var2 = this.A;
        if (lw8Var2 == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView2.setText(lw8.e(lw8Var2, strValueOf2));
        boolean zI = js3.i(boolC, Boolean.TRUE);
        og5 og5Var = this.y;
        if (zI) {
            buzzProgressImageView2.setColor(sj8.b().x);
            buzzProgressImageView.setColor(sj8.b().n);
            buzzProgressImageView2.setOnClickListener(null);
            qg5.v(buzzProgressImageView, og5Var, this, subReviewData);
            return;
        }
        boolean zI2 = js3.i(boolC, Boolean.FALSE);
        og5 og5Var2 = this.x;
        if (zI2) {
            buzzProgressImageView2.setColor(sj8.b().n);
            buzzProgressImageView.setColor(sj8.b().A);
            buzzProgressImageView.setOnClickListener(null);
            qg5.v(buzzProgressImageView2, og5Var2, this, subReviewData);
            return;
        }
        buzzProgressImageView2.setColor(sj8.b().n);
        buzzProgressImageView.setColor(sj8.b().n);
        qg5.v(buzzProgressImageView2, og5Var2, this, subReviewData);
        qg5.v(buzzProgressImageView, og5Var, this, subReviewData);
    }
}
