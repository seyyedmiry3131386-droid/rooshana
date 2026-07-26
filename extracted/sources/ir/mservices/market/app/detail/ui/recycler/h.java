package ir.mservices.market.app.detail.ui.recycler;

import android.view.View;
import android.view.ViewGroup;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f70;
import defpackage.fa3;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.qm5;
import defpackage.sj8;
import defpackage.uy6;
import defpackage.v4;
import defpackage.w91;
import ir.mservices.market.app.detail.data.VideoShotDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketVideoView;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends qg5 {
    public final og5 w;
    public final f70 x;
    public final String y;
    public fa3 z;

    public h(View view, og5 og5Var, f70 f70Var, String str) {
        super(view);
        this.w = og5Var;
        this.x = f70Var;
        this.y = str;
        w91 w91Var = (w91) qg5.r();
        if (og5Var != null) {
            this.w = new v4(7, this);
        }
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppVideoShotData appVideoShotData = (AppVideoShotData) myketRecyclerData;
        js3.p(appVideoShotData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppVideoShotViewHolder$onAttach$1(appVideoShotData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int width;
        AppVideoShotData appVideoShotData = (AppVideoShotData) myketRecyclerData;
        js3.p(appVideoShotData, "data");
        VideoShotDto videoShotDto = appVideoShotData.b;
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.screenshot_height);
        fa3 fa3Var = this.z;
        if (fa3Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketVideoView myketVideoView = fa3Var.v;
        js3.m(myketVideoView);
        uy6.q(myketVideoView, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.default_image_corner_radius)), 1);
        myketVideoView.setSeekbarTheme(sj8.b());
        if (appVideoShotData.h) {
            width = (int) ((dimensionPixelSize * 16.0f) / 9.0f);
            float width2 = (videoShotDto.getWidth() / videoShotDto.getHeight()) - 1.7777778f;
            if (Math.abs(width2) < 0.05d) {
                fa3 fa3Var2 = this.z;
                if (fa3Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                fa3Var2.v.setSize(-1, -1);
            } else if (width2 < -0.05d) {
                fa3 fa3Var3 = this.z;
                if (fa3Var3 == null) {
                    js3.V("binding");
                    throw null;
                }
                fa3Var3.v.setSize(width, (videoShotDto.getHeight() * width) / videoShotDto.getWidth());
            } else {
                fa3 fa3Var4 = this.z;
                if (fa3Var4 == null) {
                    js3.V("binding");
                    throw null;
                }
                fa3Var4.v.setSize((videoShotDto.getWidth() * dimensionPixelSize) / videoShotDto.getHeight(), dimensionPixelSize);
            }
        } else {
            width = (videoShotDto.getWidth() * dimensionPixelSize) / videoShotDto.getHeight();
            int i = (int) ((dimensionPixelSize * 9.0f) / 16.0f);
            if (width < i) {
                width = i;
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = dimensionPixelSize;
        fa3 fa3Var5 = this.z;
        if (fa3Var5 == null) {
            js3.V("binding");
            throw null;
        }
        MyketVideoView myketVideoView2 = fa3Var5.v;
        myketVideoView2.getLayoutParams().width = width;
        myketVideoView2.getLayoutParams().height = dimensionPixelSize;
        myketVideoView2.setImageUrl(videoShotDto.getThumbnailUrl(), videoShotDto.getMainUrl());
        myketVideoView2.setVideoUrl(videoShotDto.getVideoUrl());
        String startCallbackUrl = videoShotDto.getStartCallbackUrl();
        if (startCallbackUrl != null) {
            myketVideoView2.setStartCallbackUrl(startCallbackUrl);
        }
        myketVideoView2.setAparatId(videoShotDto.getAparatId());
        fa3 fa3Var6 = this.z;
        if (fa3Var6 == null) {
            js3.V("binding");
            throw null;
        }
        MyketVideoView myketVideoView3 = fa3Var6.v;
        og5 og5Var = this.w;
        myketVideoView3.setClickable(og5Var != null);
        fa3 fa3Var7 = this.z;
        if (fa3Var7 == null) {
            js3.V("binding");
            throw null;
        }
        fa3Var7.v.setVideoListener(new qm5(this, appVideoShotData, 7));
        qg5.v(view, og5Var, this, appVideoShotData);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        js3.p((AppVideoShotData) myketRecyclerData, "data");
        x();
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof fa3) {
            this.z = (fa3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x() {
        fa3 fa3Var = this.z;
        if (fa3Var != null) {
            fa3Var.v.i();
        } else {
            js3.V("binding");
            throw null;
        }
    }
}
