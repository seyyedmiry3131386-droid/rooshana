package ir.mservices.market.social.profile.common.recycler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.m88;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.r63;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.mynet.view.HeaderInfoItemView;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.data.Relation;
import ir.mservices.market.social.profile.data.RelationsDto;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int C = 0;
    public final c5 A;
    public r63 B;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public final og5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4) {
        super(view);
        js3.p(view, "itemView");
        this.w = og5Var;
        this.x = og5Var2;
        this.y = og5Var3;
        this.z = og5Var4;
        w91 w91Var = (w91) qg5.r();
        this.A = (c5) w91Var.L.get();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ProfileHeaderData profileHeaderData = (ProfileHeaderData) myketRecyclerData;
        js3.p(profileHeaderData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new OwnProfileHeaderViewHolder$onAttach$1(null, this, profileHeaderData), 3);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof r63) {
            this.B = (r63) a79Var;
        } else {
            lw.g(null, "Binding is incompatible", null);
        }
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void t(ProfileHeaderData profileHeaderData) {
        Drawable drawable;
        js3.p(profileHeaderData, "data");
        AccountDto accountDto = profileHeaderData.c;
        y(profileHeaderData);
        r63 r63Var = this.B;
        if (r63Var == null) {
            js3.V("binding");
            throw null;
        }
        HeaderInfoItemView headerInfoItemView = r63Var.x;
        js3.o(headerInfoItemView, "follower");
        qg5.v(headerInfoItemView, this.w, this, profileHeaderData);
        r63 r63Var2 = this.B;
        if (r63Var2 == null) {
            js3.V("binding");
            throw null;
        }
        HeaderInfoItemView headerInfoItemView2 = r63Var2.y;
        js3.o(headerInfoItemView2, "following");
        qg5.v(headerInfoItemView2, this.x, this, profileHeaderData);
        r63 r63Var3 = this.B;
        if (r63Var3 == null) {
            js3.V("binding");
            throw null;
        }
        HeaderInfoItemView headerInfoItemView3 = r63Var3.z;
        js3.o(headerInfoItemView3, "level");
        qg5.v(headerInfoItemView3, this.y, this, profileHeaderData);
        String nickName = accountDto.getNickName();
        View view = this.a;
        if (nickName == null || f88.n0(nickName)) {
            nickName = view.getResources().getString(rs6.anonymous_user);
            js3.o(nickName, "getString(...)");
        }
        String str = nickName;
        r63 r63Var4 = this.B;
        if (r63Var4 == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = r63Var4.v;
        c5 c5Var = this.A;
        if (c5Var == null) {
            js3.V("accountManager");
            throw null;
        }
        if (m88.T(c5Var.h.e(), accountDto.getAccountKey(), true)) {
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            avatarImageView.setDefaultImage(cc7.s(context, false));
        }
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.header_avatar_size));
        AvatarImageView.setImage$default(avatarImageView, accountDto.getAvatarUrl(), str, null, Integer.valueOf(sj8.b().l), 4, null);
        r63 r63Var5 = this.B;
        if (r63Var5 == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView2 = r63Var5.v;
        js3.o(avatarImageView2, "avatar");
        qg5.v(avatarImageView2, this.z, this, profileHeaderData);
        r63 r63Var6 = this.B;
        if (r63Var6 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = r63Var6.A;
        myketTextView.setText(str);
        if (accountDto.isVerified()) {
            Resources resources = view.getResources();
            js3.o(resources, "getResources(...)");
            int i = yq6.ic_badge_verify;
            try {
                drawable = q39.a(resources, i, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resources.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().M, PorterDuff.Mode.MULTIPLY));
            int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.verify_icon_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            myketTextView.setCompoundDrawablesRelative(null, null, drawable, null);
            myketTextView.setCompoundDrawablePadding(view.getResources().getDimensionPixelSize(pq6.space_s));
        }
        r63 r63Var7 = this.B;
        if (r63Var7 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = r63Var7.w;
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var = new ea7(context2);
        ea7Var.j = false;
        ea7Var.h = view.getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var.i = sj8.b().v;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.backward_relation_height) / 2);
        myketTextView2.setBackgroundDrawable(ea7Var.a());
        Relation.Companion companion = Relation.Companion;
        RelationsDto relationsDto = profileHeaderData.b;
        myketTextView2.setVisibility(companion.getByValue(relationsDto != null ? relationsDto.getBackward() : null) != Relation.FOLLOW ? 8 : 0);
    }

    public final void y(ProfileHeaderData profileHeaderData) {
        r63 r63Var = this.B;
        if (r63Var == null) {
            js3.V("binding");
            throw null;
        }
        HeaderInfoItemView headerInfoItemView = r63Var.x;
        RelationsDto relationsDto = (RelationsDto) profileHeaderData.a.getValue();
        headerInfoItemView.setData(relationsDto != null ? relationsDto.getFollowerCount() : null, rs6.profile_header_followers);
        r63 r63Var2 = this.B;
        if (r63Var2 == null) {
            js3.V("binding");
            throw null;
        }
        HeaderInfoItemView headerInfoItemView2 = r63Var2.y;
        RelationsDto relationsDto2 = (RelationsDto) profileHeaderData.a.getValue();
        headerInfoItemView2.setData(relationsDto2 != null ? relationsDto2.getFolloweeCount() : null, profileHeaderData.d);
        r63 r63Var3 = this.B;
        if (r63Var3 != null) {
            r63Var3.z.setData(profileHeaderData.c.getXpLevel(), rs6.level_txt);
        } else {
            js3.V("binding");
            throw null;
        }
    }
}
