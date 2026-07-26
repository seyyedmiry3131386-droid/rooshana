package ir.mservices.market.pika.receive.recycler;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dv2;
import defpackage.js3;
import defpackage.kw6;
import defpackage.lw;
import defpackage.lw8;
import defpackage.og5;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sw6;
import defpackage.w91;
import defpackage.y45;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.PikaReceiveView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int E = 0;
    public long A;
    public final lw8 B;
    public final dv2 C;
    public final d04 D;
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public sw6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, ir.mservices.market.pika.receive.a aVar, kw6 kw6Var, y45 y45Var) {
        super(view);
        js3.p(aVar, "onInstalledAppClickListener");
        js3.p(kw6Var, "cancelClickListener");
        js3.p(y45Var, "runAppClickListener");
        this.w = aVar;
        this.x = kw6Var;
        this.y = y45Var;
        w91 w91Var = (w91) qg5.r();
        this.B = (lw8) w91Var.E.get();
        this.C = (dv2) w91Var.q.get();
        this.D = (d04) w91Var.p.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        ReceivedAppData receivedAppData = (ReceivedAppData) myketRecyclerData;
        js3.p(receivedAppData, "data");
        boolean z = receivedAppData.g;
        x().w.setText(receivedAppData.c);
        Bitmap bitmapDecodeFile = receivedAppData.d;
        if (bitmapDecodeFile == null) {
            bitmapDecodeFile = BitmapFactory.decodeFile(null);
        }
        x().v.setImageBitmap(bitmapDecodeFile);
        PikaReceiveView pikaReceiveView = x().z;
        js3.o(pikaReceiveView, "install");
        pikaReceiveView.setVisibility(z ? 0 : 8);
        View view = this.a;
        if (z) {
            js3.o(view, "itemView");
            bt2.G(cc7.q(view), null, null, new ReceivedAppViewHolder$onBindView$1(null, receivedAppData, this), 3);
            x().z.setData(receivedAppData.e);
        } else {
            String string = view.getResources().getString(rs6.incompatible_app_sent);
            js3.o(string, "getString(...)");
            z(string, true, false);
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof sw6) {
            this.z = (sw6) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final sw6 x() {
        sw6 sw6Var = this.z;
        if (sw6Var != null) {
            return sw6Var;
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

    public final void z(String str, boolean z, boolean z2) {
        Drawable drawable;
        MyketTextView myketTextView = x().y;
        Resources resources = myketTextView.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_alert;
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
        Drawable drawableMutate = drawable.mutate();
        dv2 dv2Var = this.C;
        if (dv2Var == null) {
            js3.V("graphicUtils");
            throw null;
        }
        int iA = (int) dv2Var.a(12.0f);
        if (dv2Var == null) {
            js3.V("graphicUtils");
            throw null;
        }
        drawableMutate.setBounds(0, 0, iA, (int) dv2Var.a(12.0f));
        if (z) {
            myketTextView.setTextColor(sj8.b().A);
            d04 d04Var = this.D;
            if (d04Var == null) {
                js3.V("languageHelper");
                throw null;
            }
            if (d04Var.f()) {
                myketTextView.setCompoundDrawables(null, null, drawableMutate, null);
            } else {
                myketTextView.setCompoundDrawables(drawableMutate, null, null, null);
            }
        } else {
            ThemeData themeDataB = sj8.b();
            myketTextView.setTextColor(z2 ? themeDataB.x : themeDataB.m);
            myketTextView.setCompoundDrawables(null, null, null, null);
        }
        myketTextView.setText(str);
    }
}
