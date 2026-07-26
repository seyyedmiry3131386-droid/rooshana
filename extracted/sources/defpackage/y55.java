package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieReviewDto;
import ir.mservices.market.movie.ui.detail.review.MovieReviewData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class y55 extends qg5 {
    public final lw8 A;
    public l53 B;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y55(View view, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4) {
        super(view);
        js3.p(og5Var, "onLikeClickListener");
        js3.p(og5Var2, "onDisLikeClickListener");
        js3.p(og5Var3, "onProfileClickListener");
        js3.p(og5Var4, "onMenuClickListener");
        this.w = og5Var;
        this.x = og5Var2;
        this.y = og5Var3;
        this.z = og5Var4;
        w91 w91Var = (w91) qg5.r();
        this.A = (lw8) w91Var.E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieReviewData movieReviewData = (MovieReviewData) myketRecyclerData;
        js3.p(movieReviewData, "data");
        oi0 oi0Var = movieReviewData.c;
        MyketTextView myketTextView = x().y;
        MovieReviewDto movieReviewDto = movieReviewData.a;
        myketTextView.setText(movieReviewDto.getDate());
        AvatarImageView avatarImageView = x().v;
        View view = this.a;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.review_avatar_size));
        AvatarImageView.setImage$default(avatarImageView, movieReviewDto.getAvatarUrl(), movieReviewDto.getNickname(), null, null, 12, null);
        x().F.setText(movieReviewDto.getNickname());
        if (movieReviewDto.isLike()) {
            x().D.setText(view.getContext().getString(rs6.movie_liked));
            x().D.setTextColor(sj8.b().x);
        } else {
            x().D.setText(view.getContext().getString(rs6.movie_disliked));
            x().D.setTextColor(sj8.b().A);
        }
        MyketTextView myketTextView2 = x().w;
        String text = movieReviewDto.getText();
        myketTextView2.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        x().w.setText(movieReviewDto.getText());
        BuzzProgressImageView buzzProgressImageView = x().B;
        js3.o(buzzProgressImageView, "likeButton");
        BuzzProgressImageView.setImage$default(buzzProgressImageView, yq6.ic_like, false, 2, (Object) null);
        BuzzProgressImageView buzzProgressImageView2 = x().z;
        js3.o(buzzProgressImageView2, "dislikeButton");
        BuzzProgressImageView.setImage$default(buzzProgressImageView2, yq6.ic_dislike, false, 2, (Object) null);
        MyketTextView myketTextView3 = x().C;
        lw8 lw8Var = this.A;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView3.setText(lw8.e(lw8Var, String.valueOf(oi0Var != null ? oi0Var.b : movieReviewDto.getPositiveLikes())));
        MyketTextView myketTextView4 = x().A;
        lw8 lw8Var2 = this.A;
        if (lw8Var2 == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView4.setText(lw8.e(lw8Var2, String.valueOf(oi0Var != null ? oi0Var.c : movieReviewDto.getNegativeLikes())));
        Boolean bool = movieReviewData.d;
        boolean zI = js3.i(bool, Boolean.TRUE);
        og5 og5Var = this.x;
        if (zI) {
            x().B.setColor(sj8.b().x);
            x().z.setColor(sj8.b().n);
            x().B.setOnClickListener(null);
            BuzzProgressImageView buzzProgressImageView3 = x().z;
            js3.o(buzzProgressImageView3, "dislikeButton");
            qg5.v(buzzProgressImageView3, og5Var, this, movieReviewData);
        } else {
            boolean zI2 = js3.i(bool, Boolean.FALSE);
            og5 og5Var2 = this.w;
            if (zI2) {
                x().B.setColor(sj8.b().n);
                x().z.setColor(sj8.b().A);
                BuzzProgressImageView buzzProgressImageView4 = x().B;
                js3.o(buzzProgressImageView4, "likeButton");
                qg5.v(buzzProgressImageView4, og5Var2, this, movieReviewData);
                x().z.setOnClickListener(null);
            } else {
                x().B.setColor(sj8.b().n);
                x().z.setColor(sj8.b().n);
                BuzzProgressImageView buzzProgressImageView5 = x().B;
                js3.o(buzzProgressImageView5, "likeButton");
                qg5.v(buzzProgressImageView5, og5Var2, this, movieReviewData);
                BuzzProgressImageView buzzProgressImageView6 = x().z;
                js3.o(buzzProgressImageView6, "dislikeButton");
                qg5.v(buzzProgressImageView6, og5Var, this, movieReviewData);
            }
        }
        AvatarImageView avatarImageView2 = x().v;
        js3.o(avatarImageView2, "avatar");
        qg5.v(avatarImageView2, this.y, this, movieReviewData);
        x().E.setVisibility(0);
        x().E.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        MyketImageButton myketImageButton = x().E;
        js3.o(myketImageButton, "more");
        qg5.v(myketImageButton, this.z, this, movieReviewData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof l53) {
            this.B = (l53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final l53 x() {
        l53 l53Var = this.B;
        if (l53Var != null) {
            return l53Var;
        }
        js3.V("binding");
        throw null;
    }
}
