package ir.mservices.market.app.update.recycler;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dp3;
import defpackage.js3;
import defpackage.lw8;
import defpackage.m88;
import defpackage.og5;
import defpackage.pg5;
import defpackage.qg5;
import defpackage.rr6;
import defpackage.s82;
import defpackage.vt;
import defpackage.xf5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.FastDownloadView;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.UpdateRatingView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends qg5 {
    public static final /* synthetic */ int X = 0;
    public final og5 A;
    public final s82 B;
    public lw8 C;
    public xf5 D;
    public dp3 E;
    public d04 F;
    public final AppIconView G;
    public final FrameLayout H;
    public final ConstraintLayout I;
    public final UpdateRatingView J;
    public final MyketTextView K;
    public final FrameLayout L;
    public final FastDownloadView M;
    public final MyketTextView N;
    public final FrameLayout O;
    public final MyketTextView P;
    public final MyketTextView Q;
    public final ImageView R;
    public final MyketTextView S;
    public final MyketTextView T;
    public final ConstraintLayout U;
    public final MyketRatingBar V;
    public String W;
    public final pg5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    public a(View view, pg5 pg5Var, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4, s82 s82Var) {
        super(view);
        this.w = pg5Var;
        this.x = og5Var;
        this.y = og5Var2;
        this.z = og5Var3;
        this.A = og5Var4;
        this.B = s82Var;
        this.G = (AppIconView) view.findViewById(rr6.app_icon);
        this.H = (FrameLayout) view.findViewById(rr6.app_card);
        this.I = (ConstraintLayout) view.findViewById(rr6.whats_new_layout);
        UpdateRatingView updateRatingView = (UpdateRatingView) view.findViewById(rr6.rating_section);
        this.J = updateRatingView;
        this.K = (MyketTextView) view.findViewById(rr6.app_name);
        this.L = (FrameLayout) view.findViewById(rr6.card_view);
        this.M = (FastDownloadView) view.findViewById(rr6.fast_download_view);
        this.N = (MyketTextView) view.findViewById(rr6.size);
        this.O = (FrameLayout) view.findViewById(rr6.arrow_layout);
        this.P = (MyketTextView) view.findViewById(rr6.ver_from);
        this.Q = (MyketTextView) view.findViewById(rr6.ver_to);
        this.R = (ImageView) view.findViewById(rr6.app_more);
        this.S = (MyketTextView) view.findViewById(rr6.whats_new_title);
        this.T = (MyketTextView) view.findViewById(rr6.whats_new_text);
        this.U = (ConstraintLayout) updateRatingView.findViewById(rr6.review_content);
        this.V = (MyketRatingBar) updateRatingView.findViewById(rr6.ratingbar);
        this.W = "";
    }

    public final void A(boolean z, boolean z2, ApplicationStateDto applicationStateDto) {
        UpdateRatingView updateRatingView = this.J;
        if (z && applicationStateDto != null && m88.T(applicationStateDto.getCommentState(), ApplicationStateDto.STATE_NO_COMMENT, true) && !z2) {
            js3.o(updateRatingView, "ratingSection");
            updateRatingView.setVisibility(0);
            updateRatingView.setData(applicationStateDto);
        } else {
            if (z2) {
                return;
            }
            js3.o(updateRatingView, "ratingSection");
            updateRatingView.setVisibility(8);
        }
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppUpdateData appUpdateData = (AppUpdateData) myketRecyclerData;
        js3.p(appUpdateData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new BaseAppUpdateViewHolder$onAttach$1(null, appUpdateData, this), 3);
        bt2.G(cc7.q(view), null, null, new BaseAppUpdateViewHolder$onAttach$2(null, appUpdateData, this), 3);
        bt2.G(cc7.q(view), null, null, new BaseAppUpdateViewHolder$onAttach$3(null, appUpdateData, this), 3);
        bt2.G(cc7.q(view), null, null, new BaseAppUpdateViewHolder$onAttach$4(null, appUpdateData, this), 3);
        bt2.G(cc7.q(view), null, null, new BaseAppUpdateViewHolder$onAttach$5(null, appUpdateData, this), 3);
        bt2.G(cc7.q(view), null, null, new BaseAppUpdateViewHolder$onAttach$6(null, appUpdateData, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(ir.mservices.market.app.update.recycler.AppUpdateData r39) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.recycler.a.x(ir.mservices.market.app.update.recycler.AppUpdateData):void");
    }

    public final void y(AppUpdateData appUpdateData, float f) {
        MyketRatingBar myketRatingBar = this.V;
        myketRatingBar.setRating(f);
        myketRatingBar.setUpdateRatingListener(new vt(appUpdateData, myketRatingBar, this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(boolean r11, ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.recycler.a.z(boolean, ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto, boolean, boolean):void");
    }
}
