package defpackage;

import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.recycler.StreamerAvatarData;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class t68 extends qg5 {
    public r68 w;

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        StreamerAvatarData streamerAvatarData = (StreamerAvatarData) myketRecyclerData;
        js3.p(streamerAvatarData, "data");
        r68 r68Var = this.w;
        if (r68Var == null) {
            js3.V("binding");
            throw null;
        }
        AvatarImageView avatarImageView = r68Var.v;
        avatarImageView.setSize(this.a.getResources().getDimensionPixelSize(pq6.streamer_avatar_icon));
        AvatarImageView.setImage$default(avatarImageView, streamerAvatarData.b, streamerAvatarData.a, null, null, 12, null);
        MyketTextView myketTextView = r68Var.w;
        js3.o(myketTextView, "followerCount");
        MyketTextView.setTextFromHtml$default(myketTextView, streamerAvatarData.d, 2, null, null, false, 28, null);
        MyketTextView myketTextView2 = r68Var.y;
        js3.o(myketTextView2, "videoCount");
        MyketTextView.setTextFromHtml$default(myketTextView2, streamerAvatarData.c, 2, null, null, false, 28, null);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof r68) {
            this.w = (r68) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
