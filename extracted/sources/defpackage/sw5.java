package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.data.StreamerDto;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class sw5 extends qg5 {
    public final int w;
    public final og5 x;
    public final lw8 y;
    public j63 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw5(int i, og5 og5Var, View view) {
        super(view);
        js3.p(og5Var, "onHorizontalUserClickListener");
        this.w = i;
        this.x = og5Var;
        this.y = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        OtherStreamerData otherStreamerData = (OtherStreamerData) myketRecyclerData;
        js3.p(otherStreamerData, "data");
        j63 j63Var = this.z;
        if (j63Var == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = j63Var.w;
        js3.o(frameLayout, "clickableLayout");
        qg5.v(frameLayout, this.x, this, otherStreamerData);
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.w;
        layoutParams.width = i;
        int dimensionPixelSize = i - view.getResources().getDimensionPixelSize(pq6.space_16);
        j63 j63Var2 = this.z;
        if (j63Var2 == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = j63Var2.v;
        avatarImageView.getLayoutParams().width = dimensionPixelSize;
        avatarImageView.getLayoutParams().height = dimensionPixelSize;
        avatarImageView.setSize(dimensionPixelSize);
        StreamerDto streamerDto = otherStreamerData.a;
        AvatarImageView.setImage$default(avatarImageView, streamerDto.getAvatarImageUrl(), streamerDto.getName(), null, null, 12, null);
        String name = streamerDto.getName();
        if (name == null || f88.n0(name)) {
            name = view.getResources().getString(rs6.anonymous_user);
            js3.o(name, "getString(...)");
        }
        j63 j63Var3 = this.z;
        if (j63Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = j63Var3.y;
        lw8 lw8Var = this.y;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8.e(lw8Var, streamerDto.getSecondaryTitle()));
        j63 j63Var4 = this.z;
        if (j63Var4 != null) {
            j63Var4.z.setText(name);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof j63) {
            this.z = (j63) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
