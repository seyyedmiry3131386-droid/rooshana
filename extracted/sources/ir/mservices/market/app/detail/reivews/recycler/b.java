package ir.mservices.market.app.detail.reivews.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.ap;
import defpackage.b77;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.cy5;
import defpackage.ja1;
import defpackage.js3;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.pi0;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tx8;
import defpackage.w91;
import defpackage.y63;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallRegularTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public static final /* synthetic */ int E = 0;
    public final c5 A;
    public final lw8 B;
    public final pi0 C;
    public y63 D;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, og5 og5Var, ap apVar, og5 og5Var2, og5 og5Var3) {
        super(view);
        js3.p(og5Var, "onEditClickListener");
        js3.p(og5Var2, "onDeveloperLikeClickListener");
        js3.p(og5Var3, "onDeveloperDislikeClickListener");
        this.w = og5Var;
        this.x = apVar;
        this.y = og5Var2;
        this.z = og5Var3;
        w91 w91Var = (w91) qg5.r();
        this.A = (c5) w91Var.L.get();
        this.B = (lw8) w91Var.E.get();
        this.C = (pi0) w91Var.F0.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        OwnReviewData ownReviewData = (OwnReviewData) myketRecyclerData;
        js3.p(ownReviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new OwnReviewViewHolder$onAttach$1(ownReviewData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new OwnReviewViewHolder$onAttach$2(ownReviewData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        tx8 tx8Var;
        ReviewDto developerReply;
        OwnReviewData ownReviewData = (OwnReviewData) myketRecyclerData;
        js3.p(ownReviewData, "data");
        String str = ownReviewData.a;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int i = 0;
        x().l.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Drawable background = x().K.getBackground();
        int i2 = sj8.b().q;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(i2, mode));
        if (!yq2.o0(view.getContext())) {
            ViewGroup.LayoutParams layoutParams = x().K.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getResources().getDimensionPixelSize(ownReviewData.f);
        }
        x().L.setImage(yq6.ic_like, false);
        x().H.setImage(yq6.ic_dislike, false);
        SmallRegularTextButton smallRegularTextButton = x().J;
        js3.o(smallRegularTextButton, "editComment");
        qg5.v(smallRegularTextButton, this.w, this, ownReviewData);
        og5 og5Var = this.x;
        qg5.v(view, og5Var, this, ownReviewData);
        z(ownReviewData);
        x().Q.setTextColor(sj8.b().n);
        SmallRegularTextButton smallRegularTextButton2 = x().Q;
        js3.o(smallRegularTextButton2, "showComment");
        qg5.v(smallRegularTextButton2, og5Var, this, ownReviewData);
        MyketTextView myketTextView = x().O;
        js3.m(myketTextView);
        c5 c5Var = this.A;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        myketTextView.setVisibility(c5Var.f() ? 0 : 8);
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        myketTextView.setText(c5Var.c());
        SmallRegularTextButton smallRegularTextButton3 = x().J;
        smallRegularTextButton3.setText(view.getResources().getString(rs6.edit_comment));
        smallRegularTextButton3.setPrimaryColor(sj8.b().n);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i3 = yq6.ic_edit;
        try {
            drawable = q39.a(resources, i3, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i3, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i3, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        smallRegularTextButton3.setBigIcon(drawable);
        smallRegularTextButton3.setTextColor(sj8.b().n);
        ConstraintLayout constraintLayout = x().D;
        js3.o(constraintLayout, "developerLayout");
        ReviewDto reviewDto = (ReviewDto) ownReviewData.b.getValue();
        int i4 = 1;
        if (reviewDto == null || (developerReply = reviewDto.getDeveloperReply()) == null) {
            tx8Var = null;
        } else {
            ConstraintLayout constraintLayout2 = x().D;
            constraintLayout2.setBackgroundResource(yq6.review_bg);
            constraintLayout2.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().t, mode));
            MyketTextView myketTextView2 = x().z;
            js3.o(myketTextView2, "developerComment");
            MyketTextView.setExpandableText$default(myketTextView2, developerReply.getComment(), null, 2, false, ownReviewData.e, null, 42, null);
            x().A.setText(developerReply.getCreationDate());
            BuzzProgressImageView buzzProgressImageView = x().E;
            js3.m(buzzProgressImageView);
            BuzzProgressImageView.setImage$default(buzzProgressImageView, yq6.ic_like, false, 2, (Object) null);
            buzzProgressImageView.setOnLongClickListener(new cy5(i));
            BuzzProgressImageView buzzProgressImageView2 = x().B;
            js3.m(buzzProgressImageView2);
            BuzzProgressImageView.setImage$default(buzzProgressImageView2, yq6.ic_dislike, false, 2, (Object) null);
            buzzProgressImageView2.setOnLongClickListener(new cy5(i4));
            pi0 pi0Var = this.C;
            if (pi0Var == null) {
                js3.V("buzzManager");
                throw null;
            }
            Boolean boolC = pi0Var.c(str, developerReply.getId(), developerReply.getParentId());
            Boolean bool = Boolean.TRUE;
            boolean zI = js3.i(boolC, bool);
            x().F.setText(lw8.e(y(), developerReply.getPositiveLikes() != 0 ? String.valueOf(developerReply.getPositiveLikes() + (zI ? 1 : 0)) : String.valueOf(zI ? 1 : 0)));
            if (pi0Var == null) {
                js3.V("buzzManager");
                throw null;
            }
            Boolean boolC2 = pi0Var.c(str, developerReply.getId(), developerReply.getParentId());
            Boolean bool2 = Boolean.FALSE;
            boolean zI2 = js3.i(boolC2, bool2);
            x().C.setText(lw8.e(y(), developerReply.getNegativeLikes() != 0 ? String.valueOf(developerReply.getNegativeLikes() + (zI2 ? 1 : 0)) : String.valueOf(zI2 ? 1 : 0)));
            OwnReviewData ownReviewData2 = new OwnReviewData(ownReviewData.a, ja1.b(developerReply), 0, ownReviewData.g, 180);
            if (pi0Var == null) {
                js3.V("buzzManager");
                throw null;
            }
            Boolean boolC3 = pi0Var.c(str, developerReply.getId(), developerReply.getParentId());
            boolean zI3 = js3.i(boolC3, bool);
            og5 og5Var2 = this.z;
            if (zI3) {
                x().E.setColor(sj8.b().x);
                x().B.setColor(sj8.b().n);
                x().E.setOnClickListener(null);
                BuzzProgressImageView buzzProgressImageView3 = x().B;
                js3.o(buzzProgressImageView3, "developerDislike");
                qg5.v(buzzProgressImageView3, og5Var2, this, ownReviewData2);
            } else {
                boolean zI4 = js3.i(boolC3, bool2);
                og5 og5Var3 = this.y;
                if (zI4) {
                    x().E.setColor(sj8.b().n);
                    x().B.setColor(sj8.b().A);
                    x().B.setOnClickListener(null);
                    BuzzProgressImageView buzzProgressImageView4 = x().E;
                    js3.o(buzzProgressImageView4, "developerLike");
                    qg5.v(buzzProgressImageView4, og5Var3, this, ownReviewData2);
                } else {
                    x().E.setColor(sj8.b().n);
                    x().B.setColor(sj8.b().n);
                    BuzzProgressImageView buzzProgressImageView5 = x().E;
                    js3.o(buzzProgressImageView5, "developerLike");
                    qg5.v(buzzProgressImageView5, og5Var3, this, ownReviewData2);
                    BuzzProgressImageView buzzProgressImageView6 = x().B;
                    js3.o(buzzProgressImageView6, "developerDislike");
                    qg5.v(buzzProgressImageView6, og5Var2, this, ownReviewData2);
                }
            }
            tx8Var = tx8.a;
        }
        constraintLayout.setVisibility(tx8Var != null ? 0 : 8);
        if (c5Var != null) {
            c5Var.g(x().v, true);
        } else {
            js3.V("accountManager");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof y63) {
            this.D = (y63) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final y63 x() {
        y63 y63Var = this.D;
        if (y63Var != null) {
            return y63Var;
        }
        js3.V("binding");
        throw null;
    }

    public final lw8 y() {
        lw8 lw8Var = this.B;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void z(OwnReviewData ownReviewData) {
        String strE;
        String strE2;
        ReviewDto reviewDto = (ReviewDto) ownReviewData.b.getValue();
        if (reviewDto != null) {
            boolean z = reviewDto.isHasSubComment() && ownReviewData.c;
            View view = x().N;
            js3.o(view, "line");
            int i = 8;
            view.setVisibility(z ? 0 : 8);
            SmallRegularTextButton smallRegularTextButton = x().Q;
            js3.o(smallRegularTextButton, "showComment");
            smallRegularTextButton.setVisibility(z ? 0 : 8);
            MyketRatingBar myketRatingBar = x().P;
            myketRatingBar.setRating(reviewDto.getRate());
            myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.h, true, 0);
            x().y.setText(reviewDto.getCreationDate());
            MyketTextView myketTextView = x().w;
            js3.m(myketTextView);
            String comment = reviewDto.getComment();
            if (comment != null && comment.length() != 0) {
                i = 0;
            }
            myketTextView.setVisibility(i);
            int i2 = ownReviewData.h;
            if (i2 == -1) {
                i2 = 10;
            }
            MyketTextView.setExpandableText$default(myketTextView, reviewDto.getComment(), null, i2, false, ownReviewData.e, null, 42, null);
            MyketTextView myketTextView2 = x().M;
            if (reviewDto.getPositiveLikes() != 0) {
                lw8 lw8VarY = y();
                int positiveLikes = reviewDto.getPositiveLikes();
                StringBuilder sb = new StringBuilder();
                sb.append(positiveLikes);
                strE = lw8.e(lw8VarY, sb.toString());
            } else {
                strE = lw8.e(y(), "0");
            }
            myketTextView2.setText(strE);
            MyketTextView myketTextView3 = x().I;
            if (reviewDto.getNegativeLikes() != 0) {
                lw8 lw8VarY2 = y();
                int negativeLikes = reviewDto.getNegativeLikes();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(negativeLikes);
                strE2 = lw8.e(lw8VarY2, sb2.toString());
            } else {
                strE2 = lw8.e(y(), "0");
            }
            myketTextView3.setText(strE2);
            int subCommentsCount = reviewDto.getSubCommentsCount();
            View view2 = this.a;
            if (subCommentsCount > 0) {
                x().Q.setText(view2.getResources().getString(rs6.show_all_sub_comment_with_total, Integer.valueOf(reviewDto.getSubCommentsCount())));
            } else {
                x().Q.setText(view2.getResources().getString(rs6.show_all_sub_comment));
            }
        }
    }
}
