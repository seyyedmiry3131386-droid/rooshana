package ir.mservices.market.feedback.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.f92;
import defpackage.h99;
import defpackage.hh2;
import defpackage.j99;
import defpackage.js3;
import defpackage.l99;
import defpackage.lw;
import defpackage.n99;
import defpackage.og5;
import defpackage.p92;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.uploadImage.data.UploadImageDto;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.SmallFillBorderOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int A = 0;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public f92 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, p92 p92Var, p92 p92Var2, p92 p92Var3) {
        super(view);
        js3.p(p92Var, "onAttachButtonClickListener");
        js3.p(p92Var2, "onRemoveButtonClickListener");
        js3.p(p92Var3, "onEditButtonClickListener");
        this.w = p92Var;
        this.x = p92Var2;
        this.y = p92Var3;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        FeedbackAttachContentData feedbackAttachContentData = (FeedbackAttachContentData) myketRecyclerData;
        js3.p(feedbackAttachContentData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new FeedbackAttachContentViewHolder$onAttach$1(feedbackAttachContentData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new FeedbackAttachContentViewHolder$onAttach$2(feedbackAttachContentData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        FeedbackAttachContentData feedbackAttachContentData = (FeedbackAttachContentData) myketRecyclerData;
        js3.p(feedbackAttachContentData, "data");
        Drawable background = x().B.getBackground();
        int i = sj8.b().q;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(i, mode));
        x().w.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().w, mode));
        ConstraintLayout constraintLayout = x().C;
        View view = this.a;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.j = false;
        ea7Var.i = sj8.b().v;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_8));
        constraintLayout.setBackground(ea7Var.a());
        x().z.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().c, mode));
        x().x.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().c, mode));
        SmallFillBorderOvalButton smallFillBorderOvalButton = x().v;
        smallFillBorderOvalButton.setButtonTextColor(sj8.b().c);
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_upload_attachment;
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
        smallFillBorderOvalButton.setIconWithCompoundDrawables(drawable);
        smallFillBorderOvalButton.setText(smallFillBorderOvalButton.getResources().getString(rs6.feedback_add_screenshot));
        smallFillBorderOvalButton.setColors(sj8.b().q, sj8.b().c);
        y((n99) feedbackAttachContentData.b.getValue());
        SmallFillBorderOvalButton smallFillBorderOvalButton2 = x().v;
        js3.o(smallFillBorderOvalButton2, "attach");
        qg5.v(smallFillBorderOvalButton2, this.w, this, feedbackAttachContentData);
        ImageButton imageButton = x().z;
        js3.o(imageButton, AppStatusDto.Type.REMOVE);
        qg5.v(imageButton, this.x, this, feedbackAttachContentData);
        ImageButton imageButton2 = x().x;
        js3.o(imageButton2, "edit");
        qg5.v(imageButton2, this.y, this, feedbackAttachContentData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof f92) {
            this.z = (f92) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final f92 x() {
        f92 f92Var = this.z;
        if (f92Var != null) {
            return f92Var;
        }
        js3.V("binding");
        throw null;
    }

    public final void y(n99 n99Var) {
        boolean z = n99Var instanceof l99;
        View view = this.a;
        if (z) {
            LoadingView loadingView = x().D;
            js3.o(loadingView, "screenshotLoading");
            loadingView.setVisibility(8);
            x().w.setVisibility(4);
            CardView cardView = x().B;
            js3.o(cardView, "screenshotBg");
            cardView.setVisibility(0);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(((UploadImageDto) ((l99) n99Var).a).getFilePath());
            ImageView imageView = x().A;
            imageView.setImageBitmap(bitmapDecodeFile);
            imageView.setClickable(true);
            imageView.setEnabled(true);
            Context context = view.getContext();
            hh2.H(new hh2(context, context != null ? context.getString(rs6.upload_successful) : null));
            return;
        }
        if (n99Var instanceof h99) {
            LoadingView loadingView2 = x().D;
            js3.o(loadingView2, "screenshotLoading");
            loadingView2.setVisibility(8);
            ConstraintLayout constraintLayout = x().w;
            js3.o(constraintLayout, "attachContent");
            constraintLayout.setVisibility(0);
            CardView cardView2 = x().B;
            js3.o(cardView2, "screenshotBg");
            cardView2.setVisibility(8);
            ImageView imageView2 = x().A;
            imageView2.setImageBitmap(null);
            imageView2.setClickable(true);
            imageView2.setEnabled(true);
            ((h99) n99Var).a.assertToastMessage(view.getContext());
            return;
        }
        if (n99Var instanceof j99) {
            LoadingView loadingView3 = x().D;
            js3.o(loadingView3, "screenshotLoading");
            loadingView3.setVisibility(0);
            x().w.setVisibility(4);
            CardView cardView3 = x().B;
            js3.o(cardView3, "screenshotBg");
            cardView3.setVisibility(0);
            UploadImageDto uploadImageDto = (UploadImageDto) ((j99) n99Var).a;
            Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(uploadImageDto != null ? uploadImageDto.getFilePath() : null);
            ImageView imageView3 = x().A;
            imageView3.setImageBitmap(bitmapDecodeFile2);
            imageView3.setClickable(false);
            imageView3.setEnabled(false);
        }
    }
}
