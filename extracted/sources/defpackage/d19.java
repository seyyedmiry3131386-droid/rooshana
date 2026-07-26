package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.mynet.view.UserInfoTagsView;
import ir.mservices.market.social.profile.data.ProfileTagDto;
import ir.mservices.market.social.profile.data.TagItem;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class d19 extends qg5 {
    public final int w;
    public final og5 x;
    public final lw8 y;
    public b19 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d19(int i, og5 og5Var, View view) {
        super(view);
        js3.p(og5Var, "onHorizontalUserClickListener");
        this.w = i;
        this.x = og5Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        TagItem followerCount;
        UserCardData userCardData = (UserCardData) myketRecyclerData;
        js3.p(userCardData, "data");
        FrameLayout frameLayout = x().w;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.x, this, userCardData);
        View view = this.a;
        view.getLayoutParams().width = this.w;
        UserDto userDto = userCardData.a;
        String nickname = userDto.getNickname();
        if (nickname == null || f88.n0(nickname)) {
            nickname = view.getResources().getString(rs6.anonymous_user);
            js3.o(nickname, "getString(...)");
        }
        String str = nickname;
        AvatarImageView avatarImageView = x().v;
        avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.profile_icon_size));
        AvatarImageView.setImage$default(avatarImageView, userDto.getAvatarUrl(), str, null, null, 12, null);
        x().y.setText(str);
        MyketTextView myketTextView = x().x;
        lw8 lw8Var = this.y;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        ProfileTagDto tags = userDto.getTags();
        myketTextView.setText(lw8.e(lw8Var, (tags == null || (followerCount = tags.getFollowerCount()) == null) ? null : followerCount.getText()));
        ProfileTagDto tags2 = userDto.getTags();
        myketTextView.setVisibility((tags2 != null ? tags2.getFollowerCount() : null) != null ? 0 : 8);
        ProfileTagDto tags3 = userDto.getTags();
        UserInfoTagsView userInfoTagsView = x().A;
        js3.o(userInfoTagsView, "tags");
        UserInfoTagsView.setTags$default(userInfoTagsView, null, null, tags3 != null ? tags3.getRegister() : null, null, 11, null);
        x().A.setMargin(view.getResources().getDimensionPixelSize(pq6.space_4));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof b19) {
            this.z = (b19) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final b19 x() {
        b19 b19Var = this.z;
        if (b19Var != null) {
            return b19Var;
        }
        js3.V("binding");
        throw null;
    }
}
