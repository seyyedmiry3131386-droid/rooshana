package ir.mservices.market.social.requests.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.m57;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x73;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.social.profile.data.ProfileTagDto;
import ir.mservices.market.social.profile.data.TagItem;
import ir.mservices.market.social.requests.data.AccountDto;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public x73 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, m57 m57Var, m57 m57Var2, m57 m57Var3) {
        super(view);
        js3.p(m57Var, "onRequestClickListener");
        js3.p(m57Var2, "onDismissClickListener");
        js3.p(m57Var3, "onApproveClickListener");
        this.w = m57Var;
        this.x = m57Var2;
        this.y = m57Var3;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        RequestAccountData requestAccountData = (RequestAccountData) myketRecyclerData;
        js3.p(requestAccountData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new RequestAccountViewHolder$onAttach$1(requestAccountData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new RequestAccountViewHolder$onAttach$2(requestAccountData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        TagItem followerCount;
        TagItem followerCount2;
        RequestAccountData requestAccountData = (RequestAccountData) myketRecyclerData;
        js3.p(requestAccountData, "data");
        AccountDto accountDto = requestAccountData.a;
        x73 x73Var = this.z;
        if (x73Var == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = x73Var.w;
        View view = this.a;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.profile_icon_size));
        String avatarUrl = accountDto.getAvatarUrl();
        String nickname = accountDto.getNickname();
        if (nickname == null || f88.n0(nickname)) {
            nickname = view.getResources().getString(rs6.anonymous_user);
            js3.o(nickname, "getString(...)");
        }
        AvatarImageView.setImage$default(avatarImageView, avatarUrl, nickname, null, null, 12, null);
        x73 x73Var2 = this.z;
        if (x73Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = x73Var2.z;
        String nickname2 = accountDto.getNickname();
        if (nickname2 == null || f88.n0(nickname2)) {
            nickname2 = view.getResources().getString(rs6.anonymous_user);
            js3.o(nickname2, "getString(...)");
        }
        myketTextView.setText(nickname2);
        x73 x73Var3 = this.z;
        if (x73Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = x73Var3.y;
        ProfileTagDto tag = accountDto.getTag();
        myketTextView2.setText((tag == null || (followerCount2 = tag.getFollowerCount()) == null) ? null : followerCount2.getText());
        ProfileTagDto tag2 = accountDto.getTag();
        String value = (tag2 == null || (followerCount = tag2.getFollowerCount()) == null) ? null : followerCount.getValue();
        myketTextView2.setVisibility((value == null || f88.n0(value)) ? 8 : 0);
        x73 x73Var4 = this.z;
        if (x73Var4 == null) {
            js3.V("binding");
            throw null;
        }
        SmallFillOvalButton smallFillOvalButton = x73Var4.x;
        smallFillOvalButton.setText(view.getResources().getString(rs6.dismiss_request));
        smallFillOvalButton.b(sj8.b().c);
        smallFillOvalButton.setBgColor(sj8.b().e);
        smallFillOvalButton.setButtonTextColor(sj8.b().i);
        smallFillOvalButton.setTextSize(smallFillOvalButton.getContext().getResources().getDimension(pq6.font_size_medium));
        x73 x73Var5 = this.z;
        if (x73Var5 == null) {
            js3.V("binding");
            throw null;
        }
        x73Var5.v.setText(view.getResources().getString(rs6.approve_request));
        x73 x73Var6 = this.z;
        if (x73Var6 == null) {
            js3.V("binding");
            throw null;
        }
        SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = x73Var6.v;
        js3.o(smallEmptyMediumTextOvalButton, "approve");
        qg5.v(smallEmptyMediumTextOvalButton, this.y, this, requestAccountData);
        x73 x73Var7 = this.z;
        if (x73Var7 == null) {
            js3.V("binding");
            throw null;
        }
        SmallFillOvalButton smallFillOvalButton2 = x73Var7.x;
        js3.o(smallFillOvalButton2, CommonDataKt.RESTRICTION_BUTTON_ACTION_DISMISS);
        qg5.v(smallFillOvalButton2, this.x, this, requestAccountData);
        qg5.v(view, this.w, this, requestAccountData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof x73) {
            this.z = (x73) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }
}
