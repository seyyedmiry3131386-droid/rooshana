package ir.mservices.market.app.detail.reivews.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.cy5;
import defpackage.f88;
import defpackage.js3;
import defpackage.lt5;
import defpackage.lw;
import defpackage.lw8;
import defpackage.m88;
import defpackage.og5;
import defpackage.pi0;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tx8;
import defpackage.w50;
import defpackage.w91;
import defpackage.x87;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallRegularTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends qg5 {
    public static final /* synthetic */ int H = 0;
    public final og5 A;
    public final og5 B;
    public final og5 C;
    public final c5 D;
    public final lw8 E;
    public final pi0 F;
    public x87 G;
    public final lt5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, lt5 lt5Var, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4, og5 og5Var5, og5 og5Var6) {
        super(view);
        js3.p(lt5Var, "onMenuListener");
        js3.p(og5Var2, "onReplyClickListener");
        js3.p(og5Var3, "onLikeClickListener");
        js3.p(og5Var4, "onDislikeClickListener");
        js3.p(og5Var5, "onProfileClickListener");
        this.w = lt5Var;
        this.x = og5Var;
        this.y = og5Var2;
        this.z = og5Var3;
        this.A = og5Var4;
        this.B = og5Var5;
        this.C = og5Var6;
        w91 w91Var = (w91) qg5.r();
        this.D = (c5) w91Var.L.get();
        this.E = (lw8) w91Var.E.get();
        this.F = (pi0) w91Var.F0.get();
        view.getLayoutParams().width = -1;
    }

    public static void B(Boolean bool, BuzzProgressImageView buzzProgressImageView, BuzzProgressImageView buzzProgressImageView2) {
        if (js3.i(bool, Boolean.TRUE)) {
            buzzProgressImageView.setColor(sj8.b().x);
            buzzProgressImageView2.setColor(sj8.b().n);
        } else if (js3.i(bool, Boolean.FALSE)) {
            buzzProgressImageView.setColor(sj8.b().n);
            buzzProgressImageView2.setColor(sj8.b().A);
        } else {
            buzzProgressImageView.setColor(sj8.b().n);
            buzzProgressImageView2.setColor(sj8.b().n);
        }
    }

    public final void A(Boolean bool, BuzzProgressImageView buzzProgressImageView, BuzzProgressImageView buzzProgressImageView2, ReviewData reviewData) {
        c5 c5Var = this.D;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        if (m88.T(c5Var.h.e(), reviewData.a.getAccountKey(), true)) {
            buzzProgressImageView.setOnClickListener(null);
            buzzProgressImageView2.setOnClickListener(null);
            return;
        }
        boolean zI = js3.i(bool, Boolean.TRUE);
        og5 og5Var = this.A;
        if (zI) {
            buzzProgressImageView.setOnClickListener(null);
            qg5.v(buzzProgressImageView2, og5Var, this, reviewData);
            return;
        }
        boolean zI2 = js3.i(bool, Boolean.FALSE);
        og5 og5Var2 = this.z;
        if (zI2) {
            buzzProgressImageView2.setOnClickListener(null);
            qg5.v(buzzProgressImageView, og5Var2, this, reviewData);
        } else {
            qg5.v(buzzProgressImageView, og5Var2, this, reviewData);
            qg5.v(buzzProgressImageView2, og5Var, this, reviewData);
        }
    }

    public final void C(ReviewDto reviewDto, Boolean bool, MyketTextView myketTextView, MyketTextView myketTextView2) {
        String strValueOf;
        String strValueOf2;
        if (reviewDto.getPositiveLikes() != 0) {
            strValueOf = String.valueOf((Boolean.TRUE.equals(bool) ? 1 : 0) + reviewDto.getPositiveLikes());
        } else {
            strValueOf = String.valueOf(Boolean.TRUE.equals(bool) ? 1 : 0);
        }
        lw8 lw8Var = this.E;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8.e(lw8Var, strValueOf));
        if (reviewDto.getNegativeLikes() != 0) {
            strValueOf2 = String.valueOf((Boolean.FALSE.equals(bool) ? 1 : 0) + reviewDto.getNegativeLikes());
        } else {
            strValueOf2 = String.valueOf(Boolean.FALSE.equals(bool) ? 1 : 0);
        }
        lw8 lw8Var2 = this.E;
        if (lw8Var2 != null) {
            myketTextView2.setText(lw8.e(lw8Var2, strValueOf2));
        } else {
            js3.V("uiUtils");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ReviewData reviewData = (ReviewData) myketRecyclerData;
        js3.p(reviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ReviewViewHolder$onAttach$1(reviewData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int i;
        Drawable drawable;
        Drawable drawable2;
        ReviewData reviewData = (ReviewData) myketRecyclerData;
        js3.p(reviewData, "data");
        boolean z = reviewData.c;
        BuzzProgressImageView buzzProgressImageView = x().K;
        js3.o(buzzProgressImageView, "like");
        int i2 = 2;
        tx8 tx8Var = null;
        BuzzProgressImageView.setImage$default(buzzProgressImageView, yq6.ic_like, false, 2, (Object) null);
        BuzzProgressImageView buzzProgressImageView2 = x().I;
        js3.o(buzzProgressImageView2, "dislike");
        BuzzProgressImageView.setImage$default(buzzProgressImageView2, yq6.ic_dislike, false, 2, (Object) null);
        ReviewDto reviewDto = reviewData.a;
        String comment = reviewDto.getComment();
        if (comment == null || f88.n0(comment)) {
            MyketTextView myketTextView = x().w;
            js3.o(myketTextView, "comment");
            myketTextView.setVisibility(8);
        } else {
            int i3 = reviewData.h;
            int i4 = i3 != -1 ? i3 : Integer.MAX_VALUE;
            MyketTextView myketTextView2 = x().w;
            js3.o(myketTextView2, "comment");
            MyketTextView.setExpandableText$default(myketTextView2, reviewDto.getComment(), null, i4, false, false, null, 58, null);
        }
        x().N.setText(reviewDto.getNickname());
        MyketImageButton myketImageButton = x().M;
        js3.m(myketImageButton);
        myketImageButton.setVisibility(reviewData.d ? 0 : 8);
        Drawable drawableMutate = myketImageButton.getDrawable().mutate();
        int i5 = sj8.b().n;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i5, mode));
        myketImageButton.setOnClickListener(new w50(this, reviewData, 13));
        SmallRegularTextButton smallRegularTextButton = x().P;
        View view = this.a;
        if (z) {
            smallRegularTextButton.setPrimaryColor(sj8.b().n);
            Resources resources = view.getResources();
            js3.o(resources, "getResources(...)");
            int i6 = yq6.ic_reply_back;
            try {
                drawable2 = q39.a(resources, i6, null);
                if (drawable2 == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable2 = resources.getDrawable(i6, null);
                    if (drawable2 == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable2 = resources.getDrawable(i6, null);
                if (drawable2 == null) {
                    throw new Resources.NotFoundException();
                }
            }
            smallRegularTextButton.setBigIcon(drawable2);
            smallRegularTextButton.setTextColor(sj8.b().n);
            SmallRegularTextButton smallRegularTextButton2 = x().P;
            js3.o(smallRegularTextButton2, "reply");
            qg5.v(smallRegularTextButton2, this.y, this, reviewData);
            smallRegularTextButton.setVisibility(0);
        } else {
            smallRegularTextButton.setVisibility(8);
        }
        SmallRegularTextButton smallRegularTextButton3 = x().Q;
        if (reviewDto.isHasSubComment() && z && reviewData.e) {
            smallRegularTextButton3.setVisibility(0);
            smallRegularTextButton3.setTextColor(sj8.b().n);
            if (reviewDto.getSubCommentsCount() > 0) {
                smallRegularTextButton3.setText(view.getResources().getString(rs6.show_all_sub_comment_with_total, Integer.valueOf(reviewDto.getSubCommentsCount())));
            } else {
                smallRegularTextButton3.setText(rs6.show_all_sub_comment);
            }
            qg5.v(smallRegularTextButton3, this.C, this, reviewData);
        } else {
            smallRegularTextButton3.setVisibility(8);
        }
        MyketRatingBar myketRatingBar = x().O;
        myketRatingBar.setRating(reviewDto.getRate());
        myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.h, true, 0);
        FrameLayout frameLayout = x().y;
        js3.o(frameLayout, "container");
        og5 og5Var = this.x;
        qg5.v(frameLayout, og5Var, this, reviewData);
        x().x.setVisibility(!reviewDto.isOnLastVersion() ? 0 : 8);
        String creationDate = reviewDto.getCreationDate();
        if (creationDate == null || f88.n0(creationDate)) {
            creationDate = null;
        }
        if (creationDate != null) {
            x().z.setText(creationDate);
        }
        z(reviewData);
        AvatarImageView avatarImageView = x().v;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.review_avatar_size));
        AvatarImageView.setImage$default(avatarImageView, reviewDto.getAvatar(), reviewDto.getNickname(), null, null, 12, null);
        qg5.v(avatarImageView, this.B, this, reviewData);
        x().K.setOnLongClickListener(new cy5(i2));
        x().I.setOnLongClickListener(new cy5(3));
        ImageView imageView = x().R;
        if (reviewDto.isVerified()) {
            Resources resources2 = view.getResources();
            js3.o(resources2, "getResources(...)");
            int i7 = yq6.ic_badge_verify;
            try {
                drawable = q39.a(resources2, i7, null);
                if (drawable == null) {
                    ThreadLocal threadLocal3 = b77.a;
                    drawable = resources2.getDrawable(i7, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused2) {
                ThreadLocal threadLocal4 = b77.a;
                drawable = resources2.getDrawable(i7, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().M, mode));
            imageView.setImageDrawable(drawable);
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        ConstraintLayout constraintLayout = x().E;
        js3.o(constraintLayout, "developerLayout");
        ReviewDto developerReply = reviewDto.getDeveloperReply();
        if (developerReply != null) {
            ConstraintLayout constraintLayout2 = x().E;
            constraintLayout2.setBackgroundResource(yq6.review_bg);
            constraintLayout2.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().q, mode));
            int i8 = (yq2.n0(view.getContext()) || og5Var == null) ? Integer.MAX_VALUE : 3;
            MyketTextView myketTextView3 = x().A;
            js3.o(myketTextView3, "developerComment");
            MyketTextView.setExpandableText$default(myketTextView3, developerReply.getComment(), Integer.valueOf(sj8.b().c), i8, false, false, null, 56, null);
            x().B.setText(developerReply.getCreationDate());
            BuzzProgressImageView buzzProgressImageView3 = x().F;
            js3.m(buzzProgressImageView3);
            BuzzProgressImageView.setImage$default(buzzProgressImageView3, yq6.ic_like, false, 2, (Object) null);
            buzzProgressImageView3.setOnLongClickListener(new cy5(4));
            BuzzProgressImageView buzzProgressImageView4 = x().C;
            js3.m(buzzProgressImageView4);
            BuzzProgressImageView.setImage$default(buzzProgressImageView4, yq6.ic_dislike, false, 2, (Object) null);
            buzzProgressImageView4.setOnLongClickListener(new cy5(5));
            y(reviewData);
            tx8Var = tx8.a;
        }
        constraintLayout.setVisibility(tx8Var == null ? 8 : 0);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof x87) {
            this.G = (x87) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final x87 x() {
        x87 x87Var = this.G;
        if (x87Var != null) {
            return x87Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void y(ReviewData reviewData) {
        ReviewDto developerReply = reviewData.a.getDeveloperReply();
        if (developerReply != null) {
            pi0 pi0Var = this.F;
            if (pi0Var == null) {
                js3.V("buzzManager");
                throw null;
            }
            Boolean boolC = pi0Var.c(reviewData.b, developerReply.getId(), developerReply.getParentId());
            MyketTextView myketTextView = x().G;
            js3.o(myketTextView, "developerLikeLabel");
            MyketTextView myketTextView2 = x().D;
            js3.o(myketTextView2, "developerDislikeLabel");
            C(developerReply, boolC, myketTextView, myketTextView2);
            BuzzProgressImageView buzzProgressImageView = x().F;
            js3.o(buzzProgressImageView, "developerLike");
            BuzzProgressImageView buzzProgressImageView2 = x().C;
            js3.o(buzzProgressImageView2, "developerDislike");
            B(boolC, buzzProgressImageView, buzzProgressImageView2);
            BuzzProgressImageView buzzProgressImageView3 = x().F;
            js3.o(buzzProgressImageView3, "developerLike");
            BuzzProgressImageView buzzProgressImageView4 = x().C;
            js3.o(buzzProgressImageView4, "developerDislike");
            A(boolC, buzzProgressImageView3, buzzProgressImageView4, new ReviewData(developerReply, reviewData.b, false, null, 508));
        }
    }

    public final void z(ReviewData reviewData) {
        pi0 pi0Var = this.F;
        if (pi0Var == null) {
            js3.V("buzzManager");
            throw null;
        }
        String str = reviewData.b;
        ReviewDto reviewDto = reviewData.a;
        Boolean boolC = pi0Var.c(str, reviewDto.getId(), reviewDto.getParentId());
        MyketTextView myketTextView = x().L;
        js3.o(myketTextView, "likeLabel");
        MyketTextView myketTextView2 = x().J;
        js3.o(myketTextView2, "dislikeLabel");
        C(reviewDto, boolC, myketTextView, myketTextView2);
        BuzzProgressImageView buzzProgressImageView = x().K;
        js3.o(buzzProgressImageView, "like");
        BuzzProgressImageView buzzProgressImageView2 = x().I;
        js3.o(buzzProgressImageView2, "dislike");
        B(boolC, buzzProgressImageView, buzzProgressImageView2);
        BuzzProgressImageView buzzProgressImageView3 = x().K;
        js3.o(buzzProgressImageView3, "like");
        BuzzProgressImageView buzzProgressImageView4 = x().I;
        js3.o(buzzProgressImageView4, "dislike");
        A(boolC, buzzProgressImageView3, buzzProgressImageView4, reviewData);
    }
}
