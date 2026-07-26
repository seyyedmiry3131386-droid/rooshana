package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.views.AvatarImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class b29 extends qg5 {
    public final int w;
    public final og5 x;
    public z19 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b29(View view, int i, z09 z09Var) {
        super(view);
        js3.p(z09Var, "onUserClickListener");
        this.w = i;
        this.x = z09Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        UserCardData userCardData = (UserCardData) myketRecyclerData;
        js3.p(userCardData, "data");
        UserDto userDto = userCardData.a;
        z19 z19Var = this.y;
        if (z19Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = z19Var.w;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.x, this, userCardData);
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.w;
        layoutParams.width = i;
        int dimensionPixelSize = i - view.getResources().getDimensionPixelSize(pq6.space_16);
        z19 z19Var2 = this.y;
        if (z19Var2 == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = z19Var2.v;
        avatarImageView.getLayoutParams().width = dimensionPixelSize;
        avatarImageView.getLayoutParams().height = dimensionPixelSize;
        avatarImageView.setSize(dimensionPixelSize);
        AvatarImageView.setImage$default(avatarImageView, userDto.getAvatarUrl(), userDto.getNickname(), null, null, 12, null);
        z19 z19Var3 = this.y;
        if (z19Var3 != null) {
            z19Var3.y.setText(userDto.getNickname());
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof z19) {
            this.y = (z19) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
